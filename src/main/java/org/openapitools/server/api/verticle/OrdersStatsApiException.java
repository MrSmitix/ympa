package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetOrdersStatsRequest;
import org.openapitools.server.api.model.GetOrdersStatsResponse;
import org.openapitools.server.api.MainApiException;

public final class OrdersStatsApiException extends MainApiException {
    public OrdersStatsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OrdersStatsApiException OrdersStats_getOrdersStats_200_Exception = new OrdersStatsApiException(200, "Информация по заказам.");
    public static final OrdersStatsApiException OrdersStats_getOrdersStats_400_Exception = new OrdersStatsApiException(400, "Запрос содержит неправильные данные.");
    public static final OrdersStatsApiException OrdersStats_getOrdersStats_401_Exception = new OrdersStatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrdersStatsApiException OrdersStats_getOrdersStats_403_Exception = new OrdersStatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrdersStatsApiException OrdersStats_getOrdersStats_404_Exception = new OrdersStatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrdersStatsApiException OrdersStats_getOrdersStats_420_Exception = new OrdersStatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrdersStatsApiException OrdersStats_getOrdersStats_500_Exception = new OrdersStatsApiException(500, "Внутренняя ошибка сервера.");
    

}