# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""ScrollingPagerDTO
Информация о страницах результатов.

    ScrollingPagerDTO(;
        nextPageToken=nothing,
        prevPageToken=nothing,
    )

    - nextPageToken::String : Идентификатор следующей страницы результатов.
    - prevPageToken::String : Идентификатор предыдущей страницы результатов.
"""
Base.@kwdef mutable struct ScrollingPagerDTO <: OpenAPI.APIModel
    nextPageToken::Union{Nothing, String} = nothing
    prevPageToken::Union{Nothing, String} = nothing

    function ScrollingPagerDTO(nextPageToken, prevPageToken, )
        OpenAPI.validate_property(ScrollingPagerDTO, Symbol("nextPageToken"), nextPageToken)
        OpenAPI.validate_property(ScrollingPagerDTO, Symbol("prevPageToken"), prevPageToken)
        return new(nextPageToken, prevPageToken, )
    end
end # type ScrollingPagerDTO

const _property_types_ScrollingPagerDTO = Dict{Symbol,String}(Symbol("nextPageToken")=>"String", Symbol("prevPageToken")=>"String", )
OpenAPI.property_type(::Type{ ScrollingPagerDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_ScrollingPagerDTO[name]))}

function check_required(o::ScrollingPagerDTO)
    true
end

function OpenAPI.validate_property(::Type{ ScrollingPagerDTO }, name::Symbol, val)
end
