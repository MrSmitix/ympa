
# Table `SearchShipmentsResponseDTO`
(mapped from: SearchShipmentsResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**shipments** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ShipmentInfoDTO&gt;**](ShipmentInfoDTO.md) | Список с информацией об отгрузках. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `SearchShipmentsResponseDTOShipmentInfoDTO`**
(mapped from: SearchShipmentsResponseDTOShipmentInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
searchShipmentsResponseDTO | searchShipmentsResponseDTO | long | | kotlin.Long | Primary Key | *one*
shipmentInfoDTO | shipmentInfoDTO | long | | kotlin.Long | Foreign Key | *many*




