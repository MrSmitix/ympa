
# Table `ShipmentBoxesDTO`
(mapped from: ShipmentBoxesDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boxes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ParcelBoxDTO&gt;**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определил количество мест по длине этого списка.  | 


# **Table `ShipmentBoxesDTOParcelBoxDTO`**
(mapped from: ShipmentBoxesDTOParcelBoxDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
shipmentBoxesDTO | shipmentBoxesDTO | long | | kotlin.Long | Primary Key | *one*
parcelBoxDTO | parcelBoxDTO | long | | kotlin.Long | Foreign Key | *many*



