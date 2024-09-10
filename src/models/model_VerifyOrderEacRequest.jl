# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""VerifyOrderEacRequest

    VerifyOrderEacRequest(;
        code=nothing,
    )

    - code::String : Код для подтверждения ЭАПП.
"""
Base.@kwdef mutable struct VerifyOrderEacRequest <: OpenAPI.APIModel
    code::Union{Nothing, String} = nothing

    function VerifyOrderEacRequest(code, )
        OpenAPI.validate_property(VerifyOrderEacRequest, Symbol("code"), code)
        return new(code, )
    end
end # type VerifyOrderEacRequest

const _property_types_VerifyOrderEacRequest = Dict{Symbol,String}(Symbol("code")=>"String", )
OpenAPI.property_type(::Type{ VerifyOrderEacRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_VerifyOrderEacRequest[name]))}

function check_required(o::VerifyOrderEacRequest)
    true
end

function OpenAPI.validate_property(::Type{ VerifyOrderEacRequest }, name::Symbol, val)
end
