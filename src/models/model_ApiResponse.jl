# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""ApiResponse
Стандартная обертка для ответов сервера.

    ApiResponse(;
        status=nothing,
    )

    - status::ApiResponseStatusType
"""
Base.@kwdef mutable struct ApiResponse <: OpenAPI.APIModel
    status = nothing # spec type: Union{ Nothing, ApiResponseStatusType }

    function ApiResponse(status, )
        OpenAPI.validate_property(ApiResponse, Symbol("status"), status)
        return new(status, )
    end
end # type ApiResponse

const _property_types_ApiResponse = Dict{Symbol,String}(Symbol("status")=>"ApiResponseStatusType", )
OpenAPI.property_type(::Type{ ApiResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_ApiResponse[name]))}

function check_required(o::ApiResponse)
    true
end

function OpenAPI.validate_property(::Type{ ApiResponse }, name::Symbol, val)
end
