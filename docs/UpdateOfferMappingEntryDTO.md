# UpdateOfferMappingEntryDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**AwaitingModerationMapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**RejectedMapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**Offer** | [**UpdateMappingsOfferDTO**](UpdateMappingsOfferDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOfferMappingEntryDTO = Initialize-ympa_powershell_clientUpdateOfferMappingEntryDTO  -Mapping null `
 -AwaitingModerationMapping null `
 -RejectedMapping null `
 -Offer null
```

- Convert the resource to JSON
```powershell
$UpdateOfferMappingEntryDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

