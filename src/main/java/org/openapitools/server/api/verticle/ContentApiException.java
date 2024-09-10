package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetCategoryContentParametersResponse;
import org.openapitools.server.api.model.GetOfferCardsContentStatusRequest;
import org.openapitools.server.api.model.GetOfferCardsContentStatusResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateOfferContentRequest;
import org.openapitools.server.api.model.UpdateOfferContentResponse;

public final class ContentApiException extends MainApiException {
    public ContentApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ContentApiException Content_getCategoryContentParameters_200_Exception = new ContentApiException(200, "Список характеристик товаров из заданной категории.");
    public static final ContentApiException Content_getCategoryContentParameters_400_Exception = new ContentApiException(400, "Запрос содержит неправильные данные.");
    public static final ContentApiException Content_getCategoryContentParameters_401_Exception = new ContentApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ContentApiException Content_getCategoryContentParameters_403_Exception = new ContentApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ContentApiException Content_getCategoryContentParameters_404_Exception = new ContentApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ContentApiException Content_getCategoryContentParameters_420_Exception = new ContentApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ContentApiException Content_getCategoryContentParameters_500_Exception = new ContentApiException(500, "Внутренняя ошибка сервера.");
    public static final ContentApiException Content_getOfferCardsContentStatus_200_Exception = new ContentApiException(200, "Информация о карточках указанных товаров.");
    public static final ContentApiException Content_getOfferCardsContentStatus_400_Exception = new ContentApiException(400, "Запрос содержит неправильные данные.");
    public static final ContentApiException Content_getOfferCardsContentStatus_401_Exception = new ContentApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ContentApiException Content_getOfferCardsContentStatus_403_Exception = new ContentApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ContentApiException Content_getOfferCardsContentStatus_404_Exception = new ContentApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ContentApiException Content_getOfferCardsContentStatus_420_Exception = new ContentApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ContentApiException Content_getOfferCardsContentStatus_500_Exception = new ContentApiException(500, "Внутренняя ошибка сервера.");
    public static final ContentApiException Content_updateOfferContent_200_Exception = new ContentApiException(200, "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ");
    public static final ContentApiException Content_updateOfferContent_400_Exception = new ContentApiException(400, "Запрос содержит неправильные данные.");
    public static final ContentApiException Content_updateOfferContent_401_Exception = new ContentApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ContentApiException Content_updateOfferContent_403_Exception = new ContentApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ContentApiException Content_updateOfferContent_404_Exception = new ContentApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ContentApiException Content_updateOfferContent_420_Exception = new ContentApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ContentApiException Content_updateOfferContent_423_Exception = new ContentApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final ContentApiException Content_updateOfferContent_500_Exception = new ContentApiException(500, "Внутренняя ошибка сервера.");
    

}