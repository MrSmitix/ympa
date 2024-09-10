# OfferPriceResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Идентификатор предложения из прайс-листа. | [optional] 
**Price** | [**PriceDTO**](PriceDTO.md) |  | [optional] 
**MarketSku** | **Int64** | SKU на Маркете. | [optional] 
**UpdatedAt** | **System.DateTime** | Дата и время последнего обновления цены на товар. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferPriceResponseDTO = Initialize-ympa_powershell_clientOfferPriceResponseDTO  -Id null `
 -Price null `
 -MarketSku null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$OfferPriceResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

