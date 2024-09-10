--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_quarantine_offers_result_dto class
local get_quarantine_offers_result_dto = {}
local get_quarantine_offers_result_dto_mt = {
	__name = "get_quarantine_offers_result_dto";
	__index = get_quarantine_offers_result_dto;
}

local function cast_get_quarantine_offers_result_dto(t)
	return setmetatable(t, get_quarantine_offers_result_dto_mt)
end

local function new_get_quarantine_offers_result_dto(paging, offers)
	return cast_get_quarantine_offers_result_dto({
		["paging"] = paging;
		["offers"] = offers;
	})
end

return {
	cast = cast_get_quarantine_offers_result_dto;
	new = new_get_quarantine_offers_result_dto;
}
