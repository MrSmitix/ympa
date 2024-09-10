# GetCampaignOfferDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [***models::QuantumDto**](QuantumDTO.md) |  | [optional] [default to None]
**available** | **bool** | Есть ли товар в продаже.  | [optional] [default to None]
**basic_price** | [***models::GetPriceWithDiscountDto**](GetPriceWithDiscountDTO.md) |  | [optional] [default to None]
**campaign_price** | [***models::GetPriceWithVatDto**](GetPriceWithVatDTO.md) |  | [optional] [default to None]
**status** | [***models::OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] [default to None]
**errors** | [**Vec<models::OfferErrorDto>**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] [default to None]
**warnings** | [**Vec<models::OfferErrorDto>**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


