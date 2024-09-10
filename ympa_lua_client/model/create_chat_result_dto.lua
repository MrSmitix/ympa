--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- create_chat_result_dto class
local create_chat_result_dto = {}
local create_chat_result_dto_mt = {
	__name = "create_chat_result_dto";
	__index = create_chat_result_dto;
}

local function cast_create_chat_result_dto(t)
	return setmetatable(t, create_chat_result_dto_mt)
end

local function new_create_chat_result_dto(chat_id)
	return cast_create_chat_result_dto({
		["chatId"] = chat_id;
	})
end

return {
	cast = cast_create_chat_result_dto;
	new = new_create_chat_result_dto;
}
