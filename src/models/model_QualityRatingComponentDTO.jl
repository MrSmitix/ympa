# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""QualityRatingComponentDTO
Составляющая индекса качества.

    QualityRatingComponentDTO(;
        value=nothing,
        componentType=nothing,
    )

    - value::Float64 : Значение составляющей в процентах.
    - componentType::QualityRatingComponentType
"""
Base.@kwdef mutable struct QualityRatingComponentDTO <: OpenAPI.APIModel
    value::Union{Nothing, Float64} = nothing
    componentType = nothing # spec type: Union{ Nothing, QualityRatingComponentType }

    function QualityRatingComponentDTO(value, componentType, )
        OpenAPI.validate_property(QualityRatingComponentDTO, Symbol("value"), value)
        OpenAPI.validate_property(QualityRatingComponentDTO, Symbol("componentType"), componentType)
        return new(value, componentType, )
    end
end # type QualityRatingComponentDTO

const _property_types_QualityRatingComponentDTO = Dict{Symbol,String}(Symbol("value")=>"Float64", Symbol("componentType")=>"QualityRatingComponentType", )
OpenAPI.property_type(::Type{ QualityRatingComponentDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_QualityRatingComponentDTO[name]))}

function check_required(o::QualityRatingComponentDTO)
    o.value === nothing && (return false)
    o.componentType === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ QualityRatingComponentDTO }, name::Symbol, val)
    if name === Symbol("value")
        OpenAPI.validate_param(name, "QualityRatingComponentDTO", :format, val, "double")
    end
    if name === Symbol("value")
        OpenAPI.validate_param(name, "QualityRatingComponentDTO", :maximum, val, 100, false)
        OpenAPI.validate_param(name, "QualityRatingComponentDTO", :minimum, val, 0, false)
    end
end
