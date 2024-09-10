# CategoriesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CategoriesAPI_getCategoriesMaxSaleQuantum**](CategoriesAPI.md#CategoriesAPI_getCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**CategoriesAPI_getCategoriesTree**](CategoriesAPI.md#CategoriesAPI_getCategoriesTree) | **POST** /categories/tree | Дерево категорий


# **CategoriesAPI_getCategoriesMaxSaleQuantum**
```c
// Лимит на установку кванта продажи и минимального количества товаров в заказе
//
// Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_max_sale_quantum_response_t* CategoriesAPI_getCategoriesMaxSaleQuantum(apiClient_t *apiClient, get_categories_max_sale_quantum_request_t *get_categories_max_sale_quantum_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**get_categories_max_sale_quantum_request** | **[get_categories_max_sale_quantum_request_t](get_categories_max_sale_quantum_request.md) \*** |  | 

### Return type

[get_categories_max_sale_quantum_response_t](get_categories_max_sale_quantum_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **CategoriesAPI_getCategoriesTree**
```c
// Дерево категорий
//
// Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
//
get_categories_response_t* CategoriesAPI_getCategoriesTree(apiClient_t *apiClient, get_categories_request_t *get_categories_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**get_categories_request** | **[get_categories_request_t](get_categories_request.md) \*** |  | [optional] 

### Return type

[get_categories_response_t](get_categories_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

