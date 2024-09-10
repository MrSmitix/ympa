# UpdatePromoOffersRequest

Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promo_id** | **str** | Идентификатор акции. | 
**offers** | [**List[UpdatePromoOfferDTO]**](UpdatePromoOfferDTO.md) | Товары, которые необходимо добавить в акцию или цены которых нужно изменить. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_promo_offers_request import UpdatePromoOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePromoOffersRequest from a JSON string
update_promo_offers_request_instance = UpdatePromoOffersRequest.from_json(json)
# print the JSON string representation of the object
print UpdatePromoOffersRequest.to_json()

# convert the object into a dict
update_promo_offers_request_dict = update_promo_offers_request_instance.to_dict()
# create an instance of UpdatePromoOffersRequest from a dict
update_promo_offers_request_from_dict = UpdatePromoOffersRequest.from_dict(update_promo_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


