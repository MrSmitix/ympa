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

// CategoriesAPIController binds http requests to an api service and writes the service results to the http response
type CategoriesAPIController struct {
	service CategoriesAPIServicer
	errorHandler ErrorHandler
}

// CategoriesAPIOption for how the controller is set up.
type CategoriesAPIOption func(*CategoriesAPIController)

// WithCategoriesAPIErrorHandler inject ErrorHandler into controller
func WithCategoriesAPIErrorHandler(h ErrorHandler) CategoriesAPIOption {
	return func(c *CategoriesAPIController) {
		c.errorHandler = h
	}
}

// NewCategoriesAPIController creates a default api controller
func NewCategoriesAPIController(s CategoriesAPIServicer, opts ...CategoriesAPIOption) *CategoriesAPIController {
	controller := &CategoriesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the CategoriesAPIController
func (c *CategoriesAPIController) Routes() Routes {
	return Routes{
		"GetCategoriesMaxSaleQuantum": Route{
			strings.ToUpper("Post"),
			"/categories/max-sale-quantum",
			c.GetCategoriesMaxSaleQuantum,
		},
		"GetCategoriesTree": Route{
			strings.ToUpper("Post"),
			"/categories/tree",
			c.GetCategoriesTree,
		},
	}
}

// GetCategoriesMaxSaleQuantum - Лимит на установку кванта продажи и минимального количества товаров в заказе
func (c *CategoriesAPIController) GetCategoriesMaxSaleQuantum(w http.ResponseWriter, r *http.Request) {
	getCategoriesMaxSaleQuantumRequestParam := GetCategoriesMaxSaleQuantumRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&getCategoriesMaxSaleQuantumRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertGetCategoriesMaxSaleQuantumRequestRequired(getCategoriesMaxSaleQuantumRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertGetCategoriesMaxSaleQuantumRequestConstraints(getCategoriesMaxSaleQuantumRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetCategoriesMaxSaleQuantum(r.Context(), getCategoriesMaxSaleQuantumRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetCategoriesTree - Дерево категорий
func (c *CategoriesAPIController) GetCategoriesTree(w http.ResponseWriter, r *http.Request) {
	getCategoriesRequestParam := GetCategoriesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&getCategoriesRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertGetCategoriesRequestRequired(getCategoriesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertGetCategoriesRequestConstraints(getCategoriesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetCategoriesTree(r.Context(), getCategoriesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
