# ProvideOrderDigitalCodesRequest

Запрос на передачу ключей цифровых товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[OrderDigitalItemDTO]**](OrderDigitalItemDTO.md) | Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.provide_order_digital_codes_request import ProvideOrderDigitalCodesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProvideOrderDigitalCodesRequest from a JSON string
provide_order_digital_codes_request_instance = ProvideOrderDigitalCodesRequest.from_json(json)
# print the JSON string representation of the object
print ProvideOrderDigitalCodesRequest.to_json()

# convert the object into a dict
provide_order_digital_codes_request_dict = provide_order_digital_codes_request_instance.to_dict()
# create an instance of ProvideOrderDigitalCodesRequest from a dict
provide_order_digital_codes_request_from_dict = ProvideOrderDigitalCodesRequest.from_dict(provide_order_digital_codes_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


