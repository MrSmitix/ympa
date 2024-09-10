# PromoOfferAutoParticipatingDetailsDTO

Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_ids** | **List[int]** | Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;.  | [optional] 

## Example

```python
from ympa_python_client.models.promo_offer_auto_participating_details_dto import PromoOfferAutoParticipatingDetailsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PromoOfferAutoParticipatingDetailsDTO from a JSON string
promo_offer_auto_participating_details_dto_instance = PromoOfferAutoParticipatingDetailsDTO.from_json(json)
# print the JSON string representation of the object
print(PromoOfferAutoParticipatingDetailsDTO.to_json())

# convert the object into a dict
promo_offer_auto_participating_details_dto_dict = promo_offer_auto_participating_details_dto_instance.to_dict()
# create an instance of PromoOfferAutoParticipatingDetailsDTO from a dict
promo_offer_auto_participating_details_dto_from_dict = PromoOfferAutoParticipatingDetailsDTO.from_dict(promo_offer_auto_participating_details_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


