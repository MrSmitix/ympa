# OUTLET_ADDRESS_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region_id** | **INTEGER_64** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | [default to null]
**street** | [**STRING_32**](STRING_32.md) | Улица. | [optional] [default to null]
**number** | [**STRING_32**](STRING_32.md) | Номер дома. | [optional] [default to null]
**building** | [**STRING_32**](STRING_32.md) | Номер строения. | [optional] [default to null]
**estate** | [**STRING_32**](STRING_32.md) | Номер владения. | [optional] [default to null]
**block** | [**STRING_32**](STRING_32.md) | Номер корпуса. | [optional] [default to null]
**additional** | [**STRING_32**](STRING_32.md) | Дополнительная информация. | [optional] [default to null]
**km** | **INTEGER_32** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] [default to null]
**city** | [**STRING_32**](STRING_32.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


