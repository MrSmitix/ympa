# SearchModelsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Models** | [**ModelDTO[]**](ModelDTO.md) | Список моделей товаров. | 
**Currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**RegionId** | **Int64** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 
**Pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SearchModelsResponse = Initialize-ympa_powershell_clientSearchModelsResponse  -Models null `
 -Currency null `
 -RegionId null `
 -Pager null
```

- Convert the resource to JSON
```powershell
$SearchModelsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

