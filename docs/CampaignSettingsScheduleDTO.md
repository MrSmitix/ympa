# CampaignSettingsScheduleDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvailableOnHolidays** | Pointer to **bool** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**CustomHolidays** | **[]string** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**CustomWorkingDays** | **[]string** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**Period** | Pointer to [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] 
**TotalHolidays** | **[]string** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**WeeklyHolidays** | **[]int32** | Список выходных дней недели и государственных праздников. | 

## Methods

### NewCampaignSettingsScheduleDTO

`func NewCampaignSettingsScheduleDTO(customHolidays []string, customWorkingDays []string, totalHolidays []string, weeklyHolidays []int32, ) *CampaignSettingsScheduleDTO`

NewCampaignSettingsScheduleDTO instantiates a new CampaignSettingsScheduleDTO object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCampaignSettingsScheduleDTOWithDefaults

`func NewCampaignSettingsScheduleDTOWithDefaults() *CampaignSettingsScheduleDTO`

NewCampaignSettingsScheduleDTOWithDefaults instantiates a new CampaignSettingsScheduleDTO object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvailableOnHolidays

`func (o *CampaignSettingsScheduleDTO) GetAvailableOnHolidays() bool`

GetAvailableOnHolidays returns the AvailableOnHolidays field if non-nil, zero value otherwise.

### GetAvailableOnHolidaysOk

`func (o *CampaignSettingsScheduleDTO) GetAvailableOnHolidaysOk() (*bool, bool)`

GetAvailableOnHolidaysOk returns a tuple with the AvailableOnHolidays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableOnHolidays

`func (o *CampaignSettingsScheduleDTO) SetAvailableOnHolidays(v bool)`

SetAvailableOnHolidays sets AvailableOnHolidays field to given value.

### HasAvailableOnHolidays

`func (o *CampaignSettingsScheduleDTO) HasAvailableOnHolidays() bool`

HasAvailableOnHolidays returns a boolean if a field has been set.

### GetCustomHolidays

`func (o *CampaignSettingsScheduleDTO) GetCustomHolidays() []string`

GetCustomHolidays returns the CustomHolidays field if non-nil, zero value otherwise.

### GetCustomHolidaysOk

`func (o *CampaignSettingsScheduleDTO) GetCustomHolidaysOk() (*[]string, bool)`

GetCustomHolidaysOk returns a tuple with the CustomHolidays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomHolidays

`func (o *CampaignSettingsScheduleDTO) SetCustomHolidays(v []string)`

SetCustomHolidays sets CustomHolidays field to given value.


### GetCustomWorkingDays

`func (o *CampaignSettingsScheduleDTO) GetCustomWorkingDays() []string`

GetCustomWorkingDays returns the CustomWorkingDays field if non-nil, zero value otherwise.

### GetCustomWorkingDaysOk

`func (o *CampaignSettingsScheduleDTO) GetCustomWorkingDaysOk() (*[]string, bool)`

GetCustomWorkingDaysOk returns a tuple with the CustomWorkingDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomWorkingDays

`func (o *CampaignSettingsScheduleDTO) SetCustomWorkingDays(v []string)`

SetCustomWorkingDays sets CustomWorkingDays field to given value.


### GetPeriod

`func (o *CampaignSettingsScheduleDTO) GetPeriod() CampaignSettingsTimePeriodDTO`

GetPeriod returns the Period field if non-nil, zero value otherwise.

### GetPeriodOk

`func (o *CampaignSettingsScheduleDTO) GetPeriodOk() (*CampaignSettingsTimePeriodDTO, bool)`

GetPeriodOk returns a tuple with the Period field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPeriod

`func (o *CampaignSettingsScheduleDTO) SetPeriod(v CampaignSettingsTimePeriodDTO)`

SetPeriod sets Period field to given value.

### HasPeriod

`func (o *CampaignSettingsScheduleDTO) HasPeriod() bool`

HasPeriod returns a boolean if a field has been set.

### GetTotalHolidays

`func (o *CampaignSettingsScheduleDTO) GetTotalHolidays() []string`

GetTotalHolidays returns the TotalHolidays field if non-nil, zero value otherwise.

### GetTotalHolidaysOk

`func (o *CampaignSettingsScheduleDTO) GetTotalHolidaysOk() (*[]string, bool)`

GetTotalHolidaysOk returns a tuple with the TotalHolidays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTotalHolidays

`func (o *CampaignSettingsScheduleDTO) SetTotalHolidays(v []string)`

SetTotalHolidays sets TotalHolidays field to given value.


### GetWeeklyHolidays

`func (o *CampaignSettingsScheduleDTO) GetWeeklyHolidays() []int32`

GetWeeklyHolidays returns the WeeklyHolidays field if non-nil, zero value otherwise.

### GetWeeklyHolidaysOk

`func (o *CampaignSettingsScheduleDTO) GetWeeklyHolidaysOk() (*[]int32, bool)`

GetWeeklyHolidaysOk returns a tuple with the WeeklyHolidays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWeeklyHolidays

`func (o *CampaignSettingsScheduleDTO) SetWeeklyHolidays(v []int32)`

SetWeeklyHolidays sets WeeklyHolidays field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


