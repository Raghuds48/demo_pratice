FROM amazonlinux:latest
USER ec2-user
# Set the working directory in the image
WORKDIR /home/ec2-user/app


# Copy the files from the host file system to the image file system
COPY . /home/ec2-user/app

# Install the necessary packages
RUN yum update -y && yum clean all && yum install -y python3 python3-pip



# Run a command to start the application
CMD ["python3", "app.py"]
