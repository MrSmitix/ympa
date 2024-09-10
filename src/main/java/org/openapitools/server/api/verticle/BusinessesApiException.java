package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetBusinessSettingsResponse;
import org.openapitools.server.api.MainApiException;

public final class BusinessesApiException extends MainApiException {
    public BusinessesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BusinessesApiException Businesses_getBusinessSettings_200_Exception = new BusinessesApiException(200, "Настройки кабинета.");
    public static final BusinessesApiException Businesses_getBusinessSettings_400_Exception = new BusinessesApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessesApiException Businesses_getBusinessSettings_401_Exception = new BusinessesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessesApiException Businesses_getBusinessSettings_403_Exception = new BusinessesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessesApiException Businesses_getBusinessSettings_404_Exception = new BusinessesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessesApiException Businesses_getBusinessSettings_420_Exception = new BusinessesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessesApiException Businesses_getBusinessSettings_500_Exception = new BusinessesApiException(500, "Внутренняя ошибка сервера.");
    

}