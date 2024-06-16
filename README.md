# Start ZooKeeper Server
bin\windows\zookeeper-server-start.bat config\zookeeper.properties

# Start Kafka Server
bin\windows\zookeeper-server-start.bat config\zookeeper.properties


# Create Kafka Topic
bin\windows\kafka-topics --create --topic quickstart-events --bootstrap-server localhost:9092

# Describe Kafka Topic
bin\windows\kafka-topics --describe --topic quickstart-events --bootstrap-server localhost:9092

# Write Some even to Kafka Topic
bin\windows\kafka-console-producer --topic quickstart-events --bootstrap-server localhost:9092

# READ THE EVENTS
bin\windows\kafka-console-consumer --topic quickstart-events --from-beginning --bootstrap-server localhost:9092


