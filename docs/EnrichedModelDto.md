# EnrichedModelDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор модели товара. | [optional] [default to None]
**name** | **String** | Название модели товара. | [optional] [default to None]
**prices** | [***models::ModelPriceDto**](ModelPriceDTO.md) |  | [optional] [default to None]
**offers** | [**Vec<models::ModelOfferDto>**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] [default to None]
**offline_offers** | **i32** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to None]
**online_offers** | **i32** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


