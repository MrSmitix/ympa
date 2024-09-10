# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""SearchShipmentsRequest
Запрос информации об отгрузках.

    SearchShipmentsRequest(;
        dateFrom=nothing,
        dateTo=nothing,
        statuses=nothing,
        orderIds=nothing,
        cancelledOrders=true,
    )

    - dateFrom::Date : Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    - dateTo::Date : Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    - statuses::Vector{ShipmentStatusType} : Список статусов отгрузок.
    - orderIds::Vector{Int64} : Список идентификаторов заказов из отгрузок.
    - cancelledOrders::Bool : Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. 
"""
Base.@kwdef mutable struct SearchShipmentsRequest <: OpenAPI.APIModel
    dateFrom::Union{Nothing, Date} = nothing
    dateTo::Union{Nothing, Date} = nothing
    statuses::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{ShipmentStatusType} }
    orderIds::Union{Nothing, Vector{Int64}} = nothing
    cancelledOrders::Union{Nothing, Bool} = true

    function SearchShipmentsRequest(dateFrom, dateTo, statuses, orderIds, cancelledOrders, )
        OpenAPI.validate_property(SearchShipmentsRequest, Symbol("dateFrom"), dateFrom)
        OpenAPI.validate_property(SearchShipmentsRequest, Symbol("dateTo"), dateTo)
        OpenAPI.validate_property(SearchShipmentsRequest, Symbol("statuses"), statuses)
        OpenAPI.validate_property(SearchShipmentsRequest, Symbol("orderIds"), orderIds)
        OpenAPI.validate_property(SearchShipmentsRequest, Symbol("cancelledOrders"), cancelledOrders)
        return new(dateFrom, dateTo, statuses, orderIds, cancelledOrders, )
    end
end # type SearchShipmentsRequest

const _property_types_SearchShipmentsRequest = Dict{Symbol,String}(Symbol("dateFrom")=>"Date", Symbol("dateTo")=>"Date", Symbol("statuses")=>"Vector{ShipmentStatusType}", Symbol("orderIds")=>"Vector{Int64}", Symbol("cancelledOrders")=>"Bool", )
OpenAPI.property_type(::Type{ SearchShipmentsRequest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_SearchShipmentsRequest[name]))}

function check_required(o::SearchShipmentsRequest)
    o.dateFrom === nothing && (return false)
    o.dateTo === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ SearchShipmentsRequest }, name::Symbol, val)
    if name === Symbol("dateFrom")
        OpenAPI.validate_param(name, "SearchShipmentsRequest", :format, val, "date")
    end
    if name === Symbol("dateTo")
        OpenAPI.validate_param(name, "SearchShipmentsRequest", :format, val, "date")
    end
    if name === Symbol("statuses")
        OpenAPI.validate_param(name, "SearchShipmentsRequest", :minItems, val, 1)
        OpenAPI.validate_param(name, "SearchShipmentsRequest", :uniqueItems, val, true)
    end
    if name === Symbol("orderIds")
        OpenAPI.validate_param(name, "SearchShipmentsRequest", :minItems, val, 1)
        OpenAPI.validate_param(name, "SearchShipmentsRequest", :uniqueItems, val, true)
    end
end
