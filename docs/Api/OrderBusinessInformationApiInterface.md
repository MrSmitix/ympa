# OpenAPI\Server\Api\OrderBusinessInformationApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderBusinessBuyerInfo**](OrderBusinessInformationApiInterface.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**getOrderBusinessDocumentsInfo**](OrderBusinessInformationApiInterface.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\OrderBusinessInformationApi:
        tags:
            - { name: "open_api_server.api", api: "orderBusinessInformation" }
    # ...
```

## **getOrderBusinessBuyerInfo**
> OpenAPI\Server\Model\GetBusinessBuyerInfoResponse getOrderBusinessBuyerInfo($campaignId, $orderId)

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderBusinessInformationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderBusinessInformationApiInterface;

class OrderBusinessInformationApi implements OrderBusinessInformationApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of OrderBusinessInformationApiInterface#getOrderBusinessBuyerInfo
     */
    public function getOrderBusinessBuyerInfo(int $campaignId, int $orderId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **orderId** | **int**| Идентификатор заказа. |

### Return type

[**OpenAPI\Server\Model\GetBusinessBuyerInfoResponse**](../Model/GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getOrderBusinessDocumentsInfo**
> OpenAPI\Server\Model\GetBusinessDocumentsInfoResponse getOrderBusinessDocumentsInfo($campaignId, $orderId)

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderBusinessInformationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderBusinessInformationApiInterface;

class OrderBusinessInformationApi implements OrderBusinessInformationApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of OrderBusinessInformationApiInterface#getOrderBusinessDocumentsInfo
     */
    public function getOrderBusinessDocumentsInfo(int $campaignId, int $orderId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |
 **orderId** | **int**| Идентификатор заказа. |

### Return type

[**OpenAPI\Server\Model\GetBusinessDocumentsInfoResponse**](../Model/GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

