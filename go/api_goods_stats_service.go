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
	"context"
	"net/http"
	"errors"
)

// GoodsStatsAPIService is a service that implements the logic for the GoodsStatsAPIServicer
// This service should implement the business logic for every endpoint for the GoodsStatsAPI API.
// Include any external packages or services that will be required by this service.
type GoodsStatsAPIService struct {
}

// NewGoodsStatsAPIService creates a default api service
func NewGoodsStatsAPIService() *GoodsStatsAPIService {
	return &GoodsStatsAPIService{}
}

// GetGoodsStats - Отчет по товарам
func (s *GoodsStatsAPIService) GetGoodsStats(ctx context.Context, campaignId int64, getGoodsStatsRequest GetGoodsStatsRequest) (ImplResponse, error) {
	// TODO - update GetGoodsStats with the required logic for this service method.
	// Add api_goods_stats_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoodsStatsResponse{}) or use other options such as http.Ok ...
	// return Response(200, GetGoodsStatsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ApiClientDataErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ApiClientDataErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ApiUnauthorizedErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ApiUnauthorizedErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ApiForbiddenErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ApiForbiddenErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ApiNotFoundErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ApiNotFoundErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(420, ApiLimitErrorResponse{}) or use other options such as http.Ok ...
	// return Response(420, ApiLimitErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ApiServerErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ApiServerErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGoodsStats method not implemented")
}
