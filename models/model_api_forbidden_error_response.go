package models

// ApiForbiddenErrorResponse - Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.
type ApiForbiddenErrorResponse struct {

	Status ApiResponseStatusType `json:"status,omitempty"`

	// Список ошибок.
	Errors *[]ApiErrorDto `json:"errors,omitempty"`
}
