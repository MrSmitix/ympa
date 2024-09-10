package models
// ParameterType : Тип данных:  * `TEXT` — текст. * `ENUM` — список возможных значений. * `BOOLEAN` — `true` или `false`. * `NUMERIC` — число. 
type ParameterType string

// List of ParameterType
const (
	TEXT ParameterType = "TEXT"
	ENUM ParameterType = "ENUM"
	BOOLEAN ParameterType = "BOOLEAN"
	NUMERIC ParameterType = "NUMERIC"
)
