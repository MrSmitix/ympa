# feedbacks_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFeedbackAndCommentUpdates**](feedbacks_api.md#GetFeedbackAndCommentUpdates) | **GET** /campaigns/{campaignId}/feedback/updates | Новые и обновленные отзывы о магазине


<a name="GetFeedbackAndCommentUpdates"></a>
# **GetFeedbackAndCommentUpdates**
> GetFeedbackListResponse GetFeedbackAndCommentUpdates(campaignId, pageToken, limit, fromDate)

Новые и обновленные отзывы о магазине

{% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
