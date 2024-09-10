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

// PricesAPIController binds http requests to an api service and writes the service results to the http response
type PricesAPIController struct {
	service PricesAPIServicer
	errorHandler ErrorHandler
}

// PricesAPIOption for how the controller is set up.
type PricesAPIOption func(*PricesAPIController)

// WithPricesAPIErrorHandler inject ErrorHandler into controller
func WithPricesAPIErrorHandler(h ErrorHandler) PricesAPIOption {
	return func(c *PricesAPIController) {
		c.errorHandler = h
	}
}

// NewPricesAPIController creates a default api controller
func NewPricesAPIController(s PricesAPIServicer, opts ...PricesAPIOption) *PricesAPIController {
	controller := &PricesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PricesAPIController
func (c *PricesAPIController) Routes() Routes {
	return Routes{
		"GetPrices": Route{
			strings.ToUpper("Get"),
			"/campaigns/{campaignId}/offer-prices",
			c.GetPrices,
		},
		"GetPricesByOfferIds": Route{
			strings.ToUpper("Post"),
			"/campaigns/{campaignId}/offer-prices",
			c.GetPricesByOfferIds,
		},
		"GetSuggestedPrices": Route{
			strings.ToUpper("Post"),
			"/campaigns/{campaignId}/offer-prices/suggestions",
			c.GetSuggestedPrices,
		},
		"UpdateBusinessPrices": Route{
			strings.ToUpper("Post"),
			"/businesses/{businessId}/offer-prices/updates",
			c.UpdateBusinessPrices,
		},
		"UpdatePrices": Route{
			strings.ToUpper("Post"),
			"/campaigns/{campaignId}/offer-prices/updates",
			c.UpdatePrices,
		},
	}
}

// GetPrices - Список цен
// Deprecated
func (c *PricesAPIController) GetPrices(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	campaignIdParam, err := parseNumericParameter[int64](
		params["campaignId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "campaignId", Err: err}, nil)
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
	var archivedParam bool
	if query.Has("archived") {
		param, err := parseBoolParameter(
			query.Get("archived"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Param: "archived", Err: err}, nil)
			return
		}

		archivedParam = param
	} else {
		var param bool = false
		archivedParam = param
	}
	result, err := c.service.GetPrices(r.Context(), campaignIdParam, pageTokenParam, limitParam, archivedParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetPricesByOfferIds - Просмотр цен на указанные товары в магазине
func (c *PricesAPIController) GetPricesByOfferIds(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	campaignIdParam, err := parseNumericParameter[int64](
		params["campaignId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "campaignId", Err: err}, nil)
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
	getPricesByOfferIdsRequestParam := GetPricesByOfferIdsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&getPricesByOfferIdsRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertGetPricesByOfferIdsRequestRequired(getPricesByOfferIdsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertGetPricesByOfferIdsRequestConstraints(getPricesByOfferIdsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetPricesByOfferIds(r.Context(), campaignIdParam, pageTokenParam, limitParam, getPricesByOfferIdsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSuggestedPrices - Цены для продвижения товаров
// Deprecated
func (c *PricesAPIController) GetSuggestedPrices(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	campaignIdParam, err := parseNumericParameter[int64](
		params["campaignId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "campaignId", Err: err}, nil)
		return
	}
	suggestPricesRequestParam := SuggestPricesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&suggestPricesRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSuggestPricesRequestRequired(suggestPricesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSuggestPricesRequestConstraints(suggestPricesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetSuggestedPrices(r.Context(), campaignIdParam, suggestPricesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateBusinessPrices - Установка цен на товары во всех магазинах
func (c *PricesAPIController) UpdateBusinessPrices(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	businessIdParam, err := parseNumericParameter[int64](
		params["businessId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "businessId", Err: err}, nil)
		return
	}
	updateBusinessPricesRequestParam := UpdateBusinessPricesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateBusinessPricesRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateBusinessPricesRequestRequired(updateBusinessPricesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateBusinessPricesRequestConstraints(updateBusinessPricesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateBusinessPrices(r.Context(), businessIdParam, updateBusinessPricesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdatePrices - Установка цен на товары в конкретном магазине
func (c *PricesAPIController) UpdatePrices(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	campaignIdParam, err := parseNumericParameter[int64](
		params["campaignId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Param: "campaignId", Err: err}, nil)
		return
	}
	updatePricesRequestParam := UpdatePricesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updatePricesRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdatePricesRequestRequired(updatePricesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdatePricesRequestConstraints(updatePricesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdatePrices(r.Context(), campaignIdParam, updatePricesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	_ = EncodeJSONResponse(result.Body, &result.Code, w)
}
