
# Table `GoodsFeedbackCommentListDTO`
(mapped from: GoodsFeedbackCommentListDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**comments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GoodsFeedbackCommentDTO&gt;**](GoodsFeedbackCommentDTO.md) | Список комментариев. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GoodsFeedbackCommentListDTOGoodsFeedbackCommentDTO`**
(mapped from: GoodsFeedbackCommentListDTOGoodsFeedbackCommentDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
goodsFeedbackCommentListDTO | goodsFeedbackCommentListDTO | long | | kotlin.Long | Primary Key | *one*
goodsFeedbackCommentDTO | goodsFeedbackCommentDTO | long | | kotlin.Long | Foreign Key | *many*




