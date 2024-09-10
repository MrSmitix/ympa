--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- outlet_response_dto class
local outlet_response_dto = {}
local outlet_response_dto_mt = {
	__name = "outlet_response_dto";
	__index = outlet_response_dto;
}

local function cast_outlet_response_dto(t)
	return setmetatable(t, outlet_response_dto_mt)
end

local function new_outlet_response_dto(id)
	return cast_outlet_response_dto({
		["id"] = id;
	})
end

return {
	cast = cast_outlet_response_dto;
	new = new_outlet_response_dto;
}
