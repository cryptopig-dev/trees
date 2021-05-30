build:
	@./gradlew build

clean:
	@./gradlew clean

deps:
	@./gradlew --refresh-dependencies

run:
	@./gradlew runClient

.PHONY: build clean deps run
