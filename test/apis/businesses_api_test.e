note
    description: "API tests for BUSINESSES_API"
    date: "$Date$"
    revision: "$Revision$"


class BUSINESSES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_business_settings
            -- Настройки кабинета
            --
            -- Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GET_BUSINESS_SETTINGS_RESPONSE
            l_business_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_settings(l_business_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BUSINESSES_API
            -- Create an object instance of `BUSINESSES_API'.
        once
            create { BUSINESSES_API } Result
        end

end
