# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""GenerateShipmentListDocumentReportRequest
Данные, необходимые для генерации документа. 

    GenerateShipmentListDocumentReportRequest(;
        campaignId=nothing,
        shipmentId=nothing,
        orderIds=nothing,
    )

    - campaignId::Int64 : Идентификатор кампании.
    - shipmentId::Int64 : Идентификатор отгрузки.
    - orderIds::Vector{Int64} : Фильтр по идентификаторам заказа в отгрузке.
"""
Base.@kwdef mutable struct GenerateShipmentListDocumentReportRequest <: OpenAPI.APIModel
    campaignId::Union{Nothing, Int64} = nothing
    shipmentId::Union{Nothing, Int64} = nothing
    orderIds::Union{Nothing, Vector{Int64}} = nothing

    function GenerateShipmentListDocumentReportRequest(campaignId, shipmentId, orderIds, )
        OpenAPI.validate_property(GenerateShipmentListDocumentReportRequest, Symbol("campaignId"), campaignId)
        OpenAPI.validate_property(GenerateShipmentListDocumentReportRequest, Symbol("shipmentId"), shipmentId)
        OpenAPI.validate_property(GenerateShipmentListDocumentReportRequest, Symbol("orderIds"), orderIds)
        return new(campaignId, shipmentId, orderIds, )
    end
end # type GenerateShipmentListDocumentReportRequest

const _property_types_GenerateShipmentListDocumentReportRequest = Dict{Symbol,String}(Symbol("campaignId")=>"Int64", Symbol("shipmentId")=>"Int64", Symbol("orderIds")=>"Vector{Int64}", )
OpenAPI.property_type(::Type{ GenerateShipmentListDocumentReportRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_GenerateShipmentListDocumentReportRequest[name]))}

function check_required(o::GenerateShipmentListDocumentReportRequest)
    o.campaignId === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ GenerateShipmentListDocumentReportRequest }, name::Symbol, val)
    if name === Symbol("campaignId")
        OpenAPI.validate_param(name, "GenerateShipmentListDocumentReportRequest", :format, val, "int64")
    end
    if name === Symbol("shipmentId")
        OpenAPI.validate_param(name, "GenerateShipmentListDocumentReportRequest", :format, val, "int64")
    end
end
