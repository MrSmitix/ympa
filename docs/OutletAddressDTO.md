# ympa_r_client::OutletAddressDTO

Адрес точки продаж. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionId** | **integer** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | **character** | Улица. | [optional] [Max. length: 512] 
**number** | **character** | Номер дома. | [optional] [Max. length: 256] 
**building** | **character** | Номер строения. | [optional] [Max. length: 16] 
**estate** | **character** | Номер владения. | [optional] [Max. length: 16] 
**block** | **character** | Номер корпуса. | [optional] [Max. length: 16] 
**additional** | **character** | Дополнительная информация. | [optional] 
**km** | **integer** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] 
**city** | **character** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] [Max. length: 200] 


