# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


function delete_promo_offers_read(handler)
    function delete_promo_offers_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["businessId"] = OpenAPI.Servers.to_param(Int64, path_params, "businessId", required=true, )
        openapi_params["DeletePromoOffersRequest"] = OpenAPI.Servers.to_param_type(DeletePromoOffersRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function delete_promo_offers_validate(handler)
    function delete_promo_offers_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function delete_promo_offers_invoke(impl; post_invoke=nothing)
    function delete_promo_offers_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.delete_promo_offers(req::HTTP.Request, openapi_params["businessId"], openapi_params["DeletePromoOffersRequest"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function get_promo_offers_read(handler)
    function get_promo_offers_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["businessId"] = OpenAPI.Servers.to_param(Int64, path_params, "businessId", required=true, )
        query_params = HTTP.queryparams(URIs.URI(req.target))
        openapi_params["page_token"] = OpenAPI.Servers.to_param(String, query_params, "page_token", style="", is_explode=false)
        openapi_params["limit"] = OpenAPI.Servers.to_param(Int64, query_params, "limit", style="", is_explode=false)
        openapi_params["GetPromoOffersRequest"] = OpenAPI.Servers.to_param_type(GetPromoOffersRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_promo_offers_validate(handler)
    function get_promo_offers_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_promo_offers_invoke(impl; post_invoke=nothing)
    function get_promo_offers_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_promo_offers(req::HTTP.Request, openapi_params["businessId"], openapi_params["GetPromoOffersRequest"]; page_token=get(openapi_params, "page_token", nothing), limit=get(openapi_params, "limit", nothing),)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function get_promos_read(handler)
    function get_promos_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["businessId"] = OpenAPI.Servers.to_param(Int64, path_params, "businessId", required=true, )
        openapi_params["GetPromosRequest"] = OpenAPI.Servers.to_param_type(GetPromosRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_promos_validate(handler)
    function get_promos_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_promos_invoke(impl; post_invoke=nothing)
    function get_promos_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_promos(req::HTTP.Request, openapi_params["businessId"]; get_promos_request=get(openapi_params, "GetPromosRequest", nothing),)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function update_promo_offers_read(handler)
    function update_promo_offers_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["businessId"] = OpenAPI.Servers.to_param(Int64, path_params, "businessId", required=true, )
        openapi_params["UpdatePromoOffersRequest"] = OpenAPI.Servers.to_param_type(UpdatePromoOffersRequest, String(req.body))
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function update_promo_offers_validate(handler)
    function update_promo_offers_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function update_promo_offers_invoke(impl; post_invoke=nothing)
    function update_promo_offers_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.update_promo_offers(req::HTTP.Request, openapi_params["businessId"], openapi_params["UpdatePromoOffersRequest"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end


function registerPromosApi(router::HTTP.Router, impl; path_prefix::String="", optional_middlewares...)
    HTTP.register!(router, "POST", path_prefix * "/businesses/{businessId}/promos/offers/delete", OpenAPI.Servers.middleware(impl, delete_promo_offers_read, delete_promo_offers_validate, delete_promo_offers_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/businesses/{businessId}/promos/offers", OpenAPI.Servers.middleware(impl, get_promo_offers_read, get_promo_offers_validate, get_promo_offers_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/businesses/{businessId}/promos", OpenAPI.Servers.middleware(impl, get_promos_read, get_promos_validate, get_promos_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/businesses/{businessId}/promos/offers/update", OpenAPI.Servers.middleware(impl, update_promo_offers_read, update_promo_offers_validate, update_promo_offers_invoke; optional_middlewares...))
    return router
end
