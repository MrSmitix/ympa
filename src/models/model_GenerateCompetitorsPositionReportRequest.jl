# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GenerateCompetitorsPositionReportRequest
Данные, необходимые для генерации отчета.

    GenerateCompetitorsPositionReportRequest(;
        businessId=nothing,
        categoryId=nothing,
        dateFrom=nothing,
        dateTo=nothing,
    )

    - businessId::Int64 : Идентификатор бизнеса.
    - categoryId::Int64 : Идентификатор категории.
    - dateFrom::Date : Начало периода, включительно.
    - dateTo::Date : Конец периода, включительно.
"""
Base.@kwdef mutable struct GenerateCompetitorsPositionReportRequest <: OpenAPI.APIModel
    businessId::Union{Nothing, Int64} = nothing
    categoryId::Union{Nothing, Int64} = nothing
    dateFrom::Union{Nothing, Date} = nothing
    dateTo::Union{Nothing, Date} = nothing

    function GenerateCompetitorsPositionReportRequest(businessId, categoryId, dateFrom, dateTo, )
        OpenAPI.validate_property(GenerateCompetitorsPositionReportRequest, Symbol("businessId"), businessId)
        OpenAPI.validate_property(GenerateCompetitorsPositionReportRequest, Symbol("categoryId"), categoryId)
        OpenAPI.validate_property(GenerateCompetitorsPositionReportRequest, Symbol("dateFrom"), dateFrom)
        OpenAPI.validate_property(GenerateCompetitorsPositionReportRequest, Symbol("dateTo"), dateTo)
        return new(businessId, categoryId, dateFrom, dateTo, )
    end
end # type GenerateCompetitorsPositionReportRequest

const _property_types_GenerateCompetitorsPositionReportRequest = Dict{Symbol,String}(Symbol("businessId")=>"Int64", Symbol("categoryId")=>"Int64", Symbol("dateFrom")=>"Date", Symbol("dateTo")=>"Date", )
OpenAPI.property_type(::Type{ GenerateCompetitorsPositionReportRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GenerateCompetitorsPositionReportRequest[name]))}

function check_required(o::GenerateCompetitorsPositionReportRequest)
    o.businessId === nothing && (return false)
    o.categoryId === nothing && (return false)
    o.dateFrom === nothing && (return false)
    o.dateTo === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GenerateCompetitorsPositionReportRequest }, name::Symbol, val)
    if name === Symbol("businessId")
        OpenAPI.validate_param(name, "GenerateCompetitorsPositionReportRequest", :format, val, "int64")
    end
    if name === Symbol("categoryId")
        OpenAPI.validate_param(name, "GenerateCompetitorsPositionReportRequest", :format, val, "int64")
    end
    if name === Symbol("dateFrom")
        OpenAPI.validate_param(name, "GenerateCompetitorsPositionReportRequest", :format, val, "date")
    end
    if name === Symbol("dateTo")
        OpenAPI.validate_param(name, "GenerateCompetitorsPositionReportRequest", :format, val, "date")
    end
end
