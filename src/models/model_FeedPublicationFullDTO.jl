# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""FeedPublicationFullDTO
Информация о последней публикации предложений из прайс-листа на Маркете. 

    FeedPublicationFullDTO(;
        fileTime=nothing,
        publishedTime=nothing,
    )

    - fileTime::ZonedDateTime : Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
    - publishedTime::ZonedDateTime : Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
"""
Base.@kwdef mutable struct FeedPublicationFullDTO <: OpenAPI.APIModel
    fileTime::Union{Nothing, ZonedDateTime} = nothing
    publishedTime::Union{Nothing, ZonedDateTime} = nothing

    function FeedPublicationFullDTO(fileTime, publishedTime, )
        OpenAPI.validate_property(FeedPublicationFullDTO, Symbol("fileTime"), fileTime)
        OpenAPI.validate_property(FeedPublicationFullDTO, Symbol("publishedTime"), publishedTime)
        return new(fileTime, publishedTime, )
    end
end # type FeedPublicationFullDTO

const _property_types_FeedPublicationFullDTO = Dict{Symbol,String}(Symbol("fileTime")=>"ZonedDateTime", Symbol("publishedTime")=>"ZonedDateTime", )
OpenAPI.property_type(::Type{ FeedPublicationFullDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_FeedPublicationFullDTO[name]))}

function check_required(o::FeedPublicationFullDTO)
    true
end

function OpenAPI.validate_property(::Type{ FeedPublicationFullDTO }, name::Symbol, val)
    if name === Symbol("fileTime")
        OpenAPI.validate_param(name, "FeedPublicationFullDTO", :format, val, "date-time")
    end
    if name === Symbol("publishedTime")
        OpenAPI.validate_param(name, "FeedPublicationFullDTO", :format, val, "date-time")
    end
end
