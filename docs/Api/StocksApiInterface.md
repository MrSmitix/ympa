# OpenAPI\Server\Api\StocksApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStocks**](StocksApiInterface.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
[**updateStocks**](StocksApiInterface.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\StocksApi:
        tags:
            - { name: "open_api_server.api", api: "stocks" }
    # ...
```

## **getStocks**
> OpenAPI\Server\Model\GetWarehouseStocksResponse getStocks($campaignId, $pageToken, $limit, $getWarehouseStocksRequest)

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StocksApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StocksApiInterface;

class StocksApi implements StocksApiInterface
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
     * Implementation of StocksApiInterface#getStocks
     */
    public function getStocks(int $campaignId, ?string $pageToken, ?int $limit, ?GetWarehouseStocksRequest $getWarehouseStocksRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageToken** | **string**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются. | [optional]
 **limit** | **int**| Количество значений на одной странице. | [optional]
 **getWarehouseStocksRequest** | [**OpenAPI\Server\Model\GetWarehouseStocksRequest**](../Model/GetWarehouseStocksRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetWarehouseStocksResponse**](../Model/GetWarehouseStocksResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **updateStocks**
> OpenAPI\Server\Model\EmptyApiResponse updateStocks($campaignId, $updateStocksRequest)

Передача информации об остатках

Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/StocksApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\StocksApiInterface;

class StocksApi implements StocksApiInterface
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
     * Implementation of StocksApiInterface#updateStocks
     */
    public function updateStocks(int $campaignId, UpdateStocksRequest $updateStocksRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **updateStocksRequest** | [**OpenAPI\Server\Model\UpdateStocksRequest**](../Model/UpdateStocksRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\EmptyApiResponse**](../Model/EmptyApiResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

