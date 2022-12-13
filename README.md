## How to run

- Run axon server and mysql firstly

```
cd infra
docker-compose up
```

## Build common API & Run each service

'''
cd common-api
mvn install
cd ..

cd vacation
mvn spring-boot:run
cd ..

cd schedule
mvn spring-boot:run
cd ..

cd employee
mvn spring-boot:run
cd ..

'''
