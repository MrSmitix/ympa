# OrdersStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStats**](OrdersStatsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам



## getOrdersStats

> GetOrdersStatsResponse getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest)

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \&quot;\&quot; %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrdersStatsApi;

OrdersStatsApi apiInstance = new OrdersStatsApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
String pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
Integer limit = 20; // Integer | Количество значений на одной странице. 
GetOrdersStatsRequest getOrdersStatsRequest = new GetOrdersStatsRequest(); // GetOrdersStatsRequest | 
try {
    GetOrdersStatsResponse result = apiInstance.getOrdersStats(campaignId, pageToken, limit, getOrdersStatsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrdersStatsApi#getOrdersStats");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null]
 **getOrdersStatsRequest** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md)|  | [optional]

### Return type

[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

