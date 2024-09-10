
# Table `OrderDTO`
(mapped from: OrderDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderItemDTO&gt;**](OrderItemDTO.md) | Список товаров в заказе. | 
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор заказа. |  [optional]
**status** | status | long |  | [**OrderStatusType**](OrderStatusType.md) |  |  [optional] [foreignkey]
**substatus** | substatus | long |  | [**OrderSubstatusType**](OrderSubstatusType.md) |  |  [optional] [foreignkey]
**creationDate** | creationDate | text |  | **kotlin.String** |  |  [optional]
**updatedAt** | updatedAt | text |  | **kotlin.String** |  |  [optional]
**currency** | currency | long |  | [**CurrencyType**](CurrencyType.md) |  |  [optional] [foreignkey]
**itemsTotal** | itemsTotal | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Платеж покупателя.  |  [optional]
**deliveryTotal** | deliveryTotal | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость доставки.  |  [optional]
**buyerItemsTotal** | buyerItemsTotal | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  |  [optional]
**buyerTotal** | buyerTotal | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  |  [optional]
**buyerItemsTotalBeforeDiscount** | buyerItemsTotalBeforeDiscount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  |  [optional]
**buyerTotalBeforeDiscount** | buyerTotalBeforeDiscount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  |  [optional]
**paymentType** | paymentType | long |  | [**OrderPaymentType**](OrderPaymentType.md) |  |  [optional] [foreignkey]
**paymentMethod** | paymentMethod | long |  | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  |  [optional] [foreignkey]
**fake** | fake | boolean |  | **kotlin.Boolean** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  |  [optional]
**subsidies** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OrderSubsidyDTO&gt;**](OrderSubsidyDTO.md) | Список субсидий по типам. |  [optional]
**delivery** | delivery | long |  | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  |  [optional] [foreignkey]
**buyer** | buyer | long |  | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  |  [optional] [foreignkey]
**notes** | notes | text |  | **kotlin.String** | Комментарий к заказу. |  [optional]
**taxSystem** | taxSystem | long |  | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  |  [optional] [foreignkey]
**cancelRequested** | cancelRequested | boolean |  | **kotlin.Boolean** | **Только для модели DBS**  Запрошена ли отмена.  |  [optional]
**expiryDate** | expiryDate | text |  | **kotlin.String** |  |  [optional]


# **Table `OrderDTOOrderItemDTO`**
(mapped from: OrderDTOOrderItemDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderDTO | orderDTO | long | | kotlin.Long | Primary Key | *one*
orderItemDTO | orderItemDTO | long | | kotlin.Long | Foreign Key | *many*


















# **Table `OrderDTOOrderSubsidyDTO`**
(mapped from: OrderDTOOrderSubsidyDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderDTO | orderDTO | long | | kotlin.Long | Primary Key | *one*
orderSubsidyDTO | orderSubsidyDTO | long | | kotlin.Long | Foreign Key | *many*









