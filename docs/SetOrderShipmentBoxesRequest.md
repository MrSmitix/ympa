
# Table `SetOrderShipmentBoxesRequest`
(mapped from: SetOrderShipmentBoxesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boxes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ParcelBoxDTO&gt;**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 


# **Table `SetOrderShipmentBoxesRequestParcelBoxDTO`**
(mapped from: SetOrderShipmentBoxesRequestParcelBoxDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
setOrderShipmentBoxesRequest | setOrderShipmentBoxesRequest | long | | kotlin.Long | Primary Key | *one*
parcelBoxDTO | parcelBoxDTO | long | | kotlin.Long | Foreign Key | *many*



