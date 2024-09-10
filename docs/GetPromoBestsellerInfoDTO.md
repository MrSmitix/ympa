# GetPromoBestsellerInfoDTO

Информация об акции «Бестселлеры Маркета».

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bestseller** | **bool** | Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). | 
**entry_deadline** | **datetime** | До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promo_bestseller_info_dto import GetPromoBestsellerInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoBestsellerInfoDTO from a JSON string
get_promo_bestseller_info_dto_instance = GetPromoBestsellerInfoDTO.from_json(json)
# print the JSON string representation of the object
print GetPromoBestsellerInfoDTO.to_json()

# convert the object into a dict
get_promo_bestseller_info_dto_dict = get_promo_bestseller_info_dto_instance.to_dict()
# create an instance of GetPromoBestsellerInfoDTO from a dict
get_promo_bestseller_info_dto_from_dict = GetPromoBestsellerInfoDTO.from_dict(get_promo_bestseller_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


