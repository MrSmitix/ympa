# OfferMappingEntryDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**AwaitingModerationMapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**RejectedMapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**Offer** | [**MappingsOfferDTO**](MappingsOfferDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferMappingEntryDTO = Initialize-ympa_powershell_clientOfferMappingEntryDTO  -Mapping null `
 -AwaitingModerationMapping null `
 -RejectedMapping null `
 -Offer null
```

- Convert the resource to JSON
```powershell
$OfferMappingEntryDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

