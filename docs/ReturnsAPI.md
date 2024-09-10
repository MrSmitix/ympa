# ReturnsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReturnsAPI_getReturn**](ReturnsAPI.md#ReturnsAPI_getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**ReturnsAPI_getReturnApplication**](ReturnsAPI.md#ReturnsAPI_getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**ReturnsAPI_getReturnPhoto**](ReturnsAPI.md#ReturnsAPI_getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**ReturnsAPI_getReturns**](ReturnsAPI.md#ReturnsAPI_getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**ReturnsAPI_setReturnDecision**](ReturnsAPI.md#ReturnsAPI_setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
[**ReturnsAPI_submitReturnDecision**](ReturnsAPI.md#ReturnsAPI_submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату


# **ReturnsAPI_getReturn**
```c
// Информация о невыкупе или возврате
//
// Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_return_response_t* ReturnsAPI_getReturn(apiClient_t *apiClient, long campaignId, long orderId, long returnId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 

### Return type

[get_return_response_t](get_return_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReturnsAPI_getReturnApplication**
```c
// Получение заявления на возврат
//
// Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t** ReturnsAPI_getReturnApplication(apiClient_t *apiClient, long campaignId, long orderId, long returnId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReturnsAPI_getReturnPhoto**
```c
// Получение фотографии возврата
//
// Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
binary_t** ReturnsAPI_getReturnPhoto(apiClient_t *apiClient, long campaignId, long orderId, long returnId, long itemId, char *imageHash);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 
**itemId** | **long** | Идентификатор товара в возврате. | 
**imageHash** | **char \*** | Хеш ссылки изображения для загрузки. | 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReturnsAPI_getReturns**
```c
// Список невыкупов и возвратов
//
// Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
get_returns_response_t* ReturnsAPI_getReturns(apiClient_t *apiClient, long campaignId, char *page_token, int *limit, list_t *orderIds, list_t *statuses, return_type_e type, char fromDate, char toDate, char from_date, char to_date);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**page_token** | **char \*** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
**limit** | **int \*** | Количество значений на одной странице.  | [optional] 
**orderIds** | **[list_t](long.md) \*** | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] 
**statuses** | **[list_t](refund_status_type.md) \*** | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] 
**type** | **return_type_e** | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] 
**fromDate** | **char** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**toDate** | **char** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] 
**from_date** | **char** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] 
**to_date** | **char** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] 

### Return type

[get_returns_response_t](get_returns_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReturnsAPI_setReturnDecision**
```c
// Принятие или изменение решения по возврату
//
// Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t* ReturnsAPI_setReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId, set_return_decision_request_t *set_return_decision_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 
**set_return_decision_request** | **[set_return_decision_request_t](set_return_decision_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReturnsAPI_submitReturnDecision**
```c
// Подтверждение решения по возврату
//
// Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 
//
empty_api_response_t* ReturnsAPI_submitReturnDecision(apiClient_t *apiClient, long campaignId, long orderId, long returnId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**returnId** | **long** | Идентификатор возврата. | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

