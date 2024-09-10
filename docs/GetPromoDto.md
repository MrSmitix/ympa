# GetPromoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | Идентификатор акции. | [default to null]
**name** | **String!** | Название акции. | [default to null]
**period** | [***PromoPeriodDto**](PromoPeriodDTO.md) |  | [default to null]
**participating** | **Boolean!** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | [default to null]
**assortmentInfo** | [***GetPromoAssortmentInfoDto**](GetPromoAssortmentInfoDTO.md) |  | [default to null]
**mechanicsInfo** | [***GetPromoMechanicsInfoDto**](GetPromoMechanicsInfoDTO.md) |  | [default to null]
**bestsellerInfo** | [***GetPromoBestsellerInfoDto**](GetPromoBestsellerInfoDTO.md) |  | [default to null]
**channels** | [**ChannelType**](ChannelType.md) | Список каналов продвижения товаров. | [optional] [default to null]
**constraints** | [***GetPromoConstraintsDto**](GetPromoConstraintsDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


