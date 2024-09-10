# TariffsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateTariffs**](TariffsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг



## calculateTariffs

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр 'campaignId', либо 'sellingProgram'. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 calculateTariffs
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md) |  |

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

