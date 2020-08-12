#!/bin/bash

if [ $MY_NAME ]; then
  sed -r -i 's/(.*)(HELLO)(\s+\w+)(.*)/\1\2 '$MY_NAME'\4/' /usr/share/nginx/html/index.html
fi

echo "Starting nginx"
nginx -g 'daemon off;'
