# WWW::OpenAPIClient::DeliveryServicesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DeliveryServicesApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_delivery_services**](DeliveryServicesApi.md#get_delivery_services) | **GET** /delivery/services | Справочник служб доставки


# **get_delivery_services**
> GetDeliveryServicesResponse get_delivery_services()

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DeliveryServicesApi;
my $api_instance = WWW::OpenAPIClient::DeliveryServicesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);


eval {
    my $result = $api_instance->get_delivery_services();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DeliveryServicesApi->get_delivery_services: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

