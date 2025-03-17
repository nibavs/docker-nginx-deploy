FROM node:alpine AS frontend-base
COPY package.json package-lock.json ./
RUN npm install
COPY . .

FROM frontend-base AS frontend-dev
CMD ["npm", "start"]

FROM frontend-base AS frontend-build
RUN npm run build

FROM nginx:stable-alpine AS frontend-prod
COPY --from=frontend-build /build /usr/share/nginx/html
COPY --from=frontend-build nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 3000
CMD [ "nginx", "-g", "daemon off;" ]
