# OpenapiClient::OrderDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор заказа. | [optional] |
| **status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] |
| **substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] |
| **creation_date** | **String** |  | [optional] |
| **updated_at** | **String** |  | [optional] |
| **currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] |
| **items_total** | **Float** | Платеж покупателя.  | [optional] |
| **delivery_total** | **Float** | Стоимость доставки.  | [optional] |
| **buyer_items_total** | **Float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] |
| **buyer_total** | **Float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] |
| **buyer_items_total_before_discount** | **Float** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] |
| **buyer_total_before_discount** | **Float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] |
| **payment_type** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] |
| **payment_method** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] |
| **fake** | **Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] |
| **items** | [**Array&lt;OrderItemDTO&gt;**](OrderItemDTO.md) | Список товаров в заказе. |  |
| **subsidies** | [**Array&lt;OrderSubsidyDTO&gt;**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] |
| **delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] |
| **buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] |
| **notes** | **String** | Комментарий к заказу. | [optional] |
| **tax_system** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] |
| **cancel_requested** | **Boolean** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] |
| **expiry_date** | **String** |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderDTO.new(
  id: null,
  status: null,
  substatus: null,
  creation_date: 23-09-2022 09:12:41,
  updated_at: 23-09-2022 09:12:41,
  currency: null,
  items_total: null,
  delivery_total: null,
  buyer_items_total: null,
  buyer_total: null,
  buyer_items_total_before_discount: null,
  buyer_total_before_discount: null,
  payment_type: null,
  payment_method: null,
  fake: null,
  items: null,
  subsidies: null,
  delivery: null,
  buyer: null,
  notes: null,
  tax_system: null,
  cancel_requested: null,
  expiry_date: 23-09-2022 09:12:41
)
```

