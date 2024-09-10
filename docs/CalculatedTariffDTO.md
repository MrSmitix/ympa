
# Table `CalculatedTariffDTO`
(mapped from: CalculatedTariffDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | long NOT NULL |  | [**CalculatedTariffType**](CalculatedTariffType.md) |  |  [foreignkey]
**parameters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TariffParameterDTO&gt;**](TariffParameterDTO.md) | Параметры расчета тарифа. | 
**amount** | amount | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость услуги в рублях. |  [optional]



# **Table `CalculatedTariffDTOTariffParameterDTO`**
(mapped from: CalculatedTariffDTOTariffParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
calculatedTariffDTO | calculatedTariffDTO | long | | kotlin.Long | Primary Key | *one*
tariffParameterDTO | tariffParameterDTO | long | | kotlin.Long | Foreign Key | *many*




