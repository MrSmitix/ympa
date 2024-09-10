# DeletePromoOffersRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PromoId** | **String** | Идентификатор акции. | 
**DeleteAllOffers** | **Boolean** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] 
**OfferIds** | **String[]** | Товары, которые нужно убрать из акции. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePromoOffersRequest = Initialize-ympa_powershell_clientDeletePromoOffersRequest  -PromoId null `
 -DeleteAllOffers null `
 -OfferIds null
```

- Convert the resource to JSON
```powershell
$DeletePromoOffersRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

