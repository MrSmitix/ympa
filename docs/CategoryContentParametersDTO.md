# ympa_r_client::CategoryContentParametersDTO

Информация о параметрах категории.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categoryId** | **integer** | Идентификатор категории на Маркете. Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). | 
**parameters** | [**array[CategoryParameterDTO]**](CategoryParameterDTO.md) | Список характеристик. | [optional] 


