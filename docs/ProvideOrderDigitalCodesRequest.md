# OpenapiClient::ProvideOrderDigitalCodesRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;OrderDigitalItemDTO&gt;**](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ProvideOrderDigitalCodesRequest.new(
  items: null
)
```

