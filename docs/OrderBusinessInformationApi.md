# OpenapiClient::OrderBusinessInformationApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_order_business_buyer_info**](OrderBusinessInformationApi.md#get_order_business_buyer_info) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице |
| [**get_order_business_documents_info**](OrderBusinessInformationApi.md#get_order_business_documents_info) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах |


## get_order_business_buyer_info

> <GetBusinessBuyerInfoResponse> get_order_business_buyer_info(campaign_id, order_id)

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY`, `PICKUP` или `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderBusinessInformationApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация о покупателе — юридическом лице
  result = api_instance.get_order_business_buyer_info(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderBusinessInformationApi->get_order_business_buyer_info: #{e}"
end
```

#### Using the get_order_business_buyer_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessBuyerInfoResponse>, Integer, Hash)> get_order_business_buyer_info_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация о покупателе — юридическом лице
  data, status_code, headers = api_instance.get_order_business_buyer_info_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessBuyerInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderBusinessInformationApi->get_order_business_buyer_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_order_business_documents_info

> <GetBusinessDocumentsInfoResponse> get_order_business_documents_info(campaign_id, order_id)

Информация о документах

Возвращает информацию о документах по идентификатору заказа.  Получить данные можно после того, как заказ перейдет в статус `DELIVERED`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderBusinessInformationApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация о документах
  result = api_instance.get_order_business_documents_info(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderBusinessInformationApi->get_order_business_documents_info: #{e}"
end
```

#### Using the get_order_business_documents_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessDocumentsInfoResponse>, Integer, Hash)> get_order_business_documents_info_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация о документах
  data, status_code, headers = api_instance.get_order_business_documents_info_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessDocumentsInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderBusinessInformationApi->get_order_business_documents_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

