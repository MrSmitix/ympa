# OpenAPI\Server\Api\PriceQuarantineApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmBusinessPrices**](PriceQuarantineApiInterface.md#confirmBusinessPrices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
[**confirmCampaignPrices**](PriceQuarantineApiInterface.md#confirmCampaignPrices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
[**getBusinessQuarantineOffers**](PriceQuarantineApiInterface.md#getBusinessQuarantineOffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
[**getCampaignQuarantineOffers**](PriceQuarantineApiInterface.md#getCampaignQuarantineOffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PriceQuarantineApi:
        tags:
            - { name: "open_api_server.api", api: "priceQuarantine" }
    # ...
```

## **confirmBusinessPrices**
> OpenAPI\Server\Model\EmptyApiResponse confirmBusinessPrices($businessId, $confirmPricesRequest)

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PriceQuarantineApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PriceQuarantineApiInterface;

class PriceQuarantineApi implements PriceQuarantineApiInterface
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
     * Implementation of PriceQuarantineApiInterface#confirmBusinessPrices
     */
    public function confirmBusinessPrices(int $businessId, ConfirmPricesRequest $confirmPricesRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **confirmPricesRequest** | [**OpenAPI\Server\Model\ConfirmPricesRequest**](../Model/ConfirmPricesRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **confirmCampaignPrices**
> OpenAPI\Server\Model\EmptyApiResponse confirmCampaignPrices($campaignId, $confirmPricesRequest)

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PriceQuarantineApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PriceQuarantineApiInterface;

class PriceQuarantineApi implements PriceQuarantineApiInterface
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
     * Implementation of PriceQuarantineApiInterface#confirmCampaignPrices
     */
    public function confirmCampaignPrices(int $campaignId, ConfirmPricesRequest $confirmPricesRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **confirmPricesRequest** | [**OpenAPI\Server\Model\ConfirmPricesRequest**](../Model/ConfirmPricesRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBusinessQuarantineOffers**
> OpenAPI\Server\Model\GetQuarantineOffersResponse getBusinessQuarantineOffers($businessId, $getQuarantineOffersRequest, $pageToken, $limit)

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PriceQuarantineApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PriceQuarantineApiInterface;

class PriceQuarantineApi implements PriceQuarantineApiInterface
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
     * Implementation of PriceQuarantineApiInterface#getBusinessQuarantineOffers
     */
    public function getBusinessQuarantineOffers(int $businessId, GetQuarantineOffersRequest $getQuarantineOffersRequest, ?string $pageToken, ?int $limit, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getQuarantineOffersRequest** | [**OpenAPI\Server\Model\GetQuarantineOffersRequest**](../Model/GetQuarantineOffersRequest.md)|  |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]

### Return type

[**OpenAPI\Server\Model\GetQuarantineOffersResponse**](../Model/GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getCampaignQuarantineOffers**
> OpenAPI\Server\Model\GetQuarantineOffersResponse getCampaignQuarantineOffers($campaignId, $getQuarantineOffersRequest, $pageToken, $limit)

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PriceQuarantineApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PriceQuarantineApiInterface;

class PriceQuarantineApi implements PriceQuarantineApiInterface
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
     * Implementation of PriceQuarantineApiInterface#getCampaignQuarantineOffers
     */
    public function getCampaignQuarantineOffers(int $campaignId, GetQuarantineOffersRequest $getQuarantineOffersRequest, ?string $pageToken, ?int $limit, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getQuarantineOffersRequest** | [**OpenAPI\Server\Model\GetQuarantineOffersRequest**](../Model/GetQuarantineOffersRequest.md)|  |
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]

### Return type

[**OpenAPI\Server\Model\GetQuarantineOffersResponse**](../Model/GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

