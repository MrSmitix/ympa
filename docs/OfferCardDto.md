# OfferCardDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**mapping** | [***models::GetMappingDto**](GetMappingDTO.md) |  | [optional] [default to None]
**parameter_values** | [**Vec<models::ParameterValueDto>**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] [default to None]
**card_status** | [***models::OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] [default to None]
**content_rating** | **i32** | Процент заполненности карточки. | [optional] [default to None]
**recommendations** | [**Vec<models::OfferCardRecommendationDto>**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] [default to None]
**errors** | [**Vec<models::OfferErrorDto>**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] [default to None]
**warnings** | [**Vec<models::OfferErrorDto>**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


