
# Table `ApiLockedErrorResponse`
(mapped from: ApiLockedErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ApiErrorDTO&gt;**](ApiErrorDTO.md) | Список ошибок. |  [optional]



# **Table `ApiLockedErrorResponseApiErrorDTO`**
(mapped from: ApiLockedErrorResponseApiErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
apiLockedErrorResponse | apiLockedErrorResponse | long | | kotlin.Long | Primary Key | *one*
apiErrorDTO | apiErrorDTO | long | | kotlin.Long | Foreign Key | *many*



