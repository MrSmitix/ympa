
# Table `QualityRatingAffectedOrderDTO`
(mapped from: QualityRatingAffectedOrderDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderId** | orderId | long UNSIGNED NOT NULL |  | **kotlin.Long** | Идентификатор заказа. | 
**description** | description | text NOT NULL |  | **kotlin.String** | Описание проблемы. | 
**componentType** | componentType | long NOT NULL |  | [**AffectedOrderQualityRatingComponentType**](AffectedOrderQualityRatingComponentType.md) |  |  [foreignkey]





