
# Table `ApiErrorResponse`
(mapped from: ApiErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ApiErrorDTO&gt;**](ApiErrorDTO.md) | Список ошибок. |  [optional]



# **Table `ApiErrorResponseApiErrorDTO`**
(mapped from: ApiErrorResponseApiErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
apiErrorResponse | apiErrorResponse | long | | kotlin.Long | Primary Key | *one*
apiErrorDTO | apiErrorDTO | long | | kotlin.Long | Foreign Key | *many*



