# RATINGS_API

All URIs are relative to *https://api.partner.market.yandex.ru*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**quality_rating_details**](RATINGS_API.md#quality_rating_details) | **Post** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**quality_ratings**](RATINGS_API.md#quality_ratings) | **Post** /businesses/{businessId}/ratings/quality | Индекс качества магазинов


# **quality_rating_details**
> quality_rating_details (campaign_id: INTEGER_64 ): detachable GET_QUALITY_RATING_DETAILS_RESPONSE


Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **INTEGER_64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]

### Return type

[**GET_QUALITY_RATING_DETAILS_RESPONSE**](GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **quality_ratings**
> quality_ratings (business_id: INTEGER_64 ; get_quality_rating_request: GET_QUALITY_RATING_REQUEST ): detachable GET_QUALITY_RATING_RESPONSE


Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **INTEGER_64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **get_quality_rating_request** | [**GET_QUALITY_RATING_REQUEST**](GET_QUALITY_RATING_REQUEST.md)|  | 

### Return type

[**GET_QUALITY_RATING_RESPONSE**](GetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

