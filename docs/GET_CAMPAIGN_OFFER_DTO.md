# GET_CAMPAIGN_OFFER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to null]
**quantum** | [**QUANTUM_DTO**](QuantumDTO.md) |  | [optional] [default to null]
**available** | **BOOLEAN** | Есть ли товар в продаже.  | [optional] [default to null]
**basic_price** | [**GET_PRICE_WITH_DISCOUNT_DTO**](GetPriceWithDiscountDTO.md) |  | [optional] [default to null]
**campaign_price** | [**GET_PRICE_WITH_VAT_DTO**](GetPriceWithVatDTO.md) |  | [optional] [default to null]
**status** | [**OFFER_CAMPAIGN_STATUS_TYPE**](OfferCampaignStatusType.md) |  | [optional] [default to null]
**errors** | [**LIST [OFFER_ERROR_DTO]**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] [default to null]
**warnings** | [**LIST [OFFER_ERROR_DTO]**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


