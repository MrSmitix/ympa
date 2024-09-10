# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""OptionValuesLimitedDTO
Значение ограничивающей характеристики и список допустимых значений ограничиваемой характеристики.

    OptionValuesLimitedDTO(;
        limitingOptionValueId=nothing,
        optionValueIds=nothing,
    )

    - limitingOptionValueId::Int64 : Идентификатор значения ограничивающей характеристики.
    - optionValueIds::Vector{Int64} : Идентификаторы допустимых значений ограничиваемой характеристики. 
"""
Base.@kwdef mutable struct OptionValuesLimitedDTO <: OpenAPI.APIModel
    limitingOptionValueId::Union{Nothing, Int64} = nothing
    optionValueIds::Union{Nothing, Vector{Int64}} = nothing

    function OptionValuesLimitedDTO(limitingOptionValueId, optionValueIds, )
        OpenAPI.validate_property(OptionValuesLimitedDTO, Symbol("limitingOptionValueId"), limitingOptionValueId)
        OpenAPI.validate_property(OptionValuesLimitedDTO, Symbol("optionValueIds"), optionValueIds)
        return new(limitingOptionValueId, optionValueIds, )
    end
end # type OptionValuesLimitedDTO

const _property_types_OptionValuesLimitedDTO = Dict{Symbol,String}(Symbol("limitingOptionValueId")=>"Int64", Symbol("optionValueIds")=>"Vector{Int64}", )
OpenAPI.property_type(::Type{ OptionValuesLimitedDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_OptionValuesLimitedDTO[name]))}

function check_required(o::OptionValuesLimitedDTO)
    o.limitingOptionValueId === nothing && (return false)
    o.optionValueIds === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ OptionValuesLimitedDTO }, name::Symbol, val)
    if name === Symbol("limitingOptionValueId")
        OpenAPI.validate_param(name, "OptionValuesLimitedDTO", :format, val, "int64")
    end
end
