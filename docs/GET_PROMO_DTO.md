# GET_PROMO_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Идентификатор акции. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | Название акции. | [default to null]
**period** | [**PROMO_PERIOD_DTO**](PromoPeriodDTO.md) |  | [default to null]
**participating** | **BOOLEAN** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | [default to null]
**assortment_info** | [**GET_PROMO_ASSORTMENT_INFO_DTO**](GetPromoAssortmentInfoDTO.md) |  | [default to null]
**mechanics_info** | [**GET_PROMO_MECHANICS_INFO_DTO**](GetPromoMechanicsInfoDTO.md) |  | [default to null]
**bestseller_info** | [**GET_PROMO_BESTSELLER_INFO_DTO**](GetPromoBestsellerInfoDTO.md) |  | [default to null]
**channels** | [**LIST [CHANNEL_TYPE]**](ChannelType.md) | Список каналов продвижения товаров. | [optional] [default to null]
**constraints** | [**GET_PROMO_CONSTRAINTS_DTO**](GetPromoConstraintsDTO.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


