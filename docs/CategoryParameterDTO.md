# CategoryParameterDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор характеристики. | 
**Name** | Pointer to **string** | Название характеристики. | [optional] 
**Type** | [**ParameterType**](ParameterType.md) |  | 
**Unit** | Pointer to [**CategoryParameterUnitDTO**](CategoryParameterUnitDTO.md) |  | [optional] 
**Description** | Pointer to **string** | Описание характеристики. | [optional] 
**RecommendationTypes** | Pointer to [**[]OfferCardRecommendationType**](OfferCardRecommendationType.md) | Перечень возможных рекомендаций по заполнению карточки, к которым относится данная характеристика. | [optional] 
**Required** | **bool** | Обязательность характеристики. | 
**Filtering** | **bool** | Используется ли характеристика в фильтре. | 
**Distinctive** | **bool** | Является ли характеристика особенностью варианта. | 
**Multivalue** | **bool** | Можно ли передать сразу несколько значений. | 
**AllowCustomValues** | **bool** | Можно ли передавать собственное значение, которого нет в списке вариантов Маркета. Только для характеристик типа &#x60;ENUM&#x60;. | 
**Values** | Pointer to [**[]ParameterValueOptionDTO**](ParameterValueOptionDTO.md) | Список допустимых значений параметра. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 
**Constraints** | Pointer to [**ParameterValueConstraintsDTO**](ParameterValueConstraintsDTO.md) |  | [optional] 
**ValueRestrictions** | Pointer to [**[]ValueRestrictionDTO**](ValueRestrictionDTO.md) | Ограничения на значения, накладываемые другими характеристиками. Только для характеристик типа &#x60;ENUM&#x60;. | [optional] 

## Methods

### NewCategoryParameterDTO

`func NewCategoryParameterDTO(id int64, type_ ParameterType, required bool, filtering bool, distinctive bool, multivalue bool, allowCustomValues bool, ) *CategoryParameterDTO`

NewCategoryParameterDTO instantiates a new CategoryParameterDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCategoryParameterDTOWithDefaults

`func NewCategoryParameterDTOWithDefaults() *CategoryParameterDTO`

NewCategoryParameterDTOWithDefaults instantiates a new CategoryParameterDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *CategoryParameterDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *CategoryParameterDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *CategoryParameterDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetName

`func (o *CategoryParameterDTO) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *CategoryParameterDTO) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *CategoryParameterDTO) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *CategoryParameterDTO) HasName() bool`

HasName returns a boolean if a field has been set.

### GetType

`func (o *CategoryParameterDTO) GetType() ParameterType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *CategoryParameterDTO) GetTypeOk() (*ParameterType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *CategoryParameterDTO) SetType(v ParameterType)`

SetType sets Type field to given value.


### GetUnit

`func (o *CategoryParameterDTO) GetUnit() CategoryParameterUnitDTO`

GetUnit returns the Unit field if non-nil, zero value otherwise.

### GetUnitOk

`func (o *CategoryParameterDTO) GetUnitOk() (*CategoryParameterUnitDTO, bool)`

GetUnitOk returns a tuple with the Unit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnit

`func (o *CategoryParameterDTO) SetUnit(v CategoryParameterUnitDTO)`

SetUnit sets Unit field to given value.

### HasUnit

`func (o *CategoryParameterDTO) HasUnit() bool`

HasUnit returns a boolean if a field has been set.

### GetDescription

`func (o *CategoryParameterDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *CategoryParameterDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *CategoryParameterDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *CategoryParameterDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### GetRecommendationTypes

`func (o *CategoryParameterDTO) GetRecommendationTypes() []OfferCardRecommendationType`

GetRecommendationTypes returns the RecommendationTypes field if non-nil, zero value otherwise.

### GetRecommendationTypesOk

`func (o *CategoryParameterDTO) GetRecommendationTypesOk() (*[]OfferCardRecommendationType, bool)`

GetRecommendationTypesOk returns a tuple with the RecommendationTypes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecommendationTypes

`func (o *CategoryParameterDTO) SetRecommendationTypes(v []OfferCardRecommendationType)`

SetRecommendationTypes sets RecommendationTypes field to given value.

### HasRecommendationTypes

`func (o *CategoryParameterDTO) HasRecommendationTypes() bool`

HasRecommendationTypes returns a boolean if a field has been set.

### SetRecommendationTypesNil

`func (o *CategoryParameterDTO) SetRecommendationTypesNil(b bool)`

 SetRecommendationTypesNil sets the value for RecommendationTypes to be an explicit nil

### UnsetRecommendationTypes
`func (o *CategoryParameterDTO) UnsetRecommendationTypes()`

UnsetRecommendationTypes ensures that no value is present for RecommendationTypes, not even an explicit nil
### GetRequired

`func (o *CategoryParameterDTO) GetRequired() bool`

GetRequired returns the Required field if non-nil, zero value otherwise.

### GetRequiredOk

`func (o *CategoryParameterDTO) GetRequiredOk() (*bool, bool)`

GetRequiredOk returns a tuple with the Required field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequired

`func (o *CategoryParameterDTO) SetRequired(v bool)`

SetRequired sets Required field to given value.


### GetFiltering

`func (o *CategoryParameterDTO) GetFiltering() bool`

GetFiltering returns the Filtering field if non-nil, zero value otherwise.

### GetFilteringOk

`func (o *CategoryParameterDTO) GetFilteringOk() (*bool, bool)`

GetFilteringOk returns a tuple with the Filtering field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFiltering

`func (o *CategoryParameterDTO) SetFiltering(v bool)`

SetFiltering sets Filtering field to given value.


### GetDistinctive

`func (o *CategoryParameterDTO) GetDistinctive() bool`

GetDistinctive returns the Distinctive field if non-nil, zero value otherwise.

### GetDistinctiveOk

`func (o *CategoryParameterDTO) GetDistinctiveOk() (*bool, bool)`

GetDistinctiveOk returns a tuple with the Distinctive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDistinctive

`func (o *CategoryParameterDTO) SetDistinctive(v bool)`

SetDistinctive sets Distinctive field to given value.


### GetMultivalue

`func (o *CategoryParameterDTO) GetMultivalue() bool`

GetMultivalue returns the Multivalue field if non-nil, zero value otherwise.

### GetMultivalueOk

`func (o *CategoryParameterDTO) GetMultivalueOk() (*bool, bool)`

GetMultivalueOk returns a tuple with the Multivalue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMultivalue

`func (o *CategoryParameterDTO) SetMultivalue(v bool)`

SetMultivalue sets Multivalue field to given value.


### GetAllowCustomValues

`func (o *CategoryParameterDTO) GetAllowCustomValues() bool`

GetAllowCustomValues returns the AllowCustomValues field if non-nil, zero value otherwise.

### GetAllowCustomValuesOk

`func (o *CategoryParameterDTO) GetAllowCustomValuesOk() (*bool, bool)`

GetAllowCustomValuesOk returns a tuple with the AllowCustomValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowCustomValues

`func (o *CategoryParameterDTO) SetAllowCustomValues(v bool)`

SetAllowCustomValues sets AllowCustomValues field to given value.


### GetValues

`func (o *CategoryParameterDTO) GetValues() []ParameterValueOptionDTO`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *CategoryParameterDTO) GetValuesOk() (*[]ParameterValueOptionDTO, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *CategoryParameterDTO) SetValues(v []ParameterValueOptionDTO)`

SetValues sets Values field to given value.

### HasValues

`func (o *CategoryParameterDTO) HasValues() bool`

HasValues returns a boolean if a field has been set.

### SetValuesNil

`func (o *CategoryParameterDTO) SetValuesNil(b bool)`

 SetValuesNil sets the value for Values to be an explicit nil

### UnsetValues
`func (o *CategoryParameterDTO) UnsetValues()`

UnsetValues ensures that no value is present for Values, not even an explicit nil
### GetConstraints

`func (o *CategoryParameterDTO) GetConstraints() ParameterValueConstraintsDTO`

GetConstraints returns the Constraints field if non-nil, zero value otherwise.

### GetConstraintsOk

`func (o *CategoryParameterDTO) GetConstraintsOk() (*ParameterValueConstraintsDTO, bool)`

GetConstraintsOk returns a tuple with the Constraints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConstraints

`func (o *CategoryParameterDTO) SetConstraints(v ParameterValueConstraintsDTO)`

SetConstraints sets Constraints field to given value.

### HasConstraints

`func (o *CategoryParameterDTO) HasConstraints() bool`

HasConstraints returns a boolean if a field has been set.

### GetValueRestrictions

`func (o *CategoryParameterDTO) GetValueRestrictions() []ValueRestrictionDTO`

GetValueRestrictions returns the ValueRestrictions field if non-nil, zero value otherwise.

### GetValueRestrictionsOk

`func (o *CategoryParameterDTO) GetValueRestrictionsOk() (*[]ValueRestrictionDTO, bool)`

GetValueRestrictionsOk returns a tuple with the ValueRestrictions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValueRestrictions

`func (o *CategoryParameterDTO) SetValueRestrictions(v []ValueRestrictionDTO)`

SetValueRestrictions sets ValueRestrictions field to given value.

### HasValueRestrictions

`func (o *CategoryParameterDTO) HasValueRestrictions() bool`

HasValueRestrictions returns a boolean if a field has been set.

### SetValueRestrictionsNil

`func (o *CategoryParameterDTO) SetValueRestrictionsNil(b bool)`

 SetValueRestrictionsNil sets the value for ValueRestrictions to be an explicit nil

### UnsetValueRestrictions
`func (o *CategoryParameterDTO) UnsetValueRestrictions()`

UnsetValueRestrictions ensures that no value is present for ValueRestrictions, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


