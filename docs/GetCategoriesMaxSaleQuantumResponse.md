# WWW::OpenAPIClient::Object::GetCategoriesMaxSaleQuantumResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetCategoriesMaxSaleQuantumResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**results** | [**ARRAY[MaxSaleQuantumDTO]**](MaxSaleQuantumDTO.md) | Категории и лимит на установку кванта и минимального количества товаров. | 
**errors** | [**ARRAY[CategoryErrorDTO]**](CategoryErrorDTO.md) | Ошибки, которые появились из-за переданных категорий. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


