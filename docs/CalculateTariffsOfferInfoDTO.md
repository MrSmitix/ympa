# CalculateTariffsOfferInfoDTO

Стоимость услуг.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer** | [**CalculateTariffsOfferDTO**](CalculateTariffsOfferDTO.md) |  | 
**tariffs** | [**List[CalculatedTariffDTO]**](CalculatedTariffDTO.md) | Список услуг и их стоимость.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/).  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.calculate_tariffs_offer_info_dto import CalculateTariffsOfferInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CalculateTariffsOfferInfoDTO from a JSON string
calculate_tariffs_offer_info_dto_instance = CalculateTariffsOfferInfoDTO.from_json(json)
# print the JSON string representation of the object
print CalculateTariffsOfferInfoDTO.to_json()

# convert the object into a dict
calculate_tariffs_offer_info_dto_dict = calculate_tariffs_offer_info_dto_instance.to_dict()
# create an instance of CalculateTariffsOfferInfoDTO from a dict
calculate_tariffs_offer_info_dto_from_dict = CalculateTariffsOfferInfoDTO.from_dict(calculate_tariffs_offer_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


