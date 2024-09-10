# PutSkuBidsRequest

description.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bids** | [**List[SkuBidItemDTO]**](SkuBidItemDTO.md) | Список товаров и ставки для продвижения, которые на них нужно установить. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.put_sku_bids_request import PutSkuBidsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutSkuBidsRequest from a JSON string
put_sku_bids_request_instance = PutSkuBidsRequest.from_json(json)
# print the JSON string representation of the object
print PutSkuBidsRequest.to_json()

# convert the object into a dict
put_sku_bids_request_dict = put_sku_bids_request_instance.to_dict()
# create an instance of PutSkuBidsRequest from a dict
put_sku_bids_request_from_dict = PutSkuBidsRequest.from_dict(put_sku_bids_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


