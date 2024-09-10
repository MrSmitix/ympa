# EnrichedModelDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор модели товара. | [optional] [default to nothing]
**name** | **String** | Название модели товара. | [optional] [default to nothing]
**prices** | [***ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] [default to nothing]
**offers** | [**Vector{ModelOfferDTO}**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] [default to nothing]
**offlineOffers** | **Int64** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to nothing]
**onlineOffers** | **Int64** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


