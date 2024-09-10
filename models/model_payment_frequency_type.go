package models
// PaymentFrequencyType : Частота выплат:  * `DAILY` — ежедневно. * `WEEKLY` — раз в неделю. * `BIWEEKLY` — раз в две недели. * `MONTHLY` — раз в месяц.  Подробнее о графике выплат читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/acquiring.html). 
type PaymentFrequencyType string

// List of PaymentFrequencyType
const (
	DAILY PaymentFrequencyType = "DAILY"
	WEEKLY PaymentFrequencyType = "WEEKLY"
	BIWEEKLY PaymentFrequencyType = "BIWEEKLY"
	MONTHLY PaymentFrequencyType = "MONTHLY"
)
