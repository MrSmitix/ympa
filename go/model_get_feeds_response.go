// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// GetFeedsResponse - Ответ на запрос списка прайс-листов.
type GetFeedsResponse struct {

	// Список прайс-листов.
	Feeds []FeedDto `json:"feeds"`
}

// AssertGetFeedsResponseRequired checks if the required fields are not zero-ed
func AssertGetFeedsResponseRequired(obj GetFeedsResponse) error {
	elements := map[string]interface{}{
		"feeds": obj.Feeds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Feeds {
		if err := AssertFeedDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetFeedsResponseConstraints checks if the values respects the defined constraints
func AssertGetFeedsResponseConstraints(obj GetFeedsResponse) error {
	for _, el := range obj.Feeds {
		if err := AssertFeedDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
