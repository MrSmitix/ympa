# CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoriesMaxSaleQuantum**](CategoriesApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**getCategoriesTree**](CategoriesApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий



## getCategoriesMaxSaleQuantum

> GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest = new GetCategoriesMaxSaleQuantumRequest(); // GetCategoriesMaxSaleQuantumRequest | 
try {
    GetCategoriesMaxSaleQuantumResponse result = apiInstance.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoriesMaxSaleQuantum");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getCategoriesTree

> GetCategoriesResponse getCategoriesTree(getCategoriesRequest)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
GetCategoriesRequest getCategoriesRequest = new GetCategoriesRequest(); // GetCategoriesRequest | 
try {
    GetCategoriesResponse result = apiInstance.getCategoriesTree(getCategoriesRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategoriesTree");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesRequest** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional]

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

