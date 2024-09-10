# GenerateUnitedOrdersRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор бизнеса. | 
**date_from** | [***chrono::naive::NaiveDate**](date.md) | Начало периода, включительно. | 
**date_to** | [***chrono::naive::NaiveDate**](date.md) | Конец периода, включительно. Максимальный период — 1 год. | 
**campaign_ids** | **Vec<i64>** | Список магазинов, которые нужны в отчете. | [optional] [default to None]
**promo_id** | **String** | Идентификатор акции, товары из которой нужны в отчете. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


