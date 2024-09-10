# OfferMappingInfoDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Mapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**AwaitingModerationMapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 
**RejectedMapping** | [**OfferMappingDTO**](OfferMappingDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferMappingInfoDTO = Initialize-ympa_powershell_clientOfferMappingInfoDTO  -Mapping null `
 -AwaitingModerationMapping null `
 -RejectedMapping null
```

- Convert the resource to JSON
```powershell
$OfferMappingInfoDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

