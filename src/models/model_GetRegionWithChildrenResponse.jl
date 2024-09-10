# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GetRegionWithChildrenResponse

    GetRegionWithChildrenResponse(;
        pager=nothing,
        regions=nothing,
    )

    - pager::FlippingPagerDTO
    - regions::RegionDTO
"""
Base.@kwdef mutable struct GetRegionWithChildrenResponse <: OpenAPI.APIModel
    pager = nothing # spec type: Union{ Nothing, FlippingPagerDTO }
    regions = nothing # spec type: Union{ Nothing, RegionDTO }

    function GetRegionWithChildrenResponse(pager, regions, )
        OpenAPI.validate_property(GetRegionWithChildrenResponse, Symbol("pager"), pager)
        OpenAPI.validate_property(GetRegionWithChildrenResponse, Symbol("regions"), regions)
        return new(pager, regions, )
    end
end # type GetRegionWithChildrenResponse

const _property_types_GetRegionWithChildrenResponse = Dict{Symbol,String}(Symbol("pager")=>"FlippingPagerDTO", Symbol("regions")=>"RegionDTO", )
OpenAPI.property_type(::Type{ GetRegionWithChildrenResponse }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GetRegionWithChildrenResponse[name]))}

function check_required(o::GetRegionWithChildrenResponse)
    true
end

function OpenAPI.validate_property(::Type{ GetRegionWithChildrenResponse }, name::Symbol, val)
end
