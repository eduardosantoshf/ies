# Docker

Check docker version
```
$ docker --version
```

Test Docker installation
```
$ docker run hello-world
```

List the Docker images on computer
```
$ docker image ls
```

List the existing Docker containers
```
$ docker ps --all
```

Let us download the node-bulletin-board example project. This is a simple bulletin board application written in Node.js.

## Define a container with Dockerfile
After downloading the project, take a look at the file called Dockerfile in the bulletin board application. Dockerfiles describe how to assemble a private filesystem for a container, and can also contain some metadata describing how to run a container based on this image.

## Build and test your image
Now that you have some source code and a Dockerfile, it’s time to build your first image, and make sure the containers launched from it work as expected.

Make sure you’re in the directory node-bulletin-board/bulletin-board-app in a terminal or PowerShell using the cd command. Run the following command to build your bulletin board image:
```
$ docker build --tag bulletinboard:1.0 .
```

## Run your image as a container
Run the following command to start a container based on your new image:
```
$ docker run --publish 8000:8080 --detach --name bb bulletinboard:1.0
```

There are a couple of common flags here:
* **--publish** asks Docker to forward traffic incoming on the host’s port 8000 to the container’s port 8080. Containers have their own private set of ports, so if you want to reach one from the network, you have to forward traffic to it in this way. Otherwise, firewall rules will prevent all network traffic from reaching your container, as a default security posture.
* **--detach** asks Docker to run this container in the background.
* **--name** specifies a name with which you can refer to your container in subsequent commands, in this case bb.

Visit your application in a browser at **localhost:8000**

Once you’re satisfied that your bulletin board container works correctly, you can delete it:
```
$ docker rm --force bb
```
The **--force** option stops a running container, so it can be removed. If you stop the container running with docker stop bb first, then you do not need to use **--force** to remove it.

## Dockerize PostgreSQL
Full tutorial: https://docs.docker.com/engine/examples/postgresql_service/

Build an image from the Dockerfile and assign it a name:
```
$ docker build -t eg_postgresql .
```

Run the PostgreSQL server container (in the foreground):
```
$ docker run --rm -P --name pg_test eg_postgresql
```

Connect from your host system:
```
$ docker ps
```

Connect to the database:
```
$ sql -h localhost -p 49153 -d docker -U docker --password
```

## Docker Compose
Full tutorial: https://docs.docker.com/compose/gettingstarted/

Start docker-compose:
```
$ docker-compose up
```

Stop docker-compose:
```
$ docker-compose stop
```

## Perguntas

* Resultado do comando: $ docker container ls –all:

```
CONTAINER ID        IMAGE               COMMAND             CREATED            STATUS              PORTS               NAMES
200dd6682607        eg_postgresql       "bash"              6 minutes ago       Up 6 minutes        5432/tcp            upbeat_ishizaka
```

* Qual a relevância de configurar “volumes” quando se pretende preparar um container para servir uma base de dados?

A criação/configuração de volumes serve para manter a persistência de dados, mesmo quando o próprio container é apagado.