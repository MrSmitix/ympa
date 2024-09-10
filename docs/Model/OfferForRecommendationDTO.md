# OfferForRecommendationDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) | [optional] 
**price** | [**OpenAPI\Server\Model\BasePriceDTO**](BasePriceDTO.md) |  | [optional] 
**cofinancePrice** | [**OpenAPI\Server\Model\GetPriceDTO**](GetPriceDTO.md) |  | [optional] 
**competitiveness** | [**OpenAPI\Server\Model\PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 
**shows** | **int** | Количество показов карточки товара за последние 7 дней. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


