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



# Installing Apache, MariaDB en PHP

yum -y install httpd mariadb-server mariadb php php-mysql

# Enabling on start-up & restart Apache

systemctl start httpd.service
systemctl enable httpd.service
systemctl restart httpd.service

