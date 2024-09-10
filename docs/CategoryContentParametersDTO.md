
# Table `CategoryContentParametersDTO`
(mapped from: CategoryContentParametersDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**categoryId** | categoryId | int NOT NULL |  | **kotlin.Int** | Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | 
**parameters** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CategoryParameterDTO&gt;**](CategoryParameterDTO.md) | Список характеристик. |  [optional]



# **Table `CategoryContentParametersDTOCategoryParameterDTO`**
(mapped from: CategoryContentParametersDTOCategoryParameterDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
categoryContentParametersDTO | categoryContentParametersDTO | long | | kotlin.Long | Primary Key | *one*
categoryParameterDTO | categoryParameterDTO | long | | kotlin.Long | Foreign Key | *many*



