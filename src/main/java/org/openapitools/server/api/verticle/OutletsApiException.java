package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.ChangeOutletRequest;
import org.openapitools.server.api.model.CreateOutletResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOutletResponse;
import org.openapitools.server.api.model.GetOutletsResponse;
import org.openapitools.server.api.MainApiException;

public final class OutletsApiException extends MainApiException {
    public OutletsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OutletsApiException Outlets_createOutlet_200_Exception = new OutletsApiException(200, "Информация о созданной точке продаж.");
    public static final OutletsApiException Outlets_createOutlet_400_Exception = new OutletsApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletsApiException Outlets_createOutlet_401_Exception = new OutletsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletsApiException Outlets_createOutlet_403_Exception = new OutletsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletsApiException Outlets_createOutlet_404_Exception = new OutletsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletsApiException Outlets_createOutlet_420_Exception = new OutletsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletsApiException Outlets_createOutlet_500_Exception = new OutletsApiException(500, "Внутренняя ошибка сервера.");
    public static final OutletsApiException Outlets_deleteOutlet_200_Exception = new OutletsApiException(200, "Пустой ответ.");
    public static final OutletsApiException Outlets_deleteOutlet_400_Exception = new OutletsApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletsApiException Outlets_deleteOutlet_401_Exception = new OutletsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletsApiException Outlets_deleteOutlet_403_Exception = new OutletsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletsApiException Outlets_deleteOutlet_404_Exception = new OutletsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletsApiException Outlets_deleteOutlet_420_Exception = new OutletsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletsApiException Outlets_deleteOutlet_500_Exception = new OutletsApiException(500, "Внутренняя ошибка сервера.");
    public static final OutletsApiException Outlets_getOutlet_200_Exception = new OutletsApiException(200, "Информация о точке продаж.");
    public static final OutletsApiException Outlets_getOutlet_400_Exception = new OutletsApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletsApiException Outlets_getOutlet_401_Exception = new OutletsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletsApiException Outlets_getOutlet_403_Exception = new OutletsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletsApiException Outlets_getOutlet_404_Exception = new OutletsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletsApiException Outlets_getOutlet_420_Exception = new OutletsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletsApiException Outlets_getOutlet_500_Exception = new OutletsApiException(500, "Внутренняя ошибка сервера.");
    public static final OutletsApiException Outlets_getOutlets_200_Exception = new OutletsApiException(200, "Информация о точках продаж.");
    public static final OutletsApiException Outlets_getOutlets_400_Exception = new OutletsApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletsApiException Outlets_getOutlets_401_Exception = new OutletsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletsApiException Outlets_getOutlets_403_Exception = new OutletsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletsApiException Outlets_getOutlets_404_Exception = new OutletsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletsApiException Outlets_getOutlets_420_Exception = new OutletsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletsApiException Outlets_getOutlets_500_Exception = new OutletsApiException(500, "Внутренняя ошибка сервера.");
    public static final OutletsApiException Outlets_updateOutlet_200_Exception = new OutletsApiException(200, "Пустой ответ.");
    public static final OutletsApiException Outlets_updateOutlet_400_Exception = new OutletsApiException(400, "Запрос содержит неправильные данные.");
    public static final OutletsApiException Outlets_updateOutlet_401_Exception = new OutletsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OutletsApiException Outlets_updateOutlet_403_Exception = new OutletsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OutletsApiException Outlets_updateOutlet_404_Exception = new OutletsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OutletsApiException Outlets_updateOutlet_420_Exception = new OutletsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OutletsApiException Outlets_updateOutlet_500_Exception = new OutletsApiException(500, "Внутренняя ошибка сервера.");
    

}