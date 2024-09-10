# CategoriesController

All URIs are relative to `""`

The controller class is defined in **[CategoriesController.java](../../src/main/java/org/openapitools/controller/CategoriesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoriesMaxSaleQuantum**](#getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**getCategoriesTree**](#getCategoriesTree) | **POST** /categories/tree | Дерево категорий

<a id="getCategoriesMaxSaleQuantum"></a>
# **getCategoriesMaxSaleQuantum**
```java
Mono<GetCategoriesMaxSaleQuantumResponse> CategoriesController.getCategoriesMaxSaleQuantum(getCategoriesMaxSaleQuantumRequest)
```

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**getCategoriesMaxSaleQuantumRequest** | [**GetCategoriesMaxSaleQuantumRequest**](../../docs/models/GetCategoriesMaxSaleQuantumRequest.md) |  |

### Return type
[**GetCategoriesMaxSaleQuantumResponse**](../../docs/models/GetCategoriesMaxSaleQuantumResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getCategoriesTree"></a>
# **getCategoriesTree**
```java
Mono<GetCategoriesResponse> CategoriesController.getCategoriesTree(getCategoriesRequest)
```

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**getCategoriesRequest** | [**GetCategoriesRequest**](../../docs/models/GetCategoriesRequest.md) |  | [optional parameter]

### Return type
[**GetCategoriesResponse**](../../docs/models/GetCategoriesResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

