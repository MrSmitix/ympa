// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server




// CampaignsQualityRatingDto - Информация об индексе качества магазинов.
type CampaignsQualityRatingDto struct {

	// Список магазинов c информацией об их индексе качества.
	CampaignRatings []CampaignQualityRatingDto `json:"campaignRatings"`
}

// AssertCampaignsQualityRatingDtoRequired checks if the required fields are not zero-ed
func AssertCampaignsQualityRatingDtoRequired(obj CampaignsQualityRatingDto) error {
	elements := map[string]interface{}{
		"campaignRatings": obj.CampaignRatings,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.CampaignRatings {
		if err := AssertCampaignQualityRatingDtoRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCampaignsQualityRatingDtoConstraints checks if the values respects the defined constraints
func AssertCampaignsQualityRatingDtoConstraints(obj CampaignsQualityRatingDto) error {
	for _, el := range obj.CampaignRatings {
		if err := AssertCampaignQualityRatingDtoConstraints(el); err != nil {
			return err
		}
	}
	return nil
}
