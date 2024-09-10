# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""CampaignSettingsLocalRegionDTO
Информация о своем регионе магазина.

    CampaignSettingsLocalRegionDTO(;
        id=nothing,
        name=nothing,
        type=nothing,
        deliveryOptionsSource=nothing,
        delivery=nothing,
    )

    - id::Int64 : Идентификатор региона.
    - name::String : Название региона.
    - type::RegionType
    - deliveryOptionsSource::CampaignSettingsScheduleSourceType
    - delivery::CampaignSettingsDeliveryDTO
"""
Base.@kwdef mutable struct CampaignSettingsLocalRegionDTO <: OpenAPI.APIModel
    id::Union{Nothing, Int64} = nothing
    name::Union{Nothing, String} = nothing
    type = nothing # spec type: Union{ Nothing, RegionType }
    deliveryOptionsSource = nothing # spec type: Union{ Nothing, CampaignSettingsScheduleSourceType }
    delivery = nothing # spec type: Union{ Nothing, CampaignSettingsDeliveryDTO }

    function CampaignSettingsLocalRegionDTO(id, name, type, deliveryOptionsSource, delivery, )
        OpenAPI.validate_property(CampaignSettingsLocalRegionDTO, Symbol("id"), id)
        OpenAPI.validate_property(CampaignSettingsLocalRegionDTO, Symbol("name"), name)
        OpenAPI.validate_property(CampaignSettingsLocalRegionDTO, Symbol("type"), type)
        OpenAPI.validate_property(CampaignSettingsLocalRegionDTO, Symbol("deliveryOptionsSource"), deliveryOptionsSource)
        OpenAPI.validate_property(CampaignSettingsLocalRegionDTO, Symbol("delivery"), delivery)
        return new(id, name, type, deliveryOptionsSource, delivery, )
    end
end # type CampaignSettingsLocalRegionDTO

const _property_types_CampaignSettingsLocalRegionDTO = Dict{Symbol,String}(Symbol("id")=>"Int64", Symbol("name")=>"String", Symbol("type")=>"RegionType", Symbol("deliveryOptionsSource")=>"CampaignSettingsScheduleSourceType", Symbol("delivery")=>"CampaignSettingsDeliveryDTO", )
OpenAPI.property_type(::Type{ CampaignSettingsLocalRegionDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_CampaignSettingsLocalRegionDTO[name]))}

function check_required(o::CampaignSettingsLocalRegionDTO)
    true
end

function OpenAPI.validate_property(::Type{ CampaignSettingsLocalRegionDTO }, name::Symbol, val)
    if name === Symbol("id")
        OpenAPI.validate_param(name, "CampaignSettingsLocalRegionDTO", :format, val, "int64")
    end
end
