# OpenAPI\Server\Api\WarehousesApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFulfillmentWarehouses**](WarehousesApiInterface.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**getWarehouses**](WarehousesApiInterface.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\WarehousesApi:
        tags:
            - { name: "open_api_server.api", api: "warehouses" }
    # ...
```

## **getFulfillmentWarehouses**
> OpenAPI\Server\Model\GetFulfillmentWarehousesResponse getFulfillmentWarehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/WarehousesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\WarehousesApiInterface;

class WarehousesApi implements WarehousesApiInterface
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
     * Implementation of WarehousesApiInterface#getFulfillmentWarehouses
     */
    public function getFulfillmentWarehouses(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\GetFulfillmentWarehousesResponse**](../Model/GetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getWarehouses**
> OpenAPI\Server\Model\GetWarehousesResponse getWarehouses($businessId)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/WarehousesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\WarehousesApiInterface;

class WarehousesApi implements WarehousesApiInterface
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
     * Implementation of WarehousesApiInterface#getWarehouses
     */
    public function getWarehouses(int $businessId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) |

### Return type

[**OpenAPI\Server\Model\GetWarehousesResponse**](../Model/GetWarehousesResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

