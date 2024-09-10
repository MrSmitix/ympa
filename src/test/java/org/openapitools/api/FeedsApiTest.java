package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiLockedErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.FeedIndexLogsStatusType;
import org.openapitools.model.GetFeedIndexLogsResponse;
import org.openapitools.model.GetFeedResponse;
import org.openapitools.model.GetFeedsResponse;
import java.time.OffsetDateTime;
import org.openapitools.model.SetFeedParamsRequest;
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
 * API tests for FeedsApi
 */
@MicronautTest
public class FeedsApiTest {

    @Inject
    FeedsApi api;

    
    /**
     * Информация о прайс-листе
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;

        // when
        GetFeedResponse body = api.getFeed(campaignId, feedId).block();

        // then
        // TODO implement the getFeedTest()
    }

    
    /**
     * Отчет по индексации прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра &#x60;generationId&#x60;.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedIndexLogsTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;
        Integer limit = 20;
        OffsetDateTime publishedTimeFrom = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        OffsetDateTime publishedTimeTo = OffsetDateTime.of(2001, 2, 3, 12, 0, 0, 0, java.time.ZoneOffset.of("+02:00"));
        FeedIndexLogsStatusType status = FeedIndexLogsStatusType.fromValue("ERROR");

        // when
        GetFeedIndexLogsResponse body = api.getFeedIndexLogs(campaignId, feedId, limit, publishedTimeFrom, publishedTimeTo, status).block();

        // then
        // TODO implement the getFeedIndexLogsTest()
    }

    
    /**
     * Список прайс-листов магазина
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getFeedsTest() {
        // given
        Long campaignId = 56L;

        // when
        GetFeedsResponse body = api.getFeeds(campaignId).block();

        // then
        // TODO implement the getFeedsTest()
    }

    
    /**
     * Сообщить, что прайс-лист обновился
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом &#x60;POST campaigns/{campaignId}/feeds/{feedId}/refresh&#x60;. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — &#x60;200 OK&#x60;. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void refreshFeedTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;

        // when
        EmptyApiResponse body = api.refreshFeed(campaignId, feedId).block();

        // then
        // TODO implement the refreshFeedTest()
    }

    
    /**
     * Изменение параметров прайс-листа
     *
     * {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;value&#x60; (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: &#x60;name&#x60; (название параметра) и &#x60;delete&#x3D;true&#x60; (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void setFeedParamsTest() {
        // given
        Long campaignId = 56L;
        Long feedId = 56L;
        SetFeedParamsRequest setFeedParamsRequest = new SetFeedParamsRequest(Arrays.asList());

        // when
        EmptyApiResponse body = api.setFeedParams(campaignId, feedId, setFeedParamsRequest).block();

        // then
        // TODO implement the setFeedParamsTest()
    }

    
}
