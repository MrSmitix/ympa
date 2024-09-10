# UpdateCampaignOfferDTO

Параметры размещения товара в магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [**QuantumDTO**](QuantumDTO.md) |  | [optional] 
**available** | **bool** | Есть ли товар в продаже.  | [optional] 
**vat** | **int** | Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете.  | [optional] 

## Example

```python
from ympa_python_client.models.update_campaign_offer_dto import UpdateCampaignOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateCampaignOfferDTO from a JSON string
update_campaign_offer_dto_instance = UpdateCampaignOfferDTO.from_json(json)
# print the JSON string representation of the object
print(UpdateCampaignOfferDTO.to_json())

# convert the object into a dict
update_campaign_offer_dto_dict = update_campaign_offer_dto_instance.to_dict()
# create an instance of UpdateCampaignOfferDTO from a dict
update_campaign_offer_dto_from_dict = UpdateCampaignOfferDTO.from_dict(update_campaign_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


