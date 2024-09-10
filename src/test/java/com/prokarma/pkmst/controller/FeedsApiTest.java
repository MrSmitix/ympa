/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.FeedIndexLogsStatusType;
import com.prokarma.pkmst.model.GetFeedIndexLogsResponse;
import com.prokarma.pkmst.model.GetFeedResponse;
import com.prokarma.pkmst.model.GetFeedsResponse;
import java.time.OffsetDateTime;
import com.prokarma.pkmst.model.SetFeedParamsRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for FeedsApi
 */
@Ignore
public class FeedsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final FeedsApi api = new FeedsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Информация о прайс-листе
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFeedTest() throws Exception {
        Long campaignId = null;
        Long feedId = null;
    ResponseEntity<GetFeedResponse> response = api.getFeed(campaignId, feedId , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по индексации прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFeedIndexLogsTest() throws Exception {
        Long campaignId = null;
        Long feedId = null;
        Integer limit = null;
        OffsetDateTime publishedTimeFrom = null;
        OffsetDateTime publishedTimeTo = null;
        FeedIndexLogsStatusType status = null;
    ResponseEntity<GetFeedIndexLogsResponse> response = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status , accept);

        // TODO: test validations
    }
    
    /**
     * Список прайс-листов магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getFeedsTest() throws Exception {
        Long campaignId = null;
    ResponseEntity<GetFeedsResponse> response = api.getFeeds(campaignId , accept);

        // TODO: test validations
    }
    
    /**
     * Сообщить, что прайс-лист обновился
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void refreshFeedTest() throws Exception {
        Long campaignId = null;
        Long feedId = null;
    ResponseEntity<EmptyApiResponse> response = api.refreshFeed(campaignId, feedId , accept);

        // TODO: test validations
    }
    
    /**
     * Изменение параметров прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setFeedParamsTest() throws Exception {
        Long campaignId = null;
        Long feedId = null;
        SetFeedParamsRequest setFeedParamsRequest = null;
    ResponseEntity<EmptyApiResponse> response = api.setFeedParams(campaignId, feedId, setFeedParamsRequest , accept);

        // TODO: test validations
    }
    
}