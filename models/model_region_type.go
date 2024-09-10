package models
// RegionType : Тип региона.  Возможные значения:  * `CITY_DISTRICT` — район города.  * `CITY` — крупный город.  * `CONTINENT` — континент.  * `COUNTRY_DISTRICT` — область.  * `COUNTRY` — страна.  * `REGION` — регион.  * `REPUBLIC_AREA` — район субъекта федерации.  * `REPUBLIC` — субъект федерации.  * `SUBWAY_STATION` — станция метро.  * `VILLAGE` — город.  * `OTHER` — неизвестный регион. 
type RegionType string

// List of RegionType
const (
	OTHER RegionType = "OTHER"
	CONTINENT RegionType = "CONTINENT"
	REGION RegionType = "REGION"
	COUNTRY RegionType = "COUNTRY"
	COUNTRY_DISTRICT RegionType = "COUNTRY_DISTRICT"
	REPUBLIC RegionType = "REPUBLIC"
	CITY RegionType = "CITY"
	VILLAGE RegionType = "VILLAGE"
	CITY_DISTRICT RegionType = "CITY_DISTRICT"
	SUBWAY_STATION RegionType = "SUBWAY_STATION"
	REPUBLIC_AREA RegionType = "REPUBLIC_AREA"
)
