# GetCampaignOfferDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **offerId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to null] |
| **quantum** | [**QuantumDTO**](QuantumDTO.md) |  | [optional] [default to null] |
| **available** | **Boolean** | Есть ли товар в продаже.  | [optional] [default to null] |
| **basicPrice** | [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] [default to null] |
| **campaignPrice** | [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  | [optional] [default to null] |
| **status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] [default to null] |
| **errors** | [**List**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] [default to null] |
| **warnings** | [**List**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

