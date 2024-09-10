# OrderDTO

Заказ.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**creation_date** | **str** |  | [optional] 
**updated_at** | **str** |  | [optional] 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**items_total** | **float** | Платеж покупателя.  | [optional] 
**delivery_total** | **float** | Стоимость доставки.  | [optional] 
**buyer_items_total** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки.  | [optional] 
**buyer_total** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки.  | [optional] 
**buyer_items_total_before_discount** | **float** | Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам.  | [optional] 
**buyer_total_before_discount** | **float** | {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки).  | [optional] 
**payment_type** | [**OrderPaymentType**](OrderPaymentType.md) |  | [optional] 
**payment_method** | [**OrderPaymentMethodType**](OrderPaymentMethodType.md) |  | [optional] 
**fake** | **bool** | Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета.  | [optional] 
**items** | [**List[OrderItemDTO]**](OrderItemDTO.md) | Список товаров в заказе. | 
**subsidies** | [**List[OrderSubsidyDTO]**](OrderSubsidyDTO.md) | Список субсидий по типам. | [optional] 
**delivery** | [**OrderDeliveryDTO**](OrderDeliveryDTO.md) |  | [optional] 
**buyer** | [**OrderBuyerDTO**](OrderBuyerDTO.md) |  | [optional] 
**notes** | **str** | Комментарий к заказу. | [optional] 
**tax_system** | [**OrderTaxSystemType**](OrderTaxSystemType.md) |  | [optional] 
**cancel_requested** | **bool** | **Только для модели DBS**  Запрошена ли отмена.  | [optional] 
**expiry_date** | **str** |  | [optional] 

## Example

```python
from ympa_python_client.models.order_dto import OrderDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderDTO from a JSON string
order_dto_instance = OrderDTO.from_json(json)
# print the JSON string representation of the object
print(OrderDTO.to_json())

# convert the object into a dict
order_dto_dict = order_dto_instance.to_dict()
# create an instance of OrderDTO from a dict
order_dto_from_dict = OrderDTO.from_dict(order_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


