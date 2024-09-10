# PricesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrices**](PricesApi.md#getPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
[**getPricesByOfferIds**](PricesApi.md#getPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
[**getSuggestedPrices**](PricesApi.md#getSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
[**updateBusinessPrices**](PricesApi.md#updateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
[**updatePrices**](PricesApi.md#updatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине



## getPrices

Список цен

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).

{% endnote %}

Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.

{% note info %}

Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.

{% endnote %}

Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).

|**⚙️ Лимит:** '''(количество товаров партнера на витрине) * 25''' товаров в сутки|
|-|

### Example

```bash
 getPrices campaignId=value  page_token=value  limit=value  archived=value
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
 **archived** | **boolean** | Фильтр по нахождению в архиве. | [optional] [default to false]

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getPricesByOfferIds

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).

{% endnote %}

|**⚙️ Лимит:** рассчитывается по [формуле](*rule)|
|-|

[//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25)

### Example

```bash
 getPricesByOfferIds campaignId=value  page_token=value  limit=value
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
 **getPricesByOfferIdsRequest** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md) |  | [optional]

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getSuggestedPrices

Цены для продвижения товаров

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).

{% endnote %}

{% note warning \"\" %}

Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.

{% endnote %}

Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.

Товары, для которых нужно получить цены, передаются в теле POST-запроса.

Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.

Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.

Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.

Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).

|**⚙️ Лимит:** 100 000 товаров в час|
|-|

### Example

```bash
 getSuggestedPrices campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **suggestPricesRequest** | [**SuggestPricesRequest**](SuggestPricesRequest.md) |  |

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateBusinessPrices

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|

### Example

```bash
 updateBusinessPrices businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateBusinessPricesRequest** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updatePrices

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note warning \"Метод только для отдельных магазинов\" %}

Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.

Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% endnote %}

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 updatePrices campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updatePricesRequest** | [**UpdatePricesRequest**](UpdatePricesRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

