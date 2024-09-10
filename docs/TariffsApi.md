# WWW::OpenAPIClient::TariffsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::TariffsApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculate_tariffs**](TariffsApi.md#calculate_tariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


# **calculate_tariffs**
> CalculateTariffsResponse calculate_tariffs(calculate_tariffs_request => $calculate_tariffs_request)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::TariffsApi;
my $api_instance = WWW::OpenAPIClient::TariffsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $calculate_tariffs_request = WWW::OpenAPIClient::Object::CalculateTariffsRequest->new(); # CalculateTariffsRequest | 

eval {
    my $result = $api_instance->calculate_tariffs(calculate_tariffs_request => $calculate_tariffs_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling TariffsApi->calculate_tariffs: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculate_tariffs_request** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | 

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

