# OfferSellingProgramDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SellingProgram** | [**SellingProgramType**](SellingProgramType.md) |  | 
**Status** | [**OfferSellingProgramStatusType**](OfferSellingProgramStatusType.md) |  | 

## Examples

- Prepare the resource
```powershell
$OfferSellingProgramDTO = Initialize-ympa_powershell_clientOfferSellingProgramDTO  -SellingProgram null `
 -Status null
```

- Convert the resource to JSON
```powershell
$OfferSellingProgramDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

