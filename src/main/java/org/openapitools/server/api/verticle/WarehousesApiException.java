package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetFulfillmentWarehousesResponse;
import org.openapitools.server.api.model.GetWarehousesResponse;
import org.openapitools.server.api.MainApiException;

public final class WarehousesApiException extends MainApiException {
    public WarehousesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_200_Exception = new WarehousesApiException(200, "Список складов.");
    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_400_Exception = new WarehousesApiException(400, "Запрос содержит неправильные данные.");
    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_401_Exception = new WarehousesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_403_Exception = new WarehousesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_404_Exception = new WarehousesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_420_Exception = new WarehousesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final WarehousesApiException Warehouses_getFulfillmentWarehouses_500_Exception = new WarehousesApiException(500, "Внутренняя ошибка сервера.");
    public static final WarehousesApiException Warehouses_getWarehouses_200_Exception = new WarehousesApiException(200, "Список складов и групп складов.");
    public static final WarehousesApiException Warehouses_getWarehouses_400_Exception = new WarehousesApiException(400, "Запрос содержит неправильные данные.");
    public static final WarehousesApiException Warehouses_getWarehouses_401_Exception = new WarehousesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final WarehousesApiException Warehouses_getWarehouses_403_Exception = new WarehousesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final WarehousesApiException Warehouses_getWarehouses_404_Exception = new WarehousesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final WarehousesApiException Warehouses_getWarehouses_420_Exception = new WarehousesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final WarehousesApiException Warehouses_getWarehouses_500_Exception = new WarehousesApiException(500, "Внутренняя ошибка сервера.");
    

}