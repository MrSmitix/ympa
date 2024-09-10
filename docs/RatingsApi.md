# RatingsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQualityRatingDetails**](RatingsApi.md#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**getQualityRatings**](RatingsApi.md#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов



## getQualityRatingDetails

> GetQualityRatingDetailsResponse getQualityRatingDetails(campaignId)

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.RatingsApi;

RatingsApi apiInstance = new RatingsApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    GetQualityRatingDetailsResponse result = apiInstance.getQualityRatingDetails(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingsApi#getQualityRatingDetails");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]

### Return type

[**GetQualityRatingDetailsResponse**](GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getQualityRatings

> GetQualityRatingResponse getQualityRatings(businessId, getQualityRatingRequest)

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.RatingsApi;

RatingsApi apiInstance = new RatingsApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
GetQualityRatingRequest getQualityRatingRequest = new GetQualityRatingRequest(); // GetQualityRatingRequest | 
try {
    GetQualityRatingResponse result = apiInstance.getQualityRatings(businessId, getQualityRatingRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RatingsApi#getQualityRatings");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **getQualityRatingRequest** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md)|  |

### Return type

[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

