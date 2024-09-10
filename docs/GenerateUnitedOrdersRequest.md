# WWW::OpenAPIClient::Object::GenerateUnitedOrdersRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GenerateUnitedOrdersRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**date_from** | **DATE** | Начало периода, включительно. | 
**date_to** | **DATE** | Конец периода, включительно. Максимальный период — 1 год. | 
**campaign_ids** | **ARRAY[int]** | Список магазинов, которые нужны в отчете. | [optional] 
**promo_id** | **string** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


