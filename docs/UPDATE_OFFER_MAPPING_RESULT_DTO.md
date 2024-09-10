# UPDATE_OFFER_MAPPING_RESULT_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to null]
**errors** | [**LIST [OFFER_MAPPING_ERROR_DTO]**](OfferMappingErrorDTO.md) | Ошибки — информация в каталоге не обновится. | [optional] [default to null]
**warnings** | [**LIST [OFFER_MAPPING_ERROR_DTO]**](OfferMappingErrorDTO.md) | Предупреждения — информация в каталоге обновится. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


