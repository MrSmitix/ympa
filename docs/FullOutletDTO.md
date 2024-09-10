# FullOutletDTO

Информация о точке продаж.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Название точки продаж.  | 
**type** | [**OutletType**](OutletType.md) |  | 
**coords** | **str** | Координаты точки продаж.  Формат: долгота, широта. Разделители: запятая и / или пробел. Например, &#x60;20.4522144, 54.7104264&#x60;.  Если параметр не передан, координаты будут определены по значениям параметров, вложенных в &#x60;address&#x60;.  | [optional] 
**is_main** | **bool** | Признак основной точки продаж.  Возможные значения:  * &#x60;false&#x60; — неосновная точка продаж. * &#x60;true&#x60; — основная точка продаж.  | [optional] 
**shop_outlet_code** | **str** | Идентификатор точки продаж, присвоенный магазином. | [optional] 
**visibility** | [**OutletVisibilityType**](OutletVisibilityType.md) |  | [optional] 
**address** | [**OutletAddressDTO**](OutletAddressDTO.md) |  | 
**phones** | **List[str]** | Номера телефонов точки продаж. Передавайте в формате: &#x60;+7 (999) 999-99-99&#x60;.  | 
**working_schedule** | [**OutletWorkingScheduleDTO**](OutletWorkingScheduleDTO.md) |  | 
**delivery_rules** | [**List[OutletDeliveryRuleDTO]**](OutletDeliveryRuleDTO.md) | Информация об условиях доставки для данной точки продаж.  Обязательный параметр, если параметр &#x60;type&#x3D;DEPOT&#x60; или &#x60;type&#x3D;MIXED&#x60;.  | [optional] 
**storage_period** | **int** | Срок хранения заказа в собственном пункте выдачи заказов. Считается в днях. | [optional] 
**id** | **int** | Идентификатор точки продаж, присвоенный Маркетом. | [optional] 
**status** | [**OutletStatusType**](OutletStatusType.md) |  | [optional] 
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**shop_outlet_id** | **str** | Идентификатор точки продаж, заданный магазином. | [optional] 
**working_time** | **str** | Рабочее время. | [optional] 
**moderation_reason** | **str** | Статус модерации. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.full_outlet_dto import FullOutletDTO

# TODO update the JSON string below
json = "{}"
# create an instance of FullOutletDTO from a JSON string
full_outlet_dto_instance = FullOutletDTO.from_json(json)
# print the JSON string representation of the object
print FullOutletDTO.to_json()

# convert the object into a dict
full_outlet_dto_dict = full_outlet_dto_instance.to_dict()
# create an instance of FullOutletDTO from a dict
full_outlet_dto_from_dict = FullOutletDTO.from_dict(full_outlet_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


