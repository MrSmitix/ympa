package models
// EacVerificationStatusType : Статус проверки кода подтверждения:  * `ACCEPTED` — код верный. * `REJECTED` — код неверный. * `NEED_UPDATE` — Маркет отправит новый код. Значение возвращается, если превышено количество попыток отправки кода. 
type EacVerificationStatusType string

// List of EacVerificationStatusType
const (
	ACCEPTED EacVerificationStatusType = "ACCEPTED"
	REJECTED EacVerificationStatusType = "REJECTED"
	NEED_UPDATE EacVerificationStatusType = "NEED_UPDATE"
)
