package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.CalculateTariffsRequest;
import org.openapitools.server.api.model.CalculateTariffsResponse;
import org.openapitools.server.api.MainApiException;

public final class TariffsApiException extends MainApiException {
    public TariffsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final TariffsApiException Tariffs_calculateTariffs_200_Exception = new TariffsApiException(200, "Стоимость услуг.");
    public static final TariffsApiException Tariffs_calculateTariffs_400_Exception = new TariffsApiException(400, "Запрос содержит неправильные данные.");
    public static final TariffsApiException Tariffs_calculateTariffs_401_Exception = new TariffsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final TariffsApiException Tariffs_calculateTariffs_403_Exception = new TariffsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final TariffsApiException Tariffs_calculateTariffs_404_Exception = new TariffsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final TariffsApiException Tariffs_calculateTariffs_420_Exception = new TariffsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final TariffsApiException Tariffs_calculateTariffs_500_Exception = new TariffsApiException(500, "Внутренняя ошибка сервера.");
    

}