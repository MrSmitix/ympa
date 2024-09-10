package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import org.openapitools.server.api.model.GetOrderLabelsDataResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PageFormatType;

public final class OrderLabelsApiException extends MainApiException {
    public OrderLabelsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_200_Exception = new OrderLabelsApiException(200, "PDF‑файл с ярлыками для коробки. Файл содержит одну страницу с ярлыком.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_400_Exception = new OrderLabelsApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_401_Exception = new OrderLabelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_403_Exception = new OrderLabelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_404_Exception = new OrderLabelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_420_Exception = new OrderLabelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabel_500_Exception = new OrderLabelsApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_200_Exception = new OrderLabelsApiException(200, "PDF‑файл с ярлыками на все коробки.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_400_Exception = new OrderLabelsApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_401_Exception = new OrderLabelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_403_Exception = new OrderLabelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_404_Exception = new OrderLabelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_420_Exception = new OrderLabelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderLabelsApiException OrderLabels_generateOrderLabels_500_Exception = new OrderLabelsApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_200_Exception = new OrderLabelsApiException(200, "Информация для печати ярлыков.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_400_Exception = new OrderLabelsApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_401_Exception = new OrderLabelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_403_Exception = new OrderLabelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_404_Exception = new OrderLabelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_420_Exception = new OrderLabelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderLabelsApiException OrderLabels_getOrderLabelsData_500_Exception = new OrderLabelsApiException(500, "Внутренняя ошибка сервера.");
    

}