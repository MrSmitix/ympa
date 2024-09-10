# TariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculate_tariffs**](TariffsApi.md#calculate_tariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


# **calculate_tariffs**
> calculate_tariffs(_api::TariffsApi, calculate_tariffs_request::CalculateTariffsRequest; _mediaType=nothing) -> CalculateTariffsResponse, OpenAPI.Clients.ApiResponse <br/>
> calculate_tariffs(_api::TariffsApi, response_stream::Channel, calculate_tariffs_request::CalculateTariffsRequest; _mediaType=nothing) -> Channel{ CalculateTariffsResponse }, OpenAPI.Clients.ApiResponse

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **TariffsApi** | API context | 
**calculate_tariffs_request** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | 

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

