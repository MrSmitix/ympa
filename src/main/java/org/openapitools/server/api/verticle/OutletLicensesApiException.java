package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOutletLicensesResponse;
import org.openapitools.server.api.MainApiException;
import java.util.Set;
import org.openapitools.server.api.model.UpdateOutletLicenseRequest;

public final class OutletLicensesApiException extends MainApiException {
    public OutletLicensesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_200_Exception = new OutletLicensesApiException(200, "Пустой ответ.");
    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_400_Exception = new OutletLicensesApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_401_Exception = new OutletLicensesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_403_Exception = new OutletLicensesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_404_Exception = new OutletLicensesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_420_Exception = new OutletLicensesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletLicensesApiException OutletLicenses_deleteOutletLicenses_500_Exception = new OutletLicensesApiException(500, "Внутренняя ошибка сервера.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_200_Exception = new OutletLicensesApiException(200, "Найденные лицензии собственных точек продаж.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_400_Exception = new OutletLicensesApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_401_Exception = new OutletLicensesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_403_Exception = new OutletLicensesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_404_Exception = new OutletLicensesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_420_Exception = new OutletLicensesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletLicensesApiException OutletLicenses_getOutletLicenses_500_Exception = new OutletLicensesApiException(500, "Внутренняя ошибка сервера.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_200_Exception = new OutletLicensesApiException(200, "Пустой ответ.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_400_Exception = new OutletLicensesApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_401_Exception = new OutletLicensesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_403_Exception = new OutletLicensesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_404_Exception = new OutletLicensesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_420_Exception = new OutletLicensesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletLicensesApiException OutletLicenses_updateOutletLicenses_500_Exception = new OutletLicensesApiException(500, "Внутренняя ошибка сервера.");
    

}