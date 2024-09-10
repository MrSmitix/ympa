# Api.GetOfferRecommendationsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **[String]** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] 
**cofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**recommendedCofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**competitivenessFilter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 


