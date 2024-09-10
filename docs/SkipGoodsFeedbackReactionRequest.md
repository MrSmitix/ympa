
# Table `SkipGoodsFeedbackReactionRequest`
(mapped from: SkipGoodsFeedbackReactionRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feedbackIds** | `One-To-Many` | `----` | `----`  | **kotlin.collections.Set&lt;kotlin.Long&gt;** | Список идентификаторов отзывов, на которые магазин не будет отвечать. | 


# **Table `SkipGoodsFeedbackReactionRequestFeedbackIds`**
(mapped from: SkipGoodsFeedbackReactionRequestFeedbackIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
skipGoodsFeedbackReactionRequest | skipGoodsFeedbackReactionRequest | long | | kotlin.Long | Primary Key | *one*
feedbackIds | feedbackIds | long | | kotlin.Long | Foreign Key | *many*



