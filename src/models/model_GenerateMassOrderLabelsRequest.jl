# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GenerateMassOrderLabelsRequest
Данные, необходимые для генерации файла. 

    GenerateMassOrderLabelsRequest(;
        businessId=nothing,
        orderIds=nothing,
    )

    - businessId::Int64 : Идентификатор кабинета.
    - orderIds::Vector{Int64} : Список идентификаторов заказов.
"""
Base.@kwdef mutable struct GenerateMassOrderLabelsRequest <: OpenAPI.APIModel
    businessId::Union{Nothing, Int64} = nothing
    orderIds::Union{Nothing, Vector{Int64}} = nothing

    function GenerateMassOrderLabelsRequest(businessId, orderIds, )
        OpenAPI.validate_property(GenerateMassOrderLabelsRequest, Symbol("businessId"), businessId)
        OpenAPI.validate_property(GenerateMassOrderLabelsRequest, Symbol("orderIds"), orderIds)
        return new(businessId, orderIds, )
    end
end # type GenerateMassOrderLabelsRequest

const _property_types_GenerateMassOrderLabelsRequest = Dict{Symbol,String}(Symbol("businessId")=>"Int64", Symbol("orderIds")=>"Vector{Int64}", )
OpenAPI.property_type(::Type{ GenerateMassOrderLabelsRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GenerateMassOrderLabelsRequest[name]))}

function check_required(o::GenerateMassOrderLabelsRequest)
    o.businessId === nothing && (return false)
    o.orderIds === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GenerateMassOrderLabelsRequest }, name::Symbol, val)
    if name === Symbol("businessId")
        OpenAPI.validate_param(name, "GenerateMassOrderLabelsRequest", :format, val, "int64")
    end
    if name === Symbol("orderIds")
        OpenAPI.validate_param(name, "GenerateMassOrderLabelsRequest", :maxItems, val, 1000)
        OpenAPI.validate_param(name, "GenerateMassOrderLabelsRequest", :minItems, val, 1)
        OpenAPI.validate_param(name, "GenerateMassOrderLabelsRequest", :uniqueItems, val, true)
    end
end
