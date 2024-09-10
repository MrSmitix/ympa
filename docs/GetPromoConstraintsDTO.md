# GetPromoConstraintsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WarehouseIds** | **Int64[]** | Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoConstraintsDTO = Initialize-ympa_powershell_clientGetPromoConstraintsDTO  -WarehouseIds null
```

- Convert the resource to JSON
```powershell
$GetPromoConstraintsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

