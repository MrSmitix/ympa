
# Table `GetFeedsResponse`
(mapped from: GetFeedsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**feeds** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedDTO&gt;**](FeedDTO.md) | Список прайс-листов. | 


# **Table `GetFeedsResponseFeedDTO`**
(mapped from: GetFeedsResponseFeedDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getFeedsResponse | getFeedsResponse | long | | kotlin.Long | Primary Key | *one*
feedDTO | feedDTO | long | | kotlin.Long | Foreign Key | *many*



