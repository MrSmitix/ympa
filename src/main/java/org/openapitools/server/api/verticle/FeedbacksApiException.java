package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetFeedbackListResponse;
import java.time.LocalDate;
import org.openapitools.server.api.MainApiException;

public final class FeedbacksApiException extends MainApiException {
    public FeedbacksApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_200_Exception = new FeedbacksApiException(200, "Список отзывов для магазина.");
    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_400_Exception = new FeedbacksApiException(400, "Запрос содержит неправильные данные.");
    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_401_Exception = new FeedbacksApiException(401, "В запросе не указаны данные для авторизации.");
    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_403_Exception = new FeedbacksApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_404_Exception = new FeedbacksApiException(404, "Запрашиваемый ресурс не найден.");
    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_420_Exception = new FeedbacksApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final FeedbacksApiException Feedbacks_getFeedbackAndCommentUpdates_500_Exception = new FeedbacksApiException(500, "Внутренняя ошибка сервера.");
    

}