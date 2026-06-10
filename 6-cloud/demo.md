# Demo

Dette er kun en forklaring, ikke en rigtig deployment.

1. Forklar at man kan logge ind på en server med SSH:

   `ssh root@SERVER_IP`

2. Forklar at man kan kopiere filer med `scp`:

   `scp fil.txt root@SERVER_IP:/root/`

3. Forklar at firewall skal åbne relevante porte:

   `ufw allow 80`

   `ufw allow 443`

4. Forklar at Docker Compose kan starte en app på serveren:

   `docker compose up -d`

5. Forklar at domænet hos one.com kan pege på serverens public IP.

