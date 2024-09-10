# OrdersStatsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStats**](OrdersStatsApi.md#getOrdersStats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам



## getOrdersStats

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.

{% note info \"\" %}

Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)

{% endnote %}

В одном запросе можно получить информацию не более чем по 200 заказам.

|**⚙️ Лимит:** 1 000 000 запросов в час|
|-|

### Example

```bash
 getOrdersStats campaignId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getOrdersStatsRequest** | [**GetOrdersStatsRequest**](GetOrdersStatsRequest.md) |  | [optional]

### Return type

[**GetOrdersStatsResponse**](GetOrdersStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

