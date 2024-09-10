# WWW::OpenAPIClient::OutletLicensesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OutletLicensesApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_outlet_licenses**](OutletLicensesApi.md#delete_outlet_licenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж
[**get_outlet_licenses**](OutletLicensesApi.md#get_outlet_licenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж
[**update_outlet_licenses**](OutletLicensesApi.md#update_outlet_licenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж


# **delete_outlet_licenses**
> EmptyApiResponse delete_outlet_licenses(campaign_id => $campaign_id, ids => $ids)

Удаление лицензий для точек продаж

Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OutletLicensesApi;
my $api_instance = WWW::OpenAPIClient::OutletLicensesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $ids = [(null)]; # ARRAY[int] | Список идентификаторов лицензий.

eval {
    my $result = $api_instance->delete_outlet_licenses(campaign_id => $campaign_id, ids => $ids);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OutletLicensesApi->delete_outlet_licenses: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **ids** | [**ARRAY[int]**](int.md)| Список идентификаторов лицензий. | [optional] 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_outlet_licenses**
> GetOutletLicensesResponse get_outlet_licenses(campaign_id => $campaign_id, outlet_ids => $outlet_ids, ids => $ids)

Информация о лицензиях для точек продаж

Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OutletLicensesApi;
my $api_instance = WWW::OpenAPIClient::OutletLicensesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $outlet_ids = [(null)]; # ARRAY[int] | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке. 
my $ids = [(null)]; # ARRAY[int] | Список идентификаторов лицензий.

eval {
    my $result = $api_instance->get_outlet_licenses(campaign_id => $campaign_id, outlet_ids => $outlet_ids, ids => $ids);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OutletLicensesApi->get_outlet_licenses: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **outlet_ids** | [**ARRAY[int]**](int.md)| Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке.  | [optional] 
 **ids** | [**ARRAY[int]**](int.md)| Список идентификаторов лицензий. | [optional] 

### Return type

[**GetOutletLicensesResponse**](GetOutletLicensesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_outlet_licenses**
> EmptyApiResponse update_outlet_licenses(campaign_id => $campaign_id, update_outlet_license_request => $update_outlet_license_request)

Создание и изменение лицензий для точек продаж

Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OutletLicensesApi;
my $api_instance = WWW::OpenAPIClient::OutletLicensesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $update_outlet_license_request = WWW::OpenAPIClient::Object::UpdateOutletLicenseRequest->new(); # UpdateOutletLicenseRequest | 

eval {
    my $result = $api_instance->update_outlet_licenses(campaign_id => $campaign_id, update_outlet_license_request => $update_outlet_license_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OutletLicensesApi->update_outlet_licenses: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **update_outlet_license_request** | [**UpdateOutletLicenseRequest**](UpdateOutletLicenseRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

