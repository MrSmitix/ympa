# GetPriceWithVatDTO

Цена с указанием ставки НДС и времени последнего обновления.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **float** | Цена на товар. | [optional] 
**discount_base** | **float** | Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  | [optional] 
**currency_id** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**vat** | **int** | Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  | [optional] 
**updated_at** | **datetime** | Время последнего обновления. | 

## Example

```python
from ympa_python_client.models.get_price_with_vat_dto import GetPriceWithVatDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPriceWithVatDTO from a JSON string
get_price_with_vat_dto_instance = GetPriceWithVatDTO.from_json(json)
# print the JSON string representation of the object
print(GetPriceWithVatDTO.to_json())

# convert the object into a dict
get_price_with_vat_dto_dict = get_price_with_vat_dto_instance.to_dict()
# create an instance of GetPriceWithVatDTO from a dict
get_price_with_vat_dto_from_dict = GetPriceWithVatDTO.from_dict(get_price_with_vat_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


