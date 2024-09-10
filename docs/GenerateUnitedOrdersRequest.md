
# GenerateUnitedOrdersRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessId** | **kotlin.Long** | Идентификатор бизнеса. |  |
| **dateFrom** | [**java.time.LocalDate**](java.time.LocalDate.md) | Начало периода, включительно. |  |
| **dateTo** | [**java.time.LocalDate**](java.time.LocalDate.md) | Конец периода, включительно. Максимальный период — 1 год. |  |
| **campaignIds** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Список магазинов, которые нужны в отчете. |  [optional] |
| **promoId** | **kotlin.String** | Идентификатор акции, товары из которой нужны в отчете. |  [optional] |



