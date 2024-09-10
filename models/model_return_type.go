package models
// ReturnType : Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
type ReturnType string

// List of ReturnType
const (
	UNREDEEMED ReturnType = "UNREDEEMED"
	RETURN ReturnType = "RETURN"
)
