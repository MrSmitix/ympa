# TariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculateTariffs**](TariffsApi.md#CalculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


# **CalculateTariffs**
> CalculateTariffsResponse CalculateTariffs(calculate_tariffs_request)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```R
library(ympa_r_client)

# Калькулятор стоимости услуг
#
# prepare function argument(s)
var_calculate_tariffs_request <- CalculateTariffsRequest$new(CalculateTariffsParametersDTO$new(123, SellingProgramType$new(), PaymentFrequencyType$new()), c(CalculateTariffsOfferDTO$new(123, 123, 123, 123, 123, 123, 123))) # CalculateTariffsRequest | 

api_instance <- TariffsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$CalculateTariffs(var_calculate_tariffs_requestdata_file = "result.txt")
result <- api_instance$CalculateTariffs(var_calculate_tariffs_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculate_tariffs_request** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | 

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Стоимость услуг. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

