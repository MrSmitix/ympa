# OutletWorkingScheduleDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WorkInHoliday** | Pointer to **bool** | Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.  | [optional] 
**ScheduleItems** | [**[]OutletWorkingScheduleItemDTO**](OutletWorkingScheduleItemDTO.md) | Список расписаний работы точки продаж.  | 

## Methods

### NewOutletWorkingScheduleDTO

`func NewOutletWorkingScheduleDTO(scheduleItems []OutletWorkingScheduleItemDTO, ) *OutletWorkingScheduleDTO`

NewOutletWorkingScheduleDTO instantiates a new OutletWorkingScheduleDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOutletWorkingScheduleDTOWithDefaults

`func NewOutletWorkingScheduleDTOWithDefaults() *OutletWorkingScheduleDTO`

NewOutletWorkingScheduleDTOWithDefaults instantiates a new OutletWorkingScheduleDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetWorkInHoliday

`func (o *OutletWorkingScheduleDTO) GetWorkInHoliday() bool`

GetWorkInHoliday returns the WorkInHoliday field if non-nil, zero value otherwise.

### GetWorkInHolidayOk

`func (o *OutletWorkingScheduleDTO) GetWorkInHolidayOk() (*bool, bool)`

GetWorkInHolidayOk returns a tuple with the WorkInHoliday field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWorkInHoliday

`func (o *OutletWorkingScheduleDTO) SetWorkInHoliday(v bool)`

SetWorkInHoliday sets WorkInHoliday field to given value.

### HasWorkInHoliday

`func (o *OutletWorkingScheduleDTO) HasWorkInHoliday() bool`

HasWorkInHoliday returns a boolean if a field has been set.

### GetScheduleItems

`func (o *OutletWorkingScheduleDTO) GetScheduleItems() []OutletWorkingScheduleItemDTO`

GetScheduleItems returns the ScheduleItems field if non-nil, zero value otherwise.

### GetScheduleItemsOk

`func (o *OutletWorkingScheduleDTO) GetScheduleItemsOk() (*[]OutletWorkingScheduleItemDTO, bool)`

GetScheduleItemsOk returns a tuple with the ScheduleItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduleItems

`func (o *OutletWorkingScheduleDTO) SetScheduleItems(v []OutletWorkingScheduleItemDTO)`

SetScheduleItems sets ScheduleItems field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


