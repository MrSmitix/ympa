# EnrichedModelDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор модели товара. | [optional]
**name** | Option<**String**> | Название модели товара. | [optional]
**prices** | Option<[**models::ModelPriceDto**](ModelPriceDTO.md)> |  | [optional]
**offers** | Option<[**Vec<models::ModelOfferDto>**](ModelOfferDTO.md)> | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional]
**offline_offers** | Option<**i32**> | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional]
**online_offers** | Option<**i32**> | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


