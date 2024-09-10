# DeletePromoOffersRequest

Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promo_id** | **str** | Идентификатор акции. | 
**delete_all_offers** | **bool** | Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение &#x60;true&#x60; и не передавайте параметр &#x60;offerIds&#x60;. | [optional] 
**offer_ids** | **List[str]** | Товары, которые нужно убрать из акции. | [optional] 

## Example

```python
from ympa_python_client.models.delete_promo_offers_request import DeletePromoOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePromoOffersRequest from a JSON string
delete_promo_offers_request_instance = DeletePromoOffersRequest.from_json(json)
# print the JSON string representation of the object
print(DeletePromoOffersRequest.to_json())

# convert the object into a dict
delete_promo_offers_request_dict = delete_promo_offers_request_instance.to_dict()
# create an instance of DeletePromoOffersRequest from a dict
delete_promo_offers_request_from_dict = DeletePromoOffersRequest.from_dict(delete_promo_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


