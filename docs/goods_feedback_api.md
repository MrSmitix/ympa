# goods_feedback_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteGoodsFeedbackComment**](goods_feedback_api.md#DeleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**GetGoodsFeedbackComments**](goods_feedback_api.md#GetGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**GetGoodsFeedbacks**](goods_feedback_api.md#GetGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**SkipGoodsFeedbacksReaction**](goods_feedback_api.md#SkipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**UpdateGoodsFeedbackComment**](goods_feedback_api.md#UpdateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария


<a name="DeleteGoodsFeedbackComment"></a>
# **DeleteGoodsFeedbackComment**
> EmptyApiResponse DeleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest)

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
<a name="GetGoodsFeedbackComments"></a>
# **GetGoodsFeedbackComments**
> GetGoodsFeedbackCommentsResponse GetGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit)

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
<a name="GetGoodsFeedbacks"></a>
# **GetGoodsFeedbacks**
> GetGoodsFeedbackResponse GetGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest)

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
<a name="SkipGoodsFeedbacksReaction"></a>
# **SkipGoodsFeedbacksReaction**
> EmptyApiResponse SkipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest)

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
<a name="UpdateGoodsFeedbackComment"></a>
# **UpdateGoodsFeedbackComment**
> UpdateGoodsFeedbackCommentResponse UpdateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest)

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
