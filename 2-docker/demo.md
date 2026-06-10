# Demo

1. Gå ind i mappen:

   `cd tek2-exam-demo/2-docker`

2. Start app og database:

   `docker compose up -d --build`

   Hvis port 8080 allerede er i brug, skal det andet program stoppes først.

3. Vis kørende containere:

   `docker ps`

4. Åbn appen:

   `http://localhost:8080/`

5. Åbn endpointet med database-info:

   `http://localhost:8080/db`

6. Vis logs:

   `docker logs 2-docker-app-1`

7. Stop demoen:

   `docker compose down`
