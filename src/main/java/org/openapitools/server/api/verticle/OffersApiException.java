package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.DeleteCampaignOffersRequest;
import org.openapitools.server.api.model.DeleteCampaignOffersResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetAllOffersResponse;
import org.openapitools.server.api.model.GetCampaignOffersRequest;
import org.openapitools.server.api.model.GetCampaignOffersResponse;
import org.openapitools.server.api.model.GetOfferRecommendationsRequest;
import org.openapitools.server.api.model.GetOfferRecommendationsResponse;
import org.openapitools.server.api.model.GetOffersResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateCampaignOffersRequest;

public final class OffersApiException extends MainApiException {
    public OffersApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OffersApiException Offers_deleteCampaignOffers_200_Exception = new OffersApiException(200, "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.");
    public static final OffersApiException Offers_deleteCampaignOffers_400_Exception = new OffersApiException(400, "Запрос содержит неправильные данные.");
    public static final OffersApiException Offers_deleteCampaignOffers_401_Exception = new OffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OffersApiException Offers_deleteCampaignOffers_403_Exception = new OffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OffersApiException Offers_deleteCampaignOffers_404_Exception = new OffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OffersApiException Offers_deleteCampaignOffers_420_Exception = new OffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OffersApiException Offers_deleteCampaignOffers_423_Exception = new OffersApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final OffersApiException Offers_deleteCampaignOffers_500_Exception = new OffersApiException(500, "Внутренняя ошибка сервера.");
    public static final OffersApiException Offers_getAllOffers_200_Exception = new OffersApiException(200, "Предложения магазина.");
    public static final OffersApiException Offers_getAllOffers_400_Exception = new OffersApiException(400, "Запрос содержит неправильные данные.");
    public static final OffersApiException Offers_getAllOffers_401_Exception = new OffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OffersApiException Offers_getAllOffers_403_Exception = new OffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OffersApiException Offers_getAllOffers_404_Exception = new OffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OffersApiException Offers_getAllOffers_420_Exception = new OffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OffersApiException Offers_getAllOffers_500_Exception = new OffersApiException(500, "Внутренняя ошибка сервера.");
    public static final OffersApiException Offers_getCampaignOffers_200_Exception = new OffersApiException(200, "Список товаров, размещенных в заданном магазине.");
    public static final OffersApiException Offers_getCampaignOffers_400_Exception = new OffersApiException(400, "Запрос содержит неправильные данные.");
    public static final OffersApiException Offers_getCampaignOffers_401_Exception = new OffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OffersApiException Offers_getCampaignOffers_403_Exception = new OffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OffersApiException Offers_getCampaignOffers_404_Exception = new OffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OffersApiException Offers_getCampaignOffers_420_Exception = new OffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OffersApiException Offers_getCampaignOffers_500_Exception = new OffersApiException(500, "Внутренняя ошибка сервера.");
    public static final OffersApiException Offers_getOfferRecommendations_200_Exception = new OffersApiException(200, "Список товаров с рекомендациями.");
    public static final OffersApiException Offers_getOfferRecommendations_400_Exception = new OffersApiException(400, "Запрос содержит неправильные данные.");
    public static final OffersApiException Offers_getOfferRecommendations_401_Exception = new OffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OffersApiException Offers_getOfferRecommendations_403_Exception = new OffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OffersApiException Offers_getOfferRecommendations_404_Exception = new OffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OffersApiException Offers_getOfferRecommendations_420_Exception = new OffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OffersApiException Offers_getOfferRecommendations_500_Exception = new OffersApiException(500, "Внутренняя ошибка сервера.");
    public static final OffersApiException Offers_getOffers_200_Exception = new OffersApiException(200, "Предложения магазина.");
    public static final OffersApiException Offers_getOffers_400_Exception = new OffersApiException(400, "Запрос содержит неправильные данные.");
    public static final OffersApiException Offers_getOffers_401_Exception = new OffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OffersApiException Offers_getOffers_403_Exception = new OffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OffersApiException Offers_getOffers_404_Exception = new OffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OffersApiException Offers_getOffers_420_Exception = new OffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OffersApiException Offers_getOffers_500_Exception = new OffersApiException(500, "Внутренняя ошибка сервера.");
    public static final OffersApiException Offers_updateCampaignOffers_200_Exception = new OffersApiException(200, "Ответ 200 обозначает, что новые параметры получены Маркетом и скоро вступят в силу.");
    public static final OffersApiException Offers_updateCampaignOffers_400_Exception = new OffersApiException(400, "Запрос содержит неправильные данные.");
    public static final OffersApiException Offers_updateCampaignOffers_401_Exception = new OffersApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OffersApiException Offers_updateCampaignOffers_403_Exception = new OffersApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OffersApiException Offers_updateCampaignOffers_404_Exception = new OffersApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OffersApiException Offers_updateCampaignOffers_420_Exception = new OffersApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OffersApiException Offers_updateCampaignOffers_423_Exception = new OffersApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final OffersApiException Offers_updateCampaignOffers_500_Exception = new OffersApiException(500, "Внутренняя ошибка сервера.");
    

}