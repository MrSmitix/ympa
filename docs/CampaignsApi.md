# CampaignsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_campaign**](CampaignsApi.md#get_campaign) | **GET** /campaigns/{campaignId} | Информация о магазине
[**get_campaign_logins**](CampaignsApi.md#get_campaign_logins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином
[**get_campaign_region**](CampaignsApi.md#get_campaign_region) | **GET** /campaigns/{campaignId}/region | Регион магазина
[**get_campaign_settings**](CampaignsApi.md#get_campaign_settings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина
[**get_campaigns**](CampaignsApi.md#get_campaigns) | **GET** /campaigns | Список магазинов пользователя
[**get_campaigns_by_login**](CampaignsApi.md#get_campaigns_by_login) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину


# **get_campaign**
> get_campaign(_api::CampaignsApi, campaign_id::Int64; _mediaType=nothing) -> GetCampaignResponse, OpenAPI.Clients.ApiResponse <br/>
> get_campaign(_api::CampaignsApi, response_stream::Channel, campaign_id::Int64; _mediaType=nothing) -> Channel{ GetCampaignResponse }, OpenAPI.Clients.ApiResponse

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CampaignsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_campaign_logins**
> get_campaign_logins(_api::CampaignsApi, campaign_id::Int64; _mediaType=nothing) -> GetCampaignLoginsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_campaign_logins(_api::CampaignsApi, response_stream::Channel, campaign_id::Int64; _mediaType=nothing) -> Channel{ GetCampaignLoginsResponse }, OpenAPI.Clients.ApiResponse

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CampaignsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_campaign_region**
> get_campaign_region(_api::CampaignsApi, campaign_id::Int64; _mediaType=nothing) -> GetCampaignRegionResponse, OpenAPI.Clients.ApiResponse <br/>
> get_campaign_region(_api::CampaignsApi, response_stream::Channel, campaign_id::Int64; _mediaType=nothing) -> Channel{ GetCampaignRegionResponse }, OpenAPI.Clients.ApiResponse

Регион магазина

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CampaignsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_campaign_settings**
> get_campaign_settings(_api::CampaignsApi, campaign_id::Int64; _mediaType=nothing) -> GetCampaignSettingsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_campaign_settings(_api::CampaignsApi, response_stream::Channel, campaign_id::Int64; _mediaType=nothing) -> Channel{ GetCampaignSettingsResponse }, OpenAPI.Clients.ApiResponse

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CampaignsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_campaigns**
> get_campaigns(_api::CampaignsApi; page=nothing, page_size=nothing, _mediaType=nothing) -> GetCampaignsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_campaigns(_api::CampaignsApi, response_stream::Channel; page=nothing, page_size=nothing, _mediaType=nothing) -> Channel{ GetCampaignsResponse }, OpenAPI.Clients.ApiResponse

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CampaignsApi** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Int64**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **page_size** | **Int64**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to nothing]

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_campaigns_by_login**
> get_campaigns_by_login(_api::CampaignsApi, login::String; page=nothing, page_size=nothing, _mediaType=nothing) -> GetCampaignsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_campaigns_by_login(_api::CampaignsApi, response_stream::Channel, login::String; page=nothing, page_size=nothing, _mediaType=nothing) -> Channel{ GetCampaignsResponse }, OpenAPI.Clients.ApiResponse

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **CampaignsApi** | API context | 
**login** | **String**| Логин пользователя. | [default to nothing]

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Int64**| Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to 1]
 **page_size** | **Int64**| Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [default to nothing]

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

