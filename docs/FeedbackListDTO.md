
# Table `FeedbackListDTO`
(mapped from: FeedbackListDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedbackList** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedbackDTO&gt;**](FeedbackDTO.md) | Список отзывов.  Содержит не более 20 отзывов.  | 
**paging** | paging | long |  | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `FeedbackListDTOFeedbackDTO`**
(mapped from: FeedbackListDTOFeedbackDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
feedbackListDTO | feedbackListDTO | long | | kotlin.Long | Primary Key | *one*
feedbackDTO | feedbackDTO | long | | kotlin.Long | Foreign Key | *many*




