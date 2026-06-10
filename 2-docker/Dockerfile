# -- Stage 1: Build --------------------------------

FROM maven:3.9.11-eclipse-temurin-25 AS build

WORKDIR /app

# Cache Maven dependencies før koden kopieres.
# Det kan gøre næste build hurtigere, hvis pom.xml ikke er ændret.
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Kopier kildekoden og byg applikationen uden tests.
COPY src ./src
RUN mvn package -DskipTests -B

# -- Stage 2: Runtime ------------------------------

FROM eclipse-temurin:25 AS runtime

WORKDIR /app

# Kopier kun den færdige JAR fra build stage.
# Maven og kildekoden kommer ikke med i runtime-imaget.
COPY --from=build /app/target/*.jar app.jar

# Start Spring Boot applikationen.
ENTRYPOINT ["java", "-jar", "app.jar"]
