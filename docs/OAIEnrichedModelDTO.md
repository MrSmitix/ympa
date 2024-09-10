# OAIEnrichedModelDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор модели товара. | [optional] 
**name** | **NSString*** | Название модели товара. | [optional] 
**prices** | [**OAIModelPriceDTO***](OAIModelPriceDTO.md) |  | [optional] 
**offers** | [**NSArray&lt;OAIModelOfferDTO&gt;***](OAIModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**offlineOffers** | **NSNumber*** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**onlineOffers** | **NSNumber*** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


