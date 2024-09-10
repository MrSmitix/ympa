package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.EmptyApiResponse;
import org.openapitools.server.api.model.GetOrderBuyerInfoResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SetOrderDeliveryDateRequest;
import org.openapitools.server.api.model.SetOrderDeliveryTrackCodeRequest;
import org.openapitools.server.api.model.UpdateOrderStorageLimitRequest;
import org.openapitools.server.api.model.VerifyOrderEacRequest;
import org.openapitools.server.api.model.VerifyOrderEacResponse;

public final class OrderDeliveryApiException extends MainApiException {
    public OrderDeliveryApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_200_Exception = new OrderDeliveryApiException(200, "Информация о покупателе.");
    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_400_Exception = new OrderDeliveryApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_401_Exception = new OrderDeliveryApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_403_Exception = new OrderDeliveryApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_404_Exception = new OrderDeliveryApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_420_Exception = new OrderDeliveryApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderDeliveryApiException OrderDelivery_getOrderBuyerInfo_500_Exception = new OrderDeliveryApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_200_Exception = new OrderDeliveryApiException(200, "Успешное изменение даты доставки.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_400_Exception = new OrderDeliveryApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_401_Exception = new OrderDeliveryApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_403_Exception = new OrderDeliveryApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_404_Exception = new OrderDeliveryApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_420_Exception = new OrderDeliveryApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryDate_500_Exception = new OrderDeliveryApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_200_Exception = new OrderDeliveryApiException(200, "Трек‑номер посылки и идентификатор службы доставки были успешно переданы.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_400_Exception = new OrderDeliveryApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_401_Exception = new OrderDeliveryApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_403_Exception = new OrderDeliveryApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_404_Exception = new OrderDeliveryApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_420_Exception = new OrderDeliveryApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderDeliveryApiException OrderDelivery_setOrderDeliveryTrackCode_500_Exception = new OrderDeliveryApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_200_Exception = new OrderDeliveryApiException(200, "Пустой ответ.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_400_Exception = new OrderDeliveryApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_401_Exception = new OrderDeliveryApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_403_Exception = new OrderDeliveryApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_404_Exception = new OrderDeliveryApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_420_Exception = new OrderDeliveryApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderDeliveryApiException OrderDelivery_updateOrderStorageLimit_500_Exception = new OrderDeliveryApiException(500, "Внутренняя ошибка сервера.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_200_Exception = new OrderDeliveryApiException(200, "Проверка кода выполнена успешно.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_400_Exception = new OrderDeliveryApiException(400, "Запрос содержит неправильные данные.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_401_Exception = new OrderDeliveryApiException(401, "В запросе не указаны данные для авторизации.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_403_Exception = new OrderDeliveryApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_404_Exception = new OrderDeliveryApiException(404, "Запрашиваемый ресурс не найден.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_420_Exception = new OrderDeliveryApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final OrderDeliveryApiException OrderDelivery_verifyOrderEac_500_Exception = new OrderDeliveryApiException(500, "Внутренняя ошибка сервера.");
    

}