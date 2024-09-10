package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AddHiddenOffersRequest;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteHiddenOffersRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetHiddenOffersResponse;
import org.openapitools.server.api.MainApiException;

public final class HiddenOffersApiException extends MainApiException {
    public HiddenOffersApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_200_Exception = new HiddenOffersApiException(200, "Настройки скрытия получены и скоро вступят в силу.");
    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_400_Exception = new HiddenOffersApiException(400, "Запрос содержит неправильные данные.");
    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_401_Exception = new HiddenOffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_403_Exception = new HiddenOffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_420_Exception = new HiddenOffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_423_Exception = new HiddenOffersApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final HiddenOffersApiException HiddenOffers_addHiddenOffers_500_Exception = new HiddenOffersApiException(500, "Внутренняя ошибка сервера.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_200_Exception = new HiddenOffersApiException(200, "Показ товаров возобновлен.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_400_Exception = new HiddenOffersApiException(400, "Запрос содержит неправильные данные.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_401_Exception = new HiddenOffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_403_Exception = new HiddenOffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_404_Exception = new HiddenOffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_420_Exception = new HiddenOffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_423_Exception = new HiddenOffersApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final HiddenOffersApiException HiddenOffers_deleteHiddenOffers_500_Exception = new HiddenOffersApiException(500, "Внутренняя ошибка сервера.");
    public static final HiddenOffersApiException HiddenOffers_getHiddenOffers_200_Exception = new HiddenOffersApiException(200, "Информация о скрытых вами товарах.");
    public static final HiddenOffersApiException HiddenOffers_getHiddenOffers_400_Exception = new HiddenOffersApiException(400, "Запрос содержит неправильные данные.");
    public static final HiddenOffersApiException HiddenOffers_getHiddenOffers_401_Exception = new HiddenOffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final HiddenOffersApiException HiddenOffers_getHiddenOffers_403_Exception = new HiddenOffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final HiddenOffersApiException HiddenOffers_getHiddenOffers_420_Exception = new HiddenOffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final HiddenOffersApiException HiddenOffers_getHiddenOffers_500_Exception = new HiddenOffersApiException(500, "Внутренняя ошибка сервера.");
    

}