# WWW::OpenAPIClient::OrderDeliveryApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::OrderDeliveryApi;
```

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_order_buyer_info**](OrderDeliveryApi.md#get_order_buyer_info) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
[**set_order_delivery_date**](OrderDeliveryApi.md#set_order_delivery_date) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
[**set_order_delivery_track_code**](OrderDeliveryApi.md#set_order_delivery_track_code) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
[**update_order_storage_limit**](OrderDeliveryApi.md#update_order_storage_limit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
[**verify_order_eac**](OrderDeliveryApi.md#verify_order_eac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения


# **get_order_buyer_info**
> GetOrderBuyerInfoResponse get_order_buyer_info(campaign_id => $campaign_id, order_id => $order_id)

Информация о покупателе — физическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderDeliveryApi;
my $api_instance = WWW::OpenAPIClient::OrderDeliveryApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.

eval {
    my $result = $api_instance->get_order_buyer_info(campaign_id => $campaign_id, order_id => $order_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderDeliveryApi->get_order_buyer_info: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 

### Return type

[**GetOrderBuyerInfoResponse**](GetOrderBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_order_delivery_date**
> EmptyApiResponse set_order_delivery_date(campaign_id => $campaign_id, order_id => $order_id, set_order_delivery_date_request => $set_order_delivery_date_request)

Изменение даты доставки заказа

Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderDeliveryApi;
my $api_instance = WWW::OpenAPIClient::OrderDeliveryApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.
my $set_order_delivery_date_request = WWW::OpenAPIClient::Object::SetOrderDeliveryDateRequest->new(); # SetOrderDeliveryDateRequest | 

eval {
    my $result = $api_instance->set_order_delivery_date(campaign_id => $campaign_id, order_id => $order_id, set_order_delivery_date_request => $set_order_delivery_date_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderDeliveryApi->set_order_delivery_date: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 
 **set_order_delivery_date_request** | [**SetOrderDeliveryDateRequest**](SetOrderDeliveryDateRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_order_delivery_track_code**
> EmptyApiResponse set_order_delivery_track_code(campaign_id => $campaign_id, order_id => $order_id, set_order_delivery_track_code_request => $set_order_delivery_track_code_request)

Передача трек‑номера посылки

{% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderDeliveryApi;
my $api_instance = WWW::OpenAPIClient::OrderDeliveryApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.
my $set_order_delivery_track_code_request = WWW::OpenAPIClient::Object::SetOrderDeliveryTrackCodeRequest->new(); # SetOrderDeliveryTrackCodeRequest | 

eval {
    my $result = $api_instance->set_order_delivery_track_code(campaign_id => $campaign_id, order_id => $order_id, set_order_delivery_track_code_request => $set_order_delivery_track_code_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderDeliveryApi->set_order_delivery_track_code: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 
 **set_order_delivery_track_code_request** | [**SetOrderDeliveryTrackCodeRequest**](SetOrderDeliveryTrackCodeRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_order_storage_limit**
> EmptyApiResponse update_order_storage_limit(campaign_id => $campaign_id, order_id => $order_id, update_order_storage_limit_request => $update_order_storage_limit_request)

Продление срока хранения заказа

Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderDeliveryApi;
my $api_instance = WWW::OpenAPIClient::OrderDeliveryApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.
my $update_order_storage_limit_request = WWW::OpenAPIClient::Object::UpdateOrderStorageLimitRequest->new(); # UpdateOrderStorageLimitRequest | 

eval {
    my $result = $api_instance->update_order_storage_limit(campaign_id => $campaign_id, order_id => $order_id, update_order_storage_limit_request => $update_order_storage_limit_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderDeliveryApi->update_order_storage_limit: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 
 **update_order_storage_limit_request** | [**UpdateOrderStorageLimitRequest**](UpdateOrderStorageLimitRequest.md)|  | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_order_eac**
> VerifyOrderEacResponse verify_order_eac(campaign_id => $campaign_id, order_id => $order_id, verify_order_eac_request => $verify_order_eac_request)

Передача кода подтверждения

Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::OrderDeliveryApi;
my $api_instance = WWW::OpenAPIClient::OrderDeliveryApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $campaign_id = 789; # int | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
my $order_id = 789; # int | Идентификатор заказа.
my $verify_order_eac_request = WWW::OpenAPIClient::Object::VerifyOrderEacRequest->new(); # VerifyOrderEacRequest | 

eval {
    my $result = $api_instance->verify_order_eac(campaign_id => $campaign_id, order_id => $order_id, verify_order_eac_request => $verify_order_eac_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling OrderDeliveryApi->verify_order_eac: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **int**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **order_id** | **int**| Идентификатор заказа. | 
 **verify_order_eac_request** | [**VerifyOrderEacRequest**](VerifyOrderEacRequest.md)|  | 

### Return type

[**VerifyOrderEacResponse**](VerifyOrderEacResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

