# OFFER_CARD_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | [**STRING_32**](STRING_32.md) | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to null]
**mapping** | [**GET_MAPPING_DTO**](GetMappingDTO.md) |  | [optional] [default to null]
**parameter_values** | [**LIST [PARAMETER_VALUE_DTO]**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] [default to null]
**card_status** | [**OFFER_CARD_STATUS_TYPE**](OfferCardStatusType.md) |  | [optional] [default to null]
**content_rating** | **INTEGER_32** | Процент заполненности карточки. | [optional] [default to null]
**recommendations** | [**LIST [OFFER_CARD_RECOMMENDATION_DTO]**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] [default to null]
**errors** | [**LIST [OFFER_ERROR_DTO]**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] [default to null]
**warnings** | [**LIST [OFFER_ERROR_DTO]**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


