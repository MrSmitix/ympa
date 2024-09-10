# OpenapiClient::ShipmentsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**confirm_shipment**](ShipmentsApi.md#confirm_shipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/confirm | Подтверждение отгрузки |
| [**download_shipment_act**](ShipmentsApi.md#download_shipment_act) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/act | Получение акта приема-передачи |
| [**download_shipment_discrepancy_act**](ShipmentsApi.md#download_shipment_discrepancy_act) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/discrepancy-act | Получение акта расхождений |
| [**download_shipment_inbound_act**](ShipmentsApi.md#download_shipment_inbound_act) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/inbound-act | Получение фактического акта приема-передачи |
| [**download_shipment_pallet_labels**](ShipmentsApi.md#download_shipment_pallet_labels) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels | Ярлыки для доверительной приемки (FBS) |
| [**download_shipment_reception_transfer_act**](ShipmentsApi.md#download_shipment_reception_transfer_act) | **GET** /campaigns/{campaignId}/shipments/reception-transfer-act | Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее |
| [**download_shipment_transportation_waybill**](ShipmentsApi.md#download_shipment_transportation_waybill) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/transportation-waybill | Получение транспортной накладной |
| [**get_shipment**](ShipmentsApi.md#get_shipment) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId} | Получение информации об одной отгрузке |
| [**get_shipment_orders_info**](ShipmentsApi.md#get_shipment_orders_info) | **GET** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/info | Получение информации о возможности печати ярлыков (FBS) |
| [**search_shipments**](ShipmentsApi.md#search_shipments) | **PUT** /campaigns/{campaignId}/first-mile/shipments | Получение информации о нескольких отгрузках |
| [**set_shipment_pallets_count**](ShipmentsApi.md#set_shipment_pallets_count) | **PUT** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets | Передача количества упаковок в отгрузке |
| [**transfer_orders_from_shipment**](ShipmentsApi.md#transfer_orders_from_shipment) | **POST** /campaigns/{campaignId}/first-mile/shipments/{shipmentId}/orders/transfer | Перенос заказов в следующую отгрузку |


## confirm_shipment

> <EmptyApiResponse> confirm_shipment(campaign_id, shipment_id, opts)

Подтверждение отгрузки

Подтверждает отгрузку товаров в сортировочный центр или пункт приема заказов. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.
opts = {
  confirm_shipment_request: OpenapiClient::ConfirmShipmentRequest.new # ConfirmShipmentRequest | 
}

begin
  # Подтверждение отгрузки
  result = api_instance.confirm_shipment(campaign_id, shipment_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->confirm_shipment: #{e}"
end
```

#### Using the confirm_shipment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> confirm_shipment_with_http_info(campaign_id, shipment_id, opts)

```ruby
begin
  # Подтверждение отгрузки
  data, status_code, headers = api_instance.confirm_shipment_with_http_info(campaign_id, shipment_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->confirm_shipment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |
| **confirm_shipment_request** | [**ConfirmShipmentRequest**](ConfirmShipmentRequest.md) |  | [optional] |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## download_shipment_act

> File download_shipment_act(campaign_id, shipment_id)

Получение акта приема-передачи

{% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам Яндекс Go, подготавливать акт приема‑передачи не нужно.  {% endnote %}  Запрос формирует акт приема-передачи заказов, входящих в отгрузку, и возвращает акт в формате PDF. В акте содержатся собранные и готовые к отправке заказы.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                         | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Дата                                                      | Дата запроса.                                                                                                                                                                                                                                                        | | Отправитель                                               | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                               | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                         | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика)       | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                      | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Вес                                                       | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                           | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.

begin
  # Получение акта приема-передачи
  result = api_instance.download_shipment_act(campaign_id, shipment_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_act: #{e}"
end
```

#### Using the download_shipment_act_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> download_shipment_act_with_http_info(campaign_id, shipment_id)

```ruby
begin
  # Получение акта приема-передачи
  data, status_code, headers = api_instance.download_shipment_act_with_http_info(campaign_id, shipment_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_act_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## download_shipment_discrepancy_act

> File download_shipment_discrepancy_act(campaign_id, shipment_id)

Получение акта расхождений

Возвращает акт расхождений для заданной отгрузки. |**⚙️ Лимит:** 200 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.

begin
  # Получение акта расхождений
  result = api_instance.download_shipment_discrepancy_act(campaign_id, shipment_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_discrepancy_act: #{e}"
end
```

#### Using the download_shipment_discrepancy_act_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> download_shipment_discrepancy_act_with_http_info(campaign_id, shipment_id)

```ruby
begin
  # Получение акта расхождений
  data, status_code, headers = api_instance.download_shipment_discrepancy_act_with_http_info(campaign_id, shipment_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_discrepancy_act_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel, application/json


## download_shipment_inbound_act

> File download_shipment_inbound_act(campaign_id, shipment_id)

Получение фактического акта приема-передачи

Возвращает фактический акт приема-передачи для заданной отгрузки.  Такой акт становится доступен спустя несколько часов после завершения отгрузки. Он может понадобиться, если после отгрузки обнаружатся расхождения.  |**⚙️ Лимит:** 200 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.

begin
  # Получение фактического акта приема-передачи
  result = api_instance.download_shipment_inbound_act(campaign_id, shipment_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_inbound_act: #{e}"
end
```

#### Using the download_shipment_inbound_act_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> download_shipment_inbound_act_with_http_info(campaign_id, shipment_id)

```ruby
begin
  # Получение фактического акта приема-передачи
  data, status_code, headers = api_instance.download_shipment_inbound_act_with_http_info(campaign_id, shipment_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_inbound_act_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## download_shipment_pallet_labels

> File download_shipment_pallet_labels(campaign_id, shipment_id, opts)

Ярлыки для доверительной приемки (FBS)

PDF-файл с ярлыками на каждый короб или палету в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Распечатайте по несколько копий каждого ярлыка: на одну тару нужно наклеить минимум 2 ярлыка с разных сторон.  Количество упаковок в отгрузке задается в запросе [PUT campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallets](../../reference/shipments/setShipmentPalletsCount.md). |**⚙️ Лимит:** 200 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.
opts = {
  format: OpenapiClient::ShipmentPalletLabelPageFormatType::A4 # ShipmentPalletLabelPageFormatType | Формат страниц PDF-файла с ярлыками:  * `A4` — по 16 ярлыков на странице. * `A8` — по одному ярлыку на странице. 
}

begin
  # Ярлыки для доверительной приемки (FBS)
  result = api_instance.download_shipment_pallet_labels(campaign_id, shipment_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_pallet_labels: #{e}"
end
```

#### Using the download_shipment_pallet_labels_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> download_shipment_pallet_labels_with_http_info(campaign_id, shipment_id, opts)

```ruby
begin
  # Ярлыки для доверительной приемки (FBS)
  data, status_code, headers = api_instance.download_shipment_pallet_labels_with_http_info(campaign_id, shipment_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_pallet_labels_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |
| **format** | [**ShipmentPalletLabelPageFormatType**](.md) | Формат страниц PDF-файла с ярлыками:  * &#x60;A4&#x60; — по 16 ярлыков на странице. * &#x60;A8&#x60; — по одному ярлыку на странице.  | [optional][default to &#39;A8&#39;] |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## download_shipment_reception_transfer_act

> File download_shipment_reception_transfer_act(campaign_id, opts)

Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее

Запрос подтверждает ближайшую отгрузку и возвращает акт приема-передачи в формате PDF.  {% note warning \"Экспресс‑доставка\" %}  Если ваш магазин подключен к экспресс‑доставке и вы отгружаете заказы курьерам [Яндекс Go](https://go.yandex/), подготавливать акт приема‑передачи не нужно.  {% endnote %}  В акт входят собранные и готовые к отправке заказы, которые отгружаются в сортировочный центр или пункт приема или курьерам Маркета.  При формировании акта Маркет автоматически находит и подставляет в шаблон следующие данные:  {% cut \"Данные, из которых Маркет формирует акт\" %}  | **Данные в акте**                                   | **Описание**                                                                                                                                                                                                                                                         | | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | | Отправитель                                         | Название вашего юридического лица, указанное в кабинете продавца на Маркете.                                                                                                                                                                                         | | Исполнитель                                         | Название юридического лица сортировочного центра или службы доставки.                                                                                                                                                                                                | | № отправления в системе заказчика                   | Ваш идентификатор заказа, который вы указали в ответе на запрос [POST order/accept](../../pushapi/reference/orderAccept.md) от Маркета.                                                                                                                              | | № отправления в системе исполнителя (субподрядчика) | Идентификатор заказа на Маркете, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md).                                                                                                                             | | Объявленная ценность                                | Общая сумма заказа без учета стоимости доставки, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                       | | Стоимость всех товаров в заказе                     | Стоимость всех заказанных товаров.                                                                                                                                                                                                                                   | | Вес                                                 | Масса брутто грузового места (суммарная масса упаковки и содержимого), как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md). | | Количество мест                                     | Количество грузовых мест в заказе, как в выходных данных запроса [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).                                     |  {% endcut %}  Остальные поля нужно заполнить самостоятельно в распечатанном акте. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  warehouse_id: 123123 # Integer | Идентификатор склада.
}

begin
  # Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
  result = api_instance.download_shipment_reception_transfer_act(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_reception_transfer_act: #{e}"
end
```

#### Using the download_shipment_reception_transfer_act_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> download_shipment_reception_transfer_act_with_http_info(campaign_id, opts)

```ruby
begin
  # Подтверждение ближайшей отгрузки и получение акта приема-передачи для нее
  data, status_code, headers = api_instance.download_shipment_reception_transfer_act_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_reception_transfer_act_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **warehouse_id** | **Integer** | Идентификатор склада. | [optional] |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## download_shipment_transportation_waybill

> File download_shipment_transportation_waybill(campaign_id, shipment_id)

Получение транспортной накладной

Возвращает транспортную накладную для заданной отгрузки.  Транспортная накладная понадобится, если вы отгружаете товары непосредственно со своего склада. [Подробно об этом способе отгрузки](https://yandex.ru/support/marketplace/orders/fbs/settings/shipment.html#at-your-warehouse)  |**⚙️ Лимит:** 200 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.

begin
  # Получение транспортной накладной
  result = api_instance.download_shipment_transportation_waybill(campaign_id, shipment_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_transportation_waybill: #{e}"
end
```

#### Using the download_shipment_transportation_waybill_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> download_shipment_transportation_waybill_with_http_info(campaign_id, shipment_id)

```ruby
begin
  # Получение транспортной накладной
  data, status_code, headers = api_instance.download_shipment_transportation_waybill_with_http_info(campaign_id, shipment_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->download_shipment_transportation_waybill_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel, application/json


## get_shipment

> <GetShipmentResponse> get_shipment(campaign_id, shipment_id, opts)

Получение информации об одной отгрузке

Возвращает информацию об отгрузке по ее идентификатору. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.
opts = {
  cancelled_orders: true # Boolean | Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
}

begin
  # Получение информации об одной отгрузке
  result = api_instance.get_shipment(campaign_id, shipment_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->get_shipment: #{e}"
end
```

#### Using the get_shipment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetShipmentResponse>, Integer, Hash)> get_shipment_with_http_info(campaign_id, shipment_id, opts)

```ruby
begin
  # Получение информации об одной отгрузке
  data, status_code, headers = api_instance.get_shipment_with_http_info(campaign_id, shipment_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetShipmentResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->get_shipment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |
| **cancelled_orders** | **Boolean** | Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;.  | [optional][default to true] |

### Return type

[**GetShipmentResponse**](GetShipmentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_shipment_orders_info

> <GetShipmentOrdersInfoResponse> get_shipment_orders_info(campaign_id, shipment_id)

Получение информации о возможности печати ярлыков (FBS)

Возвращает информацию о возможности печати ярлыков-наклеек для заказов в отгрузке. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.

begin
  # Получение информации о возможности печати ярлыков (FBS)
  result = api_instance.get_shipment_orders_info(campaign_id, shipment_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->get_shipment_orders_info: #{e}"
end
```

#### Using the get_shipment_orders_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetShipmentOrdersInfoResponse>, Integer, Hash)> get_shipment_orders_info_with_http_info(campaign_id, shipment_id)

```ruby
begin
  # Получение информации о возможности печати ярлыков (FBS)
  data, status_code, headers = api_instance.get_shipment_orders_info_with_http_info(campaign_id, shipment_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetShipmentOrdersInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->get_shipment_orders_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |

### Return type

[**GetShipmentOrdersInfoResponse**](GetShipmentOrdersInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_shipments

> <SearchShipmentsResponse> search_shipments(campaign_id, search_shipments_request, opts)

Получение информации о нескольких отгрузках

Возвращает информацию об отгрузках по заданным параметрам:  * дате; * статусу; * идентификаторам заказов.  Результаты возвращаются постранично. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
search_shipments_request = OpenapiClient::SearchShipmentsRequest.new({date_from: Date.today, date_to: Date.today}) # SearchShipmentsRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение информации о нескольких отгрузках
  result = api_instance.search_shipments(campaign_id, search_shipments_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->search_shipments: #{e}"
end
```

#### Using the search_shipments_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SearchShipmentsResponse>, Integer, Hash)> search_shipments_with_http_info(campaign_id, search_shipments_request, opts)

```ruby
begin
  # Получение информации о нескольких отгрузках
  data, status_code, headers = api_instance.search_shipments_with_http_info(campaign_id, search_shipments_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SearchShipmentsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->search_shipments_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **search_shipments_request** | [**SearchShipmentsRequest**](SearchShipmentsRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**SearchShipmentsResponse**](SearchShipmentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## set_shipment_pallets_count

> <EmptyApiResponse> set_shipment_pallets_count(campaign_id, shipment_id, set_shipment_pallets_count_request)

Передача количества упаковок в отгрузке

Передает Маркету количество коробов или палет в отгрузке для доверительной приемки. Подробнее про доверительную приемку написано в [Справке Маркета](https://yandex.ru/support/marketplace/orders/fbs/process.html#acceptance).  Получить PDF-файл с ярлыками для упаковок можно с помощью запроса [GET campaigns/{campaignId}/first-mile/shipments/{shipmentId}/pallet/labels](../../reference/shipments/downloadShipmentPalletLabels.md). |**⚙️ Лимит:** 200 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.
set_shipment_pallets_count_request = OpenapiClient::SetShipmentPalletsCountRequest.new({places_count: 37}) # SetShipmentPalletsCountRequest | 

begin
  # Передача количества упаковок в отгрузке
  result = api_instance.set_shipment_pallets_count(campaign_id, shipment_id, set_shipment_pallets_count_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->set_shipment_pallets_count: #{e}"
end
```

#### Using the set_shipment_pallets_count_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_shipment_pallets_count_with_http_info(campaign_id, shipment_id, set_shipment_pallets_count_request)

```ruby
begin
  # Передача количества упаковок в отгрузке
  data, status_code, headers = api_instance.set_shipment_pallets_count_with_http_info(campaign_id, shipment_id, set_shipment_pallets_count_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->set_shipment_pallets_count_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |
| **set_shipment_pallets_count_request** | [**SetShipmentPalletsCountRequest**](SetShipmentPalletsCountRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## transfer_orders_from_shipment

> <EmptyApiResponse> transfer_orders_from_shipment(campaign_id, shipment_id, transfer_orders_from_shipment_request)

Перенос заказов в следующую отгрузку

Переносит указанные заказы из указанной отгрузки в следующую отгрузку. [Что такое отгрузка?](https://yandex.ru/support/marketplace/orders/fbs/process.html#ship)  Используйте этот запрос, если не успеваете собрать и упаковать заказы вовремя.  {% note warning \"Такие переносы снижают индекс качества магазина\" %}  Этот запрос предназначен для исключительных случаев. Если вы будете переносить заказы слишком часто, магазин столкнется с ограничениями. [Что за ограничения?](https://yandex.ru/support/marketplace/quality/score/fbs.html)  {% endnote %}  Переносить заказы можно, если до формирования отгрузки осталось больше получаса.  Перенос происходит не мгновенно, а занимает несколько минут.  |**⚙️ Лимит:** 200 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ShipmentsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
shipment_id = 789 # Integer | Идентификатор отгрузки.
transfer_orders_from_shipment_request = OpenapiClient::TransferOrdersFromShipmentRequest.new({order_ids: [3.56]}) # TransferOrdersFromShipmentRequest | 

begin
  # Перенос заказов в следующую отгрузку
  result = api_instance.transfer_orders_from_shipment(campaign_id, shipment_id, transfer_orders_from_shipment_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->transfer_orders_from_shipment: #{e}"
end
```

#### Using the transfer_orders_from_shipment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> transfer_orders_from_shipment_with_http_info(campaign_id, shipment_id, transfer_orders_from_shipment_request)

```ruby
begin
  # Перенос заказов в следующую отгрузку
  data, status_code, headers = api_instance.transfer_orders_from_shipment_with_http_info(campaign_id, shipment_id, transfer_orders_from_shipment_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ShipmentsApi->transfer_orders_from_shipment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **shipment_id** | **Integer** | Идентификатор отгрузки. |  |
| **transfer_orders_from_shipment_request** | [**TransferOrdersFromShipmentRequest**](TransferOrdersFromShipmentRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

