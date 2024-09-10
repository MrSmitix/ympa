# QUARANTINE_OFFER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to null]
**current_price** | [**BASE_PRICE_DTO**](BasePriceDTO.md) |  | [optional] [default to null]
**last_valid_price** | [**BASE_PRICE_DTO**](BasePriceDTO.md) |  | [optional] [default to null]
**verdicts** | [**LIST [PRICE_QUARANTINE_VERDICT_DTO]**](PriceQuarantineVerdictDTO.md) | Причины попадания товара в карантин. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


