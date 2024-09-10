package models
// ShelfsStatisticsAttributionType : Тип атрибуции:   * `CLICKS` — по кликам.   * `SHOWS` — по показам. <br><br>  О том, какие данные в отчете зависят и не зависят от типа атрибуции, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf#stats). 
type ShelfsStatisticsAttributionType string

// List of ShelfsStatisticsAttributionType
const (
	CLICKS ShelfsStatisticsAttributionType = "CLICKS"
	SHOWS ShelfsStatisticsAttributionType = "SHOWS"
)
