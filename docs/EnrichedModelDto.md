# EnrichedModelDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор модели товара. | [optional] [default to null]
**name** | **String!** | Название модели товара. | [optional] [default to null]
**prices** | [***ModelPriceDto**](ModelPriceDTO.md) |  | [optional] [default to null]
**offers** | [**ModelOfferDto**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] [default to null]
**offlineOffers** | **Int!** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to null]
**onlineOffers** | **Int!** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


