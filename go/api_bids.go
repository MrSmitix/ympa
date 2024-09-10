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

// BidsAPIController binds http requests to an api service and writes the service results to the http response
type BidsAPIController struct {
	service BidsAPIServicer
	errorHandler ErrorHandler
}

// BidsAPIOption for how the controller is set up.
type BidsAPIOption func(*BidsAPIController)

// WithBidsAPIErrorHandler inject ErrorHandler into controller
func WithBidsAPIErrorHandler(h ErrorHandler) BidsAPIOption {
	return func(c *BidsAPIController) {
		c.errorHandler = h
	}
}

// NewBidsAPIController creates a default api controller
func NewBidsAPIController(s BidsAPIServicer, opts ...BidsAPIOption) *BidsAPIController {
	controller := &BidsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BidsAPIController
func (c *BidsAPIController) Routes() Routes {
	return Routes{
		"GetBidsInfoForBusiness": Route{
			strings.ToUpper("Post"),
			"/businesses/{businessId}/bids/info",
			c.GetBidsInfoForBusiness,
		},
		"GetBidsRecommendations": Route{
			strings.ToUpper("Post"),
			"/businesses/{businessId}/bids/recommendations",
			c.GetBidsRecommendations,
		},
		"PutBidsForBusiness": Route{
			strings.ToUpper("Put"),
			"/businesses/{businessId}/bids",
			c.PutBidsForBusiness,
		},
		"PutBidsForCampaign": Route{
			strings.ToUpper("Put"),
			"/campaigns/{campaignId}/bids",
			c.PutBidsForCampaign,
		},
	}
}

// GetBidsInfoForBusiness - Информация об установленных ставках
func (c *BidsAPIController) GetBidsInfoForBusiness(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	businessIdParam, err := parseNumericParameter[int64](
		params["businessId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "businessId", Err: err}, nil)
		return
	}
	var pageTokenParam string
	if query.Has("page_token") {
		param := query.Get("page_token")

		pageTokenParam = param
	} else {
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "limit", Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	getBidsInfoRequestParam := GetBidsInfoRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&getBidsInfoRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertGetBidsInfoRequestRequired(getBidsInfoRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertGetBidsInfoRequestConstraints(getBidsInfoRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetBidsInfoForBusiness(r.Context(), businessIdParam, pageTokenParam, limitParam, getBidsInfoRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetBidsRecommendations - Рекомендованные ставки для заданных товаров
func (c *BidsAPIController) GetBidsRecommendations(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	businessIdParam, err := parseNumericParameter[int64](
		params["businessId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "businessId", Err: err}, nil)
		return
	}
	getBidsRecommendationsRequestParam := GetBidsRecommendationsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&getBidsRecommendationsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertGetBidsRecommendationsRequestRequired(getBidsRecommendationsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertGetBidsRecommendationsRequestConstraints(getBidsRecommendationsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetBidsRecommendations(r.Context(), businessIdParam, getBidsRecommendationsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// PutBidsForBusiness - Включение буста продаж и установка ставок
func (c *BidsAPIController) PutBidsForBusiness(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	businessIdParam, err := parseNumericParameter[int64](
		params["businessId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "businessId", Err: err}, nil)
		return
	}
	putSkuBidsRequestParam := PutSkuBidsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&putSkuBidsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPutSkuBidsRequestRequired(putSkuBidsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPutSkuBidsRequestConstraints(putSkuBidsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PutBidsForBusiness(r.Context(), businessIdParam, putSkuBidsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// PutBidsForCampaign - Включение буста продаж и установка ставок для магазина
func (c *BidsAPIController) PutBidsForCampaign(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	campaignIdParam, err := parseNumericParameter[int64](
		params["campaignId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "campaignId", Err: err}, nil)
		return
	}
	putSkuBidsRequestParam := PutSkuBidsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&putSkuBidsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPutSkuBidsRequestRequired(putSkuBidsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPutSkuBidsRequestConstraints(putSkuBidsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PutBidsForCampaign(r.Context(), campaignIdParam, putSkuBidsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
