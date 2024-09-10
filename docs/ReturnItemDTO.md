# ReturnItemDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketSku** | **Int64** | SKU на Маркете. | [optional] 
**ShopSku** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Count** | **Int64** | Количество единиц товара. | 
**Decisions** | [**ReturnDecisionDTO[]**](ReturnDecisionDTO.md) | Список решений по возврату. | [optional] 
**Instances** | [**ReturnInstanceDTO[]**](ReturnInstanceDTO.md) | Список логистических позиций возврата. | [optional] 
**Tracks** | [**TrackDTO[]**](TrackDTO.md) | Список трек-кодов для почтовых отправлений. | [optional] 

## Examples

- Prepare the resource
```powershell
$ReturnItemDTO = Initialize-ympa_powershell_clientReturnItemDTO  -MarketSku null `
 -ShopSku null `
 -Count null `
 -Decisions null `
 -Instances null `
 -Tracks null
```

- Convert the resource to JSON
```powershell
$ReturnItemDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

