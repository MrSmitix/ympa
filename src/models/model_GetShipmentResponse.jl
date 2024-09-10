# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetShipmentResponse

    GetShipmentResponse(;
        status=nothing,
        result=nothing,
    )

    - status::ApiResponseStatusType
    - result::ShipmentDTO
"""
Base.@kwdef mutable struct GetShipmentResponse <: OpenAPI.APIModel
    status = nothing # spec type: Union{ Nothing, ApiResponseStatusType }
    result = nothing # spec type: Union{ Nothing, ShipmentDTO }

    function GetShipmentResponse(status, result, )
        OpenAPI.validate_property(GetShipmentResponse, Symbol("status"), status)
        OpenAPI.validate_property(GetShipmentResponse, Symbol("result"), result)
        return new(status, result, )
    end
end # type GetShipmentResponse

const _property_types_GetShipmentResponse = Dict{Symbol,String}(Symbol("status")=>"ApiResponseStatusType", Symbol("result")=>"ShipmentDTO", )
OpenAPI.property_type(::Type{ GetShipmentResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetShipmentResponse[name]))}

function check_required(o::GetShipmentResponse)
    true
end

function OpenAPI.validate_property(::Type{ GetShipmentResponse }, name::Symbol, val)
end
