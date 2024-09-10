note
    description: "API tests for GOODSFEEDBACK_API"
    date: "$Date$"
    revision: "$Revision$"


class GOODSFEEDBACK_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_delete_goods_feedback_comment
            -- Удаление комментария к отзыву
            --
            -- Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_delete_goods_feedback_comment_request: DELETE_GOODS_FEEDBACK_COMMENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_goods_feedback_comment_request

            -- l_response := api.delete_goods_feedback_comment(l_business_id, l_delete_goods_feedback_comment_request)
            assert ("not_implemented", False)
        end

    test_goods_feedback_comments
            -- Получение комментариев к отзыву
            --
            -- Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_GOODS_FEEDBACK_COMMENTS_RESPONSE
            l_business_id: INTEGER_64
            l_get_goods_feedback_comments_request: GET_GOODS_FEEDBACK_COMMENTS_REQUEST
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_get_goods_feedback_comments_request

            -- l_response := api.goods_feedback_comments(l_business_id, l_get_goods_feedback_comments_request, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

    test_goods_feedbacks
            -- Получение отзывов о товарах продавца
            --
            -- Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в &#x60;page_token&#x60;, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: GET_GOODS_FEEDBACK_RESPONSE
            l_business_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_get_goods_feedback_request: GET_GOODS_FEEDBACK_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.goods_feedbacks(l_business_id, l_page_token, l_limit, l_get_goods_feedback_request)
            assert ("not_implemented", False)
        end

    test_skip_goods_feedbacks_reaction
            -- Отказ от ответа на отзывы
            --
            -- Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: EMPTY_API_RESPONSE
            l_business_id: INTEGER_64
            l_skip_goods_feedback_reaction_request: SKIP_GOODS_FEEDBACK_REACTION_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_skip_goods_feedback_reaction_request

            -- l_response := api.skip_goods_feedbacks_reaction(l_business_id, l_skip_goods_feedback_reaction_request)
            assert ("not_implemented", False)
        end

    test_update_goods_feedback_comment
            -- Добавление нового или изменение созданного комментария
            --
            -- Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва &#x60;feedbackId&#x60;.  Чтобы добавить комментарий к другому комментарию, передайте:  * &#x60;feedbackId&#x60; — идентификатор отзыва; * &#x60;comment.parentId&#x60; — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * &#x60;feedbackId&#x60;— идентификатор отзыва; * &#x60;comment.id&#x60; — идентификатор комментария, который нужно изменить.  Если передать одновременно &#x60;comment.parentId&#x60; и &#x60;comment.id&#x60;, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 
        local
            l_response: UPDATE_GOODS_FEEDBACK_COMMENT_RESPONSE
            l_business_id: INTEGER_64
            l_update_goods_feedback_comment_request: UPDATE_GOODS_FEEDBACK_COMMENT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_goods_feedback_comment_request

            -- l_response := api.update_goods_feedback_comment(l_business_id, l_update_goods_feedback_comment_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GOODSFEEDBACK_API
            -- Create an object instance of `GOODSFEEDBACK_API'.
        once
            create { GOODSFEEDBACK_API } Result
        end

end
