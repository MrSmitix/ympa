package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AddOffersToArchiveRequest;
import org.openapitools.server.api.model.AddOffersToArchiveResponse;
import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiLockedErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.DeleteOffersFromArchiveRequest;
import org.openapitools.server.api.model.DeleteOffersFromArchiveResponse;
import org.openapitools.server.api.model.DeleteOffersRequest;
import org.openapitools.server.api.model.DeleteOffersResponse;
import org.openapitools.server.api.model.GetOfferMappingsRequest;
import org.openapitools.server.api.model.GetOfferMappingsResponse;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsRequest;
import org.openapitools.server.api.model.GetSuggestedOfferMappingsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.UpdateOfferMappingsRequest;
import org.openapitools.server.api.model.UpdateOfferMappingsResponse;

public final class BusinessOfferMappingsApiException extends MainApiException {
    public BusinessOfferMappingsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_200_Exception = new BusinessOfferMappingsApiException(200, "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_400_Exception = new BusinessOfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_401_Exception = new BusinessOfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_403_Exception = new BusinessOfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_404_Exception = new BusinessOfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_420_Exception = new BusinessOfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_423_Exception = new BusinessOfferMappingsApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_addOffersToArchive_500_Exception = new BusinessOfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_200_Exception = new BusinessOfferMappingsApiException(200, "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_400_Exception = new BusinessOfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_401_Exception = new BusinessOfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_403_Exception = new BusinessOfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_404_Exception = new BusinessOfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_420_Exception = new BusinessOfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_423_Exception = new BusinessOfferMappingsApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffers_500_Exception = new BusinessOfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_200_Exception = new BusinessOfferMappingsApiException(200, "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_400_Exception = new BusinessOfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_401_Exception = new BusinessOfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_403_Exception = new BusinessOfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_404_Exception = new BusinessOfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_420_Exception = new BusinessOfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_423_Exception = new BusinessOfferMappingsApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_deleteOffersFromArchive_500_Exception = new BusinessOfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_200_Exception = new BusinessOfferMappingsApiException(200, "Информация о товарах в каталоге.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_400_Exception = new BusinessOfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_401_Exception = new BusinessOfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_403_Exception = new BusinessOfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_404_Exception = new BusinessOfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_420_Exception = new BusinessOfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getOfferMappings_500_Exception = new BusinessOfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_200_Exception = new BusinessOfferMappingsApiException(200, "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_400_Exception = new BusinessOfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_401_Exception = new BusinessOfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_403_Exception = new BusinessOfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_404_Exception = new BusinessOfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_420_Exception = new BusinessOfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_getSuggestedOfferMappings_500_Exception = new BusinessOfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_200_Exception = new BusinessOfferMappingsApiException(200, "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_400_Exception = new BusinessOfferMappingsApiException(400, "Запрос содержит неправильные данные.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_401_Exception = new BusinessOfferMappingsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_403_Exception = new BusinessOfferMappingsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_404_Exception = new BusinessOfferMappingsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_420_Exception = new BusinessOfferMappingsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_423_Exception = new BusinessOfferMappingsApiException(423, "К ресурсу нельзя применить указанный метод.");
    public static final BusinessOfferMappingsApiException BusinessOfferMappings_updateOfferMappings_500_Exception = new BusinessOfferMappingsApiException(500, "Внутренняя ошибка сервера.");
    

}