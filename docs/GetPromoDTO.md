# GetPromoDTO

Информация об акции.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Идентификатор акции. | 
**name** | **str** | Название акции. | 
**period** | [**PromoPeriodDTO**](PromoPeriodDTO.md) |  | 
**participating** | **bool** | Участвует или участвовал ли продавец в этой акции.  Для текущих и будущих акций возвращается со значением &#x60;true&#x60;, если в акции есть товары, которые были добавлены вручную. Если товары не участвуют в акции или добавлены в нее автоматически, параметр возвращается со значением &#x60;false&#x60;.  Для прошедших акций всегда возвращается со значением &#x60;true&#x60;.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**assortment_info** | [**GetPromoAssortmentInfoDTO**](GetPromoAssortmentInfoDTO.md) |  | 
**mechanics_info** | [**GetPromoMechanicsInfoDTO**](GetPromoMechanicsInfoDTO.md) |  | 
**bestseller_info** | [**GetPromoBestsellerInfoDTO**](GetPromoBestsellerInfoDTO.md) |  | 
**channels** | [**List[ChannelType]**](ChannelType.md) | Список каналов продвижения товаров. | [optional] 
**constraints** | [**GetPromoConstraintsDTO**](GetPromoConstraintsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_promo_dto import GetPromoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoDTO from a JSON string
get_promo_dto_instance = GetPromoDTO.from_json(json)
# print the JSON string representation of the object
print(GetPromoDTO.to_json())

# convert the object into a dict
get_promo_dto_dict = get_promo_dto_instance.to_dict()
# create an instance of GetPromoDTO from a dict
get_promo_dto_from_dict = GetPromoDTO.from_dict(get_promo_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


