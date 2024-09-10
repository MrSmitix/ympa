# GetPromoDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Идентификатор акции. | [default to nothing]
**name** | **String** | Название акции. | [default to nothing]
**period** | [***PromoPeriodDTO**](PromoPeriodDTO.md) |  | [default to nothing]
**participating** | **Bool** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | [default to nothing]
**assortmentInfo** | [***GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  | [default to nothing]
**mechanicsInfo** | [***GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  | [default to nothing]
**bestsellerInfo** | [***GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  | [default to nothing]
**channels** | [**Vector{ChannelType}**](ChannelType.md) | Список каналов продвижения товаров. | [optional] [default to nothing]
**constraints** | [***GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


