# TariffsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TariffsAPI_calculateTariffs**](TariffsAPI.md#TariffsAPI_calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


# **TariffsAPI_calculateTariffs**
```c
// Калькулятор стоимости услуг
//
// Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
calculate_tariffs_response_t* TariffsAPI_calculateTariffs(apiClient_t *apiClient, calculate_tariffs_request_t *calculate_tariffs_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**calculate_tariffs_request** | **[calculate_tariffs_request_t](calculate_tariffs_request.md) \*** |  | 

### Return type

[calculate_tariffs_response_t](calculate_tariffs_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

