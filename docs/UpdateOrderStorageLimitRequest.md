# UpdateOrderStorageLimitRequest

Запрос на обновление срока хранения заказа в ПВЗ.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**new_date** | **date** | Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  | 

## Example

```python
from ympa_python_client.models.update_order_storage_limit_request import UpdateOrderStorageLimitRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOrderStorageLimitRequest from a JSON string
update_order_storage_limit_request_instance = UpdateOrderStorageLimitRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateOrderStorageLimitRequest.to_json())

# convert the object into a dict
update_order_storage_limit_request_dict = update_order_storage_limit_request_instance.to_dict()
# create an instance of UpdateOrderStorageLimitRequest from a dict
update_order_storage_limit_request_from_dict = UpdateOrderStorageLimitRequest.from_dict(update_order_storage_limit_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


