# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetQuarantineOffersResultDTO
Список товаров в карантине.

    GetQuarantineOffersResultDTO(;
        paging=nothing,
        offers=nothing,
    )

    - paging::ScrollingPagerDTO
    - offers::Vector{QuarantineOfferDTO} : Страница списка товаров в карантине.
"""
Base.@kwdef mutable struct GetQuarantineOffersResultDTO <: OpenAPI.APIModel
    paging = nothing # spec type: Union{ Nothing, ScrollingPagerDTO }
    offers::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{QuarantineOfferDTO} }

    function GetQuarantineOffersResultDTO(paging, offers, )
        OpenAPI.validate_property(GetQuarantineOffersResultDTO, Symbol("paging"), paging)
        OpenAPI.validate_property(GetQuarantineOffersResultDTO, Symbol("offers"), offers)
        return new(paging, offers, )
    end
end # type GetQuarantineOffersResultDTO

const _property_types_GetQuarantineOffersResultDTO = Dict{Symbol,String}(Symbol("paging")=>"ScrollingPagerDTO", Symbol("offers")=>"Vector{QuarantineOfferDTO}", )
OpenAPI.property_type(::Type{ GetQuarantineOffersResultDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetQuarantineOffersResultDTO[name]))}

function check_required(o::GetQuarantineOffersResultDTO)
    o.offers === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GetQuarantineOffersResultDTO }, name::Symbol, val)
end
