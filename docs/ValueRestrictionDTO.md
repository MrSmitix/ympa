# ValueRestrictionDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LimitingParameterId** | **int64** | Идентификатор ограничивающей характеристики. | 
**LimitedValues** | [**[]OptionValuesLimitedDTO**](OptionValuesLimitedDTO.md) | Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики. | 

## Methods

### NewValueRestrictionDTO

`func NewValueRestrictionDTO(limitingParameterId int64, limitedValues []OptionValuesLimitedDTO, ) *ValueRestrictionDTO`

NewValueRestrictionDTO instantiates a new ValueRestrictionDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValueRestrictionDTOWithDefaults

`func NewValueRestrictionDTOWithDefaults() *ValueRestrictionDTO`

NewValueRestrictionDTOWithDefaults instantiates a new ValueRestrictionDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLimitingParameterId

`func (o *ValueRestrictionDTO) GetLimitingParameterId() int64`

GetLimitingParameterId returns the LimitingParameterId field if non-nil, zero value otherwise.

### GetLimitingParameterIdOk

`func (o *ValueRestrictionDTO) GetLimitingParameterIdOk() (*int64, bool)`

GetLimitingParameterIdOk returns a tuple with the LimitingParameterId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitingParameterId

`func (o *ValueRestrictionDTO) SetLimitingParameterId(v int64)`

SetLimitingParameterId sets LimitingParameterId field to given value.


### GetLimitedValues

`func (o *ValueRestrictionDTO) GetLimitedValues() []OptionValuesLimitedDTO`

GetLimitedValues returns the LimitedValues field if non-nil, zero value otherwise.

### GetLimitedValuesOk

`func (o *ValueRestrictionDTO) GetLimitedValuesOk() (*[]OptionValuesLimitedDTO, bool)`

GetLimitedValuesOk returns a tuple with the LimitedValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitedValues

`func (o *ValueRestrictionDTO) SetLimitedValues(v []OptionValuesLimitedDTO)`

SetLimitedValues sets LimitedValues field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


