package models
// LicenseType : Тип лицензии:  * `ALCOHOL` — лицензия на розничную продажу алкогольной продукции. 
type LicenseType string

// List of LicenseType
const (
	ALCOHOL LicenseType = "ALCOHOL"
	UNKNOWN LicenseType = "UNKNOWN"
)
