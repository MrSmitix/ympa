# OrderBusinessInformationController

All URIs are relative to `""`

The controller class is defined in **[OrderBusinessInformationController.java](../../src/main/java/org/openapitools/controller/OrderBusinessInformationController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderBusinessBuyerInfo**](#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**getOrderBusinessDocumentsInfo**](#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах

<a id="getOrderBusinessBuyerInfo"></a>
# **getOrderBusinessBuyerInfo**
```java
Mono<GetBusinessBuyerInfoResponse> OrderBusinessInformationController.getOrderBusinessBuyerInfo(campaignIdorderId)
```

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \&quot;\&quot; %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе &#x60;PROCESSING&#x60;, &#x60;DELIVERY&#x60;, &#x60;PICKUP&#x60; или &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |

### Return type
[**GetBusinessBuyerInfoResponse**](../../docs/models/GetBusinessBuyerInfoResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getOrderBusinessDocumentsInfo"></a>
# **getOrderBusinessDocumentsInfo**
```java
Mono<GetBusinessDocumentsInfoResponse> OrderBusinessInformationController.getOrderBusinessDocumentsInfo(campaignIdorderId)
```

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус &#x60;DELIVERED&#x60;.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**orderId** | `Long` | Идентификатор заказа. |

### Return type
[**GetBusinessDocumentsInfoResponse**](../../docs/models/GetBusinessDocumentsInfoResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

