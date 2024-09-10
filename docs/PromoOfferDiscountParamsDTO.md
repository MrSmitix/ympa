# PromoOfferDiscountParamsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Price** | **Int64** | Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] 
**PromoPrice** | **Int64** | Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  | [optional] 
**MaxPromoPrice** | **Int64** | Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  | 

## Examples

- Prepare the resource
```powershell
$PromoOfferDiscountParamsDTO = Initialize-ympa_powershell_clientPromoOfferDiscountParamsDTO  -Price null `
 -PromoPrice null `
 -MaxPromoPrice null
```

- Convert the resource to JSON
```powershell
$PromoOfferDiscountParamsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

