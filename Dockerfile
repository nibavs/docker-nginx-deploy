FROM node:alpine AS frontend-base
COPY ./frontend/package.json ./frontend/package-lock.json ./
RUN npm install
COPY frontend .

FROM frontend-base AS frontend-build
RUN npm run build

FROM nginx:stable-alpine AS frontend-prod
COPY --from=frontend-build /build /usr/share/nginx/html
COPY --from=frontend-build nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 3000
CMD [ "nginx", "-g", "daemon off;" ]
