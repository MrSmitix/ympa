# GoodsFeedbackApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_goods_feedback_comment**](GoodsFeedbackApi.md#delete_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**get_goods_feedback_comments**](GoodsFeedbackApi.md#get_goods_feedback_comments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**get_goods_feedbacks**](GoodsFeedbackApi.md#get_goods_feedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**skip_goods_feedbacks_reaction**](GoodsFeedbackApi.md#skip_goods_feedbacks_reaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**update_goods_feedback_comment**](GoodsFeedbackApi.md#update_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария


# **delete_goods_feedback_comment**
> delete_goods_feedback_comment(_api::GoodsFeedbackApi, business_id::Int64, delete_goods_feedback_comment_request::DeleteGoodsFeedbackCommentRequest; _mediaType=nothing) -> EmptyApiResponse, OpenAPI.Clients.ApiResponse <br/>
> delete_goods_feedback_comment(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, delete_goods_feedback_comment_request::DeleteGoodsFeedbackCommentRequest; _mediaType=nothing) -> Channel{ EmptyApiResponse }, OpenAPI.Clients.ApiResponse

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **GoodsFeedbackApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**delete_goods_feedback_comment_request** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_goods_feedback_comments**
> get_goods_feedback_comments(_api::GoodsFeedbackApi, business_id::Int64, get_goods_feedback_comments_request::GetGoodsFeedbackCommentsRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> GetGoodsFeedbackCommentsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_goods_feedback_comments(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, get_goods_feedback_comments_request::GetGoodsFeedbackCommentsRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> Channel{ GetGoodsFeedbackCommentsResponse }, OpenAPI.Clients.ApiResponse

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **GoodsFeedbackApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**get_goods_feedback_comments_request** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [default to nothing]
 **limit** | **Int64**| Количество значений на одной странице.  | [default to nothing]

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_goods_feedbacks**
> get_goods_feedbacks(_api::GoodsFeedbackApi, business_id::Int64; page_token=nothing, limit=nothing, get_goods_feedback_request=nothing, _mediaType=nothing) -> GetGoodsFeedbackResponse, OpenAPI.Clients.ApiResponse <br/>
> get_goods_feedbacks(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64; page_token=nothing, limit=nothing, get_goods_feedback_request=nothing, _mediaType=nothing) -> Channel{ GetGoodsFeedbackResponse }, OpenAPI.Clients.ApiResponse

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **GoodsFeedbackApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [default to nothing]
 **limit** | **Int64**| Количество значений на одной странице.  | [default to nothing]
 **get_goods_feedback_request** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md)|  | 

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **skip_goods_feedbacks_reaction**
> skip_goods_feedbacks_reaction(_api::GoodsFeedbackApi, business_id::Int64, skip_goods_feedback_reaction_request::SkipGoodsFeedbackReactionRequest; _mediaType=nothing) -> EmptyApiResponse, OpenAPI.Clients.ApiResponse <br/>
> skip_goods_feedbacks_reaction(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, skip_goods_feedback_reaction_request::SkipGoodsFeedbackReactionRequest; _mediaType=nothing) -> Channel{ EmptyApiResponse }, OpenAPI.Clients.ApiResponse

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **GoodsFeedbackApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**skip_goods_feedback_reaction_request** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **update_goods_feedback_comment**
> update_goods_feedback_comment(_api::GoodsFeedbackApi, business_id::Int64, update_goods_feedback_comment_request::UpdateGoodsFeedbackCommentRequest; _mediaType=nothing) -> UpdateGoodsFeedbackCommentResponse, OpenAPI.Clients.ApiResponse <br/>
> update_goods_feedback_comment(_api::GoodsFeedbackApi, response_stream::Channel, business_id::Int64, update_goods_feedback_comment_request::UpdateGoodsFeedbackCommentRequest; _mediaType=nothing) -> Channel{ UpdateGoodsFeedbackCommentResponse }, OpenAPI.Clients.ApiResponse

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **GoodsFeedbackApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**update_goods_feedback_comment_request** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md)|  | 

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

