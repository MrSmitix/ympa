
# Table `ApiClientDataErrorResponse`
(mapped from: ApiClientDataErrorResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**status** | status | long |  | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  |  [optional] [foreignkey]
**errors** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ApiErrorDTO&gt;**](ApiErrorDTO.md) | Список ошибок. |  [optional]



# **Table `ApiClientDataErrorResponseApiErrorDTO`**
(mapped from: ApiClientDataErrorResponseApiErrorDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
apiClientDataErrorResponse | apiClientDataErrorResponse | long | | kotlin.Long | Primary Key | *one*
apiErrorDTO | apiErrorDTO | long | | kotlin.Long | Foreign Key | *many*



