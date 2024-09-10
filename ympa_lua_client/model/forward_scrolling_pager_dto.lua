--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- forward_scrolling_pager_dto class
local forward_scrolling_pager_dto = {}
local forward_scrolling_pager_dto_mt = {
	__name = "forward_scrolling_pager_dto";
	__index = forward_scrolling_pager_dto;
}

local function cast_forward_scrolling_pager_dto(t)
	return setmetatable(t, forward_scrolling_pager_dto_mt)
end

local function new_forward_scrolling_pager_dto(next_page_token)
	return cast_forward_scrolling_pager_dto({
		["nextPageToken"] = next_page_token;
	})
end

return {
	cast = cast_forward_scrolling_pager_dto;
	new = new_forward_scrolling_pager_dto;
}
