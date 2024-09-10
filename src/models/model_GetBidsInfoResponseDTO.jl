# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetBidsInfoResponseDTO
Список товаров с указанными ставками.

    GetBidsInfoResponseDTO(;
        bids=nothing,
        paging=nothing,
    )

    - bids::Vector{SkuBidItemDTO} : Страница списка товаров.
    - paging::ForwardScrollingPagerDTO
"""
Base.@kwdef mutable struct GetBidsInfoResponseDTO <: OpenAPI.APIModel
    bids::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{SkuBidItemDTO} }
    paging = nothing # spec type: Union{ Nothing, ForwardScrollingPagerDTO }

    function GetBidsInfoResponseDTO(bids, paging, )
        OpenAPI.validate_property(GetBidsInfoResponseDTO, Symbol("bids"), bids)
        OpenAPI.validate_property(GetBidsInfoResponseDTO, Symbol("paging"), paging)
        return new(bids, paging, )
    end
end # type GetBidsInfoResponseDTO

const _property_types_GetBidsInfoResponseDTO = Dict{Symbol,String}(Symbol("bids")=>"Vector{SkuBidItemDTO}", Symbol("paging")=>"ForwardScrollingPagerDTO", )
OpenAPI.property_type(::Type{ GetBidsInfoResponseDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetBidsInfoResponseDTO[name]))}

function check_required(o::GetBidsInfoResponseDTO)
    o.bids === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GetBidsInfoResponseDTO }, name::Symbol, val)
end
