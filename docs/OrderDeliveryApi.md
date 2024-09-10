# OpenapiClient::OrderDeliveryApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_order_buyer_info**](OrderDeliveryApi.md#get_order_buyer_info) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице |
| [**set_order_delivery_date**](OrderDeliveryApi.md#set_order_delivery_date) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа |
| [**set_order_delivery_track_code**](OrderDeliveryApi.md#set_order_delivery_track_code) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки |
| [**update_order_storage_limit**](OrderDeliveryApi.md#update_order_storage_limit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа |
| [**verify_order_eac**](OrderDeliveryApi.md#verify_order_eac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения |


## get_order_buyer_info

> <GetOrderBuyerInfoResponse> get_order_buyer_info(campaign_id, order_id)

Информация о покупателе — физическом лице

Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderDeliveryApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Информация о покупателе — физическом лице
  result = api_instance.get_order_buyer_info(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->get_order_buyer_info: #{e}"
end
```

#### Using the get_order_buyer_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrderBuyerInfoResponse>, Integer, Hash)> get_order_buyer_info_with_http_info(campaign_id, order_id)

```ruby
begin
  # Информация о покупателе — физическом лице
  data, status_code, headers = api_instance.get_order_buyer_info_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrderBuyerInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->get_order_buyer_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetOrderBuyerInfoResponse**](GetOrderBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## set_order_delivery_date

> <EmptyApiResponse> set_order_delivery_date(campaign_id, order_id, set_order_delivery_date_request)

Изменение даты доставки заказа

Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderDeliveryApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
set_order_delivery_date_request = OpenapiClient::SetOrderDeliveryDateRequest.new({dates: OpenapiClient::OrderDeliveryDateDTO.new({to_date: Date.today}), reason: OpenapiClient::OrderDeliveryDateReasonType::USER_MOVED_DELIVERY_DATES}) # SetOrderDeliveryDateRequest | 

begin
  # Изменение даты доставки заказа
  result = api_instance.set_order_delivery_date(campaign_id, order_id, set_order_delivery_date_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->set_order_delivery_date: #{e}"
end
```

#### Using the set_order_delivery_date_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_order_delivery_date_with_http_info(campaign_id, order_id, set_order_delivery_date_request)

```ruby
begin
  # Изменение даты доставки заказа
  data, status_code, headers = api_instance.set_order_delivery_date_with_http_info(campaign_id, order_id, set_order_delivery_date_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->set_order_delivery_date_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **set_order_delivery_date_request** | [**SetOrderDeliveryDateRequest**](SetOrderDeliveryDateRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_order_delivery_track_code

> <EmptyApiResponse> set_order_delivery_track_code(campaign_id, order_id, set_order_delivery_track_code_request)

Передача трек‑номера посылки

{% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderDeliveryApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
set_order_delivery_track_code_request = OpenapiClient::SetOrderDeliveryTrackCodeRequest.new({track_code: 'track_code_example', delivery_service_id: 3.56}) # SetOrderDeliveryTrackCodeRequest | 

begin
  # Передача трек‑номера посылки
  result = api_instance.set_order_delivery_track_code(campaign_id, order_id, set_order_delivery_track_code_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->set_order_delivery_track_code: #{e}"
end
```

#### Using the set_order_delivery_track_code_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_order_delivery_track_code_with_http_info(campaign_id, order_id, set_order_delivery_track_code_request)

```ruby
begin
  # Передача трек‑номера посылки
  data, status_code, headers = api_instance.set_order_delivery_track_code_with_http_info(campaign_id, order_id, set_order_delivery_track_code_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->set_order_delivery_track_code_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **set_order_delivery_track_code_request** | [**SetOrderDeliveryTrackCodeRequest**](SetOrderDeliveryTrackCodeRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_order_storage_limit

> <EmptyApiResponse> update_order_storage_limit(campaign_id, order_id, update_order_storage_limit_request)

Продление срока хранения заказа

Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderDeliveryApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
update_order_storage_limit_request = OpenapiClient::UpdateOrderStorageLimitRequest.new({new_date: Date.today}) # UpdateOrderStorageLimitRequest | 

begin
  # Продление срока хранения заказа
  result = api_instance.update_order_storage_limit(campaign_id, order_id, update_order_storage_limit_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->update_order_storage_limit: #{e}"
end
```

#### Using the update_order_storage_limit_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_order_storage_limit_with_http_info(campaign_id, order_id, update_order_storage_limit_request)

```ruby
begin
  # Продление срока хранения заказа
  data, status_code, headers = api_instance.update_order_storage_limit_with_http_info(campaign_id, order_id, update_order_storage_limit_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->update_order_storage_limit_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **update_order_storage_limit_request** | [**UpdateOrderStorageLimitRequest**](UpdateOrderStorageLimitRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## verify_order_eac

> <VerifyOrderEacResponse> verify_order_eac(campaign_id, order_id, verify_order_eac_request)

Передача кода подтверждения

Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderDeliveryApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
verify_order_eac_request = OpenapiClient::VerifyOrderEacRequest.new # VerifyOrderEacRequest | 

begin
  # Передача кода подтверждения
  result = api_instance.verify_order_eac(campaign_id, order_id, verify_order_eac_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->verify_order_eac: #{e}"
end
```

#### Using the verify_order_eac_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VerifyOrderEacResponse>, Integer, Hash)> verify_order_eac_with_http_info(campaign_id, order_id, verify_order_eac_request)

```ruby
begin
  # Передача кода подтверждения
  data, status_code, headers = api_instance.verify_order_eac_with_http_info(campaign_id, order_id, verify_order_eac_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VerifyOrderEacResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderDeliveryApi->verify_order_eac_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **verify_order_eac_request** | [**VerifyOrderEacRequest**](VerifyOrderEacRequest.md) |  |  |

### Return type

[**VerifyOrderEacResponse**](VerifyOrderEacResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

