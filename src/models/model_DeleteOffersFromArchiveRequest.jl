# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""DeleteOffersFromArchiveRequest
Товары, которые нужно восстановить из архива. 

    DeleteOffersFromArchiveRequest(;
        offerIds=nothing,
    )

    - offerIds::Vector{String} : Список товаров, которые нужно восстановить из архива.
"""
Base.@kwdef mutable struct DeleteOffersFromArchiveRequest <: OpenAPI.APIModel
    offerIds::Union{Nothing, Vector{String}} = nothing

    function DeleteOffersFromArchiveRequest(offerIds, )
        OpenAPI.validate_property(DeleteOffersFromArchiveRequest, Symbol("offerIds"), offerIds)
        return new(offerIds, )
    end
end # type DeleteOffersFromArchiveRequest

const _property_types_DeleteOffersFromArchiveRequest = Dict{Symbol,String}(Symbol("offerIds")=>"Vector{String}", )
OpenAPI.property_type(::Type{ DeleteOffersFromArchiveRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_DeleteOffersFromArchiveRequest[name]))}

function check_required(o::DeleteOffersFromArchiveRequest)
    o.offerIds === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ DeleteOffersFromArchiveRequest }, name::Symbol, val)
    if name === Symbol("offerIds")
        OpenAPI.validate_param(name, "DeleteOffersFromArchiveRequest", :maxItems, val, 200)
        OpenAPI.validate_param(name, "DeleteOffersFromArchiveRequest", :minItems, val, 1)
    end
end
