
# Table `CategoryParameterDTO`
(mapped from: CategoryParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор характеристики. | 
**type** | type | long NOT NULL |  | [**ParameterType**](ParameterType.md) |  |  [foreignkey]
**required** | required | boolean NOT NULL |  | **kotlin.Boolean** | Обязательность характеристики. | 
**filtering** | filtering | boolean NOT NULL |  | **kotlin.Boolean** | Используется ли характеристика в фильтре. | 
**distinctive** | distinctive | boolean NOT NULL |  | **kotlin.Boolean** | Является ли характеристика особенностью варианта. | 
**multivalue** | multivalue | boolean NOT NULL |  | **kotlin.Boolean** | Можно ли передать сразу несколько значений. | 
**allowCustomValues** | allowCustomValues | boolean NOT NULL |  | **kotlin.Boolean** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**name** | name | text |  | **kotlin.String** | Название характеристики. |  [optional]
**unit** | unit | long |  | [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  |  [optional] [foreignkey]
**description** | description | text |  | **kotlin.String** | Описание характеристики. |  [optional]
**recommendationTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;OfferCardRecommendationType&gt;**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. |  [optional]
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ParameterValueOptionDTO&gt;**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional]
**constraints** | constraints | long |  | [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  |  [optional] [foreignkey]
**valueRestrictions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ValueRestrictionDTO&gt;**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. |  [optional]












# **Table `CategoryParameterDTOOfferCardRecommendationType`**
(mapped from: CategoryParameterDTOOfferCardRecommendationType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
categoryParameterDTO | categoryParameterDTO | long | | kotlin.Long | Primary Key | *one*
offerCardRecommendationType | offerCardRecommendationType | long | | kotlin.Long | Foreign Key | *many*



# **Table `CategoryParameterDTOParameterValueOptionDTO`**
(mapped from: CategoryParameterDTOParameterValueOptionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
categoryParameterDTO | categoryParameterDTO | long | | kotlin.Long | Primary Key | *one*
parameterValueOptionDTO | parameterValueOptionDTO | long | | kotlin.Long | Foreign Key | *many*




# **Table `CategoryParameterDTOValueRestrictionDTO`**
(mapped from: CategoryParameterDTOValueRestrictionDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
categoryParameterDTO | categoryParameterDTO | long | | kotlin.Long | Primary Key | *one*
valueRestrictionDTO | valueRestrictionDTO | long | | kotlin.Long | Foreign Key | *many*



