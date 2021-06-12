run:
	./gradlew bootRun --args='--spring.profiles.active=dev'
run-prod:
	./gradlew bootRun --args='--spring.profiles.active=prod'
run-watch:
	./gradlew bootJar --continuous | make run
build:
	./gradlew clean build
run-jar:
	./gradlew clean build && java -jar build/libs/java-*.jar
doc:
	./gradlew javadocJar
doc-open:
	open ./build/docs/javadoc/index.html
test:
	./gradlew test
test-mem:
	./gradlew test --args='--spring.profiles.active=mem'
test-full:
	./gradlew test -i
