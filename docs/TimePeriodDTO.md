# TimePeriodDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TimePeriod** | **int32** | Продолжительность в указанных единицах. | 
**TimeUnit** | [**TimeUnitType**](TimeUnitType.md) |  | 
**Comment** | Pointer to **string** | Комментарий. | [optional] 

## Methods

### NewTimePeriodDTO

`func NewTimePeriodDTO(timePeriod int32, timeUnit TimeUnitType, ) *TimePeriodDTO`

NewTimePeriodDTO instantiates a new TimePeriodDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTimePeriodDTOWithDefaults

`func NewTimePeriodDTOWithDefaults() *TimePeriodDTO`

NewTimePeriodDTOWithDefaults instantiates a new TimePeriodDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTimePeriod

`func (o *TimePeriodDTO) GetTimePeriod() int32`

GetTimePeriod returns the TimePeriod field if non-nil, zero value otherwise.

### GetTimePeriodOk

`func (o *TimePeriodDTO) GetTimePeriodOk() (*int32, bool)`

GetTimePeriodOk returns a tuple with the TimePeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimePeriod

`func (o *TimePeriodDTO) SetTimePeriod(v int32)`

SetTimePeriod sets TimePeriod field to given value.


### GetTimeUnit

`func (o *TimePeriodDTO) GetTimeUnit() TimeUnitType`

GetTimeUnit returns the TimeUnit field if non-nil, zero value otherwise.

### GetTimeUnitOk

`func (o *TimePeriodDTO) GetTimeUnitOk() (*TimeUnitType, bool)`

GetTimeUnitOk returns a tuple with the TimeUnit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeUnit

`func (o *TimePeriodDTO) SetTimeUnit(v TimeUnitType)`

SetTimeUnit sets TimeUnit field to given value.


### GetComment

`func (o *TimePeriodDTO) GetComment() string`

GetComment returns the Comment field if non-nil, zero value otherwise.

### GetCommentOk

`func (o *TimePeriodDTO) GetCommentOk() (*string, bool)`

GetCommentOk returns a tuple with the Comment field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComment

`func (o *TimePeriodDTO) SetComment(v string)`

SetComment sets Comment field to given value.

### HasComment

`func (o *TimePeriodDTO) HasComment() bool`

HasComment returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


