# ParameterValueOptionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** | Идентификатор значения. | 
**Value** | **string** | Значение. | 
**Description** | Pointer to **string** | Описание значения. | [optional] 

## Methods

### NewParameterValueOptionDTO

`func NewParameterValueOptionDTO(id int64, value string, ) *ParameterValueOptionDTO`

NewParameterValueOptionDTO instantiates a new ParameterValueOptionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewParameterValueOptionDTOWithDefaults

`func NewParameterValueOptionDTOWithDefaults() *ParameterValueOptionDTO`

NewParameterValueOptionDTOWithDefaults instantiates a new ParameterValueOptionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ParameterValueOptionDTO) GetId() int64`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ParameterValueOptionDTO) GetIdOk() (*int64, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ParameterValueOptionDTO) SetId(v int64)`

SetId sets Id field to given value.


### GetValue

`func (o *ParameterValueOptionDTO) GetValue() string`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ParameterValueOptionDTO) GetValueOk() (*string, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ParameterValueOptionDTO) SetValue(v string)`

SetValue sets Value field to given value.


### GetDescription

`func (o *ParameterValueOptionDTO) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ParameterValueOptionDTO) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ParameterValueOptionDTO) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ParameterValueOptionDTO) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


