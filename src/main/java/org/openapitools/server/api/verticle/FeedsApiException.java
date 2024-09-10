package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.FeedIndexLogsStatusType;
import org.openapitools.server.api.model.GetFeedIndexLogsResponse;
import org.openapitools.server.api.model.GetFeedResponse;
import org.openapitools.server.api.model.GetFeedsResponse;
import org.openapitools.server.api.MainApiException;
import java.time.OffsetDateTime;
import org.openapitools.server.api.model.SetFeedParamsRequest;

public final class FeedsApiException extends MainApiException {
    public FeedsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final FeedsApiException Feeds_getFeed_200_Exception = new FeedsApiException(200, "Информация о прайс-листе.");
    public static final FeedsApiException Feeds_getFeed_400_Exception = new FeedsApiException(400, "Запрос содержит неправильные данные.");
    public static final FeedsApiException Feeds_getFeed_401_Exception = new FeedsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final FeedsApiException Feeds_getFeed_403_Exception = new FeedsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final FeedsApiException Feeds_getFeed_404_Exception = new FeedsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final FeedsApiException Feeds_getFeed_420_Exception = new FeedsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final FeedsApiException Feeds_getFeed_500_Exception = new FeedsApiException(500, "Внутренняя ошибка сервера.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_200_Exception = new FeedsApiException(200, "Отчет по индексации прайс-листа.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_400_Exception = new FeedsApiException(400, "Запрос содержит неправильные данные.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_401_Exception = new FeedsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_403_Exception = new FeedsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_404_Exception = new FeedsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_420_Exception = new FeedsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final FeedsApiException Feeds_getFeedIndexLogs_500_Exception = new FeedsApiException(500, "Внутренняя ошибка сервера.");
    public static final FeedsApiException Feeds_getFeeds_200_Exception = new FeedsApiException(200, "Список прайс-листов.");
    public static final FeedsApiException Feeds_getFeeds_400_Exception = new FeedsApiException(400, "Запрос содержит неправильные данные.");
    public static final FeedsApiException Feeds_getFeeds_401_Exception = new FeedsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final FeedsApiException Feeds_getFeeds_403_Exception = new FeedsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final FeedsApiException Feeds_getFeeds_404_Exception = new FeedsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final FeedsApiException Feeds_getFeeds_420_Exception = new FeedsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final FeedsApiException Feeds_getFeeds_500_Exception = new FeedsApiException(500, "Внутренняя ошибка сервера.");
    public static final FeedsApiException Feeds_refreshFeed_200_Exception = new FeedsApiException(200, "Пустой ответ.");
    public static final FeedsApiException Feeds_refreshFeed_400_Exception = new FeedsApiException(400, "Запрос содержит неправильные данные.");
    public static final FeedsApiException Feeds_refreshFeed_401_Exception = new FeedsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final FeedsApiException Feeds_refreshFeed_403_Exception = new FeedsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final FeedsApiException Feeds_refreshFeed_404_Exception = new FeedsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final FeedsApiException Feeds_refreshFeed_420_Exception = new FeedsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final FeedsApiException Feeds_refreshFeed_500_Exception = new FeedsApiException(500, "Внутренняя ошибка сервера.");
    public static final FeedsApiException Feeds_setFeedParams_200_Exception = new FeedsApiException(200, "Статус выполнения операции.");
    public static final FeedsApiException Feeds_setFeedParams_400_Exception = new FeedsApiException(400, "Запрос содержит неправильные данные.");
    public static final FeedsApiException Feeds_setFeedParams_401_Exception = new FeedsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final FeedsApiException Feeds_setFeedParams_403_Exception = new FeedsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final FeedsApiException Feeds_setFeedParams_404_Exception = new FeedsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final FeedsApiException Feeds_setFeedParams_420_Exception = new FeedsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final FeedsApiException Feeds_setFeedParams_423_Exception = new FeedsApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final FeedsApiException Feeds_setFeedParams_500_Exception = new FeedsApiException(500, "Внутренняя ошибка сервера.");
    

}