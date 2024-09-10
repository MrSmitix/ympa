# ympa_csharp_client.Model.EnrichedModelDTO
Модель товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор модели товара. | [optional] 
**Name** | **string** | Название модели товара. | [optional] 
**Prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 
**Offers** | [**List&lt;ModelOfferDTO&gt;**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**OfflineOffers** | **int** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**OnlineOffers** | **int** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

