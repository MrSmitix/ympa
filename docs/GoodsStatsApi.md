# WWW::OpenAPIClient::GoodsStatsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::GoodsStatsApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_goods_stats**](GoodsStatsApi.md#get_goods_stats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам


# **get_goods_stats**
> GetGoodsStatsResponse get_goods_stats(campaign_id => $campaign_id, get_goods_stats_request => $get_goods_stats_request)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::GoodsStatsApi;
my $api_instance = WWW::OpenAPIClient::GoodsStatsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $get_goods_stats_request = WWW::OpenAPIClient::Object::GetGoodsStatsRequest->new(); # GetGoodsStatsRequest | 

eval {
    my $result = $api_instance->get_goods_stats(campaign_id => $campaign_id, get_goods_stats_request => $get_goods_stats_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GoodsStatsApi->get_goods_stats: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_goods_stats_request** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md)|  | 

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

