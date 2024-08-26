
o "Print serverdetails "

Name=$(uname -a)
Memory=$(free -h | awk 'NR==2 {print $2" is total|"$3" is used |"$4" is free"}')
CPU_Usage=$(mpstat)
Disk_Usage=$(df -h | awk '{print $1" filename | "$2" size avilable | "$3" used in file |"$4" avilable in file"}'| head -4)

echo "server name : $Name"

echo "Memory usage : $Memory"

echo "CPU usage details : $CPU_Usage"

echo "disk usage details : $Disk_Usage"


