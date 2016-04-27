#! /bin/sh
#
# Author: Bert Van Vreckem <bert.vanvreckem@gmail.com>
#
# A non-interactive replacement for mysql_secure_installation
#
# Tested on CentOS 6, CentOS 7, Ubuntu 12.04 LTS (Precise Pangolin), Ubuntu
# 14.04 LTS (Trusty Tahr).

set -o errexit # abort on nonzero exitstatus
set -o nounset # abort on unbound variable


# Installing MariaDB & Java

yum -y install java-1.7.0-openjdk-devel 

# Installing TomCat
groupadd tomcat
useradd -M -s /bin/nologin -g tomcat -d /opt/apache-tomcat-8.0.32 tomcat
wget http://mirror.sdunix.com/apache/tomcat/tomcat-8/v8.0.32/bin/apache-tomcat-8.0.32.tar.gz
mkdir /opt/tomcat
tar xvf apache-tomcat-8*tar.gz -C /opt/tomcat --strip-components=1
cd /opt/tomcat;
chgrp -R tomcat conf
chmod g+rwx conf
chmod g+r conf/*
chown -R tomcat webapps/ work/ temp/ logs/

cat >/etc/systemd/system/tomcat.service << _EOF_
# Systemd unit file for tomcat
[Unit]
Description=Apache Tomcat Web Application Container
After=syslog.target network.target

[Service]
Type=forking

Environment=JAVA_HOME=/usr/lib/jvm/jre
Environment=CATALINA_PID=/opt/tomcat/temp/tomcat.pid
Environment=CATALINA_HOME=/opt/tomcat
Environment=CATALINA_BASE=/opt/tomcat
Environment='CATALINA_OPTS=-Xms512M -Xmx1024M -server -XX:+UseParallelGC'
Environment='JAVA_OPTS=-Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom'

ExecStart=/opt/tomcat/bin/startup.sh
ExecStop=/bin/kill -15 \$MAINPID

User=tomcat
Group=tomcat

[Install]
WantedBy=multi-user.target
_EOF_

systemctl daemon-reload
systemctl start tomcat
systemctl enable tomcat
firewall-cmd --add-port=8080/tcp --permanent
systemctl restart firewalld


