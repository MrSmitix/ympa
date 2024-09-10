# UpdateOfferMappingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Offer** | [**UpdateOfferDTO**](UpdateOfferDTO.md) |  | 
**Mapping** | [**UpdateMappingDTO**](UpdateMappingDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdateOfferMappingDTO = Initialize-ympa_powershell_clientUpdateOfferMappingDTO  -Offer null `
 -Mapping null
```

- Convert the resource to JSON
```powershell
$UpdateOfferMappingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

