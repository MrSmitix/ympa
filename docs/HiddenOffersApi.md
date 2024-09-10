# HiddenOffersApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**addHiddenOffers**](HiddenOffersApi.md#addHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия
[**deleteHiddenOffers**](HiddenOffersApi.md#deleteHiddenOffers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров
[**getHiddenOffers**](HiddenOffersApi.md#getHiddenOffers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах



## addHiddenOffers

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 addHiddenOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **addHiddenOffersRequest** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md) | Запрос на скрытие оферов. |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteHiddenOffers

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 deleteHiddenOffers campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deleteHiddenOffersRequest** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md) | Запрос на возобновление показа оферов. |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getHiddenOffers

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.

В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|

### Example

```bash
 getHiddenOffers campaignId=value  Specify as:  offer_id="value1,value2,..."  page_token=value  limit=value  offset=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **offerId** | [**array[string]**](string.md) | Идентификатор скрытого предложения. | [optional] [default to null]
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]
 **offset** | **integer** | Позиция в списке, начиная с которой возвращаются результаты ответа.

Используется вместе с параметром 'limit'.

Если задан 'offset', параметры 'page_number' и 'page_size' игнорируются.

'offset' игнорируется, если задан 'page_token'. | [optional] [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

