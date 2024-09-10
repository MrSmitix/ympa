package models
// LicenseCheckStatusType : Статус проверки лицензии:  * `NEW` — лицензия проверяется. * `SUCCESS` — лицензия прошла проверку. * `FAIL` — лицензия не прошла проверку. 
type LicenseCheckStatusType string

// List of LicenseCheckStatusType
const (
	NEW LicenseCheckStatusType = "NEW"
	SUCCESS LicenseCheckStatusType = "SUCCESS"
	FAIL LicenseCheckStatusType = "FAIL"
	REVOKE LicenseCheckStatusType = "REVOKE"
	DONT_WANT LicenseCheckStatusType = "DONT_WANT"
	FAIL_MANUAL LicenseCheckStatusType = "FAIL_MANUAL"
)
