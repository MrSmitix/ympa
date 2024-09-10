
# Table `OrderBuyerBasicInfoDTO`
(mapped from: OrderBuyerBasicInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Идентификатор покупателя. |  [optional]
**lastName** | lastName | text |  | **kotlin.String** | Фамилия покупателя. |  [optional]
**firstName** | firstName | text |  | **kotlin.String** | Имя покупателя. |  [optional]
**middleName** | middleName | text |  | **kotlin.String** | Отчество покупателя. |  [optional]
**type** | type | long |  | [**OrderBuyerType**](OrderBuyerType.md) |  |  [optional] [foreignkey]







