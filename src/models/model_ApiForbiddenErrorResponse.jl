# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""ApiForbiddenErrorResponse
Неверны авторизационные данные, указанные в запросе, или запрещен доступ к запрашиваемому ресурсу.

    ApiForbiddenErrorResponse(;
        status=nothing,
        errors=nothing,
    )

    - status::ApiResponseStatusType
    - errors::Vector{ApiErrorDTO} : Список ошибок.
"""
Base.@kwdef mutable struct ApiForbiddenErrorResponse <: OpenAPI.APIModel
    status = nothing # spec type: Union{ Nothing, ApiResponseStatusType }
    errors::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{ApiErrorDTO} }

    function ApiForbiddenErrorResponse(status, errors, )
        OpenAPI.validate_property(ApiForbiddenErrorResponse, Symbol("status"), status)
        OpenAPI.validate_property(ApiForbiddenErrorResponse, Symbol("errors"), errors)
        return new(status, errors, )
    end
end # type ApiForbiddenErrorResponse

const _property_types_ApiForbiddenErrorResponse = Dict{Symbol,String}(Symbol("status")=>"ApiResponseStatusType", Symbol("errors")=>"Vector{ApiErrorDTO}", )
OpenAPI.property_type(::Type{ ApiForbiddenErrorResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_ApiForbiddenErrorResponse[name]))}

function check_required(o::ApiForbiddenErrorResponse)
    true
end

function OpenAPI.validate_property(::Type{ ApiForbiddenErrorResponse }, name::Symbol, val)
end
