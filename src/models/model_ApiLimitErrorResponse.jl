# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""ApiLimitErrorResponse
Превышено ограничение на доступ к ресурсу.

    ApiLimitErrorResponse(;
        status=nothing,
        errors=nothing,
    )

    - status::ApiResponseStatusType
    - errors::Vector{ApiErrorDTO} : Список ошибок.
"""
Base.@kwdef mutable struct ApiLimitErrorResponse <: OpenAPI.APIModel
    status = nothing # spec type: Union{ Nothing, ApiResponseStatusType }
    errors::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{ApiErrorDTO} }

    function ApiLimitErrorResponse(status, errors, )
        OpenAPI.validate_property(ApiLimitErrorResponse, Symbol("status"), status)
        OpenAPI.validate_property(ApiLimitErrorResponse, Symbol("errors"), errors)
        return new(status, errors, )
    end
end # type ApiLimitErrorResponse

const _property_types_ApiLimitErrorResponse = Dict{Symbol,String}(Symbol("status")=>"ApiResponseStatusType", Symbol("errors")=>"Vector{ApiErrorDTO}", )
OpenAPI.property_type(::Type{ ApiLimitErrorResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_ApiLimitErrorResponse[name]))}

function check_required(o::ApiLimitErrorResponse)
    true
end

function OpenAPI.validate_property(::Type{ ApiLimitErrorResponse }, name::Symbol, val)
end
