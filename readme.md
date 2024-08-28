# Notes
## Docker Image ekle
    PostgreSQL
    userName: postgres
    password: root
    DB: AuthDB

```bash
 docker run --name postgres -e POSTGRES_PASSWORD=root -p 5433:5432 -d postgres 

```
    MongoDB
    userName: admin
    password: root
    DB: UserProfileDB

```bash
docker run -d --name mongodb -p 27017:27017 mongodb:v.0.3

```

    mongod:
    db.createUser({user: "gokce",pwd: "root",roles:["readWrite","dbAdmin"]})

```bash
docker run --name microservice-redis -p 6379:6379 -d redis
```

```bash
docker run --name redis-gui -d -p 8001:8001 redislabs/redisinsight:1.14.0
```





