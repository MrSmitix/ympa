# GoodsFeedbackApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteGoodsFeedbackComment**](GoodsFeedbackApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
| [**getGoodsFeedbackComments**](GoodsFeedbackApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
| [**getGoodsFeedbacks**](GoodsFeedbackApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
| [**skipGoodsFeedbacksReaction**](GoodsFeedbackApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
| [**updateGoodsFeedbackComment**](GoodsFeedbackApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |


<a name="deleteGoodsFeedbackComment"></a>
# **deleteGoodsFeedbackComment**
> EmptyApiResponse deleteGoodsFeedbackComment(businessId, DeleteGoodsFeedbackCommentRequest)

Удаление комментария к отзыву

    Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null] |
| **DeleteGoodsFeedbackCommentRequest** | [**DeleteGoodsFeedbackCommentRequest**](../Models/DeleteGoodsFeedbackCommentRequest.md)|  | |

### Return type

[**EmptyApiResponse**](../Models/EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getGoodsFeedbackComments"></a>
# **getGoodsFeedbackComments**
> GetGoodsFeedbackCommentsResponse getGoodsFeedbackComments(businessId, GetGoodsFeedbackCommentsRequest, page\_token, limit)

Получение комментариев к отзыву

    Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null] |
| **GetGoodsFeedbackCommentsRequest** | [**GetGoodsFeedbackCommentsRequest**](../Models/GetGoodsFeedbackCommentsRequest.md)|  | |
| **page\_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null] |
| **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null] |

### Return type

[**GetGoodsFeedbackCommentsResponse**](../Models/GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getGoodsFeedbacks"></a>
# **getGoodsFeedbacks**
> GetGoodsFeedbackResponse getGoodsFeedbacks(businessId, page\_token, limit, GetGoodsFeedbackRequest)

Получение отзывов о товарах продавца

    Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null] |
| **page\_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null] |
| **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null] |
| **GetGoodsFeedbackRequest** | [**GetGoodsFeedbackRequest**](../Models/GetGoodsFeedbackRequest.md)|  | [optional] |

### Return type

[**GetGoodsFeedbackResponse**](../Models/GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="skipGoodsFeedbacksReaction"></a>
# **skipGoodsFeedbacksReaction**
> EmptyApiResponse skipGoodsFeedbacksReaction(businessId, SkipGoodsFeedbackReactionRequest)

Отказ от ответа на отзывы

    Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null] |
| **SkipGoodsFeedbackReactionRequest** | [**SkipGoodsFeedbackReactionRequest**](../Models/SkipGoodsFeedbackReactionRequest.md)|  | |

### Return type

[**EmptyApiResponse**](../Models/EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="updateGoodsFeedbackComment"></a>
# **updateGoodsFeedbackComment**
> UpdateGoodsFeedbackCommentResponse updateGoodsFeedbackComment(businessId, UpdateGoodsFeedbackCommentRequest)

Добавление нового или изменение созданного комментария

    Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null] |
| **UpdateGoodsFeedbackCommentRequest** | [**UpdateGoodsFeedbackCommentRequest**](../Models/UpdateGoodsFeedbackCommentRequest.md)|  | |

### Return type

[**UpdateGoodsFeedbackCommentResponse**](../Models/UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

