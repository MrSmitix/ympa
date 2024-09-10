
# Table `QualityRatingDetailsDTO`
(mapped from: QualityRatingDetailsDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**affectedOrders** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;QualityRatingAffectedOrderDTO&gt;**](QualityRatingAffectedOrderDTO.md) | Список заказов, которые повлияли на индекс качества. | 


# **Table `QualityRatingDetailsDTOQualityRatingAffectedOrderDTO`**
(mapped from: QualityRatingDetailsDTOQualityRatingAffectedOrderDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
qualityRatingDetailsDTO | qualityRatingDetailsDTO | long | | kotlin.Long | Primary Key | *one*
qualityRatingAffectedOrderDTO | qualityRatingAffectedOrderDTO | long | | kotlin.Long | Foreign Key | *many*



