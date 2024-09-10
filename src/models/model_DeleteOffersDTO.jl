# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""DeleteOffersDTO
Список товаров, которые не удалось удалить, потому что они хранятся на складе Маркета.

    DeleteOffersDTO(;
        notDeletedOfferIds=nothing,
    )

    - notDeletedOfferIds::Vector{String} : Список SKU товаров, которые не удалось удалить.
"""
Base.@kwdef mutable struct DeleteOffersDTO <: OpenAPI.APIModel
    notDeletedOfferIds::Union{Nothing, Vector{String}} = nothing

    function DeleteOffersDTO(notDeletedOfferIds, )
        OpenAPI.validate_property(DeleteOffersDTO, Symbol("notDeletedOfferIds"), notDeletedOfferIds)
        return new(notDeletedOfferIds, )
    end
end # type DeleteOffersDTO

const _property_types_DeleteOffersDTO = Dict{Symbol,String}(Symbol("notDeletedOfferIds")=>"Vector{String}", )
OpenAPI.property_type(::Type{ DeleteOffersDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_DeleteOffersDTO[name]))}

function check_required(o::DeleteOffersDTO)
    true
end

function OpenAPI.validate_property(::Type{ DeleteOffersDTO }, name::Symbol, val)
end
