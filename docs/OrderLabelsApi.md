# OpenapiClient::OrderLabelsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**generate_order_label**](OrderLabelsApi.md#generate_order_label) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе |
| [**generate_order_labels**](OrderLabelsApi.md#generate_order_labels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе |
| [**get_order_labels_data**](OrderLabelsApi.md#get_order_labels_data) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков |


## generate_order_label

> File generate_order_label(campaign_id, order_id, shipment_id, box_id, opts)

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderLabelsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
shipment_id = 789 # Integer | Идентификатор грузоместа.
box_id = 789 # Integer | Идентификатор коробки.
opts = {
  format: OpenapiClient::PageFormatType::A7 # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
}

begin
  # Готовый ярлык‑наклейка для коробки в заказе
  result = api_instance.generate_order_label(campaign_id, order_id, shipment_id, box_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderLabelsApi->generate_order_label: #{e}"
end
```

#### Using the generate_order_label_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> generate_order_label_with_http_info(campaign_id, order_id, shipment_id, box_id, opts)

```ruby
begin
  # Готовый ярлык‑наклейка для коробки в заказе
  data, status_code, headers = api_instance.generate_order_label_with_http_info(campaign_id, order_id, shipment_id, box_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderLabelsApi->generate_order_label_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **shipment_id** | **Integer** | Идентификатор грузоместа. |  |
| **box_id** | **Integer** | Идентификатор коробки. |  |
| **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## generate_order_labels

> File generate_order_labels(campaign_id, order_id, opts)

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderLabelsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
opts = {
  format: OpenapiClient::PageFormatType::A7 # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
}

begin
  # Готовые ярлыки‑наклейки на все коробки в одном заказе
  result = api_instance.generate_order_labels(campaign_id, order_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderLabelsApi->generate_order_labels: #{e}"
end
```

#### Using the generate_order_labels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> generate_order_labels_with_http_info(campaign_id, order_id, opts)

```ruby
begin
  # Готовые ярлыки‑наклейки на все коробки в одном заказе
  data, status_code, headers = api_instance.generate_order_labels_with_http_info(campaign_id, order_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderLabelsApi->generate_order_labels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## get_order_labels_data

> <GetOrderLabelsDataResponse> get_order_labels_data(campaign_id, order_id)

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OrderLabelsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.

begin
  # Данные для самостоятельного изготовления ярлыков
  result = api_instance.get_order_labels_data(campaign_id, order_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderLabelsApi->get_order_labels_data: #{e}"
end
```

#### Using the get_order_labels_data_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOrderLabelsDataResponse>, Integer, Hash)> get_order_labels_data_with_http_info(campaign_id, order_id)

```ruby
begin
  # Данные для самостоятельного изготовления ярлыков
  data, status_code, headers = api_instance.get_order_labels_data_with_http_info(campaign_id, order_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOrderLabelsDataResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OrderLabelsApi->get_order_labels_data_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |

### Return type

[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

