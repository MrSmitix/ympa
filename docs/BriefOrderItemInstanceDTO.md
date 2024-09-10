# BriefOrderItemInstanceDTO

Идентификатор единицы товара.  Заполните только одно поле в зависимости от того, в какой системе маркирован товар.  Подробно о работе с маркируемыми товарами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/cz.html). 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cis** | **str** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  {% note warning %}  Не экранируйте косую черту в коде символа-разделителя &#x60;\\u001d&#x60;!  ✅ &#x60;01030410947874432155Qbag!\\u001d93Zjqw&#x60;  ❌ &#x60;01030410947874432155Qbag!\\\\u001d93Zjqw&#x60;  Косые черты и кавычки в других местах экранируйте по правилам JSON: &#x60;\\\\&#x60; и &#x60;\\\&quot;&#x60;  {% endnote %}  | [optional] 
**uin** | **str** | Уникальный идентификационный номер ювелирного изделия.  Представляет собой число из 16 цифр.  | [optional] 
**rnpt** | **str** | Регистрационный номер партии товара.  Представляет собой строку из четырех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ/ХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на партию товара. Далее — дата, номер декларации и номер маркированного товара в декларации.  | [optional] 
**gtd** | **str** | Грузовая таможенная декларация.  Представляет собой строку из трех чисел, разделенных косой чертой: ХХХХХХХХ/ХХХХХХ/ХХХХХХХ.  Первая часть — код таможни, которая зарегистрировала декларацию на ввезенные товары. Далее — дата и номер декларации.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.brief_order_item_instance_dto import BriefOrderItemInstanceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of BriefOrderItemInstanceDTO from a JSON string
brief_order_item_instance_dto_instance = BriefOrderItemInstanceDTO.from_json(json)
# print the JSON string representation of the object
print BriefOrderItemInstanceDTO.to_json()

# convert the object into a dict
brief_order_item_instance_dto_dict = brief_order_item_instance_dto_instance.to_dict()
# create an instance of BriefOrderItemInstanceDTO from a dict
brief_order_item_instance_dto_from_dict = BriefOrderItemInstanceDTO.from_dict(brief_order_item_instance_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


