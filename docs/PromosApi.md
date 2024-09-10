# PromosApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_promo_offers**](PromosApi.md#delete_promo_offers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**get_promo_offers**](PromosApi.md#get_promo_offers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**get_promos**](PromosApi.md#get_promos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**update_promo_offers**](PromosApi.md#update_promo_offers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен


# **delete_promo_offers**
> delete_promo_offers(_api::PromosApi, business_id::Int64, delete_promo_offers_request::DeletePromoOffersRequest; _mediaType=nothing) -> DeletePromoOffersResponse, OpenAPI.Clients.ApiResponse <br/>
> delete_promo_offers(_api::PromosApi, response_stream::Channel, business_id::Int64, delete_promo_offers_request::DeletePromoOffersRequest; _mediaType=nothing) -> Channel{ DeletePromoOffersResponse }, OpenAPI.Clients.ApiResponse

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **PromosApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**delete_promo_offers_request** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md)|  | 

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_promo_offers**
> get_promo_offers(_api::PromosApi, business_id::Int64, get_promo_offers_request::GetPromoOffersRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> GetPromoOffersResponse, OpenAPI.Clients.ApiResponse <br/>
> get_promo_offers(_api::PromosApi, response_stream::Channel, business_id::Int64, get_promo_offers_request::GetPromoOffersRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> Channel{ GetPromoOffersResponse }, OpenAPI.Clients.ApiResponse

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **PromosApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**get_promo_offers_request** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [default to nothing]
 **limit** | **Int64**| Количество значений на одной странице.  | [default to nothing]

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_promos**
> get_promos(_api::PromosApi, business_id::Int64; get_promos_request=nothing, _mediaType=nothing) -> GetPromosResponse, OpenAPI.Clients.ApiResponse <br/>
> get_promos(_api::PromosApi, response_stream::Channel, business_id::Int64; get_promos_request=nothing, _mediaType=nothing) -> Channel{ GetPromosResponse }, OpenAPI.Clients.ApiResponse

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **PromosApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_promos_request** | [**GetPromosRequest**](GetPromosRequest.md)|  | 

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **update_promo_offers**
> update_promo_offers(_api::PromosApi, business_id::Int64, update_promo_offers_request::UpdatePromoOffersRequest; _mediaType=nothing) -> UpdatePromoOffersResponse, OpenAPI.Clients.ApiResponse <br/>
> update_promo_offers(_api::PromosApi, response_stream::Channel, business_id::Int64, update_promo_offers_request::UpdatePromoOffersRequest; _mediaType=nothing) -> Channel{ UpdatePromoOffersResponse }, OpenAPI.Clients.ApiResponse

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **PromosApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**update_promo_offers_request** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md)|  | 

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

