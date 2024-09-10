# OutletAddressDTO

Адрес точки продаж. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region_id** | **int** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | **str** | Улица. | [optional] 
**number** | **str** | Номер дома. | [optional] 
**building** | **str** | Номер строения. | [optional] 
**estate** | **str** | Номер владения. | [optional] 
**block** | **str** | Номер корпуса. | [optional] 
**additional** | **str** | Дополнительная информация. | [optional] 
**km** | **int** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] 
**city** | **str** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.outlet_address_dto import OutletAddressDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OutletAddressDTO from a JSON string
outlet_address_dto_instance = OutletAddressDTO.from_json(json)
# print the JSON string representation of the object
print OutletAddressDTO.to_json()

# convert the object into a dict
outlet_address_dto_dict = outlet_address_dto_instance.to_dict()
# create an instance of OutletAddressDTO from a dict
outlet_address_dto_from_dict = OutletAddressDTO.from_dict(outlet_address_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


