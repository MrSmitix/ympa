# OAIOutletAddressDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionId** | **NSNumber*** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | **NSString*** | Улица. | [optional] 
**number** | **NSString*** | Номер дома. | [optional] 
**building** | **NSString*** | Номер строения. | [optional] 
**estate** | **NSString*** | Номер владения. | [optional] 
**block** | **NSString*** | Номер корпуса. | [optional] 
**additional** | **NSString*** | Дополнительная информация. | [optional] 
**km** | **NSNumber*** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] 
**city** | **NSString*** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


