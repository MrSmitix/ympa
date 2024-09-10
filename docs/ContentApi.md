# ContentApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryContentParameters**](ContentApi.md#getCategoryContentParameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**getOfferCardsContentStatus**](ContentApi.md#getOfferCardsContentStatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**updateOfferContent**](ContentApi.md#updateOfferContent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара



## getCategoryContentParameters

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.

|**⚙️ Лимит:** 50 категорий в минуту |
|-|

### Example

```bash
 getCategoryContentParameters categoryId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **integer** | Идентификатор категории на Маркете.

Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | [default to null]

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOfferCardsContentStatus

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|

### Example

```bash
 getOfferCardsContentStatus businessId=value  page_token=value  limit=value
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
 **getOfferCardsContentStatusRequest** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md) |  | [optional]

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOfferContent

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning \"Здесь только то, что относится к конкретной категории\" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом 'string', передайте пустое значение.

{% note info \"Данные в каталоге обновляются не мгновенно\" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|

### Example

```bash
 updateOfferContent businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **updateOfferContentRequest** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md) |  |

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

