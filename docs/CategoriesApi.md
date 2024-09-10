# CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCategoriesMaxSaleQuantum**](CategoriesApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**getCategoriesTree**](CategoriesApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий |


<a id="getCategoriesMaxSaleQuantum"></a>
# **getCategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CategoriesApi()
val getCategoriesMaxSaleQuantumRequest : GetCategoriesMaxSaleQuantumRequest =  // GetCategoriesMaxSaleQuantumRequest | 
try {
    val result : GetCategoriesMaxSaleQuantumResponse = apiInstance.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoriesApi#getCategoriesMaxSaleQuantum")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoriesApi#getCategoriesMaxSaleQuantum")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCategoriesTree"></a>
# **getCategoriesTree**
> GetCategoriesResponse getCategoriesTree(getCategoriesRequest)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = CategoriesApi()
val getCategoriesRequest : GetCategoriesRequest =  // GetCategoriesRequest | 
try {
    val result : GetCategoriesResponse = apiInstance.getCategoriesTree(getCategoriesRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CategoriesApi#getCategoriesTree")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CategoriesApi#getCategoriesTree")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional] |

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

