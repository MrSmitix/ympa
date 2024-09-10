# GenerateShipmentListDocumentReportRequest

Данные, необходимые для генерации документа. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. | 
**shipment_id** | **int** | Идентификатор отгрузки. | [optional] 
**order_ids** | **List[int]** | Фильтр по идентификаторам заказа в отгрузке. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateShipmentListDocumentReportRequest from a JSON string
generate_shipment_list_document_report_request_instance = GenerateShipmentListDocumentReportRequest.from_json(json)
# print the JSON string representation of the object
print GenerateShipmentListDocumentReportRequest.to_json()

# convert the object into a dict
generate_shipment_list_document_report_request_dict = generate_shipment_list_document_report_request_instance.to_dict()
# create an instance of GenerateShipmentListDocumentReportRequest from a dict
generate_shipment_list_document_report_request_from_dict = GenerateShipmentListDocumentReportRequest.from_dict(generate_shipment_list_document_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


