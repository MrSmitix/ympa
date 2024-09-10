package org.openapitools.api;

import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.DeleteGoodsFeedbackCommentRequest;
import org.openapitools.model.EmptyApiResponse;
import org.openapitools.model.GetGoodsFeedbackCommentsRequest;
import org.openapitools.model.GetGoodsFeedbackCommentsResponse;
import org.openapitools.model.GetGoodsFeedbackRequest;
import org.openapitools.model.GetGoodsFeedbackResponse;
import org.openapitools.model.SkipGoodsFeedbackReactionRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentRequest;
import org.openapitools.model.UpdateGoodsFeedbackCommentResponse;
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
 * API tests for GoodsFeedbackApi
 */
@MicronautTest
public class GoodsFeedbackApiTest {

    @Inject
    GoodsFeedbackApi api;

    
    /**
     * Удаление комментария к отзыву
     *
     * Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void deleteGoodsFeedbackCommentTest() {
        // given
        Long businessId = 56L;
        DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest = new DeleteGoodsFeedbackCommentRequest(56L);

        // when
        EmptyApiResponse body = api.deleteGoodsFeedbackComment(businessId, deleteGoodsFeedbackCommentRequest).block();

        // then
        // TODO implement the deleteGoodsFeedbackCommentTest()
    }

    
    /**
     * Получение комментариев к отзыву
     *
     * Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getGoodsFeedbackCommentsTest() {
        // given
        Long businessId = 56L;
        GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest = new GetGoodsFeedbackCommentsRequest(56L);
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;

        // when
        GetGoodsFeedbackCommentsResponse body = api.getGoodsFeedbackComments(businessId, getGoodsFeedbackCommentsRequest, pageToken, limit).block();

        // then
        // TODO implement the getGoodsFeedbackCommentsTest()
    }

    
    /**
     * Получение отзывов о товарах продавца
     *
     * Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getGoodsFeedbacksTest() {
        // given
        Long businessId = 56L;
        String pageToken = "eyBuZXh0SWQ6IDIzNDIgfQ==";
        Integer limit = 20;
        GetGoodsFeedbackRequest getGoodsFeedbackRequest = new GetGoodsFeedbackRequest();

        // when
        GetGoodsFeedbackResponse body = api.getGoodsFeedbacks(businessId, pageToken, limit, getGoodsFeedbackRequest).block();

        // then
        // TODO implement the getGoodsFeedbacksTest()
    }

    
    /**
     * Отказ от ответа на отзывы
     *
     * Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void skipGoodsFeedbacksReactionTest() {
        // given
        Long businessId = 56L;
        SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest = new SkipGoodsFeedbackReactionRequest(new HashSet<>());

        // when
        EmptyApiResponse body = api.skipGoodsFeedbacksReaction(businessId, skipGoodsFeedbackReactionRequest).block();

        // then
        // TODO implement the skipGoodsFeedbacksReactionTest()
    }

    
    /**
     * Добавление нового или изменение созданного комментария
     *
     * Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void updateGoodsFeedbackCommentTest() {
        // given
        Long businessId = 56L;
        UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest = new UpdateGoodsFeedbackCommentRequest(56L, null);

        // when
        UpdateGoodsFeedbackCommentResponse body = api.updateGoodsFeedbackComment(businessId, updateGoodsFeedbackCommentRequest).block();

        // then
        // TODO implement the updateGoodsFeedbackCommentTest()
    }

    
}
