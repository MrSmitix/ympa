# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""DeleteCampaignOffersResponse
Результат удаления товаров.

    DeleteCampaignOffersResponse(;
        status=nothing,
        result=nothing,
    )

    - status::ApiResponseStatusType
    - result::DeleteCampaignOffersDTO
"""
Base.@kwdef mutable struct DeleteCampaignOffersResponse <: OpenAPI.APIModel
    status = nothing # spec type: Union{ Nothing, ApiResponseStatusType }
    result = nothing # spec type: Union{ Nothing, DeleteCampaignOffersDTO }

    function DeleteCampaignOffersResponse(status, result, )
        OpenAPI.validate_property(DeleteCampaignOffersResponse, Symbol("status"), status)
        OpenAPI.validate_property(DeleteCampaignOffersResponse, Symbol("result"), result)
        return new(status, result, )
    end
end # type DeleteCampaignOffersResponse

const _property_types_DeleteCampaignOffersResponse = Dict{Symbol,String}(Symbol("status")=>"ApiResponseStatusType", Symbol("result")=>"DeleteCampaignOffersDTO", )
OpenAPI.property_type(::Type{ DeleteCampaignOffersResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_DeleteCampaignOffersResponse[name]))}

function check_required(o::DeleteCampaignOffersResponse)
    true
end

function OpenAPI.validate_property(::Type{ DeleteCampaignOffersResponse }, name::Symbol, val)
end
