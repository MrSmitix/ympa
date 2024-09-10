# CATEGORIES_API

All URIs are relative to *https://api.partner.market.yandex.ru*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**categories_max_sale_quantum**](CATEGORIES_API.md#categories_max_sale_quantum) | **Post** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**categories_tree**](CATEGORIES_API.md#categories_tree) | **Post** /categories/tree | Дерево категорий


# **categories_max_sale_quantum**
> categories_max_sale_quantum (get_categories_max_sale_quantum_request: GET_CATEGORIES_MAX_SALE_QUANTUM_REQUEST ): detachable GET_CATEGORIES_MAX_SALE_QUANTUM_RESPONSE


Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_max_sale_quantum_request** | [**GET_CATEGORIES_MAX_SALE_QUANTUM_REQUEST**](GET_CATEGORIES_MAX_SALE_QUANTUM_REQUEST.md)|  | 

### Return type

[**GET_CATEGORIES_MAX_SALE_QUANTUM_RESPONSE**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **categories_tree**
> categories_tree (get_categories_request:  detachable GET_CATEGORIES_REQUEST ): detachable GET_CATEGORIES_RESPONSE


Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_request** | [**GET_CATEGORIES_REQUEST**](GET_CATEGORIES_REQUEST.md)|  | [optional] 

### Return type

[**GET_CATEGORIES_RESPONSE**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

