# Docker

Docker bruges til at køre programmer i containere.

I denne demo kører vi en lille Spring Boot app og en MySQL database med Docker Compose.

Appen har to simple endpoints:

- `http://localhost:8080/`
- `http://localhost:8080/db`

## Begreber

- Dockerfile: en opskrift på hvordan Docker bygger et image.
- Image: en færdig pakke med appen og det, den skal bruge for at kunne køre.
- Container: en kørende instans af et image.
- Docker Compose: starter flere containere ud fra `compose.yaml`.
- Port mapping: forbinder en port på min computer med en port i containeren.
- Volume: gemmer data uden for containeren, så databasen ikke mister data ved genstart.
- `.env`: indeholder simple variabler, som Compose bruger i `compose.yaml`.
- Multi-stage build: Docker bygger appen i et build-image og kopierer kun den færdige JAR til runtime-imaget.
- Build cache: Docker kan genbruge tidligere build-trin, hvis filerne ikke er ændret.

## Kort forklaring af filerne

- `Dockerfile` bygger Spring Boot appen.
- `compose.yaml` starter både app og MySQL.
- `.env` indeholder database-navn, bruger, kodeord og port.
- `pom.xml` beskriver Maven-projektet.
- `src/` indeholder Spring Boot koden.
