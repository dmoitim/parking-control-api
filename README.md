# parking-control

Para baixar a imagem do postgres:
```
docker pull postgres
```

Para subir um container docker com o postgres:
```
docker run --name postgresql -e POSTGRES_USER=myusername -e POSTGRES_PASSWORD=mypassword -p 5432:5432 -v /data:/var/lib/postgresql/data -d postgres
```

Para baixar a imagem do PG Admin:
```
docker pull dpage/pgadmin4:latest
```

Para subir um container com o PG Admin:
```
docker run --name my-pgadmin -p 82:80 -e 'PGADMIN_DEFAULT_EMAIL=email@dominio.com' -e 'PGADMIN_DEFAULT_PASSWORD=123456'-d dpage/pgadmin4
```

Para pegar o IP do docker:
```
docker inspect postgresql -f "{{json .NetworkSettings.Networks }}"
```

Para criar o banco de dados, conecte no PG Admin (http://localhost:82/), utilize o IP encontrado acima para criar a conexão e execute o comando:
```
CREATE DATABASE "parking-control-db"
    WITH
    OWNER = myusername
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```

Fontes:  
https://hevodata.com/learn/docker-postgresql/  
https://www.youtube.com/watch?v=LXRU-Z36GEU
