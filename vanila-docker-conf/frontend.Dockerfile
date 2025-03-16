FROM node:20 AS base
WORKDIR /simple-project/frontend

FROM base AS client-base
COPY package.json package-lock.json ./
RUN npm install
COPY public ./public
COPY src ./src

FROM client-base AS client-dev
CMD ["npm", "start"]