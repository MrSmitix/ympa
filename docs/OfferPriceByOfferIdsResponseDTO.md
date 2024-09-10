# OfferPriceByOfferIdsResponseDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**Price** | [**PriceDTO**](PriceDTO.md) |  | [optional] 
**UpdatedAt** | **System.DateTime** | Дата и время последнего обновления цены. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferPriceByOfferIdsResponseDTO = Initialize-ympa_powershell_clientOfferPriceByOfferIdsResponseDTO  -OfferId null `
 -Price null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$OfferPriceByOfferIdsResponseDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

