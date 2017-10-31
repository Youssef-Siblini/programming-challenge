Maven
Maven has been used as the build tool.
To build your jar run: mvn package

Server
Tomcat 

Requests
For NO_MODEL Response pass an event with sensorId that is not in the model config:
	POST http://localhost:8080/api/event/
	{
		"eventId": "cj86g5ypk000004zvevipqxfn",
		"sensorId": "fd0a635d-2aaf-4460-a817-6353e1b6c050",
		"timestamp": 89887987,
		"value": "30.23"
	}

For ANOMALY Response pass an event with sensorId that is in the model config and the event value is above the threshold set for that event in the model config:
	POST http://localhost:8080/api/event/
	{
		"eventId": "cj86g5ypk000004zvevipqxfn",
		"sensorId": "fd0a635d-2aaf-4460-a817-6353e1b6c050",
		"timestamp": 89887987,
		"value": "30.23"
	}

For NO_ANOMALY Response pass an event with sensorId that is in the model config and the event value is below the threshold set for that event in the model config:
	POST http://localhost:8080/api/event/
	{
		"eventId": "cj86g5ypk000004zvevipqxfn",
		"sensorId": "fd0a635d-2aaf-4460-a817-6353e1b6c050",
		"timestamp": 89887987,
		"value": "10.23"
	}



