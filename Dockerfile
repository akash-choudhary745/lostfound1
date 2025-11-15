# -------------------------------
# Stage 1: Build container (optional if you already have WAR)
# -------------------------------
# This stage is skipped if you already build WAR manually.
# Uncomment if using Maven build inside Docker.
#
# FROM maven:3.9.6-eclipse-temurin-17 AS builder
# WORKDIR /app
# COPY . .
# RUN mvn clean package -DskipTests
# -------------------------------


# -------------------------------
# Stage 2: Tomcat Server
# -------------------------------
FROM tomcat:9.0-jdk17

# Disable default Tomcat apps (optional but recommended)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file into Tomcat
# If you built .war manually:
COPY dist/LostAndFoundPortal.war /usr/local/tomcat/webapps/ROOT.war

# If using Maven build inside Docker:
# COPY --from=builder /app/target/LostAndFoundPortal.war /usr/local/tomcat/webapps/ROOT.war

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
