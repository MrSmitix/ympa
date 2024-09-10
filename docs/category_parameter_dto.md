# category_parameter_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор характеристики. | 
**name** | **char \*** | Название характеристики. | [optional] 
**type** | **parameter_type_t \*** |  | 
**unit** | [**category_parameter_unit_dto_t**](category_parameter_unit_dto.md) \* |  | [optional] 
**description** | **char \*** | Описание характеристики. | [optional] 
**recommendation_types** | [**list_t**](offer_card_recommendation_type.md) \* | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**required** | **int** | Обязательность характеристики. | 
**filtering** | **int** | Используется ли характеристика в фильтре. | 
**distinctive** | **int** | Является ли характеристика особенностью варианта. | 
**multivalue** | **int** | Можно ли передать сразу несколько значений. | 
**allow_custom_values** | **int** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**values** | [**list_t**](parameter_value_option_dto.md) \* | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**constraints** | [**parameter_value_constraints_dto_t**](parameter_value_constraints_dto.md) \* |  | [optional] 
**value_restrictions** | [**list_t**](value_restriction_dto.md) \* | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


