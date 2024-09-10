# WWW::OpenAPIClient::CategoriesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CategoriesApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_categories_max_sale_quantum**](CategoriesApi.md#get_categories_max_sale_quantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**get_categories_tree**](CategoriesApi.md#get_categories_tree) | **POST** /categories/tree | Дерево категорий


# **get_categories_max_sale_quantum**
> GetCategoriesMaxSaleQuantumResponse get_categories_max_sale_quantum(get_categories_max_sale_quantum_request => $get_categories_max_sale_quantum_request)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CategoriesApi;
my $api_instance = WWW::OpenAPIClient::CategoriesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $get_categories_max_sale_quantum_request = WWW::OpenAPIClient::Object::GetCategoriesMaxSaleQuantumRequest->new(); # GetCategoriesMaxSaleQuantumRequest | 

eval {
    my $result = $api_instance->get_categories_max_sale_quantum(get_categories_max_sale_quantum_request => $get_categories_max_sale_quantum_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoriesApi->get_categories_max_sale_quantum: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_max_sale_quantum_request** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md)|  | 

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_categories_tree**
> GetCategoriesResponse get_categories_tree(get_categories_request => $get_categories_request)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CategoriesApi;
my $api_instance = WWW::OpenAPIClient::CategoriesApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $get_categories_request = WWW::OpenAPIClient::Object::GetCategoriesRequest->new(); # GetCategoriesRequest | 

eval {
    my $result = $api_instance->get_categories_tree(get_categories_request => $get_categories_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CategoriesApi->get_categories_tree: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **get_categories_request** | [**GetCategoriesRequest**](GetCategoriesRequest.md)|  | [optional] 

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

