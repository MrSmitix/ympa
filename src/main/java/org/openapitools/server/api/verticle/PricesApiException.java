package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetPricesByOfferIdsRequest;
import org.openapitools.server.api.model.GetPricesByOfferIdsResponse;
import org.openapitools.server.api.model.GetPricesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SuggestPricesRequest;
import org.openapitools.server.api.model.SuggestPricesResponse;
import org.openapitools.server.api.model.UpdateBusinessPricesRequest;
import org.openapitools.server.api.model.UpdatePricesRequest;

public final class PricesApiException extends MainApiException {
    public PricesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final PricesApiException Prices_getPrices_200_Exception = new PricesApiException(200, "Список всех товаров с установленными ценами.");
    public static final PricesApiException Prices_getPrices_400_Exception = new PricesApiException(400, "Запрос содержит неправильные данные.");
    public static final PricesApiException Prices_getPrices_401_Exception = new PricesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PricesApiException Prices_getPrices_403_Exception = new PricesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PricesApiException Prices_getPrices_404_Exception = new PricesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PricesApiException Prices_getPrices_420_Exception = new PricesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PricesApiException Prices_getPrices_500_Exception = new PricesApiException(500, "Внутренняя ошибка сервера.");
    public static final PricesApiException Prices_getPricesByOfferIds_200_Exception = new PricesApiException(200, "Список товаров с установленными для заданного магазина ценами.");
    public static final PricesApiException Prices_getPricesByOfferIds_400_Exception = new PricesApiException(400, "Запрос содержит неправильные данные.");
    public static final PricesApiException Prices_getPricesByOfferIds_401_Exception = new PricesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PricesApiException Prices_getPricesByOfferIds_403_Exception = new PricesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PricesApiException Prices_getPricesByOfferIds_404_Exception = new PricesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PricesApiException Prices_getPricesByOfferIds_420_Exception = new PricesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PricesApiException Prices_getPricesByOfferIds_500_Exception = new PricesApiException(500, "Внутренняя ошибка сервера.");
    public static final PricesApiException Prices_getSuggestedPrices_200_Exception = new PricesApiException(200, "Список цен для продвижения на Маркете.");
    public static final PricesApiException Prices_getSuggestedPrices_400_Exception = new PricesApiException(400, "Запрос содержит неправильные данные.");
    public static final PricesApiException Prices_getSuggestedPrices_401_Exception = new PricesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PricesApiException Prices_getSuggestedPrices_403_Exception = new PricesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PricesApiException Prices_getSuggestedPrices_404_Exception = new PricesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PricesApiException Prices_getSuggestedPrices_420_Exception = new PricesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PricesApiException Prices_getSuggestedPrices_500_Exception = new PricesApiException(500, "Внутренняя ошибка сервера.");
    public static final PricesApiException Prices_updateBusinessPrices_200_Exception = new PricesApiException(200, "Маркет принял информацию о новых ценах.");
    public static final PricesApiException Prices_updateBusinessPrices_400_Exception = new PricesApiException(400, "Запрос содержит неправильные данные.");
    public static final PricesApiException Prices_updateBusinessPrices_401_Exception = new PricesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PricesApiException Prices_updateBusinessPrices_403_Exception = new PricesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PricesApiException Prices_updateBusinessPrices_404_Exception = new PricesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PricesApiException Prices_updateBusinessPrices_420_Exception = new PricesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PricesApiException Prices_updateBusinessPrices_423_Exception = new PricesApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final PricesApiException Prices_updateBusinessPrices_500_Exception = new PricesApiException(500, "Внутренняя ошибка сервера.");
    public static final PricesApiException Prices_updatePrices_200_Exception = new PricesApiException(200, "Маркет принял информацию о новых ценах.");
    public static final PricesApiException Prices_updatePrices_400_Exception = new PricesApiException(400, "Запрос содержит неправильные данные.");
    public static final PricesApiException Prices_updatePrices_401_Exception = new PricesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final PricesApiException Prices_updatePrices_403_Exception = new PricesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final PricesApiException Prices_updatePrices_404_Exception = new PricesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final PricesApiException Prices_updatePrices_420_Exception = new PricesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final PricesApiException Prices_updatePrices_423_Exception = new PricesApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final PricesApiException Prices_updatePrices_500_Exception = new PricesApiException(500, "Внутренняя ошибка сервера.");
    

}