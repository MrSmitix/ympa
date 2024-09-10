# CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCategoriesMaxSaleQuantum**](CategoriesApi.md#GetCategoriesMaxSaleQuantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**GetCategoriesTree**](CategoriesApi.md#GetCategoriesTree) | **POST** /categories/tree | Дерево категорий


# **GetCategoriesMaxSaleQuantum**
> GetCategoriesMaxSaleQuantumResponse GetCategoriesMaxSaleQuantum(get_categories_max_sale_quantum_request)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Лимит на установку кванта продажи и минимального количества товаров в заказе
#
# prepare function argument(s)
var_get_categories_max_sale_quantum_request <- GetCategoriesMaxSaleQuantumRequest$new(c(123)) # GetCategoriesMaxSaleQuantumRequest | 

api_instance <- CategoriesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetCategoriesMaxSaleQuantum(var_get_categories_max_sale_quantum_requestdata_file = "result.txt")
result <- api_instance$GetCategoriesMaxSaleQuantum(var_get_categories_max_sale_quantum_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_max_sale_quantum_request** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | 

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

# **GetCategoriesTree**
> GetCategoriesResponse GetCategoriesTree(get_categories_request = var.get_categories_request)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Дерево категорий
#
# prepare function argument(s)
var_get_categories_request <- GetCategoriesRequest$new(LanguageType$new()) # GetCategoriesRequest |  (Optional)

api_instance <- CategoriesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetCategoriesTree(get_categories_request = var_get_categories_requestdata_file = "result.txt")
result <- api_instance$GetCategoriesTree(get_categories_request = var_get_categories_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_request** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional] 

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

