#!/bin/bash
sudo pkill -f java
nohup java -jar /home/ubuntu/server/target/demo-0.0.1-SNAPSHOT.jar > /dev/null 2>&1 &
