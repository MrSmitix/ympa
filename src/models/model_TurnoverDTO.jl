# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""TurnoverDTO
Информация об оборачиваемости товара.

    TurnoverDTO(;
        turnover=nothing,
        turnoverDays=nothing,
    )

    - turnover::TurnoverType
    - turnoverDays::Float64 : Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
"""
Base.@kwdef mutable struct TurnoverDTO <: OpenAPI.APIModel
    turnover = nothing # spec type: Union{ Nothing, TurnoverType }
    turnoverDays::Union{Nothing, Float64} = nothing

    function TurnoverDTO(turnover, turnoverDays, )
        OpenAPI.validate_property(TurnoverDTO, Symbol("turnover"), turnover)
        OpenAPI.validate_property(TurnoverDTO, Symbol("turnoverDays"), turnoverDays)
        return new(turnover, turnoverDays, )
    end
end # type TurnoverDTO

const _property_types_TurnoverDTO = Dict{Symbol,String}(Symbol("turnover")=>"TurnoverType", Symbol("turnoverDays")=>"Float64", )
OpenAPI.property_type(::Type{ TurnoverDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_TurnoverDTO[name]))}

function check_required(o::TurnoverDTO)
    o.turnover === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ TurnoverDTO }, name::Symbol, val)
    if name === Symbol("turnoverDays")
        OpenAPI.validate_param(name, "TurnoverDTO", :format, val, "double")
    end
end
