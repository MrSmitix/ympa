# GoodsFeedbackApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGoodsFeedbackComment**](GoodsFeedbackApi.md#deleteGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**getGoodsFeedbackComments**](GoodsFeedbackApi.md#getGoodsFeedbackComments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**getGoodsFeedbacks**](GoodsFeedbackApi.md#getGoodsFeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**skipGoodsFeedbacksReaction**](GoodsFeedbackApi.md#skipGoodsFeedbacksReaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**updateGoodsFeedbackComment**](GoodsFeedbackApi.md#updateGoodsFeedbackComment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария



## deleteGoodsFeedbackComment

Удаление комментария к отзыву

Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 deleteGoodsFeedbackComment businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteGoodsFeedbackCommentRequest** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getGoodsFeedbackComments

Получение комментариев к отзыву

Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в 'page_token', если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getGoodsFeedbackComments businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getGoodsFeedbackCommentsRequest** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getGoodsFeedbacks

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в 'page_token', если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getGoodsFeedbacks businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **getGoodsFeedbackRequest** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md) |  | [optional]

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## skipGoodsFeedbacksReaction

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 skipGoodsFeedbacksReaction businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **skipGoodsFeedbackReactionRequest** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateGoodsFeedbackComment

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва 'feedbackId'.

Чтобы добавить комментарий к другому комментарию, передайте:

* 'feedbackId' — идентификатор отзыва;
* 'comment.parentId' — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* 'feedbackId'— идентификатор отзыва;
* 'comment.id' — идентификатор комментария, который нужно изменить.

Если передать одновременно 'comment.parentId' и 'comment.id', будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 updateGoodsFeedbackComment businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateGoodsFeedbackCommentRequest** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md) |  |

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

