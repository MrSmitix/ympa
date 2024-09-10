# DeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_delivery_services**](DeliveryServicesApi.md#get_delivery_services) | **GET** /delivery/services | Справочник служб доставки


# **get_delivery_services**
> get_delivery_services(_api::DeliveryServicesApi; _mediaType=nothing) -> GetDeliveryServicesResponse, OpenAPI.Clients.ApiResponse <br/>
> get_delivery_services(_api::DeliveryServicesApi, response_stream::Channel; _mediaType=nothing) -> Channel{ GetDeliveryServicesResponse }, OpenAPI.Clients.ApiResponse

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

