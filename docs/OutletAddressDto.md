# OutletAddressDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region_id** | **i64** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | **String** | Улица. | [optional] [default to None]
**number** | **String** | Номер дома. | [optional] [default to None]
**building** | **String** | Номер строения. | [optional] [default to None]
**estate** | **String** | Номер владения. | [optional] [default to None]
**block** | **String** | Номер корпуса. | [optional] [default to None]
**additional** | **String** | Дополнительная информация. | [optional] [default to None]
**km** | **i32** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] [default to None]
**city** | **String** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


