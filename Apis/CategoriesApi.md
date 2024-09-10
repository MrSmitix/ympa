# CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCategoriesMaxSaleQuantum**](CategoriesApi.md#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**getCategoriesTree**](CategoriesApi.md#getCategoriesTree) | **POST** /categories/tree | Дерево категорий |


<a name="getCategoriesMaxSaleQuantum"></a>
# **getCategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse getCategoriesMaxSaleQuantum(GetCategoriesMaxSaleQuantumRequest)

Лимит на установку кванта продажи и минимального количества товаров в заказе

    Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GetCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](../Models/GetCategoriesMaxSaleQuantumRequest.md)|  | |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](../Models/GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getCategoriesTree"></a>
# **getCategoriesTree**
> GetCategoriesResponse getCategoriesTree(GetCategoriesRequest)

Дерево категорий

    Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GetCategoriesRequest** | [**GetCategoriesRequest**](../Models/GetCategoriesRequest.md)|  | [optional] |

### Return type

[**GetCategoriesResponse**](../Models/GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

