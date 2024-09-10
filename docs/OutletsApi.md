# OutletsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOutlet**](OutletsApi.md#createOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
[**deleteOutlet**](OutletsApi.md#deleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
[**getOutlet**](OutletsApi.md#getOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
[**getOutlets**](OutletsApi.md#getOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
[**updateOutlet**](OutletsApi.md#updateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж



## createOutlet

Создание точки продаж

Создает точку продаж магазина на Маркете.

В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.

|**⚙️ Лимит:** 100 000 запросов в час|
|-|

### Example

```bash
 createOutlet campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **changeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  |

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## deleteOutlet

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.

В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.

|**⚙️ Лимит:** 100 000 запросов в час|
|-|

### Example

```bash
 deleteOutlet campaignId=value outletId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **outletId** | **integer** | Идентификатор точки продаж. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOutlet

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.

В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.

|**⚙️ Лимит:** 100 000 запросов в час|
|-|

### Example

```bash
 getOutlet campaignId=value outletId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **outletId** | **integer** | Идентификатор точки продаж. | [default to null]

### Return type

[**GetOutletResponse**](GetOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOutlets

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.

В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.

|**⚙️ Лимит:** 100 000 запросов в час|
|-|

### Example

```bash
 getOutlets campaignId=value  page_token=value  region_id=value  shop_outlet_code=value  regionId=value
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
 **regionId** | **integer** | Идентификатор региона.
Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов.
Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). | [optional] [default to null]
 **shopOutletCode** | **string** | Идентификатор точки продаж, присвоенный магазином. | [optional] [default to null]
 **regionId2** | **integer** | {% note warning \"\" %}

Этот параметр устарел. Для указания региона используйте 'region_id'.

{% endnote %} | [optional] [default to null]

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## updateOutlet

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.

В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.

|**⚙️ Лимит:** 100 000 запросов в час|
|-|

### Example

```bash
 updateOutlet campaignId=value outletId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **outletId** | **integer** | Идентификатор точки продаж. | [default to null]
 **changeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

