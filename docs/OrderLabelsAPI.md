# OrderLabelsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderLabelsAPI_generateOrderLabel**](OrderLabelsAPI.md#OrderLabelsAPI_generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**OrderLabelsAPI_generateOrderLabels**](OrderLabelsAPI.md#OrderLabelsAPI_generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**OrderLabelsAPI_getOrderLabelsData**](OrderLabelsAPI.md#OrderLabelsAPI_getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков


# **OrderLabelsAPI_generateOrderLabel**
```c
// Готовый ярлык‑наклейка для коробки в заказе
//
// Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t** OrderLabelsAPI_generateOrderLabel(apiClient_t *apiClient, long campaignId, long orderId, long shipmentId, long boxId, page_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**shipmentId** | **long** | Идентификатор грузоместа. | 
**boxId** | **long** | Идентификатор коробки. | 
**format** | **page_format_type_e** | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderLabelsAPI_generateOrderLabels**
```c
// Готовые ярлыки‑наклейки на все коробки в одном заказе
//
// Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
binary_t** OrderLabelsAPI_generateOrderLabels(apiClient_t *apiClient, long campaignId, long orderId, page_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**format** | **page_format_type_e** | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] 

### Return type

binary_t**



### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderLabelsAPI_getOrderLabelsData**
```c
// Данные для самостоятельного изготовления ярлыков
//
// Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
get_order_labels_data_response_t* OrderLabelsAPI_getOrderLabelsData(apiClient_t *apiClient, long campaignId, long orderId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 

### Return type

[get_order_labels_data_response_t](get_order_labels_data_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

