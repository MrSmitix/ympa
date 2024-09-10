# OpenAPI\Server\Api\GoodsStatsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGoodsStats**](GoodsStatsApiInterface.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\GoodsStatsApi:
        tags:
            - { name: "open_api_server.api", api: "goodsStats" }
    # ...
```

## **getGoodsStats**
> OpenAPI\Server\Model\GetGoodsStatsResponse getGoodsStats($campaignId, $getGoodsStatsRequest)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GoodsStatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GoodsStatsApiInterface;

class GoodsStatsApi implements GoodsStatsApiInterface
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
     * Implementation of GoodsStatsApiInterface#getGoodsStats
     */
    public function getGoodsStats(int $campaignId, GetGoodsStatsRequest $getGoodsStatsRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getGoodsStatsRequest** | [**OpenAPI\Server\Model\GetGoodsStatsRequest**](../Model/GetGoodsStatsRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\GetGoodsStatsResponse**](../Model/GetGoodsStatsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

