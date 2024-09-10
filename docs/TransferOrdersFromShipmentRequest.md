
# Table `TransferOrdersFromShipmentRequest`
(mapped from: TransferOrdersFromShipmentRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Список заказов, которые вы не успеваете подготовить. | 


# **Table `TransferOrdersFromShipmentRequestOrderIds`**
(mapped from: TransferOrdersFromShipmentRequestOrderIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
transferOrdersFromShipmentRequest | transferOrdersFromShipmentRequest | long | | kotlin.Long | Primary Key | *one*
orderIds | orderIds | long | | kotlin.Long | Foreign Key | *many*



