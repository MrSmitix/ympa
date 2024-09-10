/**
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


package org.openapitools.client.api;

import org.openapitools.client.model.ApiClientDataErrorResponse;
import org.openapitools.client.model.ApiForbiddenErrorResponse;
import org.openapitools.client.model.ApiLimitErrorResponse;
import org.openapitools.client.model.ApiNotFoundErrorResponse;
import org.openapitools.client.model.ApiServerErrorResponse;
import org.openapitools.client.model.ApiUnauthorizedErrorResponse;
import org.openapitools.client.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.client.model.EmptyApiResponse;
import org.openapitools.client.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.client.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.client.model.GetGoodsFeedbackRequest;
import org.openapitools.client.model.GetGoodsFeedbackResponse;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.openapitools.client.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.client.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.client.model.UpdateGoodsFeedbackCommentResponse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Партнерский API Маркета Test
 *
 * API tests for GoodsFeedbackApi
 */
public class GoodsFeedbackApiTest {

    private static GoodsFeedbackApi client;
    private static final String baseUrl = "http://localhost:8080";

    @BeforeAll
    public static void setup() throws MalformedURLException {
        client = RestClientBuilder.newBuilder()
                        .baseUrl(new URL(baseUrl))
                        .register(ApiException.class)
                        .build(GoodsFeedbackApi.class);
    }

    
    /**
     * Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGoodsFeedbackCommentTest() throws Exception {
        //EmptyApiResponse response = client.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest);
        //assertNotNull(response);
    }
    
    /**
     * Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGoodsFeedbackCommentsTest() throws Exception {
        //GetGoodsFeedbackCommentsResponse response = client.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit);
        //assertNotNull(response);
    }
    
    /**
     * Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGoodsFeedbacksTest() throws Exception {
        //GetGoodsFeedbackResponse response = client.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest);
        //assertNotNull(response);
    }
    
    /**
     * Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void skipGoodsFeedbacksReactionTest() throws Exception {
        //EmptyApiResponse response = client.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest);
        //assertNotNull(response);
    }
    
    /**
     * Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGoodsFeedbackCommentTest() throws Exception {
        //UpdateGoodsFeedbackCommentResponse response = client.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest);
        //assertNotNull(response);
    }
    
}