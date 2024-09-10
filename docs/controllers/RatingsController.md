# RatingsController

All URIs are relative to `""`

The controller class is defined in **[RatingsController.java](../../src/main/java/org/openapitools/controller/RatingsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQualityRatingDetails**](#getQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**getQualityRatings**](#getQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов

<a id="getQualityRatingDetails"></a>
# **getQualityRatingDetails**
```java
Mono<GetQualityRatingDetailsResponse> RatingsController.getQualityRatingDetails(campaignId)
```

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetQualityRatingDetailsResponse**](../../docs/models/GetQualityRatingDetailsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getQualityRatings"></a>
# **getQualityRatings**
```java
Mono<GetQualityRatingResponse> RatingsController.getQualityRatings(businessIdgetQualityRatingRequest)
```

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**getQualityRatingRequest** | [**GetQualityRatingRequest**](../../docs/models/GetQualityRatingRequest.md) |  |

### Return type
[**GetQualityRatingResponse**](../../docs/models/GetQualityRatingResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

