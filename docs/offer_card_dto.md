# offer_card_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **char \*** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**mapping** | [**get_mapping_dto_t**](get_mapping_dto.md) \* |  | [optional] 
**parameter_values** | [**list_t**](parameter_value_dto.md) \* | Список характеристик с их значениями.  | [optional] 
**card_status** | **offer_card_status_type_t \*** |  | [optional] 
**content_rating** | **int** | Процент заполненности карточки. | [optional] 
**recommendations** | [**list_t**](offer_card_recommendation_dto.md) \* | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] 
**errors** | [**list_t**](offer_error_dto.md) \* | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] 
**warnings** | [**list_t**](offer_error_dto.md) \* | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


