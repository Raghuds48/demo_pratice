FROM ubuntu:22.04
RUN apt update && apt install apache2 -y
COPY http://mnptechnologies.com/  /var/www/html/
EXPOSE 80
ENV MY_PATH=/root/
ENTRYPOINT [ "bin/bash", "-c", "service apache2 start && bash"]
