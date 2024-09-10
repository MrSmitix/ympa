
# Table `GetOfferRecommendationsRequest`
(mapped from: GetOfferRecommendationsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offerIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. |  [optional]
**cofinancePriceFilter** | cofinancePriceFilter | long |  | [**FieldStateType**](FieldStateType.md) |  |  [optional] [foreignkey]
**recommendedCofinancePriceFilter** | recommendedCofinancePriceFilter | long |  | [**FieldStateType**](FieldStateType.md) |  |  [optional] [foreignkey]
**competitivenessFilter** | competitivenessFilter | long |  | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  |  [optional] [foreignkey]


# **Table `GetOfferRecommendationsRequestOfferIds`**
(mapped from: GetOfferRecommendationsRequestOfferIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getOfferRecommendationsRequest | getOfferRecommendationsRequest | long | | kotlin.Long | Primary Key | *one*
offerIds | offerIds | text | | kotlin.String | Foreign Key | *many*






