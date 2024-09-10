# DeliveryServicesController

All URIs are relative to `""`

The controller class is defined in **[DeliveryServicesController.java](../../src/main/java/org/openapitools/controller/DeliveryServicesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeliveryServices**](#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки

<a id="getDeliveryServices"></a>
# **getDeliveryServices**
```java
Mono<GetDeliveryServicesResponse> DeliveryServicesController.getDeliveryServices()
```

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 


### Return type
[**GetDeliveryServicesResponse**](../../docs/models/GetDeliveryServicesResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

