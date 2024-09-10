# ympa_csharp_client.Api.DeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetDeliveryServices**](DeliveryServicesApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки |

<a id="getdeliveryservices"></a>
# **GetDeliveryServices**
> GetDeliveryServicesResponse GetDeliveryServices ()

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ympa_csharp_client.Api;
using ympa_csharp_client.Client;
using ympa_csharp_client.Model;

namespace Example
{
    public class GetDeliveryServicesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.partner.market.yandex.ru";
            // Configure OAuth2 access token for authorization: OAuth
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new DeliveryServicesApi(config);

            try
            {
                // Справочник служб доставки
                GetDeliveryServicesResponse result = apiInstance.GetDeliveryServices();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DeliveryServicesApi.GetDeliveryServices: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetDeliveryServicesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Справочник служб доставки
    ApiResponse<GetDeliveryServicesResponse> response = apiInstance.GetDeliveryServicesWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DeliveryServicesApi.GetDeliveryServicesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters
This endpoint does not need any parameter.
### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Информация о службах доставки. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

