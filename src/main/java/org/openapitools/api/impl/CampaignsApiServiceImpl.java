package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GetCampaignLoginsResponse;
import org.openapitools.model.GetCampaignRegionResponse;
import org.openapitools.model.GetCampaignResponse;
import org.openapitools.model.GetCampaignSettingsResponse;
import org.openapitools.model.GetCampaignsResponse;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
public class CampaignsApiServiceImpl implements CampaignsApi {
    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    public GetCampaignResponse getCampaign(Long campaignId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    public GetCampaignLoginsResponse getCampaignLogins(Long campaignId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     *
     */
    public GetCampaignRegionResponse getCampaignRegion(Long campaignId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    public GetCampaignSettingsResponse getCampaignSettings(Long campaignId) {
        // TODO: Implement...

        return null;
    }

    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    public GetCampaignsResponse getCampaigns(Integer page, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    public GetCampaignsResponse getCampaignsByLogin(String login, Integer page, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

}
