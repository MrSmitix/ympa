# DeliveryServicesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeliveryServicesAPI_getDeliveryServices**](DeliveryServicesAPI.md#DeliveryServicesAPI_getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки


# **DeliveryServicesAPI_getDeliveryServices**
```c
// Справочник служб доставки
//
// Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
//
get_delivery_services_response_t* DeliveryServicesAPI_getDeliveryServices(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[get_delivery_services_response_t](get_delivery_services_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

