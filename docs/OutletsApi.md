# OutletsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_outlet**](OutletsApi.md#create_outlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж
[**delete_outlet**](OutletsApi.md#delete_outlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж
[**get_outlet**](OutletsApi.md#get_outlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж
[**get_outlets**](OutletsApi.md#get_outlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж
[**update_outlet**](OutletsApi.md#update_outlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж


# **create_outlet**
> create_outlet(_api::OutletsApi, campaign_id::Int64, change_outlet_request::ChangeOutletRequest; _mediaType=nothing) -> CreateOutletResponse, OpenAPI.Clients.ApiResponse <br/>
> create_outlet(_api::OutletsApi, response_stream::Channel, campaign_id::Int64, change_outlet_request::ChangeOutletRequest; _mediaType=nothing) -> Channel{ CreateOutletResponse }, OpenAPI.Clients.ApiResponse

Создание точки продаж

Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **OutletsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**change_outlet_request** | [**ChangeOutletRequest**](ChangeOutletRequest.md)|  | 

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **delete_outlet**
> delete_outlet(_api::OutletsApi, campaign_id::Int64, outlet_id::Int64; _mediaType=nothing) -> EmptyApiResponse, OpenAPI.Clients.ApiResponse <br/>
> delete_outlet(_api::OutletsApi, response_stream::Channel, campaign_id::Int64, outlet_id::Int64; _mediaType=nothing) -> Channel{ EmptyApiResponse }, OpenAPI.Clients.ApiResponse

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **OutletsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**outlet_id** | **Int64**| Идентификатор точки продаж. | [default to nothing]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_outlet**
> get_outlet(_api::OutletsApi, campaign_id::Int64, outlet_id::Int64; _mediaType=nothing) -> GetOutletResponse, OpenAPI.Clients.ApiResponse <br/>
> get_outlet(_api::OutletsApi, response_stream::Channel, campaign_id::Int64, outlet_id::Int64; _mediaType=nothing) -> Channel{ GetOutletResponse }, OpenAPI.Clients.ApiResponse

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **OutletsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**outlet_id** | **Int64**| Идентификатор точки продаж. | [default to nothing]

### Return type

[**GetOutletResponse**](GetOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_outlets**
> get_outlets(_api::OutletsApi, campaign_id::Int64; page_token=nothing, region_id=nothing, shop_outlet_code=nothing, region_id2=nothing, _mediaType=nothing) -> GetOutletsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_outlets(_api::OutletsApi, response_stream::Channel, campaign_id::Int64; page_token=nothing, region_id=nothing, shop_outlet_code=nothing, region_id2=nothing, _mediaType=nothing) -> Channel{ GetOutletsResponse }, OpenAPI.Clients.ApiResponse

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **OutletsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [default to nothing]
 **region_id** | **Int64**| Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  | [default to nothing]
 **shop_outlet_code** | **String**| Идентификатор точки продаж, присвоенный магазином. | [default to nothing]
 **region_id2** | **Int64**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  | [default to nothing]

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **update_outlet**
> update_outlet(_api::OutletsApi, campaign_id::Int64, outlet_id::Int64, change_outlet_request::ChangeOutletRequest; _mediaType=nothing) -> EmptyApiResponse, OpenAPI.Clients.ApiResponse <br/>
> update_outlet(_api::OutletsApi, response_stream::Channel, campaign_id::Int64, outlet_id::Int64, change_outlet_request::ChangeOutletRequest; _mediaType=nothing) -> Channel{ EmptyApiResponse }, OpenAPI.Clients.ApiResponse

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **OutletsApi** | API context | 
**campaign_id** | **Int64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**outlet_id** | **Int64**| Идентификатор точки продаж. | [default to nothing]
**change_outlet_request** | [**ChangeOutletRequest**](ChangeOutletRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

