# 1. 베이스 이미지 설정
FROM openjdk:21-jdk-slim
# 2. 작업 디렉토리 설정
# WORKDIR /app
ARG JAR_FILE
# 3. JAR 파일 복사
# COPY build/libs/*.jar app.jar
RUN echo $JAR_FILE
# COPY build/libs/${JAR_FILE} app.jar
COPY ${JAR_FILE} app.jar
# 4. 컨테이너에서 열릴 포트 지정
EXPOSE 8080
# 5. JAR 파일 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]