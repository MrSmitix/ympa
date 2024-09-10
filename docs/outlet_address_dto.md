# outlet_address_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region_id** | **long** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | **char \*** | Улица. | [optional] 
**number** | **char \*** | Номер дома. | [optional] 
**building** | **char \*** | Номер строения. | [optional] 
**estate** | **char \*** | Номер владения. | [optional] 
**block** | **char \*** | Номер корпуса. | [optional] 
**additional** | **char \*** | Дополнительная информация. | [optional] 
**km** | **int** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] 
**city** | **char \*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


