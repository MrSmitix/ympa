# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""UpdateOrderStatusDTO
Список заказов.

    UpdateOrderStatusDTO(;
        id=nothing,
        status=nothing,
        substatus=nothing,
        updateStatus=nothing,
        errorDetails=nothing,
    )

    - id::Int64 : Идентификатор заказа.
    - status::OrderStatusType
    - substatus::OrderSubstatusType
    - updateStatus::OrderUpdateStatusType
    - errorDetails::String : Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. 
"""
Base.@kwdef mutable struct UpdateOrderStatusDTO <: OpenAPI.APIModel
    id::Union{Nothing, Int64} = nothing
    status = nothing # spec type: Union{ Nothing, OrderStatusType }
    substatus = nothing # spec type: Union{ Nothing, OrderSubstatusType }
    updateStatus = nothing # spec type: Union{ Nothing, OrderUpdateStatusType }
    errorDetails::Union{Nothing, String} = nothing

    function UpdateOrderStatusDTO(id, status, substatus, updateStatus, errorDetails, )
        OpenAPI.validate_property(UpdateOrderStatusDTO, Symbol("id"), id)
        OpenAPI.validate_property(UpdateOrderStatusDTO, Symbol("status"), status)
        OpenAPI.validate_property(UpdateOrderStatusDTO, Symbol("substatus"), substatus)
        OpenAPI.validate_property(UpdateOrderStatusDTO, Symbol("updateStatus"), updateStatus)
        OpenAPI.validate_property(UpdateOrderStatusDTO, Symbol("errorDetails"), errorDetails)
        return new(id, status, substatus, updateStatus, errorDetails, )
    end
end # type UpdateOrderStatusDTO

const _property_types_UpdateOrderStatusDTO = Dict{Symbol,String}(Symbol("id")=>"Int64", Symbol("status")=>"OrderStatusType", Symbol("substatus")=>"OrderSubstatusType", Symbol("updateStatus")=>"OrderUpdateStatusType", Symbol("errorDetails")=>"String", )
OpenAPI.property_type(::Type{ UpdateOrderStatusDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_UpdateOrderStatusDTO[name]))}

function check_required(o::UpdateOrderStatusDTO)
    true
end

function OpenAPI.validate_property(::Type{ UpdateOrderStatusDTO }, name::Symbol, val)
    if name === Symbol("id")
        OpenAPI.validate_param(name, "UpdateOrderStatusDTO", :format, val, "int64")
    end
end
