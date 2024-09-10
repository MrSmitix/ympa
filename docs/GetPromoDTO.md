# ympa_r_client::GetPromoDTO

Информация об акции.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Идентификатор акции. | 
**name** | **character** | Название акции. | 
**period** | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  | 
**participating** | **character** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**assortmentInfo** | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  | 
**mechanicsInfo** | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  | 
**bestsellerInfo** | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  | 
**channels** | [**array[ChannelType]**](ChannelType.md) | Список каналов продвижения товаров. | [optional] 
**constraints** | [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] 


