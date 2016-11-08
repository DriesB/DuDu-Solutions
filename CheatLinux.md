##Linux

| Task                       | Command |
| :---                       | :--:     |
| Search file excluding directories without permission | `find DIRECTORY -name "VALUE" 2> /dev/null`     |
|Check the ip configuration|`/sbin/ifconfig`|
|Change keyboard input|`loadkeys be-latin1`|
|Show the ip addressing|`ip a`|
|Show the configuration for a certain interface|`vi /etc/sysconfig/network-scripts/ifcfg-INTERFACE`|
|Show default gateway|`ip r`|
|Show DNS-Server|`cat /etc/resolv.conf`|
|Show the status of a service|`sudo systemctl status SERVICE.service`|
|Start a service|`sudo systemctl start SERVICE.service`|
|Restart a service|`sudo systemctl restart SERVICE.service`|
|Show ports (t=tcp, u=udp, l=listening, p=which proces, n=negates namechange)|`sudo ss -tulpn`|
|Show firewall|`sudo firewall-cmd --list-all`|
|Edit firewall to allow service|`sudo firewall-cmd --add-service=SERVICE --permanent`|
|Edit firewall to allow portaccess|`sudo firewall-cmd --add-port=PORT/tcp --permanent`|
|Restart the firewall|`sudo systemctl restart firewalld`|
|Show logfiles (continuous)|`sudo journalctl -l -f -u SERVICE.service`|
|Show logfiles current boot|`sudo journalctl -b`|
|Show logfiles since ... (e.g. yesterday)|`sudo journalctl --since=yesterday`|
|Check if configuration for apache is correct|`apachectl configtest`|
|Check if configuration for fileserver is correct|`testparm`|
|Check if configuration for main DNS is correct|`named-checkconf`|
|Check if configuration for specific DNS is correct|`named-checkzone`|
|Install commands for dns|`yum install bind-utils`|
|Show active running processes|`ps -A`|
|Stop process|`kill PID`|
|Bring an interface up (`cd` to the location)|`ifup IFACE`|
|Restart the network|`/etc/init.d/network restart`|
