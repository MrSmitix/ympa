

# GetCampaignOfferDTO

Параметры размещения товара в магазине.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**offerId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  |  |
|**quantum** | [**QuantumDTO**](QuantumDTO.md) |  |  [optional] |
|**available** | **Boolean** | Есть ли товар в продаже.  |  [optional] |
|**basicPrice** | [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  |  [optional] |
|**campaignPrice** | [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  |  [optional] |
|**status** | **OfferCampaignStatusType** |  |  [optional] |
|**errors** | [**List&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  |  [optional] |
|**warnings** | [**List&lt;OfferErrorDTO&gt;**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  |  [optional] |



