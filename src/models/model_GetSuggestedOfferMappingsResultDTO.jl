# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetSuggestedOfferMappingsResultDTO
Подобранные карточки на Маркете.

    GetSuggestedOfferMappingsResultDTO(;
        offers=nothing,
    )

    - offers::Vector{SuggestedOfferMappingDTO} : Список товаров.
"""
Base.@kwdef mutable struct GetSuggestedOfferMappingsResultDTO <: OpenAPI.APIModel
    offers::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{SuggestedOfferMappingDTO} }

    function GetSuggestedOfferMappingsResultDTO(offers, )
        OpenAPI.validate_property(GetSuggestedOfferMappingsResultDTO, Symbol("offers"), offers)
        return new(offers, )
    end
end # type GetSuggestedOfferMappingsResultDTO

const _property_types_GetSuggestedOfferMappingsResultDTO = Dict{Symbol,String}(Symbol("offers")=>"Vector{SuggestedOfferMappingDTO}", )
OpenAPI.property_type(::Type{ GetSuggestedOfferMappingsResultDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetSuggestedOfferMappingsResultDTO[name]))}

function check_required(o::GetSuggestedOfferMappingsResultDTO)
    o.offers === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GetSuggestedOfferMappingsResultDTO }, name::Symbol, val)
end
