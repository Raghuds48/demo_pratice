#!/bin/bash

echo "Container Name: $(hostname)" > index.html
echo "Container IP: $(ip addr show | grep inet | awk '{print $2}' | cut -d/ -f1)" >> index.html
echo "Date: $(date)" >> index.html

nginx -g "daemon off;"
