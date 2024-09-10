
# Table `QuarantineOfferDTO`
(mapped from: QuarantineOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerId** | offerId | text |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]
**currentPrice** | currentPrice | long |  | [**BasePriceDTO**](BasePriceDTO.md) |  |  [optional] [foreignkey]
**lastValidPrice** | lastValidPrice | long |  | [**BasePriceDTO**](BasePriceDTO.md) |  |  [optional] [foreignkey]
**verdicts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PriceQuarantineVerdictDTO&gt;**](PriceQuarantineVerdictDTO.md) | Причины попадания товара в карантин. |  [optional]





# **Table `QuarantineOfferDTOPriceQuarantineVerdictDTO`**
(mapped from: QuarantineOfferDTOPriceQuarantineVerdictDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
quarantineOfferDTO | quarantineOfferDTO | long | | kotlin.Long | Primary Key | *one*
priceQuarantineVerdictDTO | priceQuarantineVerdictDTO | long | | kotlin.Long | Foreign Key | *many*



