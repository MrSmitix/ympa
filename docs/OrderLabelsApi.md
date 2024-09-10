# WWW::OpenAPIClient::OrderLabelsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OrderLabelsApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_order_label**](OrderLabelsApi.md#generate_order_label) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**generate_order_labels**](OrderLabelsApi.md#generate_order_labels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**get_order_labels_data**](OrderLabelsApi.md#get_order_labels_data) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков


# **generate_order_label**
> string generate_order_label(campaign_id => $campaign_id, order_id => $order_id, shipment_id => $shipment_id, box_id => $box_id, format => $format)

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderLabelsApi;
my $api_instance = WWW::OpenAPIClient::OrderLabelsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.
my $shipment_id = 789; # int | Идентификатор грузоместа.
my $box_id = 789; # int | Идентификатор коробки.
my $format = new WWW::OpenAPIClient.PageFormatType(); # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.

eval {
    my $result = $api_instance->generate_order_label(campaign_id => $campaign_id, order_id => $order_id, shipment_id => $shipment_id, box_id => $box_id, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderLabelsApi->generate_order_label: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 
 **shipment_id** | **int**| Идентификатор грузоместа. | 
 **box_id** | **int**| Идентификатор коробки. | 
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] 

### Return type

**string**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_order_labels**
> string generate_order_labels(campaign_id => $campaign_id, order_id => $order_id, format => $format)

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderLabelsApi;
my $api_instance = WWW::OpenAPIClient::OrderLabelsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.
my $format = new WWW::OpenAPIClient.PageFormatType(); # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.

eval {
    my $result = $api_instance->generate_order_labels(campaign_id => $campaign_id, order_id => $order_id, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderLabelsApi->generate_order_labels: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] 

### Return type

**string**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_order_labels_data**
> GetOrderLabelsDataResponse get_order_labels_data(campaign_id => $campaign_id, order_id => $order_id)

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderLabelsApi;
my $api_instance = WWW::OpenAPIClient::OrderLabelsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.

eval {
    my $result = $api_instance->get_order_labels_data(campaign_id => $campaign_id, order_id => $order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderLabelsApi->get_order_labels_data: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 

### Return type

[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

