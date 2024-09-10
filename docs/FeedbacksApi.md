# FeedbacksApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeedbackAndCommentUpdates**](FeedbacksApi.md#getFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине



## getFeedbackAndCommentUpdates

> GetFeedbackListResponse getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

Новые и обновленные отзывы о магазине

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.FeedbacksApi;

FeedbacksApi apiInstance = new FeedbacksApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
String pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
Integer limit = 20; // Integer | Количество значений на одной странице. 
Date fromDate = null; // Date | Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: `ГГГГ-ММ-ДД`. 
try {
    GetFeedbackListResponse result = apiInstance.getFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FeedbacksApi#getFeedbackAndCommentUpdates");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null]
 **fromDate** | **Date**| Начальная дата обновления отзывов.  Если параметр указан, возвращаются отзывы, которые были написаны или обновлены с этой даты.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] [default to null]

### Return type

[**GetFeedbackListResponse**](GetFeedbackListResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

