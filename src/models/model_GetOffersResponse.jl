# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetOffersResponse
Список предложений с пагинатором.

    GetOffersResponse(;
        offers=nothing,
        pager=nothing,
    )

    - offers::Vector{OfferDTO} : Список предложений магазина.
    - pager::FlippingPagerDTO
"""
Base.@kwdef mutable struct GetOffersResponse <: OpenAPI.APIModel
    offers::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OfferDTO} }
    pager = nothing # spec type: Union{ Nothing, FlippingPagerDTO }

    function GetOffersResponse(offers, pager, )
        OpenAPI.validate_property(GetOffersResponse, Symbol("offers"), offers)
        OpenAPI.validate_property(GetOffersResponse, Symbol("pager"), pager)
        return new(offers, pager, )
    end
end # type GetOffersResponse

const _property_types_GetOffersResponse = Dict{Symbol,String}(Symbol("offers")=>"Vector{OfferDTO}", Symbol("pager")=>"FlippingPagerDTO", )
OpenAPI.property_type(::Type{ GetOffersResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetOffersResponse[name]))}

function check_required(o::GetOffersResponse)
    o.offers === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GetOffersResponse }, name::Symbol, val)
end
