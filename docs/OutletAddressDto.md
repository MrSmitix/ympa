# OutletAddressDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionId** | **Int!** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | [default to null]
**street** | **String!** | Улица. | [optional] [default to null]
**number** | **String!** | Номер дома. | [optional] [default to null]
**building** | **String!** | Номер строения. | [optional] [default to null]
**estate** | **String!** | Номер владения. | [optional] [default to null]
**block** | **String!** | Номер корпуса. | [optional] [default to null]
**additional** | **String!** | Дополнительная информация. | [optional] [default to null]
**km** | **Int!** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] [default to null]
**city** | **String!** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


