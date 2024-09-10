# GetPromoAssortmentInfoDTO

Информация о товарах в акции.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_offers** | **int** | Количество товаров, которые участвуют или участвовали в акции.  Учитываются только товары, которые были добавлены вручную.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index).  | 
**potential_offers** | **int** | Количество доступных товаров в акции.  Параметр возвращается только для текущих и будущих акций.  | [optional] 
**processing** | **bool** | Есть ли изменения в ассортименте, которые еще не применились. Сохранение изменений занимает некоторое время.  Параметр возвращается только для текущих и будущих акций.  | [optional] 

## Example

```python
from ympa_python_client.models.get_promo_assortment_info_dto import GetPromoAssortmentInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromoAssortmentInfoDTO from a JSON string
get_promo_assortment_info_dto_instance = GetPromoAssortmentInfoDTO.from_json(json)
# print the JSON string representation of the object
print(GetPromoAssortmentInfoDTO.to_json())

# convert the object into a dict
get_promo_assortment_info_dto_dict = get_promo_assortment_info_dto_instance.to_dict()
# create an instance of GetPromoAssortmentInfoDTO from a dict
get_promo_assortment_info_dto_from_dict = GetPromoAssortmentInfoDTO.from_dict(get_promo_assortment_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


