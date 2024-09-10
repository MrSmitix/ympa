# EnrichedOrderBoxLayoutDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**OrderBoxLayoutItemDTO[]**](OrderBoxLayoutItemDTO.md) | Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт.  | 
**BoxId** | **Int64** | Идентификатор коробки. | [optional] 

## Examples

- Prepare the resource
```powershell
$EnrichedOrderBoxLayoutDTO = Initialize-ympa_powershell_clientEnrichedOrderBoxLayoutDTO  -Items null `
 -BoxId null
```

- Convert the resource to JSON
```powershell
$EnrichedOrderBoxLayoutDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

