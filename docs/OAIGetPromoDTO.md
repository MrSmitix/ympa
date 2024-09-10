# OAIGetPromoDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | Идентификатор акции. | 
**name** | **NSString*** | Название акции. | 
**period** | [**OAIPromoPeriodDTO***](OAIPromoPeriodDTO.md) |  | 
**participating** | **NSNumber*** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**assortmentInfo** | [**OAIGetPromoAssortmentInfoDTO***](OAIGetPromoAssortmentInfoDTO.md) |  | 
**mechanicsInfo** | [**OAIGetPromoMechanicsInfoDTO***](OAIGetPromoMechanicsInfoDTO.md) |  | 
**bestsellerInfo** | [**OAIGetPromoBestsellerInfoDTO***](OAIGetPromoBestsellerInfoDTO.md) |  | 
**channels** | [**NSArray&lt;OAIChannelType&gt;***](OAIChannelType.md) | Список каналов продвижения товаров. | [optional] 
**constraints** | [**OAIGetPromoConstraintsDTO***](OAIGetPromoConstraintsDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


