/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package ympa_go_gin_server
// CurrencyType : Коды валют. Возможные значения: * `BYR` — белорусский рубль. * `KZT` — казахстанский тенге. * `RUR` — российский рубль. * `UAH` — украинская гривна. 
type CurrencyType string

// List of CurrencyType
const (
	RUR CurrencyType = "RUR"
	USD CurrencyType = "USD"
	EUR CurrencyType = "EUR"
	UAH CurrencyType = "UAH"
	AUD CurrencyType = "AUD"
	GBP CurrencyType = "GBP"
	BYR CurrencyType = "BYR"
	BYN CurrencyType = "BYN"
	DKK CurrencyType = "DKK"
	ISK CurrencyType = "ISK"
	KZT CurrencyType = "KZT"
	CAD CurrencyType = "CAD"
	CNY CurrencyType = "CNY"
	NOK CurrencyType = "NOK"
	XDR CurrencyType = "XDR"
	SGD CurrencyType = "SGD"
	TRY CurrencyType = "TRY"
	SEK CurrencyType = "SEK"
	CHF CurrencyType = "CHF"
	JPY CurrencyType = "JPY"
	AZN CurrencyType = "AZN"
	ALL CurrencyType = "ALL"
	DZD CurrencyType = "DZD"
	AOA CurrencyType = "AOA"
	ARS CurrencyType = "ARS"
	AMD CurrencyType = "AMD"
	AFN CurrencyType = "AFN"
	BHD CurrencyType = "BHD"
	BGN CurrencyType = "BGN"
	BOB CurrencyType = "BOB"
	BWP CurrencyType = "BWP"
	BND CurrencyType = "BND"
	BRL CurrencyType = "BRL"
	BIF CurrencyType = "BIF"
	HUF CurrencyType = "HUF"
	VEF CurrencyType = "VEF"
	KPW CurrencyType = "KPW"
	VND CurrencyType = "VND"
	GMD CurrencyType = "GMD"
	GHS CurrencyType = "GHS"
	GNF CurrencyType = "GNF"
	HKD CurrencyType = "HKD"
	GEL CurrencyType = "GEL"
	AED CurrencyType = "AED"
	EGP CurrencyType = "EGP"
	ZMK CurrencyType = "ZMK"
	ILS CurrencyType = "ILS"
	INR CurrencyType = "INR"
	IDR CurrencyType = "IDR"
	JOD CurrencyType = "JOD"
	IQD CurrencyType = "IQD"
	IRR CurrencyType = "IRR"
	YER CurrencyType = "YER"
	QAR CurrencyType = "QAR"
	KES CurrencyType = "KES"
	KGS CurrencyType = "KGS"
	COP CurrencyType = "COP"
	CDF CurrencyType = "CDF"
	CRC CurrencyType = "CRC"
	KWD CurrencyType = "KWD"
	CUP CurrencyType = "CUP"
	LAK CurrencyType = "LAK"
	LVL CurrencyType = "LVL"
	SLL CurrencyType = "SLL"
	LBP CurrencyType = "LBP"
	LYD CurrencyType = "LYD"
	SZL CurrencyType = "SZL"
	LTL CurrencyType = "LTL"
	MUR CurrencyType = "MUR"
	MRO CurrencyType = "MRO"
	MKD CurrencyType = "MKD"
	MWK CurrencyType = "MWK"
	MGA CurrencyType = "MGA"
	MYR CurrencyType = "MYR"
	MAD CurrencyType = "MAD"
	MXN CurrencyType = "MXN"
	MZN CurrencyType = "MZN"
	MDL CurrencyType = "MDL"
	MNT CurrencyType = "MNT"
	NPR CurrencyType = "NPR"
	NGN CurrencyType = "NGN"
	NIO CurrencyType = "NIO"
	NZD CurrencyType = "NZD"
	OMR CurrencyType = "OMR"
	PKR CurrencyType = "PKR"
	PYG CurrencyType = "PYG"
	PEN CurrencyType = "PEN"
	PLN CurrencyType = "PLN"
	KHR CurrencyType = "KHR"
	SAR CurrencyType = "SAR"
	RON CurrencyType = "RON"
	SCR CurrencyType = "SCR"
	SYP CurrencyType = "SYP"
	SKK CurrencyType = "SKK"
	SOS CurrencyType = "SOS"
	SDG CurrencyType = "SDG"
	SRD CurrencyType = "SRD"
	TJS CurrencyType = "TJS"
	THB CurrencyType = "THB"
	TWD CurrencyType = "TWD"
	BDT CurrencyType = "BDT"
	TZS CurrencyType = "TZS"
	TND CurrencyType = "TND"
	TMM CurrencyType = "TMM"
	UGX CurrencyType = "UGX"
	UZS CurrencyType = "UZS"
	UYU CurrencyType = "UYU"
	PHP CurrencyType = "PHP"
	DJF CurrencyType = "DJF"
	XAF CurrencyType = "XAF"
	XOF CurrencyType = "XOF"
	HRK CurrencyType = "HRK"
	CZK CurrencyType = "CZK"
	CLP CurrencyType = "CLP"
	LKR CurrencyType = "LKR"
	EEK CurrencyType = "EEK"
	ETB CurrencyType = "ETB"
	RSD CurrencyType = "RSD"
	ZAR CurrencyType = "ZAR"
	KRW CurrencyType = "KRW"
	NAD CurrencyType = "NAD"
	TL CurrencyType = "TL"
	UE CurrencyType = "UE"
)
