note
    description: "API tests for REGIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class REGIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_search_region_children
            -- Информация о дочерних регионах
            --
            -- Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
        local
            l_response: GET_REGION_WITH_CHILDREN_RESPONSE
            l_region_id: INTEGER_64
            l_page: INTEGER_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_region_id

            -- l_response := api.search_region_children(l_region_id, l_page, l_page_size)
            assert ("not_implemented", False)
        end

    test_search_regions_by_id
            -- Информация о регионе
            --
            -- Возвращает информацию о регионе.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
        local
            l_response: GET_REGIONS_RESPONSE
            l_region_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_region_id

            -- l_response := api.search_regions_by_id(l_region_id)
            assert ("not_implemented", False)
        end

    test_search_regions_by_name
            -- Поиск регионов по их имени
            --
            -- Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов &#x60;GET regions&#x60;, &#x60;GET regions/{regionId}&#x60; и &#x60;GET regions/{regionId}/children&#x60; действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 
        local
            l_response: GET_REGIONS_RESPONSE
            l_name: STRING_32
            l_page_token: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_name

            -- l_response := api.search_regions_by_name(l_name, l_page_token, l_limit)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: REGIONS_API
            -- Create an object instance of `REGIONS_API'.
        once
            create { REGIONS_API } Result
        end

end
