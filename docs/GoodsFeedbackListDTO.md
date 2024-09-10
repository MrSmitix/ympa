
# Table `GoodsFeedbackListDTO`
(mapped from: GoodsFeedbackListDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedbacks** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GoodsFeedbackDTO&gt;**](GoodsFeedbackDTO.md) | Список отзывов. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GoodsFeedbackListDTOGoodsFeedbackDTO`**
(mapped from: GoodsFeedbackListDTOGoodsFeedbackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsFeedbackListDTO | goodsFeedbackListDTO | long | | kotlin.Long | Primary Key | *one*
goodsFeedbackDTO | goodsFeedbackDTO | long | | kotlin.Long | Foreign Key | *many*




