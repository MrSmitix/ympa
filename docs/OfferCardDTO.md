# OfferCardDTO
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OfferId** | **String** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**Mapping** | [**GetMappingDTO**](GetMappingDTO.md) |  | [optional] 
**ParameterValues** | [**ParameterValueDTO[]**](ParameterValueDTO.md) | Список характеристик с их значениями.  | [optional] 
**CardStatus** | [**OfferCardStatusType**](OfferCardStatusType.md) |  | [optional] 
**ContentRating** | **Int32** | Процент заполненности карточки. | [optional] 
**Recommendations** | [**OfferCardRecommendationDTO[]**](OfferCardRecommendationDTO.md) | Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку.  | [optional] 
**Errors** | [**OfferErrorDTO[]**](OfferErrorDTO.md) | Ошибки в контенте, препятствующие размещению товара на витрине. | [optional] 
**Warnings** | [**OfferErrorDTO[]**](OfferErrorDTO.md) | Связанные с контентом предупреждения, не препятствующие размещению товара на витрине. | [optional] 

## Examples

- Prepare the resource
```powershell
$OfferCardDTO = Initialize-ympa_powershell_clientOfferCardDTO  -OfferId null `
 -Mapping null `
 -ParameterValues null `
 -CardStatus null `
 -ContentRating null `
 -Recommendations null `
 -Errors null `
 -Warnings null
```

- Convert the resource to JSON
```powershell
$OfferCardDTO | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

