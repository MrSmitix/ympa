# WWW::OpenAPIClient::Object::OfferCardDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OfferCardDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **string** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 
**parameter_values** | [**ARRAY[ParameterValueDTO]**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] 
**card_status** | [**OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] 
**content_rating** | **int** | Процент заполненности карточки. | [optional] 
**recommendations** | [**ARRAY[OfferCardRecommendationDTO]**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] 
**errors** | [**ARRAY[OfferErrorDTO]**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] 
**warnings** | [**ARRAY[OfferErrorDTO]**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


