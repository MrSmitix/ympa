
# Table `CalculateTariffsResponseDTO`
(mapped from: CalculateTariffsResponseDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CalculateTariffsOfferInfoDTO&gt;**](CalculateTariffsOfferInfoDTO.md) | Стоимость услуг. | 


# **Table `CalculateTariffsResponseDTOCalculateTariffsOfferInfoDTO`**
(mapped from: CalculateTariffsResponseDTOCalculateTariffsOfferInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
calculateTariffsResponseDTO | calculateTariffsResponseDTO | long | | kotlin.Long | Primary Key | *one*
calculateTariffsOfferInfoDTO | calculateTariffsOfferInfoDTO | long | | kotlin.Long | Foreign Key | *many*



