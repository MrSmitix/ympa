# OAIGetCampaignOfferDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **NSString*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [**OAIQuantumDTO***](OAIQuantumDTO.md) |  | [optional] 
**available** | **NSNumber*** | Есть ли товар в продаже.  | [optional] 
**basicPrice** | [**OAIGetPriceWithDiscountDTO***](OAIGetPriceWithDiscountDTO.md) |  | [optional] 
**campaignPrice** | [**OAIGetPriceWithVatDTO***](OAIGetPriceWithVatDTO.md) |  | [optional] 
**status** | [**OAIOfferCampaignStatusType***](OAIOfferCampaignStatusType.md) |  | [optional] 
**errors** | [**NSArray&lt;OAIOfferErrorDTO&gt;***](OAIOfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] 
**warnings** | [**NSArray&lt;OAIOfferErrorDTO&gt;***](OAIOfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


