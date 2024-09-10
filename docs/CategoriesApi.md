# ympa_csharp_client.Api.CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetCategoriesMaxSaleQuantum**](CategoriesApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**GetCategoriesTree**](CategoriesApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий |

<a id="getcategoriesmaxsalequantum"></a>
# **GetCategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse GetCategoriesMaxSaleQuantum (GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ympa_csharp_client.Api;
using ympa_csharp_client.Client;
using ympa_csharp_client.Model;

namespace Example
{
    public class GetCategoriesMaxSaleQuantumExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.partner.market.yandex.ru";
            // Configure OAuth2 access token for authorization: OAuth
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CategoriesApi(config);
            var getCategoriesMaxSaleQuantumRequest = new GetCategoriesMaxSaleQuantumRequest(); // GetCategoriesMaxSaleQuantumRequest | 

            try
            {
                // Лимит на установку кванта продажи и минимального количества товаров в заказе
                GetCategoriesMaxSaleQuantumResponse result = apiInstance.GetCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CategoriesApi.GetCategoriesMaxSaleQuantum: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCategoriesMaxSaleQuantumWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Лимит на установку кванта продажи и минимального количества товаров в заказе
    ApiResponse<GetCategoriesMaxSaleQuantumResponse> response = apiInstance.GetCategoriesMaxSaleQuantumWithHttpInfo(getCategoriesMaxSaleQuantumRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CategoriesApi.GetCategoriesMaxSaleQuantumWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md) |  |  |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Лимит на установку кванта и минимального количества товаров. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="getcategoriestree"></a>
# **GetCategoriesTree**
> GetCategoriesResponse GetCategoriesTree (GetCategoriesRequest? getCategoriesRequest = null)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ympa_csharp_client.Api;
using ympa_csharp_client.Client;
using ympa_csharp_client.Model;

namespace Example
{
    public class GetCategoriesTreeExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.partner.market.yandex.ru";
            // Configure OAuth2 access token for authorization: OAuth
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            var apiInstance = new CategoriesApi(config);
            var getCategoriesRequest = new GetCategoriesRequest?(); // GetCategoriesRequest? |  (optional) 

            try
            {
                // Дерево категорий
                GetCategoriesResponse result = apiInstance.GetCategoriesTree(getCategoriesRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CategoriesApi.GetCategoriesTree: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the GetCategoriesTreeWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Дерево категорий
    ApiResponse<GetCategoriesResponse> response = apiInstance.GetCategoriesTreeWithHttpInfo(getCategoriesRequest);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CategoriesApi.GetCategoriesTreeWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **getCategoriesRequest** | [**GetCategoriesRequest?**](GetCategoriesRequest?.md) |  | [optional]  |

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Категории Маркета. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

