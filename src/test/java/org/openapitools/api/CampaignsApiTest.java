package org.openapitools.api;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for CampaignsApi
 */
@MicronautTest
public class CampaignsApiTest {

    @Inject
    CampaignsApi api;

    
    /**
     * Информация о магазине
     *
     * Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignResponse body = api.getCampaign(campaignId).block();

        // then
        // TODO implement the getCampaignTest()
    }

    
    /**
     * Логины, связанные с магазином
     *
     * Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignLoginsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignLoginsResponse body = api.getCampaignLogins(campaignId).block();

        // then
        // TODO implement the getCampaignLoginsTest()
    }

    
    /**
     * Регион магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignRegionTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignRegionResponse body = api.getCampaignRegion(campaignId).block();

        // then
        // TODO implement the getCampaignRegionTest()
    }

    
    /**
     * Настройки магазина
     *
     * Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignSettingsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetCampaignSettingsResponse body = api.getCampaignSettings(campaignId).block();

        // then
        // TODO implement the getCampaignSettingsTest()
    }

    
    /**
     * Список магазинов пользователя
     *
     * Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignsTest() {
        // given
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetCampaignsResponse body = api.getCampaigns(page, pageSize).block();

        // then
        // TODO implement the getCampaignsTest()
    }

    
    /**
     * Магазины, доступные логину
     *
     * Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getCampaignsByLoginTest() {
        // given
        String login = "example";
        Integer page = 1;
        Integer pageSize = 56;

        // when
        GetCampaignsResponse body = api.getCampaignsByLogin(login, page, pageSize).block();

        // then
        // TODO implement the getCampaignsByLoginTest()
    }

    
}
