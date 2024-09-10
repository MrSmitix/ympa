# ReturnsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReturn**](ReturnsApi.md#getReturn) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате
[**getReturnApplication**](ReturnsApi.md#getReturnApplication) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат
[**getReturnPhoto**](ReturnsApi.md#getReturnPhoto) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата
[**getReturns**](ReturnsApi.md#getReturns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов
[**setReturnDecision**](ReturnsApi.md#setReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату
[**submitReturnDecision**](ReturnsApi.md#submitReturnDecision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату



## getReturn

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturn campaignId=value orderId=value returnId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturnApplication

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturnApplication campaignId=value orderId=value returnId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]

### Return type

**binary**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturnPhoto

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturnPhoto campaignId=value orderId=value returnId=value itemId=value imageHash=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]
 **itemId** | **integer** | Идентификатор товара в возврате. | [default to null]
 **imageHash** | **string** | Хеш ссылки изображения для загрузки. | [default to null]

### Return type

**binary**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/octet-stream, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReturns

Список невыкупов и возвратов

Получает список невыкупов и возвратов.

Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 getReturns campaignId=value  page_token=value  limit=value  Specify as:  orderIds="value1,value2,..."  Specify as:  statuses="value1,value2,..."  type=value  fromDate=value  toDate=value  from_date=value  to_date=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **orderIds** | [**array[integer]**](integer.md) | Идентификаторы заказов — для фильтрации результатов.

Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. | [optional] [default to null]
 **statuses** | [**array[RefundStatusType]**](RefundStatusType.md) | Статусы возвратов или невыкупов — для фильтрации результатов.

Несколько статусов перечисляются через запятую. | [optional] [default to null]
 **type** | [**ReturnType**](.md) | Тип заказа для фильтрации:

* 'RETURN' — возврат.

* 'UNREDEEMED' — невыкуп.

Если не указывать, в ответе будут и возвраты, и невыкупы. | [optional] [default to null]
 **fromDate** | **string** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: 'ГГГГ-ММ-ДД'. | [optional] [default to null]
 **toDate** | **string** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.

Формат: 'ГГГГ-ММ-ДД'. | [optional] [default to null]
 **fromDate2** | **string** | {% note warning \"\" %}

Этот параметр устарел. Вместо него используйте 'fromDate'.

{% endnote %}

Начальная дата для фильтрации возвратов или невыкупов по дате обновления. | [optional] [default to null]
 **toDate2** | **string** | {% note warning \"\" %}

Этот параметр устарел. Вместо него используйте 'toDate'.

{% endnote %}

Конечная дата для фильтрации возвратов или невыкупов по дате обновления. | [optional] [default to null]

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setReturnDecision

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 setReturnDecision campaignId=value orderId=value returnId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]
 **setReturnDecisionRequest** | [**SetReturnDecisionRequest**](SetReturnDecisionRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## submitReturnDecision

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).

|**⚙️ Лимит:** 10 000 запросов в час|
|-|

### Example

```bash
 submitReturnDecision campaignId=value orderId=value returnId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]
 **returnId** | **integer** | Идентификатор возврата. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

