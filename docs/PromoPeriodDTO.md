# PromoPeriodDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DateTimeFrom** | **time.Time** | Дата и время начала акции. | 
**DateTimeTo** | **time.Time** | Дата и время окончания акции. | 

## Methods

### NewPromoPeriodDTO

`func NewPromoPeriodDTO(dateTimeFrom time.Time, dateTimeTo time.Time, ) *PromoPeriodDTO`

NewPromoPeriodDTO instantiates a new PromoPeriodDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPromoPeriodDTOWithDefaults

`func NewPromoPeriodDTOWithDefaults() *PromoPeriodDTO`

NewPromoPeriodDTOWithDefaults instantiates a new PromoPeriodDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDateTimeFrom

`func (o *PromoPeriodDTO) GetDateTimeFrom() time.Time`

GetDateTimeFrom returns the DateTimeFrom field if non-nil, zero value otherwise.

### GetDateTimeFromOk

`func (o *PromoPeriodDTO) GetDateTimeFromOk() (*time.Time, bool)`

GetDateTimeFromOk returns a tuple with the DateTimeFrom field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTimeFrom

`func (o *PromoPeriodDTO) SetDateTimeFrom(v time.Time)`

SetDateTimeFrom sets DateTimeFrom field to given value.


### GetDateTimeTo

`func (o *PromoPeriodDTO) GetDateTimeTo() time.Time`

GetDateTimeTo returns the DateTimeTo field if non-nil, zero value otherwise.

### GetDateTimeToOk

`func (o *PromoPeriodDTO) GetDateTimeToOk() (*time.Time, bool)`

GetDateTimeToOk returns a tuple with the DateTimeTo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateTimeTo

`func (o *PromoPeriodDTO) SetDateTimeTo(v time.Time)`

SetDateTimeTo sets DateTimeTo field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


