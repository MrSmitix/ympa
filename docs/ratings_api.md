# ratings_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetQualityRatingDetails**](ratings_api.md#GetQualityRatingDetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**GetQualityRatings**](ratings_api.md#GetQualityRatings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов


<a name="GetQualityRatingDetails"></a>
# **GetQualityRatingDetails**
> GetQualityRatingDetailsResponse GetQualityRatingDetails(campaignId)

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 
<a name="GetQualityRatings"></a>
# **GetQualityRatings**
> GetQualityRatingResponse GetQualityRatings(businessId, getQualityRatingRequest)

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 
