# ENRICHED_MODEL_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор модели товара. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Название модели товара. | [optional] [default to null]
**prices** | [**MODEL_PRICE_DTO**](ModelPriceDTO.md) |  | [optional] [default to null]
**offers** | [**LIST [MODEL_OFFER_DTO]**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] [default to null]
**offline_offers** | **INTEGER_32** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to null]
**online_offers** | **INTEGER_32** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


