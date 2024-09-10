# GetMappingDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketSku** | **Int64** | SKU на Маркете. | [optional] 
**MarketSkuName** | **String** | Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**MarketModelId** | **Int64** | Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**MarketModelName** | **String** | Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**MarketCategoryId** | **Int64** | Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] 
**MarketCategoryName** | **String** | Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetMappingDTO = Initialize-ympa_powershell_clientGetMappingDTO  -MarketSku null `
 -MarketSkuName null `
 -MarketModelId null `
 -MarketModelName null `
 -MarketCategoryId null `
 -MarketCategoryName null
```

- Convert the resource to JSON
```powershell
$GetMappingDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

