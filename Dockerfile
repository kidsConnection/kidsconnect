# 1. 베이스 이미지 설정
FROM openjdk:17-jdk-alpine

# 2. 프로젝트의 JAR 파일을 컨테이너에 복사
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# 3. 애플리케이션을 실행할 명령어 설정
ENTRYPOINT ["java", "-jar", "/app.jar"]
