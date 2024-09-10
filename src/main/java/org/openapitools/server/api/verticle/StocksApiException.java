package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetWarehouseStocksRequest;
import org.openapitools.server.api.model.GetWarehouseStocksResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateStocksRequest;

public final class StocksApiException extends MainApiException {
    public StocksApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final StocksApiException Stocks_getStocks_200_Exception = new StocksApiException(200, "Остатки товаров на складах.");
    public static final StocksApiException Stocks_getStocks_400_Exception = new StocksApiException(400, "Запрос содержит неправильные данные.");
    public static final StocksApiException Stocks_getStocks_401_Exception = new StocksApiException(401, "В запросе не указаны данные для авторизации.");
    public static final StocksApiException Stocks_getStocks_403_Exception = new StocksApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final StocksApiException Stocks_getStocks_420_Exception = new StocksApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final StocksApiException Stocks_getStocks_500_Exception = new StocksApiException(500, "Внутренняя ошибка сервера.");
    public static final StocksApiException Stocks_updateStocks_200_Exception = new StocksApiException(200, "Пустой ответ.");
    public static final StocksApiException Stocks_updateStocks_400_Exception = new StocksApiException(400, "Запрос содержит неправильные данные.");
    public static final StocksApiException Stocks_updateStocks_401_Exception = new StocksApiException(401, "В запросе не указаны данные для авторизации.");
    public static final StocksApiException Stocks_updateStocks_403_Exception = new StocksApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final StocksApiException Stocks_updateStocks_404_Exception = new StocksApiException(404, "Запрашиваемый ресурс не найден.");
    public static final StocksApiException Stocks_updateStocks_420_Exception = new StocksApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final StocksApiException Stocks_updateStocks_500_Exception = new StocksApiException(500, "Внутренняя ошибка сервера.");
    

}