// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * API version: LATEST
 */

package ympa_go_server

import (
	"encoding/json"
	"net/http"
	"strings"
)

// TariffsAPIController binds http requests to an api service and writes the service results to the http response
type TariffsAPIController struct {
	service TariffsAPIServicer
	errorHandler ErrorHandler
}

// TariffsAPIOption for how the controller is set up.
type TariffsAPIOption func(*TariffsAPIController)

// WithTariffsAPIErrorHandler inject ErrorHandler into controller
func WithTariffsAPIErrorHandler(h ErrorHandler) TariffsAPIOption {
	return func(c *TariffsAPIController) {
		c.errorHandler = h
	}
}

// NewTariffsAPIController creates a default api controller
func NewTariffsAPIController(s TariffsAPIServicer, opts ...TariffsAPIOption) *TariffsAPIController {
	controller := &TariffsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the TariffsAPIController
func (c *TariffsAPIController) Routes() Routes {
	return Routes{
		"CalculateTariffs": Route{
			strings.ToUpper("Post"),
			"/tariffs/calculate",
			c.CalculateTariffs,
		},
	}
}

// CalculateTariffs - Калькулятор стоимости услуг
func (c *TariffsAPIController) CalculateTariffs(w http.ResponseWriter, r *http.Request) {
	calculateTariffsRequestParam := CalculateTariffsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&calculateTariffsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCalculateTariffsRequestRequired(calculateTariffsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCalculateTariffsRequestConstraints(calculateTariffsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CalculateTariffs(r.Context(), calculateTariffsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
