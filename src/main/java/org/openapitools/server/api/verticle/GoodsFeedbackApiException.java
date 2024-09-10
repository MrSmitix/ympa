package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.server.api.model.GetGoodsFeedbackRequest;
import org.openapitools.server.api.model.GetGoodsFeedbackResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.server.api.model.UpdateGoodsFeedbackCommentResponse;

public final class GoodsFeedbackApiException extends MainApiException {
    public GoodsFeedbackApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_200_Exception = new GoodsFeedbackApiException(200, "Пустой ответ.");
    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_400_Exception = new GoodsFeedbackApiException(400, "Запрос содержит неправильные данные.");
    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_401_Exception = new GoodsFeedbackApiException(401, "В запросе не указаны данные для авторизации.");
    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_403_Exception = new GoodsFeedbackApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_404_Exception = new GoodsFeedbackApiException(404, "Запрашиваемый ресурс не найден.");
    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_420_Exception = new GoodsFeedbackApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final GoodsFeedbackApiException GoodsFeedback_deleteGoodsFeedbackComment_500_Exception = new GoodsFeedbackApiException(500, "Внутренняя ошибка сервера.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_200_Exception = new GoodsFeedbackApiException(200, "Дерево комментариев к отзыву.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_400_Exception = new GoodsFeedbackApiException(400, "Запрос содержит неправильные данные.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_401_Exception = new GoodsFeedbackApiException(401, "В запросе не указаны данные для авторизации.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_403_Exception = new GoodsFeedbackApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_404_Exception = new GoodsFeedbackApiException(404, "Запрашиваемый ресурс не найден.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_420_Exception = new GoodsFeedbackApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbackComments_500_Exception = new GoodsFeedbackApiException(500, "Внутренняя ошибка сервера.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_200_Exception = new GoodsFeedbackApiException(200, "Список отзывов.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_400_Exception = new GoodsFeedbackApiException(400, "Запрос содержит неправильные данные.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_401_Exception = new GoodsFeedbackApiException(401, "В запросе не указаны данные для авторизации.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_403_Exception = new GoodsFeedbackApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_404_Exception = new GoodsFeedbackApiException(404, "Запрашиваемый ресурс не найден.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_420_Exception = new GoodsFeedbackApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final GoodsFeedbackApiException GoodsFeedback_getGoodsFeedbacks_500_Exception = new GoodsFeedbackApiException(500, "Внутренняя ошибка сервера.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_200_Exception = new GoodsFeedbackApiException(200, "Пустой ответ.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_400_Exception = new GoodsFeedbackApiException(400, "Запрос содержит неправильные данные.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_401_Exception = new GoodsFeedbackApiException(401, "В запросе не указаны данные для авторизации.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_403_Exception = new GoodsFeedbackApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_404_Exception = new GoodsFeedbackApiException(404, "Запрашиваемый ресурс не найден.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_420_Exception = new GoodsFeedbackApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final GoodsFeedbackApiException GoodsFeedback_skipGoodsFeedbacksReaction_500_Exception = new GoodsFeedbackApiException(500, "Внутренняя ошибка сервера.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_200_Exception = new GoodsFeedbackApiException(200, "Информация о добавленном или измененном комментарии.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_400_Exception = new GoodsFeedbackApiException(400, "Запрос содержит неправильные данные.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_401_Exception = new GoodsFeedbackApiException(401, "В запросе не указаны данные для авторизации.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_403_Exception = new GoodsFeedbackApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_404_Exception = new GoodsFeedbackApiException(404, "Запрашиваемый ресурс не найден.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_420_Exception = new GoodsFeedbackApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final GoodsFeedbackApiException GoodsFeedback_updateGoodsFeedbackComment_500_Exception = new GoodsFeedbackApiException(500, "Внутренняя ошибка сервера.");
    

}