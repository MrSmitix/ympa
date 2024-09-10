# OfferProcessingNoteDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | [**OfferProcessingNoteType**](OfferProcessingNoteType.md) |  | [optional] 
**Payload** | **String** | Дополнительная информация о причине отклонения товара.  | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferProcessingNoteDTO = Initialize-ympa_powershell_clientOfferProcessingNoteDTO  -Type null `
 -Payload null
```

- Convert the resource to JSON
```powershell
$OfferProcessingNoteDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

