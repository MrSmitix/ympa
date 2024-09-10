# OrderItemInstanceDTO

Переданные вами для данной позиции коды маркировки или УИНы. Коды «Честного знака» возвращаются в двух вариантах — с криптохвостом и без. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cis** | **str** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) без криптохвоста. | [optional] 
**cis_full** | **str** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/) с криптохвостом. | [optional] 
**uin** | **str** | УИН ювелирного изделия (16-значный код) Производитель получает УИН, когда регистрирует изделие в системе контроля за оборотом драгоценных металлов и камней — ГИИС ДМДК.  | [optional] 
**rnpt** | **str** | Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  | [optional] 
**gtd** | **str** | Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  | [optional] 

## Example

```python
from ympa_python_client.models.order_item_instance_dto import OrderItemInstanceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderItemInstanceDTO from a JSON string
order_item_instance_dto_instance = OrderItemInstanceDTO.from_json(json)
# print the JSON string representation of the object
print(OrderItemInstanceDTO.to_json())

# convert the object into a dict
order_item_instance_dto_dict = order_item_instance_dto_instance.to_dict()
# create an instance of OrderItemInstanceDTO from a dict
order_item_instance_dto_from_dict = OrderItemInstanceDTO.from_dict(order_item_instance_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


