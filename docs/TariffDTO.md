
# Table `TariffDTO`
(mapped from: TariffDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | long NOT NULL |  | [**TariffType**](TariffType.md) |  |  [foreignkey]
**amount** | amount | decimal NOT NULL |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Значение тарифа в рублях. | 
**parameters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TariffParameterDTO&gt;**](TariffParameterDTO.md) | Параметры расчета тарифа. | 
**percent** | percent | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах.  |  [optional]




# **Table `TariffDTOTariffParameterDTO`**
(mapped from: TariffDTOTariffParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
tariffDTO | tariffDTO | long | | kotlin.Long | Primary Key | *one*
tariffParameterDTO | tariffParameterDTO | long | | kotlin.Long | Foreign Key | *many*




