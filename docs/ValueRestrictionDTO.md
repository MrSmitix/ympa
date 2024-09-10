
# Table `ValueRestrictionDTO`
(mapped from: ValueRestrictionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**limitingParameterId** | limitingParameterId | long NOT NULL |  | **kotlin.Long** | Идентификатор ограничивающей характеристики. | 
**limitedValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OptionValuesLimitedDTO&gt;**](OptionValuesLimitedDTO.md) | Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. | 



# **Table `ValueRestrictionDTOOptionValuesLimitedDTO`**
(mapped from: ValueRestrictionDTOOptionValuesLimitedDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
valueRestrictionDTO | valueRestrictionDTO | long | | kotlin.Long | Primary Key | *one*
optionValuesLimitedDTO | optionValuesLimitedDTO | long | | kotlin.Long | Foreign Key | *many*



