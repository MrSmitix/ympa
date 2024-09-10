# OfferProcessingStateDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**OfferProcessingStatusType**](OfferProcessingStatusType.md) |  | [optional] 
**Notes** | [**OfferProcessingNoteDTO[]**](OfferProcessingNoteDTO.md) | Причины, по которым товар не прошел модерацию. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferProcessingStateDTO = Initialize-ympa_powershell_clientOfferProcessingStateDTO  -Status null `
 -Notes null
```

- Convert the resource to JSON
```powershell
$OfferProcessingStateDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

