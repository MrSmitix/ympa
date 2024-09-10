# order_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор заказа. | [optional] 
**status** | **order_status_type_t \*** |  | [optional] 
**substatus** | **order_substatus_type_t \*** |  | [optional] 
**creation_date** | **char \*** |  | [optional] 
**updated_at** | **char \*** |  | [optional] 
**currency** | **currency_type_t \*** |  | [optional] 
**items_total** | **double** | Платеж покупателя.  | [optional] 
**delivery_total** | **double** | Стоимость доставки.  | [optional] 
**buyer_items_total** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyer_total** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyer_items_total_before_discount** | **double** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyer_total_before_discount** | **double** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**payment_type** | **order_payment_type_t \*** |  | [optional] 
**payment_method** | **order_payment_method_type_t \*** |  | [optional] 
**fake** | **int** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**list_t**](order_item_dto.md) \* | Список товаров в заказе. | 
**subsidies** | [**list_t**](order_subsidy_dto.md) \* | Список субсидий по типам. | [optional] 
**delivery** | [**order_delivery_dto_t**](order_delivery_dto.md) \* |  | [optional] 
**buyer** | [**order_buyer_dto_t**](order_buyer_dto.md) \* |  | [optional] 
**notes** | **char \*** | Комментарий к заказу. | [optional] 
**tax_system** | **order_tax_system_type_t \*** |  | [optional] 
**cancel_requested** | **int** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiry_date** | **char \*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


