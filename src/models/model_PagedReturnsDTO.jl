# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""PagedReturnsDTO
Возвраты.

    PagedReturnsDTO(;
        paging=nothing,
        returns=nothing,
    )

    - paging::ForwardScrollingPagerDTO
    - returns::Vector{ReturnDTO} : Список возвратов.
"""
Base.@kwdef mutable struct PagedReturnsDTO <: OpenAPI.APIModel
    paging = nothing # spec type: Union{ Nothing, ForwardScrollingPagerDTO }
    returns::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{ReturnDTO} }

    function PagedReturnsDTO(paging, returns, )
        OpenAPI.validate_property(PagedReturnsDTO, Symbol("paging"), paging)
        OpenAPI.validate_property(PagedReturnsDTO, Symbol("returns"), returns)
        return new(paging, returns, )
    end
end # type PagedReturnsDTO

const _property_types_PagedReturnsDTO = Dict{Symbol,String}(Symbol("paging")=>"ForwardScrollingPagerDTO", Symbol("returns")=>"Vector{ReturnDTO}", )
OpenAPI.property_type(::Type{ PagedReturnsDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_PagedReturnsDTO[name]))}

function check_required(o::PagedReturnsDTO)
    o.returns === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ PagedReturnsDTO }, name::Symbol, val)
end
