# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""CalculateTariffsParametersDTO
Параметры для расчета стоимости услуг.

    CalculateTariffsParametersDTO(;
        campaignId=nothing,
        sellingProgram=nothing,
        frequency=nothing,
    )

    - campaignId::Int64 : Идентификатор кампании. У пользователя, который выполняет запрос, должен быть доступ к этой кампании.  Используйте параметр &#x60;campaignId&#x60;, если уже завершили подключение магазина на Маркете. Иначе вернется пустой список.  Обязательный параметр, если не указан параметр &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке. 
    - sellingProgram::SellingProgramType
    - frequency::PaymentFrequencyType
"""
Base.@kwdef mutable struct CalculateTariffsParametersDTO <: OpenAPI.APIModel
    campaignId::Union{Nothing, Int64} = nothing
    sellingProgram = nothing # spec type: Union{ Nothing, SellingProgramType }
    frequency = nothing # spec type: Union{ Nothing, PaymentFrequencyType }

    function CalculateTariffsParametersDTO(campaignId, sellingProgram, frequency, )
        OpenAPI.validate_property(CalculateTariffsParametersDTO, Symbol("campaignId"), campaignId)
        OpenAPI.validate_property(CalculateTariffsParametersDTO, Symbol("sellingProgram"), sellingProgram)
        OpenAPI.validate_property(CalculateTariffsParametersDTO, Symbol("frequency"), frequency)
        return new(campaignId, sellingProgram, frequency, )
    end
end # type CalculateTariffsParametersDTO

const _property_types_CalculateTariffsParametersDTO = Dict{Symbol,String}(Symbol("campaignId")=>"Int64", Symbol("sellingProgram")=>"SellingProgramType", Symbol("frequency")=>"PaymentFrequencyType", )
OpenAPI.property_type(::Type{ CalculateTariffsParametersDTO }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_CalculateTariffsParametersDTO[name]))}

function check_required(o::CalculateTariffsParametersDTO)
    true
end

function OpenAPI.validate_property(::Type{ CalculateTariffsParametersDTO }, name::Symbol, val)
    if name === Symbol("campaignId")
        OpenAPI.validate_param(name, "CalculateTariffsParametersDTO", :format, val, "int64")
    end
end
