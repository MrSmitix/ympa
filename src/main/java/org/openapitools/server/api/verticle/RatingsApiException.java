package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetQualityRatingDetailsResponse;
import org.openapitools.server.api.model.GetQualityRatingRequest;
import org.openapitools.server.api.model.GetQualityRatingResponse;
import org.openapitools.server.api.MainApiException;

public final class RatingsApiException extends MainApiException {
    public RatingsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final RatingsApiException Ratings_getQualityRatingDetails_200_Exception = new RatingsApiException(200, "Информация о заказах, которые повлияли на индекс качества.");
    public static final RatingsApiException Ratings_getQualityRatingDetails_400_Exception = new RatingsApiException(400, "Запрос содержит неправильные данные.");
    public static final RatingsApiException Ratings_getQualityRatingDetails_401_Exception = new RatingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final RatingsApiException Ratings_getQualityRatingDetails_403_Exception = new RatingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final RatingsApiException Ratings_getQualityRatingDetails_404_Exception = new RatingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final RatingsApiException Ratings_getQualityRatingDetails_420_Exception = new RatingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final RatingsApiException Ratings_getQualityRatingDetails_500_Exception = new RatingsApiException(500, "Внутренняя ошибка сервера.");
    public static final RatingsApiException Ratings_getQualityRatings_200_Exception = new RatingsApiException(200, "Значение индекса качества магазинов и его составляющие.");
    public static final RatingsApiException Ratings_getQualityRatings_400_Exception = new RatingsApiException(400, "Запрос содержит неправильные данные.");
    public static final RatingsApiException Ratings_getQualityRatings_401_Exception = new RatingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final RatingsApiException Ratings_getQualityRatings_403_Exception = new RatingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final RatingsApiException Ratings_getQualityRatings_404_Exception = new RatingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final RatingsApiException Ratings_getQualityRatings_420_Exception = new RatingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final RatingsApiException Ratings_getQualityRatings_500_Exception = new RatingsApiException(500, "Внутренняя ошибка сервера.");
    

}