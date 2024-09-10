# GetPriceWithDiscountDTO

Цена с указанием скидки и времени последнего обновления.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Значение. | 
**currency_id** | [**CurrencyType**](CurrencyType.md) |  | 
**discount_base** | **float** | Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 
**updated_at** | **datetime** | Время последнего обновления. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_price_with_discount_dto import GetPriceWithDiscountDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPriceWithDiscountDTO from a JSON string
get_price_with_discount_dto_instance = GetPriceWithDiscountDTO.from_json(json)
# print the JSON string representation of the object
print GetPriceWithDiscountDTO.to_json()

# convert the object into a dict
get_price_with_discount_dto_dict = get_price_with_discount_dto_instance.to_dict()
# create an instance of GetPriceWithDiscountDTO from a dict
get_price_with_discount_dto_from_dict = GetPriceWithDiscountDTO.from_dict(get_price_with_discount_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


