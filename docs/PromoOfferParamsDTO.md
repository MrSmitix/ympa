# PromoOfferParamsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DiscountParams** | [**PromoOfferDiscountParamsDTO**](PromoOfferDiscountParamsDTO.md) |  | [optional] 
**PromocodeParams** | [**PromoOfferPromocodeParamsDTO**](PromoOfferPromocodeParamsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PromoOfferParamsDTO = Initialize-ympa_powershell_clientPromoOfferParamsDTO  -DiscountParams null `
 -PromocodeParams null
```

- Convert the resource to JSON
```powershell
$PromoOfferParamsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

