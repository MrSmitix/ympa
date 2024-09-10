# StocksApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStocks**](StocksApi.md#getStocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости
[**updateStocks**](StocksApi.md#updateStocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках



## getStocks

> GetWarehouseStocksResponse getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest)

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \&quot;По умолчанию данные по оборачивамости не возращаются\&quot; %}  Чтобы они были в ответе, передавайте &#x60;true&#x60; в поле &#x60;withTurnover&#x60;.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: &lt;&gt; (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 

### Example

```java
// Import classes:
//import org.openapitools.client.api.StocksApi;

StocksApi apiInstance = new StocksApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
String pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
Integer limit = 20; // Integer | Количество значений на одной странице. 
GetWarehouseStocksRequest getWarehouseStocksRequest = new GetWarehouseStocksRequest(); // GetWarehouseStocksRequest | 
try {
    GetWarehouseStocksResponse result = apiInstance.getStocks(campaignId, pageToken, limit, getWarehouseStocksRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#getStocks");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null]
 **getWarehouseStocksRequest** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md)|  | [optional]

### Return type

[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## updateStocks

> EmptyApiResponse updateStocks(campaignId, updateStocksRequest)

Передача информации об остатках

Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \&quot;Данные в каталоге обновляются не мгновенно\&quot; %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.StocksApi;

StocksApi apiInstance = new StocksApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
UpdateStocksRequest updateStocksRequest = new UpdateStocksRequest(); // UpdateStocksRequest | 
try {
    EmptyApiResponse result = apiInstance.updateStocks(campaignId, updateStocksRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StocksApi#updateStocks");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **updateStocksRequest** | [**UpdateStocksRequest**](UpdateStocksRequest.md)|  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

