# OrdersStatsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrdersStatsAPI_getOrdersStats**](OrdersStatsAPI.md#OrdersStatsAPI_getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам


# **OrdersStatsAPI_getOrdersStats**
```c
// Детальная информация по заказам
//
// Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_orders_stats_response_t* OrdersStatsAPI_getOrdersStats(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, get_orders_stats_request_t *get_orders_stats_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**get_orders_stats_request** | **[get_orders_stats_request_t](get_orders_stats_request.md) \*** |  | [optional] 

### Return type

[get_orders_stats_response_t](get_orders_stats_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

