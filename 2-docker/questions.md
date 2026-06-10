# Typiske spørgsmål

## Hvad er en Dockerfile?

En Dockerfile er en opskrift på et Docker image.

## Hvad er et image?

Et image er en færdig pakke, som en container kan startes fra.

## Hvad er en container?

En container er et kørende program baseret på et image.

## Hvad er port mapping?

Port mapping betyder, at en port på min computer peger ind på en port i containeren.

I denne demo peger `8080:8080` på Spring Boot appen, og `3308:3306` peger på MySQL.

## Hvad er Docker Compose?

Docker Compose starter containere ud fra en `compose.yaml` fil.

## Hvad er et volume?

Et volume deler filer mellem computeren og containeren.

I denne demo bruger MySQL et volume, så databasefilerne kan gemmes uden for containeren.

## Hvad er .env?

`.env` indeholder variabler, som Docker Compose kan læse.

## Hvad er multi-stage build?

Multi-stage build betyder, at Docker først bygger appen i et build-stage og derefter laver et mindre runtime-stage.

## Hvad er build cache?

Docker kan genbruge gamle build-trin, så build ofte går hurtigere.
