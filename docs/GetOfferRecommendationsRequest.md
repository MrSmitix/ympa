# WWW::OpenAPIClient::Object::GetOfferRecommendationsRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetOfferRecommendationsRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **ARRAY[string]** | Идентификаторы товаров, информация о которых нужна. ⚠️ Не используйте это поле одновременно с остальными фильтрами. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. | [optional] 
**cofinance_price_filter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**recommended_cofinance_price_filter** | [**FieldStateType**](FieldStateType.md) |  | [optional] 
**competitiveness_filter** | [**PriceCompetitivenessType**](PriceCompetitivenessType.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


