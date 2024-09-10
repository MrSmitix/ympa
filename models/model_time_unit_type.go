package models
// TimeUnitType : Единица измерения времени:  * `HOUR` — час. * `DAY` — сутки. * `WEEK` — неделя. * `MONTH` — месяц. * `YEAR` — год. 
type TimeUnitType string

// List of TimeUnitType
const (
	HOUR TimeUnitType = "HOUR"
	DAY TimeUnitType = "DAY"
	WEEK TimeUnitType = "WEEK"
	MONTH TimeUnitType = "MONTH"
	YEAR TimeUnitType = "YEAR"
)
