# OpenAPI\Server\Api\OrderDeliveryApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderBuyerInfo**](OrderDeliveryApiInterface.md#getOrderBuyerInfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
[**setOrderDeliveryDate**](OrderDeliveryApiInterface.md#setOrderDeliveryDate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
[**setOrderDeliveryTrackCode**](OrderDeliveryApiInterface.md#setOrderDeliveryTrackCode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
[**updateOrderStorageLimit**](OrderDeliveryApiInterface.md#updateOrderStorageLimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
[**verifyOrderEac**](OrderDeliveryApiInterface.md#verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\OrderDeliveryApi:
        tags:
            - { name: "open_api_server.api", api: "orderDelivery" }
    # ...
```

## **getOrderBuyerInfo**
> OpenAPI\Server\Model\GetOrderBuyerInfoResponse getOrderBuyerInfo($campaignId, $orderId)

Информация о покупателе — физическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderDeliveryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderDeliveryApiInterface;

class OrderDeliveryApi implements OrderDeliveryApiInterface
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
     * Implementation of OrderDeliveryApiInterface#getOrderBuyerInfo
     */
    public function getOrderBuyerInfo(int $campaignId, int $orderId, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\GetOrderBuyerInfoResponse**](../Model/GetOrderBuyerInfoResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **setOrderDeliveryDate**
> OpenAPI\Server\Model\EmptyApiResponse setOrderDeliveryDate($campaignId, $orderId, $setOrderDeliveryDateRequest)

Изменение даты доставки заказа

Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderDeliveryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderDeliveryApiInterface;

class OrderDeliveryApi implements OrderDeliveryApiInterface
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
     * Implementation of OrderDeliveryApiInterface#setOrderDeliveryDate
     */
    public function setOrderDeliveryDate(int $campaignId, int $orderId, SetOrderDeliveryDateRequest $setOrderDeliveryDateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **setOrderDeliveryDateRequest** | [**OpenAPI\Server\Model\SetOrderDeliveryDateRequest**](../Model/SetOrderDeliveryDateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **setOrderDeliveryTrackCode**
> OpenAPI\Server\Model\EmptyApiResponse setOrderDeliveryTrackCode($campaignId, $orderId, $setOrderDeliveryTrackCodeRequest)

Передача трек‑номера посылки

{% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderDeliveryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderDeliveryApiInterface;

class OrderDeliveryApi implements OrderDeliveryApiInterface
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
     * Implementation of OrderDeliveryApiInterface#setOrderDeliveryTrackCode
     */
    public function setOrderDeliveryTrackCode(int $campaignId, int $orderId, SetOrderDeliveryTrackCodeRequest $setOrderDeliveryTrackCodeRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **setOrderDeliveryTrackCodeRequest** | [**OpenAPI\Server\Model\SetOrderDeliveryTrackCodeRequest**](../Model/SetOrderDeliveryTrackCodeRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateOrderStorageLimit**
> OpenAPI\Server\Model\EmptyApiResponse updateOrderStorageLimit($campaignId, $orderId, $updateOrderStorageLimitRequest)

Продление срока хранения заказа

Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderDeliveryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderDeliveryApiInterface;

class OrderDeliveryApi implements OrderDeliveryApiInterface
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
     * Implementation of OrderDeliveryApiInterface#updateOrderStorageLimit
     */
    public function updateOrderStorageLimit(int $campaignId, int $orderId, UpdateOrderStorageLimitRequest $updateOrderStorageLimitRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateOrderStorageLimitRequest** | [**OpenAPI\Server\Model\UpdateOrderStorageLimitRequest**](../Model/UpdateOrderStorageLimitRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **verifyOrderEac**
> OpenAPI\Server\Model\VerifyOrderEacResponse verifyOrderEac($campaignId, $orderId, $verifyOrderEacRequest)

Передача кода подтверждения

Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderDeliveryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderDeliveryApiInterface;

class OrderDeliveryApi implements OrderDeliveryApiInterface
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
     * Implementation of OrderDeliveryApiInterface#verifyOrderEac
     */
    public function verifyOrderEac(int $campaignId, int $orderId, VerifyOrderEacRequest $verifyOrderEacRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **verifyOrderEacRequest** | [**OpenAPI\Server\Model\VerifyOrderEacRequest**](../Model/VerifyOrderEacRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\VerifyOrderEacResponse**](../Model/VerifyOrderEacResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

