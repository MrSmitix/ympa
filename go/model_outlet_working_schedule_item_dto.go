// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// OutletWorkingScheduleItemDto - Расписание работы точки продаж.
type OutletWorkingScheduleItemDto struct {

	StartDay DayOfWeekType `json:"startDay"`

	EndDay DayOfWeekType `json:"endDay"`

	// Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
	StartTime string `json:"startTime"`

	// Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
	EndTime string `json:"endTime"`
}

// AssertOutletWorkingScheduleItemDtoRequired checks if the required fields are not zero-ed
func AssertOutletWorkingScheduleItemDtoRequired(obj OutletWorkingScheduleItemDto) error {
	elements := map[string]interface{}{
		"startDay": obj.StartDay,
		"endDay": obj.EndDay,
		"startTime": obj.StartTime,
		"endTime": obj.EndTime,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertOutletWorkingScheduleItemDtoConstraints checks if the values respects the defined constraints
func AssertOutletWorkingScheduleItemDtoConstraints(obj OutletWorkingScheduleItemDto) error {
	return nil
}
