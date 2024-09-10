package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiClientDataErrorResponse;
import org.openapitools.server.api.model.ApiForbiddenErrorResponse;
import org.openapitools.server.api.model.ApiLimitErrorResponse;
import org.openapitools.server.api.model.ApiNotFoundErrorResponse;
import org.openapitools.server.api.model.ApiServerErrorResponse;
import org.openapitools.server.api.model.ApiUnauthorizedErrorResponse;
import org.openapitools.server.api.model.GetCampaignLoginsResponse;
import org.openapitools.server.api.model.GetCampaignRegionResponse;
import org.openapitools.server.api.model.GetCampaignResponse;
import org.openapitools.server.api.model.GetCampaignSettingsResponse;
import org.openapitools.server.api.model.GetCampaignsResponse;
import org.openapitools.server.api.MainApiException;

public final class CampaignsApiException extends MainApiException {
    public CampaignsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final CampaignsApiException Campaigns_getCampaign_200_Exception = new CampaignsApiException(200, "Информация о магазине.");
    public static final CampaignsApiException Campaigns_getCampaign_400_Exception = new CampaignsApiException(400, "Запрос содержит неправильные данные.");
    public static final CampaignsApiException Campaigns_getCampaign_401_Exception = new CampaignsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CampaignsApiException Campaigns_getCampaign_403_Exception = new CampaignsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CampaignsApiException Campaigns_getCampaign_404_Exception = new CampaignsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CampaignsApiException Campaigns_getCampaign_420_Exception = new CampaignsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CampaignsApiException Campaigns_getCampaign_500_Exception = new CampaignsApiException(500, "Внутренняя ошибка сервера.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_200_Exception = new CampaignsApiException(200, "Список логинов, связанных с магазином.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_400_Exception = new CampaignsApiException(400, "Запрос содержит неправильные данные.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_401_Exception = new CampaignsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_403_Exception = new CampaignsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_404_Exception = new CampaignsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_420_Exception = new CampaignsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CampaignsApiException Campaigns_getCampaignLogins_500_Exception = new CampaignsApiException(500, "Внутренняя ошибка сервера.");
    public static final CampaignsApiException Campaigns_getCampaignRegion_200_Exception = new CampaignsApiException(200, "Возвращает регион, в котором находится магазин.  |**⚙️ Лимит:** 1000 запросов в час| |-| ");
    public static final CampaignsApiException Campaigns_getCampaignRegion_400_Exception = new CampaignsApiException(400, "Запрос содержит неправильные данные.");
    public static final CampaignsApiException Campaigns_getCampaignRegion_401_Exception = new CampaignsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CampaignsApiException Campaigns_getCampaignRegion_403_Exception = new CampaignsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CampaignsApiException Campaigns_getCampaignRegion_404_Exception = new CampaignsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CampaignsApiException Campaigns_getCampaignRegion_420_Exception = new CampaignsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CampaignsApiException Campaigns_getCampaignRegion_500_Exception = new CampaignsApiException(500, "Внутренняя ошибка сервера.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_200_Exception = new CampaignsApiException(200, "Настройки магазина.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_400_Exception = new CampaignsApiException(400, "Запрос содержит неправильные данные.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_401_Exception = new CampaignsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_403_Exception = new CampaignsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_404_Exception = new CampaignsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_420_Exception = new CampaignsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CampaignsApiException Campaigns_getCampaignSettings_500_Exception = new CampaignsApiException(500, "Внутренняя ошибка сервера.");
    public static final CampaignsApiException Campaigns_getCampaigns_200_Exception = new CampaignsApiException(200, "Магазины пользователя.");
    public static final CampaignsApiException Campaigns_getCampaigns_400_Exception = new CampaignsApiException(400, "Запрос содержит неправильные данные.");
    public static final CampaignsApiException Campaigns_getCampaigns_401_Exception = new CampaignsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CampaignsApiException Campaigns_getCampaigns_403_Exception = new CampaignsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CampaignsApiException Campaigns_getCampaigns_404_Exception = new CampaignsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CampaignsApiException Campaigns_getCampaigns_420_Exception = new CampaignsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CampaignsApiException Campaigns_getCampaigns_500_Exception = new CampaignsApiException(500, "Внутренняя ошибка сервера.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_200_Exception = new CampaignsApiException(200, "Информация о магазинах.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_400_Exception = new CampaignsApiException(400, "Запрос содержит неправильные данные.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_401_Exception = new CampaignsApiException(401, "В запросе не указаны данные для авторизации.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_403_Exception = new CampaignsApiException(403, "Данные для авторизации неверны или доступ к ресурсу запрещен.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_404_Exception = new CampaignsApiException(404, "Запрашиваемый ресурс не найден.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_420_Exception = new CampaignsApiException(420, "Превышено ограничение на доступ к ресурсу.");
    public static final CampaignsApiException Campaigns_getCampaignsByLogin_500_Exception = new CampaignsApiException(500, "Внутренняя ошибка сервера.");
    

}