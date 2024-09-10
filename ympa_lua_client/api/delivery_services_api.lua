--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

--package ympa_lua_client

local http_request = require "http.request"
local http_util = require "http.util"
local dkjson = require "dkjson"
local basexx = require "basexx"

-- model import
local ympa_lua_client_api_client_data_error_response = require "ympa_lua_client.model.api_client_data_error_response"
local ympa_lua_client_api_forbidden_error_response = require "ympa_lua_client.model.api_forbidden_error_response"
local ympa_lua_client_api_limit_error_response = require "ympa_lua_client.model.api_limit_error_response"
local ympa_lua_client_api_not_found_error_response = require "ympa_lua_client.model.api_not_found_error_response"
local ympa_lua_client_api_server_error_response = require "ympa_lua_client.model.api_server_error_response"
local ympa_lua_client_api_unauthorized_error_response = require "ympa_lua_client.model.api_unauthorized_error_response"
local ympa_lua_client_get_delivery_services_response = require "ympa_lua_client.model.get_delivery_services_response"

local delivery_services_api = {}
local delivery_services_api_mt = {
	__name = "delivery_services_api";
	__index = delivery_services_api;
}

local function new_delivery_services_api(authority, basePath, schemes)
	local schemes_map = {}
	for _,v in ipairs(schemes) do
		schemes_map[v] = v
	end
	local default_scheme = schemes_map.https or schemes_map.http
	local host, port = http_util.split_authority(authority, default_scheme)
	return setmetatable({
		host = host;
		port = port;
		basePath = basePath or "https://api.partner.market.yandex.ru";
		schemes = schemes_map;
		default_scheme = default_scheme;
		http_username = nil;
		http_password = nil;
		api_key = {};
		access_token = nil;
	}, delivery_services_api_mt)
end

function delivery_services_api:get_delivery_services()
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/delivery/services",
			self.basePath);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return ympa_lua_client_get_delivery_services_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

return {
	new = new_delivery_services_api;
}
