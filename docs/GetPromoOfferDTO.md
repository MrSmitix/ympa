# WWW::OpenAPIClient::Object::GetPromoOfferDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetPromoOfferDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**status** | [**PromoOfferParticipationStatusType**](PromoOfferParticipationStatusType.md) |  | 
**params** | [**PromoOfferParamsDTO**](PromoOfferParamsDTO.md) |  | 
**auto_participating_details** | [**PromoOfferAutoParticipatingDetailsDTO**](PromoOfferAutoParticipatingDetailsDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


