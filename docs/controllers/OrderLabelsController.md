# OrderLabelsController

All URIs are relative to `""`

The controller class is defined in **[OrderLabelsController.java](../../src/main/java/org/openapitools/controller/OrderLabelsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateOrderLabel**](#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**generateOrderLabels**](#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**getOrderLabelsData**](#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков

<a id="generateOrderLabel"></a>
# **generateOrderLabel**
```java
Mono<CompletedFileUpload> OrderLabelsController.generateOrderLabel(campaignIdorderIdshipmentIdboxId_format)
```

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**shipmentId** | `Long` | Идентификатор грузоместа. |
**boxId** | `Long` | Идентификатор коробки. |
**_format** | [**PageFormatType**](../../docs/models/.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional parameter] [enum: `A7`, `A4`]

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/pdf`, `application/json`

<a id="generateOrderLabels"></a>
# **generateOrderLabels**
```java
Mono<CompletedFileUpload> OrderLabelsController.generateOrderLabels(campaignIdorderId_format)
```

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |
**_format** | [**PageFormatType**](../../docs/models/.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional parameter] [enum: `A7`, `A4`]

### Return type
[**CompletedFileUpload**](../../docs/models/CompletedFileUpload.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/pdf`, `application/json`

<a id="getOrderLabelsData"></a>
# **getOrderLabelsData**
```java
Mono<GetOrderLabelsDataResponse> OrderLabelsController.getOrderLabelsData(campaignIdorderId)
```

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |

### Return type
[**GetOrderLabelsDataResponse**](../../docs/models/GetOrderLabelsDataResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

