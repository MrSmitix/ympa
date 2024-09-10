# CampaignsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCampaign**](CampaignsApi.md#getCampaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**getCampaignLogins**](CampaignsApi.md#getCampaignLogins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**getCampaignRegion**](CampaignsApi.md#getCampaignRegion) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**getCampaignSettings**](CampaignsApi.md#getCampaignSettings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**getCampaigns**](CampaignsApi.md#getCampaigns) | **GET** /campaigns | Список магазинов пользователя
[**getCampaignsByLogin**](CampaignsApi.md#getCampaignsByLogin) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину



## getCampaign

Информация о магазине

Возвращает информацию о магазине.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaign campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignLogins

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaignLogins campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignRegion

Регион магазина

{% note warning \"\" %}

Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).

{% endnote %}

Возвращает регион, в котором находится магазин.
|**⚙️ Лимит:** 5 000 запросов в час|
|-|

### Example

```bash
 getCampaignRegion campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignSettings

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaignSettings campaignId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaigns

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getCampaigns  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getCampaignsByLogin

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ.
|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 getCampaignsByLogin login=value  page=value  pageSize=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **string** | Логин пользователя. | [default to null]
 **page** | **integer** | Номер страницы результатов.

Значение по умолчанию: 1.

Используется вместе с параметром 'page_size'.

'page_number' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to 1]
 **pageSize** | **integer** | Размер страницы.

Используется вместе с параметром 'page_number'.

'page_size' игнорируется, если задан 'page_token', 'limit' или 'offset'. | [optional] [default to null]

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

