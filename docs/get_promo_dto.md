# get_promo_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Идентификатор акции. | 
**name** | **char \*** | Название акции. | 
**period** | [**promo_period_dto_t**](promo_period_dto.md) \* |  | 
**participating** | **int** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**assortment_info** | [**get_promo_assortment_info_dto_t**](get_promo_assortment_info_dto.md) \* |  | 
**mechanics_info** | [**get_promo_mechanics_info_dto_t**](get_promo_mechanics_info_dto.md) \* |  | 
**bestseller_info** | [**get_promo_bestseller_info_dto_t**](get_promo_bestseller_info_dto.md) \* |  | 
**channels** | [**list_t**](channel_type.md) \* | Список каналов продвижения товаров. | [optional] 
**constraints** | [**get_promo_constraints_dto_t**](get_promo_constraints_dto.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


