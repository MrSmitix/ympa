# WarehouseOfferDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**TurnoverSummary** | [**TurnoverDTO**](TurnoverDTO.md) |  | [optional] 
**Stocks** | [**WarehouseStockDTO[]**](WarehouseStockDTO.md) | Информация об остатках. | 
**UpdatedAt** | **System.DateTime** | Дата и время последнего обновления информации об остатках.  Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2023-11-21T00:42:42+03:00&#x60;.  | [optional] 

## Examples

- Prepare the resource
```powershell
$WarehouseOfferDTO = Initialize-ympa_powershell_clientWarehouseOfferDTO  -OfferId null `
 -TurnoverSummary null `
 -Stocks null `
 -UpdatedAt null
```

- Convert the resource to JSON
```powershell
$WarehouseOfferDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

