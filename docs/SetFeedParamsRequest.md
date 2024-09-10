
# Table `SetFeedParamsRequest`
(mapped from: SetFeedParamsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**parameters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FeedParameterDTO&gt;**](FeedParameterDTO.md) | Параметры прайс-листа.  Обязательный параметр.  | 


# **Table `SetFeedParamsRequestFeedParameterDTO`**
(mapped from: SetFeedParamsRequestFeedParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
setFeedParamsRequest | setFeedParamsRequest | long | | kotlin.Long | Primary Key | *one*
feedParameterDTO | feedParameterDTO | long | | kotlin.Long | Foreign Key | *many*



