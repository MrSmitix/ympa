# OfferForRecommendationDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | Option<**String**> | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional]
**price** | Option<[**models::BasePriceDto**](BasePriceDTO.md)> |  | [optional]
**cofinance_price** | Option<[**models::GetPriceDto**](GetPriceDTO.md)> |  | [optional]
**competitiveness** | Option<[**models::PriceCompetitivenessType**](PriceCompetitivenessType.md)> |  | [optional]
**shows** | Option<**i64**> | Количество показов карточки товара за последние 7 дней. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


