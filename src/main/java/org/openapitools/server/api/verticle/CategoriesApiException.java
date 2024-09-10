package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetCategoriesMaxSaleQuantumRequest;
import org.openapitools.server.api.model.GetCategoriesMaxSaleQuantumResponse;
import org.openapitools.server.api.model.GetCategoriesRequest;
import org.openapitools.server.api.model.GetCategoriesResponse;
import org.openapitools.server.api.MainApiException;

public final class CategoriesApiException extends MainApiException {
    public CategoriesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_200_Exception = new CategoriesApiException(200, "Лимит на установку кванта и минимального количества товаров.");
    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_400_Exception = new CategoriesApiException(400, "Запрос содержит неправильные данные.");
    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_401_Exception = new CategoriesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_403_Exception = new CategoriesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_404_Exception = new CategoriesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_420_Exception = new CategoriesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CategoriesApiException Categories_getCategoriesMaxSaleQuantum_500_Exception = new CategoriesApiException(500, "Внутренняя ошибка сервера.");
    public static final CategoriesApiException Categories_getCategoriesTree_200_Exception = new CategoriesApiException(200, "Категории Маркета.");
    public static final CategoriesApiException Categories_getCategoriesTree_400_Exception = new CategoriesApiException(400, "Запрос содержит неправильные данные.");
    public static final CategoriesApiException Categories_getCategoriesTree_401_Exception = new CategoriesApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CategoriesApiException Categories_getCategoriesTree_403_Exception = new CategoriesApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CategoriesApiException Categories_getCategoriesTree_404_Exception = new CategoriesApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CategoriesApiException Categories_getCategoriesTree_420_Exception = new CategoriesApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CategoriesApiException Categories_getCategoriesTree_500_Exception = new CategoriesApiException(500, "Внутренняя ошибка сервера.");
    

}