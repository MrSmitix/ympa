# TariffsController

All URIs are relative to `""`

The controller class is defined in **[TariffsController.java](../../src/main/java/org/openapitools/controller/TariffsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateTariffs**](#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг

<a id="calculateTariffs"></a>
# **calculateTariffs**
```java
Mono<CalculateTariffsResponse> TariffsController.calculateTariffs(calculateTariffsRequest)
```

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**calculateTariffsRequest** | [**CalculateTariffsRequest**](../../docs/models/CalculateTariffsRequest.md) |  |

### Return type
[**CalculateTariffsResponse**](../../docs/models/CalculateTariffsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

