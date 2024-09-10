# AddOffersToArchiveErrorDTO

Товар, который не удалось поместить в архив.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_id** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | 
**error** | [**AddOffersToArchiveErrorType**](AddOffersToArchiveErrorType.md) |  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.add_offers_to_archive_error_dto import AddOffersToArchiveErrorDTO

# TODO update the JSON string below
json = "{}"
# create an instance of AddOffersToArchiveErrorDTO from a JSON string
add_offers_to_archive_error_dto_instance = AddOffersToArchiveErrorDTO.from_json(json)
# print the JSON string representation of the object
print AddOffersToArchiveErrorDTO.to_json()

# convert the object into a dict
add_offers_to_archive_error_dto_dict = add_offers_to_archive_error_dto_instance.to_dict()
# create an instance of AddOffersToArchiveErrorDTO from a dict
add_offers_to_archive_error_dto_from_dict = AddOffersToArchiveErrorDTO.from_dict(add_offers_to_archive_error_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


