

# OutletAddressDTO

Адрес точки продаж. 

The class is defined in **[OutletAddressDTO.java](../../src/main/java/org/openapitools/model/OutletAddressDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionId** | `Long` | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**street** | `String` | Улица. |  [optional property]
**number** | `String` | Номер дома. |  [optional property]
**building** | `String` | Номер строения. |  [optional property]
**estate** | `String` | Номер владения. |  [optional property]
**block** | `String` | Номер корпуса. |  [optional property]
**additional** | `String` | Дополнительная информация. |  [optional property]
**km** | `Integer` | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. |  [optional property]
**city** | `String` | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  |  [optional property]











