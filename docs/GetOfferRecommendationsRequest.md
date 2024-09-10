# ympa_r_client::GetOfferRecommendationsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerIds** | **array[character]** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] 
**cofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] [Enum: ] 
**recommendedCofinancePriceFilter** | [**FieldStateType**](FieldStateType.md) |  | [optional] [Enum: ] 
**competitivenessFilter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] [Enum: ] 


