# GENERATE_UNITED_ORDERS_REQUEST

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **INTEGER_64** | Идентификатор бизнеса. | [default to null]
**date_from** | [**DATE**](DATE.md) | Начало периода, включительно. | [default to null]
**date_to** | [**DATE**](DATE.md) | Конец периода, включительно. Максимальный период — 1 год. | [default to null]
**campaign_ids** | **LIST [INTEGER_64]** | Список магазинов, которые нужны в отчете. | [optional] [default to null]
**promo_id** | [**STRING_32**](STRING_32.md) | Идентификатор акции, товары из которой нужны в отчете. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


