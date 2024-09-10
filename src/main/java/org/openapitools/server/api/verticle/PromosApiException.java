package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeletePromoOffersRequest;
import org.openapitools.server.api.model.DeletePromoOffersResponse;
import org.openapitools.server.api.model.GetPromoOffersRequest;
import org.openapitools.server.api.model.GetPromoOffersResponse;
import org.openapitools.server.api.model.GetPromosRequest;
import org.openapitools.server.api.model.GetPromosResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdatePromoOffersRequest;
import org.openapitools.server.api.model.UpdatePromoOffersResponse;

public final class PromosApiException extends MainApiException {
    public PromosApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final PromosApiException Promos_deletePromoOffers_200_Exception = new PromosApiException(200, "Результат удаления товаров из акции.");
    public static final PromosApiException Promos_deletePromoOffers_400_Exception = new PromosApiException(400, "Запрос содержит неправильные данные.");
    public static final PromosApiException Promos_deletePromoOffers_401_Exception = new PromosApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PromosApiException Promos_deletePromoOffers_403_Exception = new PromosApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PromosApiException Promos_deletePromoOffers_404_Exception = new PromosApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PromosApiException Promos_deletePromoOffers_420_Exception = new PromosApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PromosApiException Promos_deletePromoOffers_500_Exception = new PromosApiException(500, "Внутренняя ошибка сервера.");
    public static final PromosApiException Promos_getPromoOffers_200_Exception = new PromosApiException(200, "Список товаров, которые участвуют или могут участвовать в акции.");
    public static final PromosApiException Promos_getPromoOffers_400_Exception = new PromosApiException(400, "Запрос содержит неправильные данные.");
    public static final PromosApiException Promos_getPromoOffers_401_Exception = new PromosApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PromosApiException Promos_getPromoOffers_403_Exception = new PromosApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PromosApiException Promos_getPromoOffers_404_Exception = new PromosApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PromosApiException Promos_getPromoOffers_420_Exception = new PromosApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PromosApiException Promos_getPromoOffers_500_Exception = new PromosApiException(500, "Внутренняя ошибка сервера.");
    public static final PromosApiException Promos_getPromos_200_Exception = new PromosApiException(200, "Список акций Маркета.");
    public static final PromosApiException Promos_getPromos_400_Exception = new PromosApiException(400, "Запрос содержит неправильные данные.");
    public static final PromosApiException Promos_getPromos_401_Exception = new PromosApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PromosApiException Promos_getPromos_403_Exception = new PromosApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PromosApiException Promos_getPromos_404_Exception = new PromosApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PromosApiException Promos_getPromos_420_Exception = new PromosApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PromosApiException Promos_getPromos_500_Exception = new PromosApiException(500, "Внутренняя ошибка сервера.");
    public static final PromosApiException Promos_updatePromoOffers_200_Exception = new PromosApiException(200, "Результат добавления товаров в акцию или обновления их цен.");
    public static final PromosApiException Promos_updatePromoOffers_400_Exception = new PromosApiException(400, "Запрос содержит неправильные данные.");
    public static final PromosApiException Promos_updatePromoOffers_401_Exception = new PromosApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PromosApiException Promos_updatePromoOffers_403_Exception = new PromosApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PromosApiException Promos_updatePromoOffers_404_Exception = new PromosApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PromosApiException Promos_updatePromoOffers_420_Exception = new PromosApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PromosApiException Promos_updatePromoOffers_500_Exception = new PromosApiException(500, "Внутренняя ошибка сервера.");
    

}