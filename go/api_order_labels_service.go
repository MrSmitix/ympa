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

// OrderLabelsAPIService is a service that implements the logic for the OrderLabelsAPIServicer
// This service should implement the business logic for every endpoint for the OrderLabelsAPI API.
// Include any external packages or services that will be required by this service.
type OrderLabelsAPIService struct {
}

// NewOrderLabelsAPIService creates a default api service
func NewOrderLabelsAPIService() *OrderLabelsAPIService {
	return &OrderLabelsAPIService{}
}

// GenerateOrderLabel - Готовый ярлык‑наклейка для коробки в заказе
func (s *OrderLabelsAPIService) GenerateOrderLabel(ctx context.Context, campaignId int64, orderId int64, shipmentId int64, boxId int64, format PageFormatType) (ImplResponse, error) {
	// TODO - update GenerateOrderLabel with the required logic for this service method.
	// Add api_order_labels_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GenerateOrderLabel method not implemented")
}

// GenerateOrderLabels - Готовые ярлыки‑наклейки на все коробки в одном заказе
func (s *OrderLabelsAPIService) GenerateOrderLabels(ctx context.Context, campaignId int64, orderId int64, format PageFormatType) (ImplResponse, error) {
	// TODO - update GenerateOrderLabels with the required logic for this service method.
	// Add api_order_labels_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GenerateOrderLabels method not implemented")
}

// GetOrderLabelsData - Данные для самостоятельного изготовления ярлыков
func (s *OrderLabelsAPIService) GetOrderLabelsData(ctx context.Context, campaignId int64, orderId int64) (ImplResponse, error) {
	// TODO - update GetOrderLabelsData with the required logic for this service method.
	// Add api_order_labels_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetOrderLabelsDataResponse{}) or use other options such as http.Ok ...
	// return Response(200, GetOrderLabelsDataResponse{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetOrderLabelsData method not implemented")
}
