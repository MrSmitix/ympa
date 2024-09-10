# UpdateOfferContentRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OffersContent** | [**OfferContentDTO[]**](OfferContentDTO.md) | Список товаров с указанными характеристиками. | 

## Examples

- Prepare the resource
```powershell
$UpdateOfferContentRequest = Initialize-ympa_powershell_clientUpdateOfferContentRequest  -OffersContent null
```

- Convert the resource to JSON
```powershell
$UpdateOfferContentRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

