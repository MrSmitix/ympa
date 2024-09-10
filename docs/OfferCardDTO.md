# OfferCardDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [default to nothing]
**mapping** | [***GetMappingDTO**](GetMappingDTO.md) |  | [optional] [default to nothing]
**parameterValues** | [**Vector{ParameterValueDTO}**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] [default to nothing]
**cardStatus** | [***OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] [default to nothing]
**contentRating** | **Int64** | Процент заполненности карточки. | [optional] [default to nothing]
**recommendations** | [**Vector{OfferCardRecommendationDTO}**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] [default to nothing]
**errors** | [**Vector{OfferErrorDTO}**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] [default to nothing]
**warnings** | [**Vector{OfferErrorDTO}**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


