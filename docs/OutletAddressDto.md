# OutletAddressDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region_id** | **i64** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | Option<**String**> | Улица. | [optional]
**number** | Option<**String**> | Номер дома. | [optional]
**building** | Option<**String**> | Номер строения. | [optional]
**estate** | Option<**String**> | Номер владения. | [optional]
**block** | Option<**String**> | Номер корпуса. | [optional]
**additional** | Option<**String**> | Дополнительная информация. | [optional]
**km** | Option<**i32**> | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional]
**city** | Option<**String**> | {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %}  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


