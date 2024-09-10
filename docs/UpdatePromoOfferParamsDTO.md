# UpdatePromoOfferParamsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DiscountParams** | [**UpdatePromoOfferDiscountParamsDTO**](UpdatePromoOfferDiscountParamsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePromoOfferParamsDTO = Initialize-ympa_powershell_clientUpdatePromoOfferParamsDTO  -DiscountParams null
```

- Convert the resource to JSON
```powershell
$UpdatePromoOfferParamsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

