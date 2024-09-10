package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import java.io.File;
import org.openapitools.server.api.model.GetReturnResponse;
import org.openapitools.server.api.model.GetReturnsResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RefundStatusType;
import org.openapitools.server.api.model.ReturnType;
import org.openapitools.server.api.model.SetReturnDecisionRequest;

public final class ReturnsApiException extends MainApiException {
    public ReturnsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ReturnsApiException Returns_getReturn_200_Exception = new ReturnsApiException(200, "Детали возврата.");
    public static final ReturnsApiException Returns_getReturn_400_Exception = new ReturnsApiException(400, "Запрос содержит неправильные данные.");
    public static final ReturnsApiException Returns_getReturn_401_Exception = new ReturnsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ReturnsApiException Returns_getReturn_403_Exception = new ReturnsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ReturnsApiException Returns_getReturn_404_Exception = new ReturnsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ReturnsApiException Returns_getReturn_420_Exception = new ReturnsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ReturnsApiException Returns_getReturn_500_Exception = new ReturnsApiException(500, "Внутренняя ошибка сервера.");
    public static final ReturnsApiException Returns_getReturnApplication_200_Exception = new ReturnsApiException(200, "Заявление на возврат.");
    public static final ReturnsApiException Returns_getReturnApplication_400_Exception = new ReturnsApiException(400, "Запрос содержит неправильные данные.");
    public static final ReturnsApiException Returns_getReturnApplication_401_Exception = new ReturnsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ReturnsApiException Returns_getReturnApplication_403_Exception = new ReturnsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ReturnsApiException Returns_getReturnApplication_404_Exception = new ReturnsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ReturnsApiException Returns_getReturnApplication_420_Exception = new ReturnsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ReturnsApiException Returns_getReturnApplication_500_Exception = new ReturnsApiException(500, "Внутренняя ошибка сервера.");
    public static final ReturnsApiException Returns_getReturnPhoto_200_Exception = new ReturnsApiException(200, "Фотография возврата.");
    public static final ReturnsApiException Returns_getReturnPhoto_400_Exception = new ReturnsApiException(400, "Запрос содержит неправильные данные.");
    public static final ReturnsApiException Returns_getReturnPhoto_401_Exception = new ReturnsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ReturnsApiException Returns_getReturnPhoto_403_Exception = new ReturnsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ReturnsApiException Returns_getReturnPhoto_404_Exception = new ReturnsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ReturnsApiException Returns_getReturnPhoto_420_Exception = new ReturnsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ReturnsApiException Returns_getReturnPhoto_500_Exception = new ReturnsApiException(500, "Внутренняя ошибка сервера.");
    public static final ReturnsApiException Returns_getReturns_200_Exception = new ReturnsApiException(200, "Постраничные возвраты партнера.");
    public static final ReturnsApiException Returns_getReturns_400_Exception = new ReturnsApiException(400, "Запрос содержит неправильные данные.");
    public static final ReturnsApiException Returns_getReturns_401_Exception = new ReturnsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ReturnsApiException Returns_getReturns_403_Exception = new ReturnsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ReturnsApiException Returns_getReturns_404_Exception = new ReturnsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ReturnsApiException Returns_getReturns_420_Exception = new ReturnsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ReturnsApiException Returns_getReturns_500_Exception = new ReturnsApiException(500, "Внутренняя ошибка сервера.");
    public static final ReturnsApiException Returns_setReturnDecision_200_Exception = new ReturnsApiException(200, "Детали возврата.");
    public static final ReturnsApiException Returns_setReturnDecision_400_Exception = new ReturnsApiException(400, "Запрос содержит неправильные данные.");
    public static final ReturnsApiException Returns_setReturnDecision_401_Exception = new ReturnsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ReturnsApiException Returns_setReturnDecision_403_Exception = new ReturnsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ReturnsApiException Returns_setReturnDecision_404_Exception = new ReturnsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ReturnsApiException Returns_setReturnDecision_420_Exception = new ReturnsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ReturnsApiException Returns_setReturnDecision_500_Exception = new ReturnsApiException(500, "Внутренняя ошибка сервера.");
    public static final ReturnsApiException Returns_submitReturnDecision_200_Exception = new ReturnsApiException(200, "Статус выполнения операции.");
    public static final ReturnsApiException Returns_submitReturnDecision_400_Exception = new ReturnsApiException(400, "Запрос содержит неправильные данные.");
    public static final ReturnsApiException Returns_submitReturnDecision_401_Exception = new ReturnsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ReturnsApiException Returns_submitReturnDecision_403_Exception = new ReturnsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ReturnsApiException Returns_submitReturnDecision_404_Exception = new ReturnsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ReturnsApiException Returns_submitReturnDecision_420_Exception = new ReturnsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ReturnsApiException Returns_submitReturnDecision_500_Exception = new ReturnsApiException(500, "Внутренняя ошибка сервера.");
    

}