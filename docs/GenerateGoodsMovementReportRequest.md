# GenerateGoodsMovementReportRequest

Данные, необходимые для генерации отчета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. | 
**date_from** | **date** | Начало периода, включительно. | 
**date_to** | **date** | Конец периода, включительно. | 
**shop_sku** | **str** | Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  | [optional] 

## Example

```python
from ympa_python_client.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateGoodsMovementReportRequest from a JSON string
generate_goods_movement_report_request_instance = GenerateGoodsMovementReportRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateGoodsMovementReportRequest.to_json())

# convert the object into a dict
generate_goods_movement_report_request_dict = generate_goods_movement_report_request_instance.to_dict()
# create an instance of GenerateGoodsMovementReportRequest from a dict
generate_goods_movement_report_request_from_dict = GenerateGoodsMovementReportRequest.from_dict(generate_goods_movement_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


