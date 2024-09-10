# OutletAddressDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RegionId** | **Int64** | Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов &#x60;TOWN&#x60; (город), &#x60;CITY&#x60; (крупный город) и &#x60;REPUBLIC_AREA&#x60; (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %}  | 
**Street** | **String** | Улица. | [optional] 
**Number** | **String** | Номер дома. | [optional] 
**Building** | **String** | Номер строения. | [optional] 
**Estate** | **String** | Номер владения. | [optional] 
**Block** | **String** | Номер корпуса. | [optional] 
**Additional** | **String** | Дополнительная информация. | [optional] 
**Km** | **Int32** | Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица. | [optional] 
**City** | **String** | {% note warning &quot;&quot;&quot;&quot; %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре &#x60;regionId&#x60;.  {% endnote %}  | [optional] 

## Examples

- Prepare the resource
```powershell
$OutletAddressDTO = Initialize-ympa_powershell_clientOutletAddressDTO  -RegionId null `
 -Street null `
 -Number null `
 -Building null `
 -Estate null `
 -Block null `
 -Additional null `
 -Km null `
 -City null
```

- Convert the resource to JSON
```powershell
$OutletAddressDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

