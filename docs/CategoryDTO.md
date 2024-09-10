# ympa_r_client::CategoryDTO

Информация о категории.  Категория считается листовой, если у нее нет дочерних категорий. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор категории. | 
**name** | **character** | Название категории. | 
**children** | [**array[CategoryDTO]**](CategoryDTO.md) | Дочерние категории. | [optional] 


