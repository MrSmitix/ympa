--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- goods_feedback_identifiers_dto class
local goods_feedback_identifiers_dto = {}
local goods_feedback_identifiers_dto_mt = {
	__name = "goods_feedback_identifiers_dto";
	__index = goods_feedback_identifiers_dto;
}

local function cast_goods_feedback_identifiers_dto(t)
	return setmetatable(t, goods_feedback_identifiers_dto_mt)
end

local function new_goods_feedback_identifiers_dto(order_id, model_id)
	return cast_goods_feedback_identifiers_dto({
		["orderId"] = order_id;
		["modelId"] = model_id;
	})
end

return {
	cast = cast_goods_feedback_identifiers_dto;
	new = new_goods_feedback_identifiers_dto;
}
