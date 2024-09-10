# OrderItemPromoDTO

Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**OrderPromoType**](OrderPromoType.md) |  | 
**discount** | **float** | Размер пользовательской скидки в валюте покупателя.  | [optional] 
**subsidy** | **float** | Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа.  | [optional] 
**shop_promo_id** | **str** | Идентификатор акции поставщика.  | [optional] 
**market_promo_id** | **str** | Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр &#x60;type&#x3D;MARKET_DEAL&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.order_item_promo_dto import OrderItemPromoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemPromoDTO from a JSON string
order_item_promo_dto_instance = OrderItemPromoDTO.from_json(json)
# print the JSON string representation of the object
print(OrderItemPromoDTO.to_json())

# convert the object into a dict
order_item_promo_dto_dict = order_item_promo_dto_instance.to_dict()
# create an instance of OrderItemPromoDTO from a dict
order_item_promo_dto_from_dict = OrderItemPromoDTO.from_dict(order_item_promo_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


