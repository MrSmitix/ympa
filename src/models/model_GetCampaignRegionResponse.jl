# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetCampaignRegionResponse
Ответ на запрос региона магазина.

    GetCampaignRegionResponse(;
        region=nothing,
    )

    - region::RegionDTO
"""
Base.@kwdef mutable struct GetCampaignRegionResponse <: OpenAPI.APIModel
    region = nothing # spec type: Union{ Nothing, RegionDTO }

    function GetCampaignRegionResponse(region, )
        OpenAPI.validate_property(GetCampaignRegionResponse, Symbol("region"), region)
        return new(region, )
    end
end # type GetCampaignRegionResponse

const _property_types_GetCampaignRegionResponse = Dict{Symbol,String}(Symbol("region")=>"RegionDTO", )
OpenAPI.property_type(::Type{ GetCampaignRegionResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetCampaignRegionResponse[name]))}

function check_required(o::GetCampaignRegionResponse)
    true
end

function OpenAPI.validate_property(::Type{ GetCampaignRegionResponse }, name::Symbol, val)
end
