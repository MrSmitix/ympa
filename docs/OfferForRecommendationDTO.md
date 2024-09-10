
# Table `OfferForRecommendationDTO`
(mapped from: OfferForRecommendationDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerId** | offerId | text |  | **kotlin.String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  [optional]
**price** | price | long |  | [**BasePriceDTO**](BasePriceDTO.md) |  |  [optional] [foreignkey]
**cofinancePrice** | cofinancePrice | long |  | [**GetPriceDTO**](GetPriceDTO.md) |  |  [optional] [foreignkey]
**competitiveness** | competitiveness | long |  | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  |  [optional] [foreignkey]
**shows** | shows | long |  | **kotlin.Long** | Количество показов карточки товара за последние 7 дней. |  [optional]







