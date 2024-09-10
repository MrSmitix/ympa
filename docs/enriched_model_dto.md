# enriched_model_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор модели товара. | [optional] 
**name** | **char \*** | Название модели товара. | [optional] 
**prices** | [**model_price_dto_t**](model_price_dto.md) \* |  | [optional] 
**offers** | [**list_t**](model_offer_dto.md) \* | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**offline_offers** | **int** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**online_offers** | **int** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


