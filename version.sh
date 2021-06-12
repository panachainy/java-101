echo $(./gradlew properties -q | grep "version:" | awk '{print $2}')
