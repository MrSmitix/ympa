package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetBusinessBuyerInfoResponse;
import org.openapitools.server.api.model.GetBusinessDocumentsInfoResponse;
import org.openapitools.server.api.MainApiException;

public final class OrderBusinessInformationApiException extends MainApiException {
    public OrderBusinessInformationApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_200_Exception = new OrderBusinessInformationApiException(200, "Информация о покупателе.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_400_Exception = new OrderBusinessInformationApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_401_Exception = new OrderBusinessInformationApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_403_Exception = new OrderBusinessInformationApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_404_Exception = new OrderBusinessInformationApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_420_Exception = new OrderBusinessInformationApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessBuyerInfo_500_Exception = new OrderBusinessInformationApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_200_Exception = new OrderBusinessInformationApiException(200, "Информация о документах.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_400_Exception = new OrderBusinessInformationApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_401_Exception = new OrderBusinessInformationApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_403_Exception = new OrderBusinessInformationApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_404_Exception = new OrderBusinessInformationApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_420_Exception = new OrderBusinessInformationApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderBusinessInformationApiException OrderBusinessInformation_getOrderBusinessDocumentsInfo_500_Exception = new OrderBusinessInformationApiException(500, "Внутренняя ошибка сервера.");
    

}