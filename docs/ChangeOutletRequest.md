# ChangeOutletRequest


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

## Example

```python
from ympa_python_client.models.change_outlet_request import ChangeOutletRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ChangeOutletRequest from a JSON string
change_outlet_request_instance = ChangeOutletRequest.from_json(json)
# print the JSON string representation of the object
print(ChangeOutletRequest.to_json())

# convert the object into a dict
change_outlet_request_dict = change_outlet_request_instance.to_dict()
# create an instance of ChangeOutletRequest from a dict
change_outlet_request_from_dict = ChangeOutletRequest.from_dict(change_outlet_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


