# C++ Qt API client

# 

Партнерский API Маркета

- API version: LATEST
- Generator version: 7.8.0

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.

В числе возможностей интеграции:

* управление каталогом товаров и витриной,

* обработка заказов,

* изменение настроек магазина,

* получение отчетов.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:

1. CMake 3.2+
2. Qt
3. C++ Compiler

## Getting Started

example.h:
```c++

#include <iostream>
#include "../client/OAIBidsApi.h"

using namespace test_namespace;

class Example : public QObject {
    Q_OBJECT
    qint64 create();
    QString create();
    qint32 create();
    OAIGetBidsInfoRequest create();
public Q_SLOTS:
   void exampleFunction1();
};

```

example.cpp:
```c++

#include "../client/OAIBidsApi.h"
#include "example.h"
#include <QTimer>
#include <QEventLoop>

qint64 Example::create(){
    qint64 obj;
QString Example::create(){
    QString obj;
qint32 Example::create(){
    qint32 obj;
OAIGetBidsInfoRequest Example::create(){
    OAIGetBidsInfoRequest obj;
 return obj;
}

void Example::exampleFunction1(){
     OAIBidsApi apiInstance;
     
      //OAuth Authentication supported right now

      QEventLoop loop;
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignal, [&]() {
          loop.quit();
      });
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignalE, [&](QNetworkReply::NetworkError, QString error_str) {
          qDebug() << "Error happened while issuing request : " << error_str;
          loop.quit();
      });

      qint64 business_id = create(); // qint64 | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

      QEventLoop loop;
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignal, [&]() {
          loop.quit();
      });
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignalE, [&](QNetworkReply::NetworkError, QString error_str) {
          qDebug() << "Error happened while issuing request : " << error_str;
          loop.quit();
      });

      QString page_token = create(); // QString | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 

      QEventLoop loop;
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignal, [&]() {
          loop.quit();
      });
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignalE, [&](QNetworkReply::NetworkError, QString error_str) {
          qDebug() << "Error happened while issuing request : " << error_str;
          loop.quit();
      });

      qint32 limit = create(); // qint32 | Количество значений на одной странице. 

      QEventLoop loop;
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignal, [&]() {
          loop.quit();
      });
      connect(&apiInstance, &OAIBidsApi::getBidsInfoForBusinessSignalE, [&](QNetworkReply::NetworkError, QString error_str) {
          qDebug() << "Error happened while issuing request : " << error_str;
          loop.quit();
      });

      OAIGetBidsInfoRequest oai_get_bids_info_request = create(); // OAIGetBidsInfoRequest | description
      apiInstance.getBidsInfoForBusiness(business_idpage_tokenlimitoai_get_bids_info_request);
      QTimer::singleShot(5000, &loop, &QEventLoop::quit);
      loop.exec();
  }

```

## Documentation for Servers

Parameterized Servers are supported. Define a server in the API for each endpoint with arbitrary numbers of variables:

```yaml
servers:
- url: http://{server}:{port}/{basePath}
  description: Description of the Server
  variables:
    server:
        enum:
          - 'petstore'
          - 'qa-petstore'
          - 'dev-petstore'
        default: 'petstore'
    port:
      enum:
        - '3000'
        - '1000'
      default: '3000'
    basePath:
      default: v1
```
To change the default variable, use this function in each Api:
```c++
int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
```
The parameter "serverIndex" will choose a server from the server list for each endpoint. There is always at least one server with index 0. The Parameter "operation" should be the desired endpoint operationid.
Variable is the name of the variable you wish to change and the value is the new default Value.
The function will return -1 when the variable does not exists, -2 if value is not defined in the variable enum and -3 if the operation is not found.

If your endpoint has multiple server objects in the servers array, you can set the server that will be used with this function:
```c++
void setServerIndex(const QString &operation, int serverIndex);
```
Parameter "operation" should be your operationid. "serverIndex" is the index you want to set as your default server. The function will check if there is a server with your index.
Here is an example of multiple servers in the servers array. The first server will have index 0 and the second will have index 1.
```yaml
servers:
- url: http://{server}:8080/
  description: Description of the Server
  variables:
    server:
        enum:
          - 'petstore'
          - 'qa-petstore'
          - 'dev-petstore'
        default: 'petstore'
- url: https://localhost:8080/v1
```

## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth


- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: https://oauth.yandex.ru/authorize
- **Scopes**: 
  - market:partner-api: API Яндекс.Маркета / Поиска по товарам для партнеров


## Author




## License

BSD 3-Clause for more information visit [BSD 3-Clause](https://opensource.org/license/bsd-3-clause/)