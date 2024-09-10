# UpdatePriceWithDiscountDTO

Цена с указанием скидки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Значение. | 
**currency_id** | [**CurrencyType**](CurrencyType.md) |  | 
**discount_base** | **float** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_price_with_discount_dto import UpdatePriceWithDiscountDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePriceWithDiscountDTO from a JSON string
update_price_with_discount_dto_instance = UpdatePriceWithDiscountDTO.from_json(json)
# print the JSON string representation of the object
print UpdatePriceWithDiscountDTO.to_json()

# convert the object into a dict
update_price_with_discount_dto_dict = update_price_with_discount_dto_instance.to_dict()
# create an instance of UpdatePriceWithDiscountDTO from a dict
update_price_with_discount_dto_from_dict = UpdatePriceWithDiscountDTO.from_dict(update_price_with_discount_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


