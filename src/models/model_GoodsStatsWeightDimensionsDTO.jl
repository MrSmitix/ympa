# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GoodsStatsWeightDimensionsDTO
Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 

    GoodsStatsWeightDimensionsDTO(;
        length=nothing,
        width=nothing,
        height=nothing,
        weight=nothing,
    )

    - length::Float64 : Длина товара в сантиметрах.
    - width::Float64 : Ширина товара в сантиметрах.
    - height::Float64 : Высота товара в сантиметрах.
    - weight::Float64 : Вес товара в килограммах.
"""
Base.@kwdef mutable struct GoodsStatsWeightDimensionsDTO <: OpenAPI.APIModel
    length::Union{Nothing, Float64} = nothing
    width::Union{Nothing, Float64} = nothing
    height::Union{Nothing, Float64} = nothing
    weight::Union{Nothing, Float64} = nothing

    function GoodsStatsWeightDimensionsDTO(length, width, height, weight, )
        OpenAPI.validate_property(GoodsStatsWeightDimensionsDTO, Symbol("length"), length)
        OpenAPI.validate_property(GoodsStatsWeightDimensionsDTO, Symbol("width"), width)
        OpenAPI.validate_property(GoodsStatsWeightDimensionsDTO, Symbol("height"), height)
        OpenAPI.validate_property(GoodsStatsWeightDimensionsDTO, Symbol("weight"), weight)
        return new(length, width, height, weight, )
    end
end # type GoodsStatsWeightDimensionsDTO

const _property_types_GoodsStatsWeightDimensionsDTO = Dict{Symbol,String}(Symbol("length")=>"Float64", Symbol("width")=>"Float64", Symbol("height")=>"Float64", Symbol("weight")=>"Float64", )
OpenAPI.property_type(::Type{ GoodsStatsWeightDimensionsDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GoodsStatsWeightDimensionsDTO[name]))}

function check_required(o::GoodsStatsWeightDimensionsDTO)
    true
end

function OpenAPI.validate_property(::Type{ GoodsStatsWeightDimensionsDTO }, name::Symbol, val)
end
