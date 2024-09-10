# TariffsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateTariffs**](TariffsAPI.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


# **calculateTariffs**
```swift
    open class func calculateTariffs(calculateTariffsRequest: CalculateTariffsRequest, completion: @escaping (_ data: CalculateTariffsResponse?, _ error: Error?) -> Void)
```

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let calculateTariffsRequest = CalculateTariffsRequest(parameters: CalculateTariffsParametersDTO(campaignId: 123, sellingProgram: SellingProgramType(), frequency: PaymentFrequencyType()), offers: [CalculateTariffsOfferDTO(categoryId: 123, price: 123, length: 123, width: 123, height: 123, weight: 123, quantity: 123)]) // CalculateTariffsRequest | 

// Калькулятор стоимости услуг
TariffsAPI.calculateTariffs(calculateTariffsRequest: calculateTariffsRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
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

