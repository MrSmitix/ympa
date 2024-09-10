# AgeDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Value** | **float32** | Значение.  | 
**AgeUnit** | [**AgeUnitType**](AgeUnitType.md) |  | 

## Methods

### NewAgeDTO

`func NewAgeDTO(value float32, ageUnit AgeUnitType, ) *AgeDTO`

NewAgeDTO instantiates a new AgeDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAgeDTOWithDefaults

`func NewAgeDTOWithDefaults() *AgeDTO`

NewAgeDTOWithDefaults instantiates a new AgeDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetValue

`func (o *AgeDTO) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *AgeDTO) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *AgeDTO) SetValue(v float32)`

SetValue sets Value field to given value.


### GetAgeUnit

`func (o *AgeDTO) GetAgeUnit() AgeUnitType`

GetAgeUnit returns the AgeUnit field if non-nil, zero value otherwise.

### GetAgeUnitOk

`func (o *AgeDTO) GetAgeUnitOk() (*AgeUnitType, bool)`

GetAgeUnitOk returns a tuple with the AgeUnit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAgeUnit

`func (o *AgeDTO) SetAgeUnit(v AgeUnitType)`

SetAgeUnit sets AgeUnit field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


