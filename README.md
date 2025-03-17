# Docker-nginx-deploy

## Vanila-docker-conf (without docker compose)
Three dockerfiles were written to make three different images:
1. Backend
2. Frontend
3. Nginx for reverse proxy

nginx.conf is written to use host's ports inside nginx container.
To make it work, you should build three images and run containers on ports:
```bash
8080:8080 backend
3000:3000 frontend
80:80 nginx
```

## Docker compose
```bash
docker compose up
```
This command will start application using compose.yml file. Compose file using inside itself docker files, which are written for backend and frontend.




