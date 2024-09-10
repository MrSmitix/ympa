# GenerateUnitedOrdersRequest

Данные, необходимые для генерации отчета. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**business_id** | **int** | Идентификатор бизнеса. | 
**date_from** | **date** | Начало периода, включительно. | 
**date_to** | **date** | Конец периода, включительно. Максимальный период — 1 год. | 
**campaign_ids** | **List[int]** | Список магазинов, которые нужны в отчете. | [optional] 
**promo_id** | **str** | Идентификатор акции, товары из которой нужны в отчете. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.generate_united_orders_request import GenerateUnitedOrdersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateUnitedOrdersRequest from a JSON string
generate_united_orders_request_instance = GenerateUnitedOrdersRequest.from_json(json)
# print the JSON string representation of the object
print GenerateUnitedOrdersRequest.to_json()

# convert the object into a dict
generate_united_orders_request_dict = generate_united_orders_request_instance.to_dict()
# create an instance of GenerateUnitedOrdersRequest from a dict
generate_united_orders_request_from_dict = GenerateUnitedOrdersRequest.from_dict(generate_united_orders_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


