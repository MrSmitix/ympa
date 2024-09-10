package models
// PromoParticipationType : Какие акции вернутся:  * `PARTICIPATING_NOW` — текущие и будущие акции продавца.  * `PARTICIPATED` — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
type PromoParticipationType string

// List of PromoParticipationType
const (
	PARTICIPATING_NOW PromoParticipationType = "PARTICIPATING_NOW"
	PARTICIPATED PromoParticipationType = "PARTICIPATED"
)
