# OpenAPI\Server\Api\RatingsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQualityRatingDetails**](RatingsApiInterface.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**getQualityRatings**](RatingsApiInterface.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\RatingsApi:
        tags:
            - { name: "open_api_server.api", api: "ratings" }
    # ...
```

## **getQualityRatingDetails**
> OpenAPI\Server\Model\GetQualityRatingDetailsResponse getQualityRatingDetails($campaignId)

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RatingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RatingsApiInterface;

class RatingsApi implements RatingsApiInterface
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
     * Implementation of RatingsApiInterface#getQualityRatingDetails
     */
    public function getQualityRatingDetails(int $campaignId, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\GetQualityRatingDetailsResponse**](../Model/GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getQualityRatings**
> OpenAPI\Server\Model\GetQualityRatingResponse getQualityRatings($businessId, $getQualityRatingRequest)

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/RatingsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\RatingsApiInterface;

class RatingsApi implements RatingsApiInterface
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
     * Implementation of RatingsApiInterface#getQualityRatings
     */
    public function getQualityRatings(int $businessId, GetQualityRatingRequest $getQualityRatingRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getQualityRatingRequest** | [**OpenAPI\Server\Model\GetQualityRatingRequest**](../Model/GetQualityRatingRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\GetQualityRatingResponse**](../Model/GetQualityRatingResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

