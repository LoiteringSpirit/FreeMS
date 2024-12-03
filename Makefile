clean:
	mvn clean

run:
	mvn install
	sudo docker image build -t freems:latest .
	sudo docker run -p 8080:8080 freems:latest