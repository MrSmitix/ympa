# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""OrderDTO
Заказ.

    OrderDTO(;
        id=nothing,
        status=nothing,
        substatus=nothing,
        creationDate=nothing,
        updatedAt=nothing,
        currency=nothing,
        itemsTotal=nothing,
        deliveryTotal=nothing,
        buyerItemsTotal=nothing,
        buyerTotal=nothing,
        buyerItemsTotalBeforeDiscount=nothing,
        buyerTotalBeforeDiscount=nothing,
        paymentType=nothing,
        paymentMethod=nothing,
        fake=nothing,
        items=nothing,
        subsidies=nothing,
        delivery=nothing,
        buyer=nothing,
        notes=nothing,
        taxSystem=nothing,
        cancelRequested=nothing,
        expiryDate=nothing,
    )

    - id::Int64 : Идентификатор заказа.
    - status::OrderStatusType
    - substatus::OrderSubstatusType
    - creationDate::String
    - updatedAt::String
    - currency::CurrencyType
    - itemsTotal::Float64 : Платеж покупателя. 
    - deliveryTotal::Float64 : Стоимость доставки. 
    - buyerItemsTotal::Float64 : {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и без учета стоимости доставки. 
    - buyerTotal::Float64 : {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя после применения скидок и с учетом стоимости доставки. 
    - buyerItemsTotalBeforeDiscount::Float64 : Стоимость всех товаров в заказе в валюте покупателя без учета стоимости доставки и до применения скидок по:  * акциям; * купонам; * промокодам. 
    - buyerTotalBeforeDiscount::Float64 : {% note warning \&quot;\&quot; %}  Этот параметр устарел.  {% endnote %}  Стоимость всех товаров в заказе в валюте покупателя до применения скидок и с учетом стоимости доставки (&#x60;buyerItemsTotalBeforeDiscount&#x60; + стоимость доставки). 
    - paymentType::OrderPaymentType
    - paymentMethod::OrderPaymentMethodType
    - fake::Bool : Тип заказа:  * &#x60;false&#x60; — настоящий заказ покупателя.  * &#x60;true&#x60; — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    - items::Vector{OrderItemDTO} : Список товаров в заказе.
    - subsidies::Vector{OrderSubsidyDTO} : Список субсидий по типам.
    - delivery::OrderDeliveryDTO
    - buyer::OrderBuyerDTO
    - notes::String : Комментарий к заказу.
    - taxSystem::OrderTaxSystemType
    - cancelRequested::Bool : **Только для модели DBS**  Запрошена ли отмена. 
    - expiryDate::String
"""
Base.@kwdef mutable struct OrderDTO <: OpenAPI.APIModel
    id::Union{Nothing, Int64} = nothing
    status = nothing # spec type: Union{ Nothing, OrderStatusType }
    substatus = nothing # spec type: Union{ Nothing, OrderSubstatusType }
    creationDate::Union{Nothing, String} = nothing
    updatedAt::Union{Nothing, String} = nothing
    currency = nothing # spec type: Union{ Nothing, CurrencyType }
    itemsTotal::Union{Nothing, Float64} = nothing
    deliveryTotal::Union{Nothing, Float64} = nothing
    buyerItemsTotal::Union{Nothing, Float64} = nothing
    buyerTotal::Union{Nothing, Float64} = nothing
    buyerItemsTotalBeforeDiscount::Union{Nothing, Float64} = nothing
    buyerTotalBeforeDiscount::Union{Nothing, Float64} = nothing
    paymentType = nothing # spec type: Union{ Nothing, OrderPaymentType }
    paymentMethod = nothing # spec type: Union{ Nothing, OrderPaymentMethodType }
    fake::Union{Nothing, Bool} = nothing
    items::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OrderItemDTO} }
    subsidies::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{OrderSubsidyDTO} }
    delivery = nothing # spec type: Union{ Nothing, OrderDeliveryDTO }
    buyer = nothing # spec type: Union{ Nothing, OrderBuyerDTO }
    notes::Union{Nothing, String} = nothing
    taxSystem = nothing # spec type: Union{ Nothing, OrderTaxSystemType }
    cancelRequested::Union{Nothing, Bool} = nothing
    expiryDate::Union{Nothing, String} = nothing

    function OrderDTO(id, status, substatus, creationDate, updatedAt, currency, itemsTotal, deliveryTotal, buyerItemsTotal, buyerTotal, buyerItemsTotalBeforeDiscount, buyerTotalBeforeDiscount, paymentType, paymentMethod, fake, items, subsidies, delivery, buyer, notes, taxSystem, cancelRequested, expiryDate, )
        OpenAPI.validate_property(OrderDTO, Symbol("id"), id)
        OpenAPI.validate_property(OrderDTO, Symbol("status"), status)
        OpenAPI.validate_property(OrderDTO, Symbol("substatus"), substatus)
        OpenAPI.validate_property(OrderDTO, Symbol("creationDate"), creationDate)
        OpenAPI.validate_property(OrderDTO, Symbol("updatedAt"), updatedAt)
        OpenAPI.validate_property(OrderDTO, Symbol("currency"), currency)
        OpenAPI.validate_property(OrderDTO, Symbol("itemsTotal"), itemsTotal)
        OpenAPI.validate_property(OrderDTO, Symbol("deliveryTotal"), deliveryTotal)
        OpenAPI.validate_property(OrderDTO, Symbol("buyerItemsTotal"), buyerItemsTotal)
        OpenAPI.validate_property(OrderDTO, Symbol("buyerTotal"), buyerTotal)
        OpenAPI.validate_property(OrderDTO, Symbol("buyerItemsTotalBeforeDiscount"), buyerItemsTotalBeforeDiscount)
        OpenAPI.validate_property(OrderDTO, Symbol("buyerTotalBeforeDiscount"), buyerTotalBeforeDiscount)
        OpenAPI.validate_property(OrderDTO, Symbol("paymentType"), paymentType)
        OpenAPI.validate_property(OrderDTO, Symbol("paymentMethod"), paymentMethod)
        OpenAPI.validate_property(OrderDTO, Symbol("fake"), fake)
        OpenAPI.validate_property(OrderDTO, Symbol("items"), items)
        OpenAPI.validate_property(OrderDTO, Symbol("subsidies"), subsidies)
        OpenAPI.validate_property(OrderDTO, Symbol("delivery"), delivery)
        OpenAPI.validate_property(OrderDTO, Symbol("buyer"), buyer)
        OpenAPI.validate_property(OrderDTO, Symbol("notes"), notes)
        OpenAPI.validate_property(OrderDTO, Symbol("taxSystem"), taxSystem)
        OpenAPI.validate_property(OrderDTO, Symbol("cancelRequested"), cancelRequested)
        OpenAPI.validate_property(OrderDTO, Symbol("expiryDate"), expiryDate)
        return new(id, status, substatus, creationDate, updatedAt, currency, itemsTotal, deliveryTotal, buyerItemsTotal, buyerTotal, buyerItemsTotalBeforeDiscount, buyerTotalBeforeDiscount, paymentType, paymentMethod, fake, items, subsidies, delivery, buyer, notes, taxSystem, cancelRequested, expiryDate, )
    end
end # type OrderDTO

const _property_types_OrderDTO = Dict{Symbol,String}(Symbol("id")=>"Int64", Symbol("status")=>"OrderStatusType", Symbol("substatus")=>"OrderSubstatusType", Symbol("creationDate")=>"String", Symbol("updatedAt")=>"String", Symbol("currency")=>"CurrencyType", Symbol("itemsTotal")=>"Float64", Symbol("deliveryTotal")=>"Float64", Symbol("buyerItemsTotal")=>"Float64", Symbol("buyerTotal")=>"Float64", Symbol("buyerItemsTotalBeforeDiscount")=>"Float64", Symbol("buyerTotalBeforeDiscount")=>"Float64", Symbol("paymentType")=>"OrderPaymentType", Symbol("paymentMethod")=>"OrderPaymentMethodType", Symbol("fake")=>"Bool", Symbol("items")=>"Vector{OrderItemDTO}", Symbol("subsidies")=>"Vector{OrderSubsidyDTO}", Symbol("delivery")=>"OrderDeliveryDTO", Symbol("buyer")=>"OrderBuyerDTO", Symbol("notes")=>"String", Symbol("taxSystem")=>"OrderTaxSystemType", Symbol("cancelRequested")=>"Bool", Symbol("expiryDate")=>"String", )
OpenAPI.property_type(::Type{ OrderDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_OrderDTO[name]))}

function check_required(o::OrderDTO)
    o.items === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ OrderDTO }, name::Symbol, val)
    if name === Symbol("id")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "int64")
    end
    if name === Symbol("creationDate")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "date-dd-MM-yyyy-HH-mm-ss")
    end
    if name === Symbol("updatedAt")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "date-dd-MM-yyyy-HH-mm-ss")
    end
    if name === Symbol("itemsTotal")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "decimal")
    end
    if name === Symbol("deliveryTotal")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "decimal")
    end
    if name === Symbol("buyerItemsTotal")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "decimal")
    end
    if name === Symbol("buyerTotal")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "decimal")
    end
    if name === Symbol("buyerItemsTotalBeforeDiscount")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "decimal")
    end
    if name === Symbol("buyerTotalBeforeDiscount")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "decimal")
    end
    if name === Symbol("expiryDate")
        OpenAPI.validate_param(name, "OrderDTO", :format, val, "date-dd-MM-yyyy-HH-mm-ss")
    end
end
