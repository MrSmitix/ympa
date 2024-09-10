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

	"github.com/gorilla/mux"
)

// RatingsAPIController binds http requests to an api service and writes the service results to the http response
type RatingsAPIController struct {
	service RatingsAPIServicer
	errorHandler ErrorHandler
}

// RatingsAPIOption for how the controller is set up.
type RatingsAPIOption func(*RatingsAPIController)

// WithRatingsAPIErrorHandler inject ErrorHandler into controller
func WithRatingsAPIErrorHandler(h ErrorHandler) RatingsAPIOption {
	return func(c *RatingsAPIController) {
		c.errorHandler = h
	}
}

// NewRatingsAPIController creates a default api controller
func NewRatingsAPIController(s RatingsAPIServicer, opts ...RatingsAPIOption) *RatingsAPIController {
	controller := &RatingsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the RatingsAPIController
func (c *RatingsAPIController) Routes() Routes {
	return Routes{
		"GetQualityRatingDetails": Route{
			strings.ToUpper("Post"),
			"/campaigns/{campaignId}/ratings/quality/details",
			c.GetQualityRatingDetails,
		},
		"GetQualityRatings": Route{
			strings.ToUpper("Post"),
			"/businesses/{businessId}/ratings/quality",
			c.GetQualityRatings,
		},
	}
}

// GetQualityRatingDetails - Заказы, которые повлияли на индекс качества
func (c *RatingsAPIController) GetQualityRatingDetails(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	campaignIdParam, err := parseNumericParameter[int64](
		params["campaignId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "campaignId", Err: err}, nil)
		return
	}
	result, err := c.service.GetQualityRatingDetails(r.Context(), campaignIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetQualityRatings - Индекс качества магазинов
func (c *RatingsAPIController) GetQualityRatings(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	businessIdParam, err := parseNumericParameter[int64](
		params["businessId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "businessId", Err: err}, nil)
		return
	}
	getQualityRatingRequestParam := GetQualityRatingRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&getQualityRatingRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertGetQualityRatingRequestRequired(getQualityRatingRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertGetQualityRatingRequestConstraints(getQualityRatingRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetQualityRatings(r.Context(), businessIdParam, getQualityRatingRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
