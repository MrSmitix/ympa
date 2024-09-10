# DeletePromoOffersResultDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RejectedOffers** | [**RejectedPromoOfferDeleteDTO[]**](RejectedPromoOfferDeleteDTO.md) | Товары, при удалении которых появились ошибки.  Возвращается, только если есть такие товары.  | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePromoOffersResultDTO = Initialize-ympa_powershell_clientDeletePromoOffersResultDTO  -RejectedOffers null
```

- Convert the resource to JSON
```powershell
$DeletePromoOffersResultDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

