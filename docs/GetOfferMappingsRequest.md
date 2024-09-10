# GetOfferMappingsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}     | [optional] 
**card_statuses** | [**List[OfferCardStatusType]**](OfferCardStatusType.md) | Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  | [optional] 
**category_ids** | **List[int]** | Фильтр по категориям на Маркете. | [optional] 
**vendor_names** | **List[str]** | Фильтр по брендам. | [optional] 
**tags** | **List[str]** | Фильтр по тегам. | [optional] 
**archived** | **bool** | Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_offer_mappings_request import GetOfferMappingsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferMappingsRequest from a JSON string
get_offer_mappings_request_instance = GetOfferMappingsRequest.from_json(json)
# print the JSON string representation of the object
print GetOfferMappingsRequest.to_json()

# convert the object into a dict
get_offer_mappings_request_dict = get_offer_mappings_request_instance.to_dict()
# create an instance of GetOfferMappingsRequest from a dict
get_offer_mappings_request_from_dict = GetOfferMappingsRequest.from_dict(get_offer_mappings_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


