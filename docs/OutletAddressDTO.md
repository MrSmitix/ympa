# OutletAddressDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regionId** | **Int64** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | [default to nothing]
**street** | **String** | Улица. | [optional] [default to nothing]
**number** | **String** | Номер дома. | [optional] [default to nothing]
**building** | **String** | Номер строения. | [optional] [default to nothing]
**estate** | **String** | Номер владения. | [optional] [default to nothing]
**block** | **String** | Номер корпуса. | [optional] [default to nothing]
**additional** | **String** | Дополнительная информация. | [optional] [default to nothing]
**km** | **Int64** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] [default to nothing]
**city** | **String** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


