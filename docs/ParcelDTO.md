
# Table `ParcelDTO`
(mapped from: ParcelDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**boxes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ParcelBoxDTO&gt;**](ParcelBoxDTO.md) | Список грузовых мест. Маркет определяет количество мест по длине этого списка. | 


# **Table `ParcelDTOParcelBoxDTO`**
(mapped from: ParcelDTOParcelBoxDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
parcelDTO | parcelDTO | long | | kotlin.Long | Primary Key | *one*
parcelBoxDTO | parcelBoxDTO | long | | kotlin.Long | Foreign Key | *many*



