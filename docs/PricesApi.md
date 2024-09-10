# PricesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPrices**](PricesApi.md#GetPrices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен
[**GetPricesByOfferIds**](PricesApi.md#GetPricesByOfferIds) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине
[**GetSuggestedPrices**](PricesApi.md#GetSuggestedPrices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров
[**UpdateBusinessPrices**](PricesApi.md#UpdateBusinessPrices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах
[**UpdatePrices**](PricesApi.md#UpdatePrices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине


# **GetPrices**
> GetPricesResponse GetPrices(campaign_id, page_token = var.page_token, limit = var.limit, archived = FALSE)

Список цен

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 

### Example
```R
library(ympa_r_client)

# Список цен
#
# prepare function argument(s)
var_campaign_id <- 56 # integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_page_token <- "eyBuZXh0SWQ6IDIzNDIgfQ==" # character | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (Optional)
var_limit <- 20 # integer | Количество значений на одной странице.  (Optional)
var_archived <- FALSE # character | Фильтр по нахождению в архиве. (Optional)

api_instance <- PricesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetPrices(var_campaign_id, page_token = var_page_token, limit = var_limit, archived = var_archiveddata_file = "result.txt")
result <- api_instance$GetPrices(var_campaign_id, page_token = var_page_token, limit = var_limit, archived = var_archived)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **integer**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **character**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **integer**| Количество значений на одной странице.  | [optional] 
 **archived** | **character**| Фильтр по нахождению в архиве. | [optional] [default to FALSE]

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список всех товаров с установленными ценами. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GetPricesByOfferIds**
> GetPricesByOfferIdsResponse GetPricesByOfferIds(campaign_id, page_token = var.page_token, limit = var.limit, get_prices_by_offer_ids_request = var.get_prices_by_offer_ids_request)

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 

### Example
```R
library(ympa_r_client)

# Просмотр цен на указанные товары в магазине
#
# prepare function argument(s)
var_campaign_id <- 56 # integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_page_token <- "eyBuZXh0SWQ6IDIzNDIgfQ==" # character | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (Optional)
var_limit <- 20 # integer | Количество значений на одной странице.  (Optional)
var_get_prices_by_offer_ids_request <- GetPricesByOfferIdsRequest$new(c("offerIds_example")) # GetPricesByOfferIdsRequest |  (Optional)

api_instance <- PricesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetPricesByOfferIds(var_campaign_id, page_token = var_page_token, limit = var_limit, get_prices_by_offer_ids_request = var_get_prices_by_offer_ids_requestdata_file = "result.txt")
result <- api_instance$GetPricesByOfferIds(var_campaign_id, page_token = var_page_token, limit = var_limit, get_prices_by_offer_ids_request = var_get_prices_by_offer_ids_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **integer**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **page_token** | **character**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **integer**| Количество значений на одной странице.  | [optional] 
 **get_prices_by_offer_ids_request** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md)|  | [optional] 

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список товаров с установленными для заданного магазина ценами. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GetSuggestedPrices**
> SuggestPricesResponse GetSuggestedPrices(campaign_id, suggest_prices_request)

Цены для продвижения товаров

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Example
```R
library(ympa_r_client)

# Цены для продвижения товаров
#
# prepare function argument(s)
var_campaign_id <- 56 # integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_suggest_prices_request <- SuggestPricesRequest$new(c(SuggestOfferPriceDTO$new("offerId_example", 123))) # SuggestPricesRequest | 

api_instance <- PricesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetSuggestedPrices(var_campaign_id, var_suggest_prices_requestdata_file = "result.txt")
result <- api_instance$GetSuggestedPrices(var_campaign_id, var_suggest_prices_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **integer**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **suggest_prices_request** | [**SuggestPricesRequest**](SuggestPricesRequest.md)|  | 

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Список цен для продвижения на Маркете. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **UpdateBusinessPrices**
> EmptyApiResponse UpdateBusinessPrices(business_id, update_business_prices_request)

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```R
library(ympa_r_client)

# Установка цен на товары во всех магазинах
#
# prepare function argument(s)
var_business_id <- 56 # integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_update_business_prices_request <- UpdateBusinessPricesRequest$new(c(UpdateBusinessOfferPriceDTO$new("offerId_example", UpdatePriceWithDiscountDTO$new(123, CurrencyType$new(), 123)))) # UpdateBusinessPricesRequest | 

api_instance <- PricesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdateBusinessPrices(var_business_id, var_update_business_prices_requestdata_file = "result.txt")
result <- api_instance$UpdateBusinessPrices(var_business_id, var_update_business_prices_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **integer**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_business_prices_request** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Маркет принял информацию о новых ценах. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **423** | К ресурсу нельзя применить указанный метод. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **UpdatePrices**
> EmptyApiResponse UpdatePrices(campaign_id, update_prices_request)

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```R
library(ympa_r_client)

# Установка цен на товары в конкретном магазине
#
# prepare function argument(s)
var_campaign_id <- 56 # integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_update_prices_request <- UpdatePricesRequest$new(c(OfferPriceDTO$new("offerId_example", PriceDTO$new(123, 123, CurrencyType$new(), 123)))) # UpdatePricesRequest | 

api_instance <- PricesApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdatePrices(var_campaign_id, var_update_prices_requestdata_file = "result.txt")
result <- api_instance$UpdatePrices(var_campaign_id, var_update_prices_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **integer**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_prices_request** | [**UpdatePricesRequest**](UpdatePricesRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Маркет принял информацию о новых ценах. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **423** | К ресурсу нельзя применить указанный метод. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

