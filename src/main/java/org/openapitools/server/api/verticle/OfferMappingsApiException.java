package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOfferMappingEntriesResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingEntriesRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingEntriesResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OfferAvailabilityStatusType;
import org.openapitools.server.api.model.OfferMappingKindType;
import org.openapitools.server.api.model.OfferProcessingStatusType;
import org.openapitools.server.api.model.UpdateOfferMappingEntryRequest;

public final class OfferMappingsApiException extends MainApiException {
    public OfferMappingsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_200_Exception = new OfferMappingsApiException(200, "Информация о товарах в каталоге.");
    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_400_Exception = new OfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_401_Exception = new OfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_403_Exception = new OfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_404_Exception = new OfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_420_Exception = new OfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OfferMappingsApiException OfferMappings_getOfferMappingEntries_500_Exception = new OfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_200_Exception = new OfferMappingsApiException(200, "Информация о товарах в каталоге.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_400_Exception = new OfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_401_Exception = new OfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_403_Exception = new OfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_404_Exception = new OfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_420_Exception = new OfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OfferMappingsApiException OfferMappings_getSuggestedOfferMappingEntries_500_Exception = new OfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_200_Exception = new OfferMappingsApiException(200, "Статус выполнения операции.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_400_Exception = new OfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_401_Exception = new OfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_403_Exception = new OfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_404_Exception = new OfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_420_Exception = new OfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_423_Exception = new OfferMappingsApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final OfferMappingsApiException OfferMappings_updateOfferMappingEntries_500_Exception = new OfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    

}