.PHONY: run

run:
	@echo "Running ./gradlew bootBuildImage"
	@./gradlew bootBuildImage --stacktrace
	@echo "Running docker-compose up -d"
	@docker-compose up -d