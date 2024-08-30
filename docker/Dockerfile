FROM ubuntu:latest
RUN app get update && app install apache2 -y
ADD http://mnptechnologies.com/  /var/www/html/
EXPOSE 80
ENV MY_PATH=/root/
ENTRYPOINT ["/bin/bash" "-c", "service apache2 start && bash"]
