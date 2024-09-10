# OutletWorkingScheduleItemDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDay** | [**DayOfWeekType**](DayOfWeekType.md) |  | 
**EndDay** | [**DayOfWeekType**](DayOfWeekType.md) |  | 
**StartTime** | **string** | Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 
**EndTime** | **string** | Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 

## Methods

### NewOutletWorkingScheduleItemDTO

`func NewOutletWorkingScheduleItemDTO(startDay DayOfWeekType, endDay DayOfWeekType, startTime string, endTime string, ) *OutletWorkingScheduleItemDTO`

NewOutletWorkingScheduleItemDTO instantiates a new OutletWorkingScheduleItemDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOutletWorkingScheduleItemDTOWithDefaults

`func NewOutletWorkingScheduleItemDTOWithDefaults() *OutletWorkingScheduleItemDTO`

NewOutletWorkingScheduleItemDTOWithDefaults instantiates a new OutletWorkingScheduleItemDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetStartDay

`func (o *OutletWorkingScheduleItemDTO) GetStartDay() DayOfWeekType`

GetStartDay returns the StartDay field if non-nil, zero value otherwise.

### GetStartDayOk

`func (o *OutletWorkingScheduleItemDTO) GetStartDayOk() (*DayOfWeekType, bool)`

GetStartDayOk returns a tuple with the StartDay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartDay

`func (o *OutletWorkingScheduleItemDTO) SetStartDay(v DayOfWeekType)`

SetStartDay sets StartDay field to given value.


### GetEndDay

`func (o *OutletWorkingScheduleItemDTO) GetEndDay() DayOfWeekType`

GetEndDay returns the EndDay field if non-nil, zero value otherwise.

### GetEndDayOk

`func (o *OutletWorkingScheduleItemDTO) GetEndDayOk() (*DayOfWeekType, bool)`

GetEndDayOk returns a tuple with the EndDay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndDay

`func (o *OutletWorkingScheduleItemDTO) SetEndDay(v DayOfWeekType)`

SetEndDay sets EndDay field to given value.


### GetStartTime

`func (o *OutletWorkingScheduleItemDTO) GetStartTime() string`

GetStartTime returns the StartTime field if non-nil, zero value otherwise.

### GetStartTimeOk

`func (o *OutletWorkingScheduleItemDTO) GetStartTimeOk() (*string, bool)`

GetStartTimeOk returns a tuple with the StartTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartTime

`func (o *OutletWorkingScheduleItemDTO) SetStartTime(v string)`

SetStartTime sets StartTime field to given value.


### GetEndTime

`func (o *OutletWorkingScheduleItemDTO) GetEndTime() string`

GetEndTime returns the EndTime field if non-nil, zero value otherwise.

### GetEndTimeOk

`func (o *OutletWorkingScheduleItemDTO) GetEndTimeOk() (*string, bool)`

GetEndTimeOk returns a tuple with the EndTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndTime

`func (o *OutletWorkingScheduleItemDTO) SetEndTime(v string)`

SetEndTime sets EndTime field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


