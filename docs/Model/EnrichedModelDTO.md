# EnrichedModelDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор модели товара. | [optional] 
**name** | **string** | Название модели товара. | [optional] 
**prices** | [**OpenAPI\Server\Model\ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 
**offers** | [**OpenAPI\Server\Model\ModelOfferDTO**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них. | [optional] 
**offlineOffers** | **int** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**onlineOffers** | **int** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


