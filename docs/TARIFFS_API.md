# TARIFFS_API

All URIs are relative to *https://api.partner.market.yandex.ru*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**calculate_tariffs**](TARIFFS_API.md#calculate_tariffs) | **Post** /tariffs/calculate | Калькулятор стоимости услуг


# **calculate_tariffs**
> calculate_tariffs (calculate_tariffs_request: CALCULATE_TARIFFS_REQUEST ): detachable CALCULATE_TARIFFS_RESPONSE


Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculate_tariffs_request** | [**CALCULATE_TARIFFS_REQUEST**](CALCULATE_TARIFFS_REQUEST.md)|  | 

### Return type

[**CALCULATE_TARIFFS_RESPONSE**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

