# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""CampaignQualityRatingDTO
Информация об индексе качества магазина.

    CampaignQualityRatingDTO(;
        campaignId=nothing,
        ratings=nothing,
    )

    - campaignId::Int64 : Идентификатор магазина.
    - ratings::Vector{QualityRatingDTO} : Список значений индекса качества.
"""
Base.@kwdef mutable struct CampaignQualityRatingDTO <: OpenAPI.APIModel
    campaignId::Union{Nothing, Int64} = nothing
    ratings::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{QualityRatingDTO} }

    function CampaignQualityRatingDTO(campaignId, ratings, )
        OpenAPI.validate_property(CampaignQualityRatingDTO, Symbol("campaignId"), campaignId)
        OpenAPI.validate_property(CampaignQualityRatingDTO, Symbol("ratings"), ratings)
        return new(campaignId, ratings, )
    end
end # type CampaignQualityRatingDTO

const _property_types_CampaignQualityRatingDTO = Dict{Symbol,String}(Symbol("campaignId")=>"Int64", Symbol("ratings")=>"Vector{QualityRatingDTO}", )
OpenAPI.property_type(::Type{ CampaignQualityRatingDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_CampaignQualityRatingDTO[name]))}

function check_required(o::CampaignQualityRatingDTO)
    o.campaignId === nothing && (return false)
    o.ratings === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ CampaignQualityRatingDTO }, name::Symbol, val)
    if name === Symbol("campaignId")
        OpenAPI.validate_param(name, "CampaignQualityRatingDTO", :format, val, "int64")
    end
end
