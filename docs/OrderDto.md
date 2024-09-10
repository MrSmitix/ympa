# OrderDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор заказа. | [optional]
**status** | Option<[**models::OrderStatusType**](OrderStatusType.md)> |  | [optional]
**substatus** | Option<[**models::OrderSubstatusType**](OrderSubstatusType.md)> |  | [optional]
**creation_date** | Option<**String**> |  | [optional]
**updated_at** | Option<**String**> |  | [optional]
**currency** | Option<[**models::CurrencyType**](CurrencyType.md)> |  | [optional]
**items_total** | Option<**f64**> | Платеж покупателя.  | [optional]
**delivery_total** | Option<**f64**> | Стоимость доставки.  | [optional]
**buyer_items_total** | Option<**f64**> | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional]
**buyer_total** | Option<**f64**> | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional]
**buyer_items_total_before_discount** | Option<**f64**> | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional]
**buyer_total_before_discount** | Option<**f64**> | {% note warning \"\" %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (`buyerItemsTotalBeforeDiscount` + стоимость доставки).  | [optional]
**payment_type** | Option<[**models::OrderPaymentType**](OrderPaymentType.md)> |  | [optional]
**payment_method** | Option<[**models::OrderPaymentMethodType**](OrderPaymentMethodType.md)> |  | [optional]
**fake** | Option<**bool**> | Тип заказа:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional]
**items** | [**Vec<models::OrderItemDto>**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | Option<[**Vec<models::OrderSubsidyDto>**](OrderSubsidyDTO.md)> | Список субсидий по типам. | [optional]
**delivery** | Option<[**models::OrderDeliveryDto**](OrderDeliveryDTO.md)> |  | [optional]
**buyer** | Option<[**models::OrderBuyerDto**](OrderBuyerDTO.md)> |  | [optional]
**notes** | Option<**String**> | Комментарий к заказу. | [optional]
**tax_system** | Option<[**models::OrderTaxSystemType**](OrderTaxSystemType.md)> |  | [optional]
**cancel_requested** | Option<**bool**> | **Только для модели DBS**  Запрошена ли отмена.  | [optional]
**expiry_date** | Option<**String**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


