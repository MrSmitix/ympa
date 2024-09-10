
# Table `CalculateTariffsRequest`
(mapped from: CalculateTariffsRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**parameters** | parameters | long NOT NULL |  | [**CalculateTariffsParametersDTO**](CalculateTariffsParametersDTO.md) |  |  [foreignkey]
**offers** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CalculateTariffsOfferDTO&gt;**](CalculateTariffsOfferDTO.md) | Товары, для которых нужно рассчитать стоимость услуг. | 



# **Table `CalculateTariffsRequestCalculateTariffsOfferDTO`**
(mapped from: CalculateTariffsRequestCalculateTariffsOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
calculateTariffsRequest | calculateTariffsRequest | long | | kotlin.Long | Primary Key | *one*
calculateTariffsOfferDTO | calculateTariffsOfferDTO | long | | kotlin.Long | Foreign Key | *many*



