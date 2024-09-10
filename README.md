# ympa_groovy_client

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.

В числе возможностей интеграции:

* управление каталогом товаров и витриной,

* обработка заказов,

* изменение настроек магазина,

* получение отчетов.


This Groovy package, using the [http-builder-ng library](https://http-builder-ng.github.io/http-builder-ng/), is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: LATEST
- Package version: LATEST
- Build date: 2024-09-09T21:58:10.181979933Z[Etc/UTC]
- Generator version: 7.8.0
- Build package: org.openapitools.codegen.languages.GroovyClientCodegen

## Requirements

* Groovy 2.5.7
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

## Getting Started


```groovy
def apiInstance = new BidsApi()
def businessId = 56L // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
def pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==" // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
def limit = 20 // Integer | Количество значений на одной странице. 
def getBidsInfoRequest = new GetBidsInfoRequest() // GetBidsInfoRequest | description

apiInstance.getBidsInfoForBusiness(businessId, pageToken, limit, getBidsInfoRequest)
    {
    // on success
    def result = (GetBidsInfoResponse)it
    println result
    
}
    {
    // on failure
    statusCode, message ->
        println "${statusCode} ${message}"
};
```

