package models

// CalculateTariffsParametersDto - Параметры для расчета стоимости услуг.
type CalculateTariffsParametersDto struct {

	// Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр `campaignId`, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр `sellingProgram`. Совместное использование параметров приведет к ошибке. 
	CampaignId int64 `json:"campaignId,omitempty"`

	SellingProgram SellingProgramType `json:"sellingProgram,omitempty"`

	Frequency PaymentFrequencyType `json:"frequency,omitempty"`
}
