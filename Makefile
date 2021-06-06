run:
	./gradlew bootJar --continuous | ./gradlew bootRun
build:
	./gradlew build
run-jar:
	./gradlew clean build && java -jar build/libs/java-0.0.1-SNAPSHOT.jar
