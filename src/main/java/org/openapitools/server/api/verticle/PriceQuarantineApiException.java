package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.ConfirmPricesRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetQuarantineOffersRequest;
import org.openapitools.server.api.model.GetQuarantineOffersResponse;
import org.openapitools.server.api.MainApiException;

public final class PriceQuarantineApiException extends MainApiException {
    public PriceQuarantineApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_200_Exception = new PriceQuarantineApiException(200, "Ответ 200 обозначает, что цены подтверждены.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_400_Exception = new PriceQuarantineApiException(400, "Запрос содержит неправильные данные.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_401_Exception = new PriceQuarantineApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_403_Exception = new PriceQuarantineApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_404_Exception = new PriceQuarantineApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_420_Exception = new PriceQuarantineApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_423_Exception = new PriceQuarantineApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmBusinessPrices_500_Exception = new PriceQuarantineApiException(500, "Внутренняя ошибка сервера.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_200_Exception = new PriceQuarantineApiException(200, "Ответ 200 обозначает, что цены подтверждены.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_400_Exception = new PriceQuarantineApiException(400, "Запрос содержит неправильные данные.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_401_Exception = new PriceQuarantineApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_403_Exception = new PriceQuarantineApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_404_Exception = new PriceQuarantineApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_420_Exception = new PriceQuarantineApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_423_Exception = new PriceQuarantineApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final PriceQuarantineApiException PriceQuarantine_confirmCampaignPrices_500_Exception = new PriceQuarantineApiException(500, "Внутренняя ошибка сервера.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_200_Exception = new PriceQuarantineApiException(200, "Список товаров в карантине.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_400_Exception = new PriceQuarantineApiException(400, "Запрос содержит неправильные данные.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_401_Exception = new PriceQuarantineApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_403_Exception = new PriceQuarantineApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_404_Exception = new PriceQuarantineApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_420_Exception = new PriceQuarantineApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PriceQuarantineApiException PriceQuarantine_getBusinessQuarantineOffers_500_Exception = new PriceQuarantineApiException(500, "Внутренняя ошибка сервера.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_200_Exception = new PriceQuarantineApiException(200, "Список товаров в карантине.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_400_Exception = new PriceQuarantineApiException(400, "Запрос содержит неправильные данные.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_401_Exception = new PriceQuarantineApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_403_Exception = new PriceQuarantineApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_404_Exception = new PriceQuarantineApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_420_Exception = new PriceQuarantineApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PriceQuarantineApiException PriceQuarantine_getCampaignQuarantineOffers_500_Exception = new PriceQuarantineApiException(500, "Внутренняя ошибка сервера.");
    

}