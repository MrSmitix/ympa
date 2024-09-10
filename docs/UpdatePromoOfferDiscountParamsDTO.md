# UpdatePromoOfferDiscountParamsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Price** | **Int64** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  | [optional] 
**PromoPrice** | **Int64** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  | [optional] 

## Examples

- Prepare the resource
```powershell
$UpdatePromoOfferDiscountParamsDTO = Initialize-ympa_powershell_clientUpdatePromoOfferDiscountParamsDTO  -Price null `
 -PromoPrice null
```

- Convert the resource to JSON
```powershell
$UpdatePromoOfferDiscountParamsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

