# DeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeliveryServices**](DeliveryServicesApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки



## getDeliveryServices

> GetDeliveryServicesResponse getDeliveryServices()

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.DeliveryServicesApi;

DeliveryServicesApi apiInstance = new DeliveryServicesApi();
try {
    GetDeliveryServicesResponse result = apiInstance.getDeliveryServices();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DeliveryServicesApi#getDeliveryServices");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

