# CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_categories_max_sale_quantum**](CategoriesApi.md#get_categories_max_sale_quantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**get_categories_tree**](CategoriesApi.md#get_categories_tree) | **POST** /categories/tree | Дерево категорий


# **get_categories_max_sale_quantum**
> get_categories_max_sale_quantum(_api::CategoriesApi, get_categories_max_sale_quantum_request::GetCategoriesMaxSaleQuantumRequest; _mediaType=nothing) -> GetCategoriesMaxSaleQuantumResponse, OpenAPI.Clients.ApiResponse <br/>
> get_categories_max_sale_quantum(_api::CategoriesApi, response_stream::Channel, get_categories_max_sale_quantum_request::GetCategoriesMaxSaleQuantumRequest; _mediaType=nothing) -> Channel{ GetCategoriesMaxSaleQuantumResponse }, OpenAPI.Clients.ApiResponse

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CategoriesApi** | API context | 
**get_categories_max_sale_quantum_request** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | 

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_categories_tree**
> get_categories_tree(_api::CategoriesApi; get_categories_request=nothing, _mediaType=nothing) -> GetCategoriesResponse, OpenAPI.Clients.ApiResponse <br/>
> get_categories_tree(_api::CategoriesApi, response_stream::Channel; get_categories_request=nothing, _mediaType=nothing) -> Channel{ GetCategoriesResponse }, OpenAPI.Clients.ApiResponse

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CategoriesApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_request** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | 

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

