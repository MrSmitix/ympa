# GenerateUnitedOrdersRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **i64** | Идентификатор бизнеса. | 
**date_from** | [**String**](string.md) | Начало периода, включительно. | 
**date_to** | [**String**](string.md) | Конец периода, включительно. Максимальный период — 1 год. | 
**campaign_ids** | Option<**Vec<i64>**> | Список магазинов, которые нужны в отчете. | [optional]
**promo_id** | Option<**String**> | Идентификатор акции, товары из которой нужны в отчете. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


