# get_promo_offer_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **char \*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**status** | **promo_offer_participation_status_type_t \*** |  | 
**params** | [**promo_offer_params_dto_t**](promo_offer_params_dto.md) \* |  | 
**auto_participating_details** | [**promo_offer_auto_participating_details_dto_t**](promo_offer_auto_participating_details_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


