# OpenapiClient::OrderBuyerInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Идентификатор покупателя. | [optional] |
| **last_name** | **String** | Фамилия покупателя. | [optional] |
| **first_name** | **String** | Имя покупателя. | [optional] |
| **middle_name** | **String** | Отчество покупателя. | [optional] |
| **type** | [**OrderBuyerType**](OrderBuyerType.md) |  | [optional] |
| **phone** | **String** | Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: &#x60;+&lt;код_страны&gt;&lt;код_региона&gt;&lt;номер_телефона&gt;&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderBuyerInfoDTO.new(
  id: null,
  last_name: null,
  first_name: null,
  middle_name: null,
  type: null,
  phone: null
)
```

