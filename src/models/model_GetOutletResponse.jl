# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetOutletResponse
Ответ на запрос информации о точке продаж.

    GetOutletResponse(;
        outlet=nothing,
    )

    - outlet::FullOutletDTO
"""
Base.@kwdef mutable struct GetOutletResponse <: OpenAPI.APIModel
    outlet = nothing # spec type: Union{ Nothing, FullOutletDTO }

    function GetOutletResponse(outlet, )
        OpenAPI.validate_property(GetOutletResponse, Symbol("outlet"), outlet)
        return new(outlet, )
    end
end # type GetOutletResponse

const _property_types_GetOutletResponse = Dict{Symbol,String}(Symbol("outlet")=>"FullOutletDTO", )
OpenAPI.property_type(::Type{ GetOutletResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetOutletResponse[name]))}

function check_required(o::GetOutletResponse)
    true
end

function OpenAPI.validate_property(::Type{ GetOutletResponse }, name::Symbol, val)
end
