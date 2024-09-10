# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


function get_prices_read(handler)
    function get_prices_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["campaignId"] = OpenAPI.Servers.to_param(Int64, path_params, "campaignId", required=true, )
        query_params = HTTP.queryparams(URIs.URI(req.target))
        openapi_params["page_token"] = OpenAPI.Servers.to_param(String, query_params, "page_token", style="", is_explode=false)
        openapi_params["limit"] = OpenAPI.Servers.to_param(Int64, query_params, "limit", style="", is_explode=false)
        openapi_params["archived"] = OpenAPI.Servers.to_param(Bool, query_params, "archived", style="", is_explode=false)
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_prices_validate(handler)
    function get_prices_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_prices_invoke(impl; post_invoke=nothing)
    function get_prices_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_prices(req::HTTP.Request, openapi_params["campaignId"]; page_token=get(openapi_params, "page_token", nothing), limit=get(openapi_params, "limit", nothing), archived=get(openapi_params, "archived", nothing),)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function get_prices_by_offer_ids_read(handler)
    function get_prices_by_offer_ids_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["campaignId"] = OpenAPI.Servers.to_param(Int64, path_params, "campaignId", required=true, )
        query_params = HTTP.queryparams(URIs.URI(req.target))
        openapi_params["page_token"] = OpenAPI.Servers.to_param(String, query_params, "page_token", style="", is_explode=false)
        openapi_params["limit"] = OpenAPI.Servers.to_param(Int64, query_params, "limit", style="", is_explode=false)
        openapi_params["GetPricesByOfferIdsRequest"] = OpenAPI.Servers.to_param_type(GetPricesByOfferIdsRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_prices_by_offer_ids_validate(handler)
    function get_prices_by_offer_ids_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_prices_by_offer_ids_invoke(impl; post_invoke=nothing)
    function get_prices_by_offer_ids_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_prices_by_offer_ids(req::HTTP.Request, openapi_params["campaignId"]; page_token=get(openapi_params, "page_token", nothing), limit=get(openapi_params, "limit", nothing), get_prices_by_offer_ids_request=get(openapi_params, "GetPricesByOfferIdsRequest", nothing),)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function get_suggested_prices_read(handler)
    function get_suggested_prices_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["campaignId"] = OpenAPI.Servers.to_param(Int64, path_params, "campaignId", required=true, )
        openapi_params["SuggestPricesRequest"] = OpenAPI.Servers.to_param_type(SuggestPricesRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_suggested_prices_validate(handler)
    function get_suggested_prices_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_suggested_prices_invoke(impl; post_invoke=nothing)
    function get_suggested_prices_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_suggested_prices(req::HTTP.Request, openapi_params["campaignId"], openapi_params["SuggestPricesRequest"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function update_business_prices_read(handler)
    function update_business_prices_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["businessId"] = OpenAPI.Servers.to_param(Int64, path_params, "businessId", required=true, )
        openapi_params["UpdateBusinessPricesRequest"] = OpenAPI.Servers.to_param_type(UpdateBusinessPricesRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function update_business_prices_validate(handler)
    function update_business_prices_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function update_business_prices_invoke(impl; post_invoke=nothing)
    function update_business_prices_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.update_business_prices(req::HTTP.Request, openapi_params["businessId"], openapi_params["UpdateBusinessPricesRequest"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function update_prices_read(handler)
    function update_prices_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["campaignId"] = OpenAPI.Servers.to_param(Int64, path_params, "campaignId", required=true, )
        openapi_params["UpdatePricesRequest"] = OpenAPI.Servers.to_param_type(UpdatePricesRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function update_prices_validate(handler)
    function update_prices_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function update_prices_invoke(impl; post_invoke=nothing)
    function update_prices_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.update_prices(req::HTTP.Request, openapi_params["campaignId"], openapi_params["UpdatePricesRequest"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end


function registerPricesApi(router::HTTP.Router, impl; path_prefix::String="", optional_middlewares...)
    HTTP.register!(router, "GET", path_prefix * "/campaigns/{campaignId}/offer-prices", OpenAPI.Servers.middleware(impl, get_prices_read, get_prices_validate, get_prices_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/campaigns/{campaignId}/offer-prices", OpenAPI.Servers.middleware(impl, get_prices_by_offer_ids_read, get_prices_by_offer_ids_validate, get_prices_by_offer_ids_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/campaigns/{campaignId}/offer-prices/suggestions", OpenAPI.Servers.middleware(impl, get_suggested_prices_read, get_suggested_prices_validate, get_suggested_prices_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/businesses/{businessId}/offer-prices/updates", OpenAPI.Servers.middleware(impl, update_business_prices_read, update_business_prices_validate, update_business_prices_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/campaigns/{campaignId}/offer-prices/updates", OpenAPI.Servers.middleware(impl, update_prices_read, update_prices_validate, update_prices_invoke; optional_middlewares...))
    return router
end
