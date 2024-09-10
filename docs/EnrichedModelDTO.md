# WWW::OpenAPIClient::Object::EnrichedModelDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EnrichedModelDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор модели товара. | [optional] 
**name** | **string** | Название модели товара. | [optional] 
**prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 
**offers** | [**ARRAY[ModelOfferDTO]**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**offline_offers** | **int** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**online_offers** | **int** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


