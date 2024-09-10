note
    description: "API tests for FEEDBACKS_API"
    date: "$Date$"
    revision: "$Revision$"


class FEEDBACKS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_feedback_and_comment_updates
            -- Новые и обновленные отзывы о магазине
            --
            -- {% note warning \&quot;\&quot; %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает новые и обновленные отзывы о магазине на Маркете.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов. Выходные данные содержат идентификатор следующей страницы.  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GET_FEEDBACK_LIST_RESPONSE
            l_campaign_id: INTEGER_64
            l_page_token: STRING_32
            l_limit: INTEGER_32
            l_from_date: DATE
        do
            -- TODO: Initialize required params.
            -- l_campaign_id

            -- l_response := api.feedback_and_comment_updates(l_campaign_id, l_page_token, l_limit, l_from_date)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: FEEDBACKS_API
            -- Create an object instance of `FEEDBACKS_API'.
        once
            create { FEEDBACKS_API } Result
        end

end
