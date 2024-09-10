# # OrderDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional]
**status** | [**\OpenAPI\Client\Model\OrderStatusType**](OrderStatusType.md) |  | [optional]
**substatus** | [**\OpenAPI\Client\Model\OrderSubstatusType**](OrderSubstatusType.md) |  | [optional]
**creation_date** | **string** |  | [optional]
**updated_at** | **string** |  | [optional]
**currency** | [**\OpenAPI\Client\Model\CurrencyType**](CurrencyType.md) |  | [optional]
**items_total** | **float** | Платеж покупателя. | [optional]
**delivery_total** | **float** | Стоимость доставки. | [optional]
**buyer_items_total** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. | [optional]
**buyer_total** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. | [optional]
**buyer_items_total_before_discount** | **float** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. | [optional]
**buyer_total_before_discount** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). | [optional]
**payment_type** | [**\OpenAPI\Client\Model\OrderPaymentType**](OrderPaymentType.md) |  | [optional]
**payment_method** | [**\OpenAPI\Client\Model\OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional]
**fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. | [optional]
**items** | [**\OpenAPI\Client\Model\OrderItemDTO[]**](OrderItemDTO.md) | Список товаров в заказе. |
**subsidies** | [**\OpenAPI\Client\Model\OrderSubsidyDTO[]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional]
**delivery** | [**\OpenAPI\Client\Model\OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional]
**buyer** | [**\OpenAPI\Client\Model\OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional]
**notes** | **string** | Комментарий к заказу. | [optional]
**tax_system** | [**\OpenAPI\Client\Model\OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional]
**cancel_requested** | **bool** | **Только для модели DBS**  Запрошена ли отмена. | [optional]
**expiry_date** | **string** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
