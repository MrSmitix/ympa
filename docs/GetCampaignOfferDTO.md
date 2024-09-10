# WWW::OpenAPIClient::Object::GetCampaignOfferDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetCampaignOfferDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [**QuantumDTO**](QuantumDTO.md) |  | [optional] 
**available** | **boolean** | Есть ли товар в продаже.  | [optional] 
**basic_price** | [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] 
**campaign_price** | [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  | [optional] 
**status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] 
**errors** | [**ARRAY[OfferErrorDTO]**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] 
**warnings** | [**ARRAY[OfferErrorDTO]**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


