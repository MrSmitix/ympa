# GetPromoOfferDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Status** | [**PromoOfferParticipationStatusType**](PromoOfferParticipationStatusType.md) |  | 
**Params** | [**PromoOfferParamsDTO**](PromoOfferParamsDTO.md) |  | 
**AutoParticipatingDetails** | [**PromoOfferAutoParticipatingDetailsDTO**](PromoOfferAutoParticipatingDetailsDTO.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetPromoOfferDTO = Initialize-ympa_powershell_clientGetPromoOfferDTO  -OfferId null `
 -Status null `
 -Params null `
 -AutoParticipatingDetails null
```

- Convert the resource to JSON
```powershell
$GetPromoOfferDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

