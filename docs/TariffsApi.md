# ympa_csharp_client.Api.TariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CalculateTariffs**](TariffsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |

<a id="calculatetariffs"></a>
# **CalculateTariffs**
> CalculateTariffsResponse CalculateTariffs (CalculateTariffsRequest calculateTariffsRequest)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ympa_csharp_client.Api;
using ympa_csharp_client.Client;
using ympa_csharp_client.Model;

namespace Example
{
    public class CalculateTariffsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.partner.market.yandex.ru";
            // Configure OAuth2 access token for authorization: OAuth
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new TariffsApi(config);
            var calculateTariffsRequest = new CalculateTariffsRequest(); // CalculateTariffsRequest | 

            try
            {
                // Калькулятор стоимости услуг
                CalculateTariffsResponse result = apiInstance.CalculateTariffs(calculateTariffsRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling TariffsApi.CalculateTariffs: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CalculateTariffsWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Калькулятор стоимости услуг
    ApiResponse<CalculateTariffsResponse> response = apiInstance.CalculateTariffsWithHttpInfo(calculateTariffsRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling TariffsApi.CalculateTariffsWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **calculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md) |  |  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

