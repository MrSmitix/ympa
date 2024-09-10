
# Table `ApiUnauthorizedErrorResponse`
(mapped from: ApiUnauthorizedErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ApiErrorDTO&gt;**](ApiErrorDTO.md) | Список ошибок. |  [optional]



# **Table `ApiUnauthorizedErrorResponseApiErrorDTO`**
(mapped from: ApiUnauthorizedErrorResponseApiErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
apiUnauthorizedErrorResponse | apiUnauthorizedErrorResponse | long | | kotlin.Long | Primary Key | *one*
apiErrorDTO | apiErrorDTO | long | | kotlin.Long | Foreign Key | *many*



