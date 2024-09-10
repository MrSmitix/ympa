# OfferForRecommendationDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] [default to nothing]
**price** | [***BasePriceDTO**](BasePriceDTO.md) |  | [optional] [default to nothing]
**cofinancePrice** | [***GetPriceDTO**](GetPriceDTO.md) |  | [optional] [default to nothing]
**competitiveness** | [***PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] [default to nothing]
**shows** | **Int64** | Количество показов карточки товара за последние 7 дней. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


