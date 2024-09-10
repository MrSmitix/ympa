
# Table `OutletLicensesResponseDTO`
(mapped from: OutletLicensesResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**licenses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;FullOutletLicenseDTO&gt;**](FullOutletLicenseDTO.md) | Список лицензий. | 


# **Table `OutletLicensesResponseDTOFullOutletLicenseDTO`**
(mapped from: OutletLicensesResponseDTOFullOutletLicenseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
outletLicensesResponseDTO | outletLicensesResponseDTO | long | | kotlin.Long | Primary Key | *one*
fullOutletLicenseDTO | fullOutletLicenseDTO | long | | kotlin.Long | Foreign Key | *many*



