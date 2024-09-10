
# Table `EnrichedModelDTO`
(mapped from: EnrichedModelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор модели товара. |  [optional]
**name** | name | text |  | **kotlin.String** | Название модели товара. |  [optional]
**prices** | prices | long |  | [**ModelPriceDTO**](ModelPriceDTO.md) |  |  [optional] [foreignkey]
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ModelOfferDTO&gt;**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  |  [optional]
**offlineOffers** | offlineOffers | int |  | **kotlin.Int** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. |  [optional]
**onlineOffers** | onlineOffers | int |  | **kotlin.Int** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. |  [optional]





# **Table `EnrichedModelDTOModelOfferDTO`**
(mapped from: EnrichedModelDTOModelOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
enrichedModelDTO | enrichedModelDTO | long | | kotlin.Long | Primary Key | *one*
modelOfferDTO | modelOfferDTO | long | | kotlin.Long | Foreign Key | *many*





