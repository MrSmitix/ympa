
# Table `CategoryDTO`
(mapped from: CategoryDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | long NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Long** | Идентификатор категории. | 
**name** | name | text NOT NULL |  | **kotlin.String** | Название категории. | 
**children** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CategoryDTO&gt;**](CategoryDTO.md) | Дочерние категории. |  [optional]




# **Table `CategoryDTOCategoryDTO`**
(mapped from: CategoryDTOCategoryDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
categoryDTO | categoryDTO | long | | kotlin.Long | Primary Key | *one*
categoryDTO | categoryDTO | long | | kotlin.Long | Foreign Key | *many*



