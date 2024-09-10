# GenerateUnitedOrdersRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**businessId** | **Int64** | Идентификатор бизнеса. | [default to nothing]
**dateFrom** | **Date** | Начало периода, включительно. | [default to nothing]
**dateTo** | **Date** | Конец периода, включительно. Максимальный период — 1 год. | [default to nothing]
**campaignIds** | **Vector{Int64}** | Список магазинов, которые нужны в отчете. | [optional] [default to nothing]
**promoId** | **String** | Идентификатор акции, товары из которой нужны в отчете. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


