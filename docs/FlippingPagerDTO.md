# FlippingPagerDTO

Модель для пагинации.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **int** | Сколько всего найдено элементов. | [optional] 
**var_from** | **int** | Начальный номер найденного элемента на странице. | [optional] 
**to** | **int** | Конечный номер найденного элемента на странице. | [optional] 
**current_page** | **int** | Текущая страница. | [optional] 
**pages_count** | **int** | Общее количество страниц. | [optional] 
**page_size** | **int** | Размер страницы. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.flipping_pager_dto import FlippingPagerDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FlippingPagerDTO from a JSON string
flipping_pager_dto_instance = FlippingPagerDTO.from_json(json)
# print the JSON string representation of the object
print FlippingPagerDTO.to_json()

# convert the object into a dict
flipping_pager_dto_dict = flipping_pager_dto_instance.to_dict()
# create an instance of FlippingPagerDTO from a dict
flipping_pager_dto_from_dict = FlippingPagerDTO.from_dict(flipping_pager_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


