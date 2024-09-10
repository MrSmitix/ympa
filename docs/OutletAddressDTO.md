
# Table `OutletAddressDTO`
(mapped from: OutletAddressDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**regionId** | regionId | long NOT NULL |  | **kotlin.Long** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | street | text |  | **kotlin.String** | Улица. |  [optional]
**number** | number | text |  | **kotlin.String** | Номер дома. |  [optional]
**building** | building | text |  | **kotlin.String** | Номер строения. |  [optional]
**estate** | estate | text |  | **kotlin.String** | Номер владения. |  [optional]
**block** | block | text |  | **kotlin.String** | Номер корпуса. |  [optional]
**additional** | additional | text |  | **kotlin.String** | Дополнительная информация. |  [optional]
**km** | km | int |  | **kotlin.Int** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. |  [optional]
**city** | city | text |  | **kotlin.String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  |  [optional]











