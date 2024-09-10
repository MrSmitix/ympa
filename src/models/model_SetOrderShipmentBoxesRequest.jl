# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""SetOrderShipmentBoxesRequest

    SetOrderShipmentBoxesRequest(;
        boxes=nothing,
    )

    - boxes::Vector{ParcelBoxDTO} : Список грузовых мест. Маркет определяет количество мест по длине этого списка.
"""
Base.@kwdef mutable struct SetOrderShipmentBoxesRequest <: OpenAPI.APIModel
    boxes::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{ParcelBoxDTO} }

    function SetOrderShipmentBoxesRequest(boxes, )
        OpenAPI.validate_property(SetOrderShipmentBoxesRequest, Symbol("boxes"), boxes)
        return new(boxes, )
    end
end # type SetOrderShipmentBoxesRequest

const _property_types_SetOrderShipmentBoxesRequest = Dict{Symbol,String}(Symbol("boxes")=>"Vector{ParcelBoxDTO}", )
OpenAPI.property_type(::Type{ SetOrderShipmentBoxesRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_SetOrderShipmentBoxesRequest[name]))}

function check_required(o::SetOrderShipmentBoxesRequest)
    o.boxes === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ SetOrderShipmentBoxesRequest }, name::Symbol, val)
    if name === Symbol("boxes")
        OpenAPI.validate_param(name, "SetOrderShipmentBoxesRequest", :minItems, val, 1)
    end
end
