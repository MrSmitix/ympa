
# Table `ApiForbiddenErrorResponse`
(mapped from: ApiForbiddenErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ApiErrorDTO&gt;**](ApiErrorDTO.md) | Список ошибок. |  [optional]



# **Table `ApiForbiddenErrorResponseApiErrorDTO`**
(mapped from: ApiForbiddenErrorResponseApiErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
apiForbiddenErrorResponse | apiForbiddenErrorResponse | long | | kotlin.Long | Primary Key | *one*
apiErrorDTO | apiErrorDTO | long | | kotlin.Long | Foreign Key | *many*



