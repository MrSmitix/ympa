package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.CurrencyType;
import org.openapitools.server.api.model.GetModelsOffersResponse;
import org.openapitools.server.api.model.GetModelsRequest;
import org.openapitools.server.api.model.GetModelsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SearchModelsResponse;
import org.openapitools.server.api.model.SortOrderType;

public final class ModelsApiException extends MainApiException {
    public ModelsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final ModelsApiException Models_getModel_200_Exception = new ModelsApiException(200, "Информация о модели.");
    public static final ModelsApiException Models_getModel_400_Exception = new ModelsApiException(400, "Запрос содержит неправильные данные.");
    public static final ModelsApiException Models_getModel_401_Exception = new ModelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ModelsApiException Models_getModel_403_Exception = new ModelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ModelsApiException Models_getModel_404_Exception = new ModelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ModelsApiException Models_getModel_420_Exception = new ModelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ModelsApiException Models_getModel_500_Exception = new ModelsApiException(500, "Внутренняя ошибка сервера.");
    public static final ModelsApiException Models_getModelOffers_200_Exception = new ModelsApiException(200, "Список предложений для модели.");
    public static final ModelsApiException Models_getModelOffers_400_Exception = new ModelsApiException(400, "Запрос содержит неправильные данные.");
    public static final ModelsApiException Models_getModelOffers_401_Exception = new ModelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ModelsApiException Models_getModelOffers_403_Exception = new ModelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ModelsApiException Models_getModelOffers_404_Exception = new ModelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ModelsApiException Models_getModelOffers_420_Exception = new ModelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ModelsApiException Models_getModelOffers_500_Exception = new ModelsApiException(500, "Внутренняя ошибка сервера.");
    public static final ModelsApiException Models_getModels_200_Exception = new ModelsApiException(200, "Информация о моделях.");
    public static final ModelsApiException Models_getModels_400_Exception = new ModelsApiException(400, "Запрос содержит неправильные данные.");
    public static final ModelsApiException Models_getModels_401_Exception = new ModelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ModelsApiException Models_getModels_403_Exception = new ModelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ModelsApiException Models_getModels_404_Exception = new ModelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ModelsApiException Models_getModels_420_Exception = new ModelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ModelsApiException Models_getModels_500_Exception = new ModelsApiException(500, "Внутренняя ошибка сервера.");
    public static final ModelsApiException Models_getModelsOffers_200_Exception = new ModelsApiException(200, "Список предложений для моделей.");
    public static final ModelsApiException Models_getModelsOffers_400_Exception = new ModelsApiException(400, "Запрос содержит неправильные данные.");
    public static final ModelsApiException Models_getModelsOffers_401_Exception = new ModelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ModelsApiException Models_getModelsOffers_403_Exception = new ModelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ModelsApiException Models_getModelsOffers_404_Exception = new ModelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ModelsApiException Models_getModelsOffers_420_Exception = new ModelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ModelsApiException Models_getModelsOffers_500_Exception = new ModelsApiException(500, "Внутренняя ошибка сервера.");
    public static final ModelsApiException Models_searchModels_200_Exception = new ModelsApiException(200, "Информация о моделях.");
    public static final ModelsApiException Models_searchModels_400_Exception = new ModelsApiException(400, "Запрос содержит неправильные данные.");
    public static final ModelsApiException Models_searchModels_401_Exception = new ModelsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final ModelsApiException Models_searchModels_403_Exception = new ModelsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final ModelsApiException Models_searchModels_404_Exception = new ModelsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final ModelsApiException Models_searchModels_420_Exception = new ModelsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final ModelsApiException Models_searchModels_500_Exception = new ModelsApiException(500, "Внутренняя ошибка сервера.");
    

}