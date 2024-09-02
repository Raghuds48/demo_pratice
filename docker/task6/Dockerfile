FROM ubuntu:latest

RUN apt-get update && apt-get install -y nginx

COPY print_container_details.sh /print_container_details.sh
RUN chmod +x /print_container_details.sh

CMD ["/print_container_details.sh"]
