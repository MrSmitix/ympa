package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetDeliveryServicesResponse;
import org.openapitools.server.api.MainApiException;

public final class DeliveryServicesApiException extends MainApiException {
    public DeliveryServicesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_200_Exception = new DeliveryServicesApiException(200, "Информация о службах доставки.");
    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_400_Exception = new DeliveryServicesApiException(400, "Запрос содержит неправильные данные.");
    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_401_Exception = new DeliveryServicesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_403_Exception = new DeliveryServicesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_404_Exception = new DeliveryServicesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_420_Exception = new DeliveryServicesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final DeliveryServicesApiException DeliveryServices_getDeliveryServices_500_Exception = new DeliveryServicesApiException(500, "Внутренняя ошибка сервера.");
    

}