
# Table `OptionValuesLimitedDTO`
(mapped from: OptionValuesLimitedDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**limitingOptionValueId** | limitingOptionValueId | long NOT NULL |  | **kotlin.Long** | Идентификатор значения ограничивающей характеристики. | 
**optionValueIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Идентификаторы допустимых значений ограничиваемой характеристики.  | 



# **Table `OptionValuesLimitedDTOOptionValueIds`**
(mapped from: OptionValuesLimitedDTOOptionValueIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
optionValuesLimitedDTO | optionValuesLimitedDTO | long | | kotlin.Long | Primary Key | *one*
optionValueIds | optionValueIds | long | | kotlin.Long | Foreign Key | *many*



