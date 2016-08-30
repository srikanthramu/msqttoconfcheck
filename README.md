# msqttoconfcheck

MQTT is an IoT protocol for communication between a client and a broker. Mosquitto (https://mosquitto.org/) is an open source message broker. This utility parses the Mosquitto configuration file and checks for insecure configurations.

Build: mvn clean install
Run: java -cp target/msqttoconfcheck-0.0.1-SNAPSHOT.jar net.mqtt.msqttoconfcheck.ConfChecker mosquitto.conf  
