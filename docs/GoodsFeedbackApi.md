# ympa_python_client.GoodsFeedbackApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_goods_feedback_comment**](GoodsFeedbackApi.md#delete_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**get_goods_feedback_comments**](GoodsFeedbackApi.md#get_goods_feedback_comments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**get_goods_feedbacks**](GoodsFeedbackApi.md#get_goods_feedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**skip_goods_feedbacks_reaction**](GoodsFeedbackApi.md#skip_goods_feedbacks_reaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**update_goods_feedback_comment**](GoodsFeedbackApi.md#update_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария


# **delete_goods_feedback_comment**
> EmptyApiResponse delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request)

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.delete_goods_feedback_comment_request import DeleteGoodsFeedbackCommentRequest
from ympa_python_client.models.empty_api_response import EmptyApiResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.GoodsFeedbackApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    delete_goods_feedback_comment_request = ympa_python_client.DeleteGoodsFeedbackCommentRequest() # DeleteGoodsFeedbackCommentRequest | 

    try:
        # Удаление комментария к отзыву
        api_response = api_instance.delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request)
        print("The response of GoodsFeedbackApi->delete_goods_feedback_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GoodsFeedbackApi->delete_goods_feedback_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **delete_goods_feedback_comment_request** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Пустой ответ. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goods_feedback_comments**
> GetGoodsFeedbackCommentsResponse get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, page_token=page_token, limit=limit)

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_goods_feedback_comments_request import GetGoodsFeedbackCommentsRequest
from ympa_python_client.models.get_goods_feedback_comments_response import GetGoodsFeedbackCommentsResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.GoodsFeedbackApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    get_goods_feedback_comments_request = ympa_python_client.GetGoodsFeedbackCommentsRequest() # GetGoodsFeedbackCommentsRequest | 
    page_token = 'eyBuZXh0SWQ6IDIzNDIgfQ==' # str | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
    limit = 20 # int | Количество значений на одной странице.  (optional)

    try:
        # Получение комментариев к отзыву
        api_response = api_instance.get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, page_token=page_token, limit=limit)
        print("The response of GoodsFeedbackApi->get_goods_feedback_comments:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GoodsFeedbackApi->get_goods_feedback_comments: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_goods_feedback_comments_request** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md)|  | 
 **page_token** | **str**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Дерево комментариев к отзыву. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_goods_feedbacks**
> GetGoodsFeedbackResponse get_goods_feedbacks(business_id, page_token=page_token, limit=limit, get_goods_feedback_request=get_goods_feedback_request)

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_goods_feedback_request import GetGoodsFeedbackRequest
from ympa_python_client.models.get_goods_feedback_response import GetGoodsFeedbackResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.GoodsFeedbackApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    page_token = 'eyBuZXh0SWQ6IDIzNDIgfQ==' # str | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
    limit = 20 # int | Количество значений на одной странице.  (optional)
    get_goods_feedback_request = ympa_python_client.GetGoodsFeedbackRequest() # GetGoodsFeedbackRequest |  (optional)

    try:
        # Получение отзывов о товарах продавца
        api_response = api_instance.get_goods_feedbacks(business_id, page_token=page_token, limit=limit, get_goods_feedback_request=get_goods_feedback_request)
        print("The response of GoodsFeedbackApi->get_goods_feedbacks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GoodsFeedbackApi->get_goods_feedbacks: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **str**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **int**| Количество значений на одной странице.  | [optional] 
 **get_goods_feedback_request** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md)|  | [optional] 

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Список отзывов. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **skip_goods_feedbacks_reaction**
> EmptyApiResponse skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request)

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.empty_api_response import EmptyApiResponse
from ympa_python_client.models.skip_goods_feedback_reaction_request import SkipGoodsFeedbackReactionRequest
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.GoodsFeedbackApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    skip_goods_feedback_reaction_request = ympa_python_client.SkipGoodsFeedbackReactionRequest() # SkipGoodsFeedbackReactionRequest | 

    try:
        # Отказ от ответа на отзывы
        api_response = api_instance.skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request)
        print("The response of GoodsFeedbackApi->skip_goods_feedbacks_reaction:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GoodsFeedbackApi->skip_goods_feedbacks_reaction: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **skip_goods_feedback_reaction_request** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Пустой ответ. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_goods_feedback_comment**
> UpdateGoodsFeedbackCommentResponse update_goods_feedback_comment(business_id, update_goods_feedback_comment_request)

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.update_goods_feedback_comment_request import UpdateGoodsFeedbackCommentRequest
from ympa_python_client.models.update_goods_feedback_comment_response import UpdateGoodsFeedbackCommentResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.GoodsFeedbackApi(api_client)
    business_id = 56 # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
    update_goods_feedback_comment_request = ympa_python_client.UpdateGoodsFeedbackCommentRequest() # UpdateGoodsFeedbackCommentRequest | 

    try:
        # Добавление нового или изменение созданного комментария
        api_response = api_instance.update_goods_feedback_comment(business_id, update_goods_feedback_comment_request)
        print("The response of GoodsFeedbackApi->update_goods_feedback_comment:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GoodsFeedbackApi->update_goods_feedback_comment: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_goods_feedback_comment_request** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md)|  | 

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Информация о добавленном или измененном комментарии. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

