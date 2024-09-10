# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""DeleteCampaignOffersRequest
Фильтрации удаляемых товаров по offerIds. 

    DeleteCampaignOffersRequest(;
        offerIds=nothing,
    )

    - offerIds::Vector{String} : Идентификаторы товаров в каталоге.
"""
Base.@kwdef mutable struct DeleteCampaignOffersRequest <: OpenAPI.APIModel
    offerIds::Union{Nothing, Vector{String}} = nothing

    function DeleteCampaignOffersRequest(offerIds, )
        OpenAPI.validate_property(DeleteCampaignOffersRequest, Symbol("offerIds"), offerIds)
        return new(offerIds, )
    end
end # type DeleteCampaignOffersRequest

const _property_types_DeleteCampaignOffersRequest = Dict{Symbol,String}(Symbol("offerIds")=>"Vector{String}", )
OpenAPI.property_type(::Type{ DeleteCampaignOffersRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_DeleteCampaignOffersRequest[name]))}

function check_required(o::DeleteCampaignOffersRequest)
    o.offerIds === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ DeleteCampaignOffersRequest }, name::Symbol, val)
    if name === Symbol("offerIds")
        OpenAPI.validate_param(name, "DeleteCampaignOffersRequest", :maxItems, val, 500)
        OpenAPI.validate_param(name, "DeleteCampaignOffersRequest", :minItems, val, 1)
    end
end
