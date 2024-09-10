# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


function get_order_business_buyer_info_read(handler)
    function get_order_business_buyer_info_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["campaignId"] = OpenAPI.Servers.to_param(Int64, path_params, "campaignId", required=true, )
        openapi_params["orderId"] = OpenAPI.Servers.to_param(Int64, path_params, "orderId", required=true, )
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_order_business_buyer_info_validate(handler)
    function get_order_business_buyer_info_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_order_business_buyer_info_invoke(impl; post_invoke=nothing)
    function get_order_business_buyer_info_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_order_business_buyer_info(req::HTTP.Request, openapi_params["campaignId"], openapi_params["orderId"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end

function get_order_business_documents_info_read(handler)
    function get_order_business_documents_info_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["campaignId"] = OpenAPI.Servers.to_param(Int64, path_params, "campaignId", required=true, )
        openapi_params["orderId"] = OpenAPI.Servers.to_param(Int64, path_params, "orderId", required=true, )
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_order_business_documents_info_validate(handler)
    function get_order_business_documents_info_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_order_business_documents_info_invoke(impl; post_invoke=nothing)
    function get_order_business_documents_info_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_order_business_documents_info(req::HTTP.Request, openapi_params["campaignId"], openapi_params["orderId"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end


function registerOrderBusinessInformationApi(router::HTTP.Router, impl; path_prefix::String="", optional_middlewares...)
    HTTP.register!(router, "POST", path_prefix * "/campaigns/{campaignId}/orders/{orderId}/business-buyer", OpenAPI.Servers.middleware(impl, get_order_business_buyer_info_read, get_order_business_buyer_info_validate, get_order_business_buyer_info_invoke; optional_middlewares...))
    HTTP.register!(router, "POST", path_prefix * "/campaigns/{campaignId}/orders/{orderId}/documents", OpenAPI.Servers.middleware(impl, get_order_business_documents_info_read, get_order_business_documents_info_validate, get_order_business_documents_info_invoke; optional_middlewares...))
    return router
end
