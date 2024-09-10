# OrderDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор заказа. | [optional] [default to None]
**status** | [***models::OrderStatusType**](OrderStatusType.md) |  | [optional] [default to None]
**substatus** | [***models::OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to None]
**creation_date** | **String** |  | [optional] [default to None]
**updated_at** | **String** |  | [optional] [default to None]
**currency** | [***models::CurrencyType**](CurrencyType.md) |  | [optional] [default to None]
**items_total** | **f64** | Платеж покупателя.  | [optional] [default to None]
**delivery_total** | **f64** | Стоимость доставки.  | [optional] [default to None]
**buyer_items_total** | **f64** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] [default to None]
**buyer_total** | **f64** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] [default to None]
**buyer_items_total_before_discount** | **f64** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] [default to None]
**buyer_total_before_discount** | **f64** | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  | [optional] [default to None]
**payment_type** | [***models::OrderPaymentType**](OrderPaymentType.md) |  | [optional] [default to None]
**payment_method** | [***models::OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] [default to None]
**fake** | **bool** | Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] [default to None]
**items** | [**Vec<models::OrderItemDto>**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**Vec<models::OrderSubsidyDto>**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] [default to None]
**delivery** | [***models::OrderDeliveryDto**](OrderDeliveryDTO.md) |  | [optional] [default to None]
**buyer** | [***models::OrderBuyerDto**](OrderBuyerDTO.md) |  | [optional] [default to None]
**notes** | **String** | Комментарий к заказу. | [optional] [default to None]
**tax_system** | [***models::OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] [default to None]
**cancel_requested** | **bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] [default to None]
**expiry_date** | **String** |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


