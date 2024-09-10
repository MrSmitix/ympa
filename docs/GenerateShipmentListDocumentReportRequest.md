
# Table `GenerateShipmentListDocumentReportRequest`
(mapped from: GenerateShipmentListDocumentReportRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignId** | campaignId | long NOT NULL |  | **kotlin.Long** | Идентификатор кампании. | 
**shipmentId** | shipmentId | long |  | **kotlin.Long** | Идентификатор отгрузки. |  [optional]
**orderIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Фильтр по идентификаторам заказа в отгрузке. |  [optional]




# **Table `GenerateShipmentListDocumentReportRequestOrderIds`**
(mapped from: GenerateShipmentListDocumentReportRequestOrderIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
generateShipmentListDocumentReportRequest | generateShipmentListDocumentReportRequest | long | | kotlin.Long | Primary Key | *one*
orderIds | orderIds | long | | kotlin.Long | Foreign Key | *many*



