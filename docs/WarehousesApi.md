# WarehousesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFulfillmentWarehouses**](WarehousesApi.md#GetFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**GetWarehouses**](WarehousesApi.md#GetWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


# **GetFulfillmentWarehouses**
> GetFulfillmentWarehousesResponse GetFulfillmentWarehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```R
library(ympa_r_client)

# Идентификаторы складов Маркета (FBY)
#

api_instance <- WarehousesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetFulfillmentWarehouses(data_file = "result.txt")
result <- api_instance$GetFulfillmentWarehouses()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список складов. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GetWarehouses**
> GetWarehousesResponse GetWarehouses(business_id)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```R
library(ympa_r_client)

# Список складов и групп складов
#
# prepare function argument(s)
var_business_id <- 56 # integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

api_instance <- WarehousesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetWarehouses(var_business_iddata_file = "result.txt")
result <- api_instance$GetWarehouses(var_business_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **integer**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список складов и групп складов. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

