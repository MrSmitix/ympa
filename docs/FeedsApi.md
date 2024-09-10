# FeedsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeed**](FeedsApi.md#getFeed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе
[**getFeedIndexLogs**](FeedsApi.md#getFeedIndexLogs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа
[**getFeeds**](FeedsApi.md#getFeeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина
[**refreshFeed**](FeedsApi.md#refreshFeed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился
[**setFeedParams**](FeedsApi.md#setFeedParams) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа



## getFeed

Информация о прайс-листе

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getFeed campaignId=value feedId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]

### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getFeedIndexLogs

Отчет по индексации прайс-листа

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.

Данные в отчете возвращаются в порядке убывания значений параметра 'generationId'.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|

### Example

```bash
 getFeedIndexLogs campaignId=value feedId=value  limit=value  published_time_from=value  published_time_to=value  status=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **publishedTimeFrom** | **string** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, '2017-11-21T00:42:42+03:00'.

Значение по умолчанию: последние восемь дней со времени отправки запроса. | [optional] [default to null]
 **publishedTimeTo** | **string** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.

Формат даты: ISO 8601 со смещением относительно UTC. Например, '2017-11-31T00:42:42+03:00'.

Значение по умолчанию: дата и время отправки запроса.

{% note info %}

Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра 'published_time_to'. Значение параметра не должно быть датой из будущего.

{% endnote %} | [optional] [default to null]
 **status** | [**FeedIndexLogsStatusType**](.md) | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.

Возможные значения:
* 'ERROR' — произошли ошибки.
* 'OK' — обработан без ошибок.
* 'WARNING' — наблюдались некритичные проблемы. | [optional] [default to null]

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getFeeds

Список прайс-листов магазина

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getFeeds campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## refreshFeed

Сообщить, что прайс-лист обновился

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе.
1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете.
2. Магазин отправляет Маркету запрос методом 'POST campaigns/{campaignId}/feeds/{feedId}/refresh'.
3. Маркет начинает обновление данных магазина на сервисе.

{% note alert %}

Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — '200 OK'. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.

{% endnote %}

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|

### Example

```bash
 refreshFeed campaignId=value feedId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## setFeedParams

Изменение параметров прайс-листа

{% note warning \"\" %}

Этот метод устарел. Не используйте его.

{% endnote %}

Позволяет магазину изменить параметры прайс-листа.

Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: 'name' (название параметра) и 'value' (значение параметра).

Чтобы отменить установленное значение, передайте в теле запроса: 'name' (название параметра) и 'delete=true' (удалить значение).

|**⚙️ Лимит:** 3 запроса в час для одного прайс-листа|
|-|

### Example

```bash
 setFeedParams campaignId=value feedId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **feedId** | **integer** | Идентификатор прайс-листа. | [default to null]
 **setFeedParamsRequest** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

