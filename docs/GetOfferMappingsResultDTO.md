# GetOfferMappingsResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**OfferMappings** | [**GetOfferMappingDTO[]**](GetOfferMappingDTO.md) | Информация о товарах. | 

## Examples

- Prepare the resource
```powershell
$GetOfferMappingsResultDTO = Initialize-ympa_powershell_clientGetOfferMappingsResultDTO  -Paging null `
 -OfferMappings null
```

- Convert the resource to JSON
```powershell
$GetOfferMappingsResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

