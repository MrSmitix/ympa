# PromosApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeletePromoOffers**](PromosApi.md#DeletePromoOffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**GetPromoOffers**](PromosApi.md#GetPromoOffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**GetPromos**](PromosApi.md#GetPromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**UpdatePromoOffers**](PromosApi.md#UpdatePromoOffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен


# **DeletePromoOffers**
> DeletePromoOffersResponse DeletePromoOffers(business_id, delete_promo_offers_request)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Удаление товаров из акции
#
# prepare function argument(s)
var_business_id <- 56 # integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_delete_promo_offers_request <- DeletePromoOffersRequest$new("promoId_example", "deleteAllOffers_example", c("offerIds_example")) # DeletePromoOffersRequest | 

api_instance <- PromosApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeletePromoOffers(var_business_id, var_delete_promo_offers_requestdata_file = "result.txt")
result <- api_instance$DeletePromoOffers(var_business_id, var_delete_promo_offers_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **integer**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **delete_promo_offers_request** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md)|  | 

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Результат удаления товаров из акции. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GetPromoOffers**
> GetPromoOffersResponse GetPromoOffers(business_id, get_promo_offers_request, page_token = var.page_token, limit = var.limit)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Получение списка товаров, которые участвуют или могут участвовать в акции
#
# prepare function argument(s)
var_business_id <- 56 # integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_get_promo_offers_request <- GetPromoOffersRequest$new("promoId_example", PromoOfferParticipationStatusFilterType$new()) # GetPromoOffersRequest | 
var_page_token <- "eyBuZXh0SWQ6IDIzNDIgfQ==" # character | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (Optional)
var_limit <- 20 # integer | Количество значений на одной странице.  (Optional)

api_instance <- PromosApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetPromoOffers(var_business_id, var_get_promo_offers_request, page_token = var_page_token, limit = var_limitdata_file = "result.txt")
result <- api_instance$GetPromoOffers(var_business_id, var_get_promo_offers_request, page_token = var_page_token, limit = var_limit)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **integer**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_promo_offers_request** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md)|  | 
 **page_token** | **character**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **integer**| Количество значений на одной странице.  | [optional] 

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список товаров, которые участвуют или могут участвовать в акции. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GetPromos**
> GetPromosResponse GetPromos(business_id, get_promos_request = var.get_promos_request)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Получение списка акций
#
# prepare function argument(s)
var_business_id <- 56 # integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_get_promos_request <- GetPromosRequest$new(PromoParticipationType$new(), MechanicsType$new()) # GetPromosRequest |  (Optional)

api_instance <- PromosApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetPromos(var_business_id, get_promos_request = var_get_promos_requestdata_file = "result.txt")
result <- api_instance$GetPromos(var_business_id, get_promos_request = var_get_promos_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **integer**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_promos_request** | [**GetPromosRequest**](GetPromosRequest.md)|  | [optional] 

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список акций Маркета. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **UpdatePromoOffers**
> UpdatePromoOffersResponse UpdatePromoOffers(business_id, update_promo_offers_request)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Добавление товаров в акцию или изменение их цен
#
# prepare function argument(s)
var_business_id <- 56 # integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_update_promo_offers_request <- UpdatePromoOffersRequest$new("promoId_example", c(UpdatePromoOfferDTO$new("offerId_example", UpdatePromoOfferParamsDTO$new(UpdatePromoOfferDiscountParamsDTO$new(123, 123))))) # UpdatePromoOffersRequest | 

api_instance <- PromosApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdatePromoOffers(var_business_id, var_update_promo_offers_requestdata_file = "result.txt")
result <- api_instance$UpdatePromoOffers(var_business_id, var_update_promo_offers_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **integer**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_promo_offers_request** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md)|  | 

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Результат добавления товаров в акцию или обновления их цен. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

