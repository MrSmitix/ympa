# GetCampaignOfferDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to nothing]
**quantum** | [***QuantumDTO**](QuantumDTO.md) |  | [optional] [default to nothing]
**available** | **Bool** | Есть ли товар в продаже.  | [optional] [default to nothing]
**basicPrice** | [***GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] [default to nothing]
**campaignPrice** | [***GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  | [optional] [default to nothing]
**status** | [***OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] [default to nothing]
**errors** | [**Vector{OfferErrorDTO}**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] [default to nothing]
**warnings** | [**Vector{OfferErrorDTO}**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


