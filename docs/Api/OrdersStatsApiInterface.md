# OpenAPI\Server\Api\OrdersStatsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStats**](OrdersStatsApiInterface.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\OrdersStatsApi:
        tags:
            - { name: "open_api_server.api", api: "ordersStats" }
    # ...
```

## **getOrdersStats**
> OpenAPI\Server\Model\GetOrdersStatsResponse getOrdersStats($campaignId, $pageToken, $limit, $getOrdersStatsRequest)

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrdersStatsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrdersStatsApiInterface;

class OrdersStatsApi implements OrdersStatsApiInterface
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
     * Implementation of OrdersStatsApiInterface#getOrdersStats
     */
    public function getOrdersStats(int $campaignId, ?string $pageToken, ?int $limit, ?GetOrdersStatsRequest $getOrdersStatsRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **getOrdersStatsRequest** | [**OpenAPI\Server\Model\GetOrdersStatsRequest**](../Model/GetOrdersStatsRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\GetOrdersStatsResponse**](../Model/GetOrdersStatsResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

