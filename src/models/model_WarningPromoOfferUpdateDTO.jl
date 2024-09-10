# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""WarningPromoOfferUpdateDTO
Описание предупреждения, которое появилось при добавлении товара.

    WarningPromoOfferUpdateDTO(;
        offerId=nothing,
        warnings=nothing,
    )

    - offerId::String : Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    - warnings::Vector{PromoOfferUpdateWarningDTO} : Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
"""
Base.@kwdef mutable struct WarningPromoOfferUpdateDTO <: OpenAPI.APIModel
    offerId::Union{Nothing, String} = nothing
    warnings::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{PromoOfferUpdateWarningDTO} }

    function WarningPromoOfferUpdateDTO(offerId, warnings, )
        OpenAPI.validate_property(WarningPromoOfferUpdateDTO, Symbol("offerId"), offerId)
        OpenAPI.validate_property(WarningPromoOfferUpdateDTO, Symbol("warnings"), warnings)
        return new(offerId, warnings, )
    end
end # type WarningPromoOfferUpdateDTO

const _property_types_WarningPromoOfferUpdateDTO = Dict{Symbol,String}(Symbol("offerId")=>"String", Symbol("warnings")=>"Vector{PromoOfferUpdateWarningDTO}", )
OpenAPI.property_type(::Type{ WarningPromoOfferUpdateDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_WarningPromoOfferUpdateDTO[name]))}

function check_required(o::WarningPromoOfferUpdateDTO)
    o.offerId === nothing && (return false)
    o.warnings === nothing && (return false)
    true
end

function OpenAPI.validate_property(::Type{ WarningPromoOfferUpdateDTO }, name::Symbol, val)
    if name === Symbol("offerId")
        OpenAPI.validate_param(name, "WarningPromoOfferUpdateDTO", :maxLength, val, 255)
        OpenAPI.validate_param(name, "WarningPromoOfferUpdateDTO", :minLength, val, 1)
        OpenAPI.validate_param(name, "WarningPromoOfferUpdateDTO", :pattern, val, r"^[^\x00-\x08\x0A-\x1f\x7f]{1,255}$")
    end
end
