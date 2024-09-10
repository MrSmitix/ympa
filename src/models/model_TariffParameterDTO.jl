# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""TariffParameterDTO
Детали расчета конкретной услуги Маркета.

    TariffParameterDTO(;
        name=nothing,
        value=nothing,
    )

    - name::String : Название параметра.
    - value::String : Значение параметра.
"""
Base.@kwdef mutable struct TariffParameterDTO <: OpenAPI.APIModel
    name::Union{Nothing, String} = nothing
    value::Union{Nothing, String} = nothing

    function TariffParameterDTO(name, value, )
        OpenAPI.validate_property(TariffParameterDTO, Symbol("name"), name)
        OpenAPI.validate_property(TariffParameterDTO, Symbol("value"), value)
        return new(name, value, )
    end
end # type TariffParameterDTO

const _property_types_TariffParameterDTO = Dict{Symbol,String}(Symbol("name")=>"String", Symbol("value")=>"String", )
OpenAPI.property_type(::Type{ TariffParameterDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_TariffParameterDTO[name]))}

function check_required(o::TariffParameterDTO)
    o.name === nothing && (return false)
    o.value === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ TariffParameterDTO }, name::Symbol, val)
end
