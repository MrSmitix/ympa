# QuarantineOfferDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 
**CurrentPrice** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**LastValidPrice** | [**BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**Verdicts** | [**PriceQuarantineVerdictDTO[]**](PriceQuarantineVerdictDTO.md) | Причины попадания товара в карантин. | [optional] 

## Examples

- Prepare the resource
```powershell
$QuarantineOfferDTO = Initialize-ympa_powershell_clientQuarantineOfferDTO  -OfferId null `
 -CurrentPrice null `
 -LastValidPrice null `
 -Verdicts null
```

- Convert the resource to JSON
```powershell
$QuarantineOfferDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

