# OfferMappingEntriesDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**OfferMappingEntries** | [**OfferMappingEntryDTO[]**](OfferMappingEntryDTO.md) | Информация о товарах в каталоге. | 

## Examples

- Prepare the resource
```powershell
$OfferMappingEntriesDTO = Initialize-ympa_powershell_clientOfferMappingEntriesDTO  -Paging null `
 -OfferMappingEntries null
```

- Convert the resource to JSON
```powershell
$OfferMappingEntriesDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

