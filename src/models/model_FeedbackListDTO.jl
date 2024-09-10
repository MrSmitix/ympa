# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""FeedbackListDTO
Отзывы пользователей Яндекс Маркета об указанном магазине.

    FeedbackListDTO(;
        paging=nothing,
        feedbackList=nothing,
    )

    - paging::ScrollingPagerDTO
    - feedbackList::Vector{FeedbackDTO} : Список отзывов.  Содержит не более 20 отзывов. 
"""
Base.@kwdef mutable struct FeedbackListDTO <: OpenAPI.APIModel
    paging = nothing # spec type: Union{ Nothing, ScrollingPagerDTO }
    feedbackList::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{FeedbackDTO} }

    function FeedbackListDTO(paging, feedbackList, )
        OpenAPI.validate_property(FeedbackListDTO, Symbol("paging"), paging)
        OpenAPI.validate_property(FeedbackListDTO, Symbol("feedbackList"), feedbackList)
        return new(paging, feedbackList, )
    end
end # type FeedbackListDTO

const _property_types_FeedbackListDTO = Dict{Symbol,String}(Symbol("paging")=>"ScrollingPagerDTO", Symbol("feedbackList")=>"Vector{FeedbackDTO}", )
OpenAPI.property_type(::Type{ FeedbackListDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_FeedbackListDTO[name]))}

function check_required(o::FeedbackListDTO)
    o.feedbackList === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ FeedbackListDTO }, name::Symbol, val)
end
