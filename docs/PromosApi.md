# PromosApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePromoOffers**](PromosApi.md#deletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**getPromoOffers**](PromosApi.md#getPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**getPromos**](PromosApi.md#getPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**updatePromoOffers**](PromosApi.md#updatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен



## deletePromoOffers

Удаление товаров из акции

Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 deletePromoOffers businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **deletePromoOffersRequest** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md) |  |

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPromoOffers

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре 'limit' не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getPromoOffers businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getPromoOffersRequest** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md) |  |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPromos

Получение списка акций

Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр 'participation'.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getPromos businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getPromosRequest** | [**GetPromosRequest**](GetPromosRequest.md) |  | [optional]

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updatePromoOffers

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 updatePromoOffers businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updatePromoOffersRequest** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md) |  |

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

