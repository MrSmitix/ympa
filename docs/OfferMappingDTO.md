# OfferMappingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketSku** | **Int64** | SKU на Маркете. | [optional] 
**ModelId** | **Int64** | Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара.  | [optional] 
**CategoryId** | **Int64** | Идентификатор категории для текущей карточки товара на Маркете. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferMappingDTO = Initialize-ympa_powershell_clientOfferMappingDTO  -MarketSku null `
 -ModelId null `
 -CategoryId null
```

- Convert the resource to JSON
```powershell
$OfferMappingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

