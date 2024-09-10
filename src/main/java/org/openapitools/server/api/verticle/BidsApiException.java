package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetBidsInfoRequest;
import org.openapitools.server.api.model.GetBidsInfoResponse;
import org.openapitools.server.api.model.GetBidsRecommendationsRequest;
import org.openapitools.server.api.model.GetBidsRecommendationsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PutSkuBidsRequest;

public final class BidsApiException extends MainApiException {
    public BidsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BidsApiException Bids_getBidsInfoForBusiness_200_Exception = new BidsApiException(200, "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.");
    public static final BidsApiException Bids_getBidsInfoForBusiness_400_Exception = new BidsApiException(400, "Запрос содержит неправильные данные.");
    public static final BidsApiException Bids_getBidsInfoForBusiness_401_Exception = new BidsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BidsApiException Bids_getBidsInfoForBusiness_403_Exception = new BidsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BidsApiException Bids_getBidsInfoForBusiness_404_Exception = new BidsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BidsApiException Bids_getBidsInfoForBusiness_420_Exception = new BidsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BidsApiException Bids_getBidsInfoForBusiness_500_Exception = new BidsApiException(500, "Внутренняя ошибка сервера.");
    public static final BidsApiException Bids_getBidsRecommendations_200_Exception = new BidsApiException(200, "Рекомендованные ставки для заданных товаров.");
    public static final BidsApiException Bids_getBidsRecommendations_400_Exception = new BidsApiException(400, "Запрос содержит неправильные данные.");
    public static final BidsApiException Bids_getBidsRecommendations_401_Exception = new BidsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BidsApiException Bids_getBidsRecommendations_403_Exception = new BidsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BidsApiException Bids_getBidsRecommendations_404_Exception = new BidsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BidsApiException Bids_getBidsRecommendations_420_Exception = new BidsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BidsApiException Bids_getBidsRecommendations_500_Exception = new BidsApiException(500, "Внутренняя ошибка сервера.");
    public static final BidsApiException Bids_putBidsForBusiness_200_Exception = new BidsApiException(200, "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ");
    public static final BidsApiException Bids_putBidsForBusiness_400_Exception = new BidsApiException(400, "Запрос содержит неправильные данные.");
    public static final BidsApiException Bids_putBidsForBusiness_401_Exception = new BidsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BidsApiException Bids_putBidsForBusiness_403_Exception = new BidsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BidsApiException Bids_putBidsForBusiness_404_Exception = new BidsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BidsApiException Bids_putBidsForBusiness_420_Exception = new BidsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BidsApiException Bids_putBidsForBusiness_500_Exception = new BidsApiException(500, "Внутренняя ошибка сервера.");
    public static final BidsApiException Bids_putBidsForCampaign_200_Exception = new BidsApiException(200, "Пустой ответ.");
    public static final BidsApiException Bids_putBidsForCampaign_400_Exception = new BidsApiException(400, "Запрос содержит неправильные данные.");
    public static final BidsApiException Bids_putBidsForCampaign_401_Exception = new BidsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BidsApiException Bids_putBidsForCampaign_403_Exception = new BidsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BidsApiException Bids_putBidsForCampaign_404_Exception = new BidsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BidsApiException Bids_putBidsForCampaign_420_Exception = new BidsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BidsApiException Bids_putBidsForCampaign_500_Exception = new BidsApiException(500, "Внутренняя ошибка сервера.");
    

}