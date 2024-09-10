/*
Партнерский API Маркета

API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

API version: LATEST
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package ympa_go_client

import (
	"encoding/json"
	"bytes"
	"fmt"
)

// checks if the CampaignSettingsScheduleDTO type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CampaignSettingsScheduleDTO{}

// CampaignSettingsScheduleDTO Расписание работы службы доставки в своем регионе.
type CampaignSettingsScheduleDTO struct {
	// Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
	AvailableOnHolidays *bool `json:"availableOnHolidays,omitempty"`
	// Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
	CustomHolidays []string `json:"customHolidays"`
	// Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
	CustomWorkingDays []string `json:"customWorkingDays"`
	Period *CampaignSettingsTimePeriodDTO `json:"period,omitempty"`
	// Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
	TotalHolidays []string `json:"totalHolidays"`
	// Список выходных дней недели и государственных праздников.
	WeeklyHolidays []int32 `json:"weeklyHolidays"`
}

type _CampaignSettingsScheduleDTO CampaignSettingsScheduleDTO

// NewCampaignSettingsScheduleDTO instantiates a new CampaignSettingsScheduleDTO object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCampaignSettingsScheduleDTO(customHolidays []string, customWorkingDays []string, totalHolidays []string, weeklyHolidays []int32) *CampaignSettingsScheduleDTO {
	this := CampaignSettingsScheduleDTO{}
	this.CustomHolidays = customHolidays
	this.CustomWorkingDays = customWorkingDays
	this.TotalHolidays = totalHolidays
	this.WeeklyHolidays = weeklyHolidays
	return &this
}

// NewCampaignSettingsScheduleDTOWithDefaults instantiates a new CampaignSettingsScheduleDTO object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCampaignSettingsScheduleDTOWithDefaults() *CampaignSettingsScheduleDTO {
	this := CampaignSettingsScheduleDTO{}
	return &this
}

// GetAvailableOnHolidays returns the AvailableOnHolidays field value if set, zero value otherwise.
func (o *CampaignSettingsScheduleDTO) GetAvailableOnHolidays() bool {
	if o == nil || IsNil(o.AvailableOnHolidays) {
		var ret bool
		return ret
	}
	return *o.AvailableOnHolidays
}

// GetAvailableOnHolidaysOk returns a tuple with the AvailableOnHolidays field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CampaignSettingsScheduleDTO) GetAvailableOnHolidaysOk() (*bool, bool) {
	if o == nil || IsNil(o.AvailableOnHolidays) {
		return nil, false
	}
	return o.AvailableOnHolidays, true
}

// HasAvailableOnHolidays returns a boolean if a field has been set.
func (o *CampaignSettingsScheduleDTO) HasAvailableOnHolidays() bool {
	if o != nil && !IsNil(o.AvailableOnHolidays) {
		return true
	}

	return false
}

// SetAvailableOnHolidays gets a reference to the given bool and assigns it to the AvailableOnHolidays field.
func (o *CampaignSettingsScheduleDTO) SetAvailableOnHolidays(v bool) {
	o.AvailableOnHolidays = &v
}

// GetCustomHolidays returns the CustomHolidays field value
func (o *CampaignSettingsScheduleDTO) GetCustomHolidays() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.CustomHolidays
}

// GetCustomHolidaysOk returns a tuple with the CustomHolidays field value
// and a boolean to check if the value has been set.
func (o *CampaignSettingsScheduleDTO) GetCustomHolidaysOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomHolidays, true
}

// SetCustomHolidays sets field value
func (o *CampaignSettingsScheduleDTO) SetCustomHolidays(v []string) {
	o.CustomHolidays = v
}

// GetCustomWorkingDays returns the CustomWorkingDays field value
func (o *CampaignSettingsScheduleDTO) GetCustomWorkingDays() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.CustomWorkingDays
}

// GetCustomWorkingDaysOk returns a tuple with the CustomWorkingDays field value
// and a boolean to check if the value has been set.
func (o *CampaignSettingsScheduleDTO) GetCustomWorkingDaysOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomWorkingDays, true
}

// SetCustomWorkingDays sets field value
func (o *CampaignSettingsScheduleDTO) SetCustomWorkingDays(v []string) {
	o.CustomWorkingDays = v
}

// GetPeriod returns the Period field value if set, zero value otherwise.
func (o *CampaignSettingsScheduleDTO) GetPeriod() CampaignSettingsTimePeriodDTO {
	if o == nil || IsNil(o.Period) {
		var ret CampaignSettingsTimePeriodDTO
		return ret
	}
	return *o.Period
}

// GetPeriodOk returns a tuple with the Period field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CampaignSettingsScheduleDTO) GetPeriodOk() (*CampaignSettingsTimePeriodDTO, bool) {
	if o == nil || IsNil(o.Period) {
		return nil, false
	}
	return o.Period, true
}

// HasPeriod returns a boolean if a field has been set.
func (o *CampaignSettingsScheduleDTO) HasPeriod() bool {
	if o != nil && !IsNil(o.Period) {
		return true
	}

	return false
}

// SetPeriod gets a reference to the given CampaignSettingsTimePeriodDTO and assigns it to the Period field.
func (o *CampaignSettingsScheduleDTO) SetPeriod(v CampaignSettingsTimePeriodDTO) {
	o.Period = &v
}

// GetTotalHolidays returns the TotalHolidays field value
func (o *CampaignSettingsScheduleDTO) GetTotalHolidays() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.TotalHolidays
}

// GetTotalHolidaysOk returns a tuple with the TotalHolidays field value
// and a boolean to check if the value has been set.
func (o *CampaignSettingsScheduleDTO) GetTotalHolidaysOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.TotalHolidays, true
}

// SetTotalHolidays sets field value
func (o *CampaignSettingsScheduleDTO) SetTotalHolidays(v []string) {
	o.TotalHolidays = v
}

// GetWeeklyHolidays returns the WeeklyHolidays field value
func (o *CampaignSettingsScheduleDTO) GetWeeklyHolidays() []int32 {
	if o == nil {
		var ret []int32
		return ret
	}

	return o.WeeklyHolidays
}

// GetWeeklyHolidaysOk returns a tuple with the WeeklyHolidays field value
// and a boolean to check if the value has been set.
func (o *CampaignSettingsScheduleDTO) GetWeeklyHolidaysOk() ([]int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.WeeklyHolidays, true
}

// SetWeeklyHolidays sets field value
func (o *CampaignSettingsScheduleDTO) SetWeeklyHolidays(v []int32) {
	o.WeeklyHolidays = v
}

func (o CampaignSettingsScheduleDTO) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CampaignSettingsScheduleDTO) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AvailableOnHolidays) {
		toSerialize["availableOnHolidays"] = o.AvailableOnHolidays
	}
	toSerialize["customHolidays"] = o.CustomHolidays
	toSerialize["customWorkingDays"] = o.CustomWorkingDays
	if !IsNil(o.Period) {
		toSerialize["period"] = o.Period
	}
	toSerialize["totalHolidays"] = o.TotalHolidays
	toSerialize["weeklyHolidays"] = o.WeeklyHolidays
	return toSerialize, nil
}

func (o *CampaignSettingsScheduleDTO) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"customHolidays",
		"customWorkingDays",
		"totalHolidays",
		"weeklyHolidays",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varCampaignSettingsScheduleDTO := _CampaignSettingsScheduleDTO{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCampaignSettingsScheduleDTO)

	if err != nil {
		return err
	}

	*o = CampaignSettingsScheduleDTO(varCampaignSettingsScheduleDTO)

	return err
}

type NullableCampaignSettingsScheduleDTO struct {
	value *CampaignSettingsScheduleDTO
	isSet bool
}

func (v NullableCampaignSettingsScheduleDTO) Get() *CampaignSettingsScheduleDTO {
	return v.value
}

func (v *NullableCampaignSettingsScheduleDTO) Set(val *CampaignSettingsScheduleDTO) {
	v.value = val
	v.isSet = true
}

func (v NullableCampaignSettingsScheduleDTO) IsSet() bool {
	return v.isSet
}

func (v *NullableCampaignSettingsScheduleDTO) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCampaignSettingsScheduleDTO(val *CampaignSettingsScheduleDTO) *NullableCampaignSettingsScheduleDTO {
	return &NullableCampaignSettingsScheduleDTO{value: val, isSet: true}
}

func (v NullableCampaignSettingsScheduleDTO) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCampaignSettingsScheduleDTO) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


