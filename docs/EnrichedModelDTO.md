# EnrichedModelDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int64** | Идентификатор модели товара. | [optional] 
**Name** | **String** | Название модели товара. | [optional] 
**Prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 
**Offers** | [**ModelOfferDTO[]**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**OfflineOffers** | **Int32** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**OnlineOffers** | **Int32** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

## Examples

- Prepare the resource
```powershell
$EnrichedModelDTO = Initialize-ympa_powershell_clientEnrichedModelDTO  -Id null `
 -Name null `
 -Prices null `
 -Offers null `
 -OfflineOffers null `
 -OnlineOffers null
```

- Convert the resource to JSON
```powershell
$EnrichedModelDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

