# get_campaign_offer_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **char \*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [**quantum_dto_t**](quantum_dto.md) \* |  | [optional] 
**available** | **int** | Есть ли товар в продаже.  | [optional] 
**basic_price** | [**get_price_with_discount_dto_t**](get_price_with_discount_dto.md) \* |  | [optional] 
**campaign_price** | [**get_price_with_vat_dto_t**](get_price_with_vat_dto.md) \* |  | [optional] 
**status** | **offer_campaign_status_type_t \*** |  | [optional] 
**errors** | [**list_t**](offer_error_dto.md) \* | Ошибки, препятствующие размещению товара на витрине.  | [optional] 
**warnings** | [**list_t**](offer_error_dto.md) \* | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


