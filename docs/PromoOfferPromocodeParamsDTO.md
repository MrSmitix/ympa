# PromoOfferPromocodeParamsDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MaxPrice** | **Int64** | Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  | 

## Examples

- Prepare the resource
```powershell
$PromoOfferPromocodeParamsDTO = Initialize-ympa_powershell_clientPromoOfferPromocodeParamsDTO  -MaxPrice null
```

- Convert the resource to JSON
```powershell
$PromoOfferPromocodeParamsDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

