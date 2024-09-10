# ParameterValueConstraintsDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MinValue** | Pointer to **float64** | Минимальное число. | [optional] 
**MaxValue** | Pointer to **float64** | Максимальное число. | [optional] 
**MaxLength** | Pointer to **int32** | Максимальная длина текста. | [optional] 

## Methods

### NewParameterValueConstraintsDTO

`func NewParameterValueConstraintsDTO() *ParameterValueConstraintsDTO`

NewParameterValueConstraintsDTO instantiates a new ParameterValueConstraintsDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewParameterValueConstraintsDTOWithDefaults

`func NewParameterValueConstraintsDTOWithDefaults() *ParameterValueConstraintsDTO`

NewParameterValueConstraintsDTOWithDefaults instantiates a new ParameterValueConstraintsDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMinValue

`func (o *ParameterValueConstraintsDTO) GetMinValue() float64`

GetMinValue returns the MinValue field if non-nil, zero value otherwise.

### GetMinValueOk

`func (o *ParameterValueConstraintsDTO) GetMinValueOk() (*float64, bool)`

GetMinValueOk returns a tuple with the MinValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinValue

`func (o *ParameterValueConstraintsDTO) SetMinValue(v float64)`

SetMinValue sets MinValue field to given value.

### HasMinValue

`func (o *ParameterValueConstraintsDTO) HasMinValue() bool`

HasMinValue returns a boolean if a field has been set.

### GetMaxValue

`func (o *ParameterValueConstraintsDTO) GetMaxValue() float64`

GetMaxValue returns the MaxValue field if non-nil, zero value otherwise.

### GetMaxValueOk

`func (o *ParameterValueConstraintsDTO) GetMaxValueOk() (*float64, bool)`

GetMaxValueOk returns a tuple with the MaxValue field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxValue

`func (o *ParameterValueConstraintsDTO) SetMaxValue(v float64)`

SetMaxValue sets MaxValue field to given value.

### HasMaxValue

`func (o *ParameterValueConstraintsDTO) HasMaxValue() bool`

HasMaxValue returns a boolean if a field has been set.

### GetMaxLength

`func (o *ParameterValueConstraintsDTO) GetMaxLength() int32`

GetMaxLength returns the MaxLength field if non-nil, zero value otherwise.

### GetMaxLengthOk

`func (o *ParameterValueConstraintsDTO) GetMaxLengthOk() (*int32, bool)`

GetMaxLengthOk returns a tuple with the MaxLength field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxLength

`func (o *ParameterValueConstraintsDTO) SetMaxLength(v int32)`

SetMaxLength sets MaxLength field to given value.

### HasMaxLength

`func (o *ParameterValueConstraintsDTO) HasMaxLength() bool`

HasMaxLength returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


