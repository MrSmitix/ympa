# GetCampaignOfferDTO

Параметры размещения товара в магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**quantum** | [**QuantumDTO**](QuantumDTO.md) |  | [optional] 
**available** | **bool** | Есть ли товар в продаже.  | [optional] 
**basic_price** | [**GetPriceWithDiscountDTO**](GetPriceWithDiscountDTO.md) |  | [optional] 
**campaign_price** | [**GetPriceWithVatDTO**](GetPriceWithVatDTO.md) |  | [optional] 
**status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | [optional] 
**errors** | [**List[OfferErrorDTO]**](OfferErrorDTO.md) | Ошибки, препятствующие размещению товара на витрине.  | [optional] 
**warnings** | [**List[OfferErrorDTO]**](OfferErrorDTO.md) | Предупреждения, не препятствующие размещению товара на витрине.  | [optional] 

## Example

```python
from ympa_python_client.models.get_campaign_offer_dto import GetCampaignOfferDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignOfferDTO from a JSON string
get_campaign_offer_dto_instance = GetCampaignOfferDTO.from_json(json)
# print the JSON string representation of the object
print(GetCampaignOfferDTO.to_json())

# convert the object into a dict
get_campaign_offer_dto_dict = get_campaign_offer_dto_instance.to_dict()
# create an instance of GetCampaignOfferDTO from a dict
get_campaign_offer_dto_from_dict = GetCampaignOfferDTO.from_dict(get_campaign_offer_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


