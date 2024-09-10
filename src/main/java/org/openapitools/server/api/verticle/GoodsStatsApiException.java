package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetGoodsStatsRequest;
import org.openapitools.server.api.model.GetGoodsStatsResponse;
import org.openapitools.server.api.MainApiException;

public final class GoodsStatsApiException extends MainApiException {
    public GoodsStatsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final GoodsStatsApiException GoodsStats_getGoodsStats_200_Exception = new GoodsStatsApiException(200, "Отчет по товарам.");
    public static final GoodsStatsApiException GoodsStats_getGoodsStats_400_Exception = new GoodsStatsApiException(400, "Запрос содержит неправильные данные.");
    public static final GoodsStatsApiException GoodsStats_getGoodsStats_401_Exception = new GoodsStatsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final GoodsStatsApiException GoodsStats_getGoodsStats_403_Exception = new GoodsStatsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final GoodsStatsApiException GoodsStats_getGoodsStats_404_Exception = new GoodsStatsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final GoodsStatsApiException GoodsStats_getGoodsStats_420_Exception = new GoodsStatsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final GoodsStatsApiException GoodsStats_getGoodsStats_500_Exception = new GoodsStatsApiException(500, "Внутренняя ошибка сервера.");
    

}