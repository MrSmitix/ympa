# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""FeedbackDTO
Отзыв пользователя Яндекс Маркета об указанном магазине.

    FeedbackDTO(;
        id=nothing,
        createdAt=nothing,
        text=nothing,
        state=nothing,
        author=nothing,
        pro=nothing,
        contra=nothing,
        comments=nothing,
        shop=nothing,
        resolved=nothing,
        verified=nothing,
        recommend=nothing,
        grades=nothing,
        order=nothing,
    )

    - id::Int64 : Идентификатор отзыва.
    - createdAt::ZonedDateTime : Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;. 
    - text::String : Комментарий автора отзыва.
    - state::FeedbackStateType
    - author::FeedbackAuthorDTO
    - pro::String : Достоинства магазина, описанные в отзыве.
    - contra::String : Недостатки магазина, описанные в отзыве.
    - comments::Vector{FeedbackCommentDTO} : Переписка автора отзыва с магазином.
    - shop::FeedbackShopDTO
    - resolved::Bool : Решена ли проблема автора отзыва:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
    - verified::Bool : {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
    - recommend::Bool : Купил бы автор отзыва в магазине снова:  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. 
    - grades::FeedbackGradesDTO
    - order::FeedbackOrderDTO
"""
Base.@kwdef mutable struct FeedbackDTO <: OpenAPI.APIModel
    id::Union{Nothing, Int64} = nothing
    createdAt::Union{Nothing, ZonedDateTime} = nothing
    text::Union{Nothing, String} = nothing
    state = nothing # spec type: Union{ Nothing, FeedbackStateType }
    author = nothing # spec type: Union{ Nothing, FeedbackAuthorDTO }
    pro::Union{Nothing, String} = nothing
    contra::Union{Nothing, String} = nothing
    comments::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{FeedbackCommentDTO} }
    shop = nothing # spec type: Union{ Nothing, FeedbackShopDTO }
    resolved::Union{Nothing, Bool} = nothing
    verified::Union{Nothing, Bool} = nothing
    recommend::Union{Nothing, Bool} = nothing
    grades = nothing # spec type: Union{ Nothing, FeedbackGradesDTO }
    order = nothing # spec type: Union{ Nothing, FeedbackOrderDTO }

    function FeedbackDTO(id, createdAt, text, state, author, pro, contra, comments, shop, resolved, verified, recommend, grades, order, )
        OpenAPI.validate_property(FeedbackDTO, Symbol("id"), id)
        OpenAPI.validate_property(FeedbackDTO, Symbol("createdAt"), createdAt)
        OpenAPI.validate_property(FeedbackDTO, Symbol("text"), text)
        OpenAPI.validate_property(FeedbackDTO, Symbol("state"), state)
        OpenAPI.validate_property(FeedbackDTO, Symbol("author"), author)
        OpenAPI.validate_property(FeedbackDTO, Symbol("pro"), pro)
        OpenAPI.validate_property(FeedbackDTO, Symbol("contra"), contra)
        OpenAPI.validate_property(FeedbackDTO, Symbol("comments"), comments)
        OpenAPI.validate_property(FeedbackDTO, Symbol("shop"), shop)
        OpenAPI.validate_property(FeedbackDTO, Symbol("resolved"), resolved)
        OpenAPI.validate_property(FeedbackDTO, Symbol("verified"), verified)
        OpenAPI.validate_property(FeedbackDTO, Symbol("recommend"), recommend)
        OpenAPI.validate_property(FeedbackDTO, Symbol("grades"), grades)
        OpenAPI.validate_property(FeedbackDTO, Symbol("order"), order)
        return new(id, createdAt, text, state, author, pro, contra, comments, shop, resolved, verified, recommend, grades, order, )
    end
end # type FeedbackDTO

const _property_types_FeedbackDTO = Dict{Symbol,String}(Symbol("id")=>"Int64", Symbol("createdAt")=>"ZonedDateTime", Symbol("text")=>"String", Symbol("state")=>"FeedbackStateType", Symbol("author")=>"FeedbackAuthorDTO", Symbol("pro")=>"String", Symbol("contra")=>"String", Symbol("comments")=>"Vector{FeedbackCommentDTO}", Symbol("shop")=>"FeedbackShopDTO", Symbol("resolved")=>"Bool", Symbol("verified")=>"Bool", Symbol("recommend")=>"Bool", Symbol("grades")=>"FeedbackGradesDTO", Symbol("order")=>"FeedbackOrderDTO", )
OpenAPI.property_type(::Type{ FeedbackDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_FeedbackDTO[name]))}

function check_required(o::FeedbackDTO)
    o.comments === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ FeedbackDTO }, name::Symbol, val)
    if name === Symbol("id")
        OpenAPI.validate_param(name, "FeedbackDTO", :format, val, "int64")
    end
    if name === Symbol("createdAt")
        OpenAPI.validate_param(name, "FeedbackDTO", :format, val, "date-time")
    end
end
