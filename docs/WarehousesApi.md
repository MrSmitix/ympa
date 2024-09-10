# WWW::OpenAPIClient::WarehousesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::WarehousesApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fulfillment_warehouses**](WarehousesApi.md#get_fulfillment_warehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**get_warehouses**](WarehousesApi.md#get_warehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


# **get_fulfillment_warehouses**
> GetFulfillmentWarehousesResponse get_fulfillment_warehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::WarehousesApi;
my $api_instance = WWW::OpenAPIClient::WarehousesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);


eval {
    my $result = $api_instance->get_fulfillment_warehouses();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling WarehousesApi->get_fulfillment_warehouses: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_warehouses**
> GetWarehousesResponse get_warehouses(business_id => $business_id)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::WarehousesApi;
my $api_instance = WWW::OpenAPIClient::WarehousesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $business_id = 789; # int | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

eval {
    my $result = $api_instance->get_warehouses(business_id => $business_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling WarehousesApi->get_warehouses: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **int**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

