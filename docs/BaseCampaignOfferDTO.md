# BaseCampaignOfferDTO

Информация о новой цене на товар.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [**QuantumDTO**](QuantumDTO.md) |  | [optional] 
**available** | **bool** | Есть ли товар в продаже.  | [optional] 

## Example

```python
from ympa_python_client.models.base_campaign_offer_dto import BaseCampaignOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BaseCampaignOfferDTO from a JSON string
base_campaign_offer_dto_instance = BaseCampaignOfferDTO.from_json(json)
# print the JSON string representation of the object
print(BaseCampaignOfferDTO.to_json())

# convert the object into a dict
base_campaign_offer_dto_dict = base_campaign_offer_dto_instance.to_dict()
# create an instance of BaseCampaignOfferDTO from a dict
base_campaign_offer_dto_from_dict = BaseCampaignOfferDTO.from_dict(base_campaign_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


