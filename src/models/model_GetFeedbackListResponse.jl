# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetFeedbackListResponse

    GetFeedbackListResponse(;
        status=nothing,
        result=nothing,
    )

    - status::ApiResponseStatusType
    - result::FeedbackListDTO
"""
Base.@kwdef mutable struct GetFeedbackListResponse <: OpenAPI.APIModel
    status = nothing # spec type: Union{ Nothing, ApiResponseStatusType }
    result = nothing # spec type: Union{ Nothing, FeedbackListDTO }

    function GetFeedbackListResponse(status, result, )
        OpenAPI.validate_property(GetFeedbackListResponse, Symbol("status"), status)
        OpenAPI.validate_property(GetFeedbackListResponse, Symbol("result"), result)
        return new(status, result, )
    end
end # type GetFeedbackListResponse

const _property_types_GetFeedbackListResponse = Dict{Symbol,String}(Symbol("status")=>"ApiResponseStatusType", Symbol("result")=>"FeedbackListDTO", )
OpenAPI.property_type(::Type{ GetFeedbackListResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetFeedbackListResponse[name]))}

function check_required(o::GetFeedbackListResponse)
    true
end

function OpenAPI.validate_property(::Type{ GetFeedbackListResponse }, name::Symbol, val)
end
