# ympa_csharp_functions_server - Azure Functions v4 Server

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.

В числе возможностей интеграции:

* управление каталогом товаров и витриной,

* обработка заказов,

* изменение настроек магазина,

* получение отчетов.


## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/ympa_csharp_functions_server
docker build -t ympa_csharp_functions_server .
docker run -p 5000:8080 ympa_csharp_functions_server
```
