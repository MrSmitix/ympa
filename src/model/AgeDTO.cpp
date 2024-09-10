/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "ympa_cpp_restsdk_client/model/AgeDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



AgeDTO::AgeDTO()
{
    m_Value = 0.0;
    m_ValueIsSet = false;
    m_AgeUnitIsSet = false;
}

AgeDTO::~AgeDTO()
{
}

void AgeDTO::validate()
{
    // TODO: implement validation
}

web::json::value AgeDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ValueIsSet)
    {
        val[utility::conversions::to_string_t(U("value"))] = ModelBase::toJson(m_Value);
    }
    if(m_AgeUnitIsSet)
    {
        val[utility::conversions::to_string_t(U("ageUnit"))] = ModelBase::toJson(m_AgeUnit);
    }

    return val;
}

bool AgeDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("value"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("value")));
        if(!fieldValue.is_null())
        {
            double refVal_setValue;
            ok &= ModelBase::fromJson(fieldValue, refVal_setValue);
            setValue(refVal_setValue);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ageUnit"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ageUnit")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<AgeUnitType> refVal_setAgeUnit;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAgeUnit);
            setAgeUnit(refVal_setAgeUnit);
        }
    }
    return ok;
}

void AgeDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("value")), m_Value));
    }
    if(m_AgeUnitIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ageUnit")), m_AgeUnit));
    }
}

bool AgeDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("value"))))
    {
        double refVal_setValue;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("value"))), refVal_setValue );
        setValue(refVal_setValue);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ageUnit"))))
    {
        std::shared_ptr<AgeUnitType> refVal_setAgeUnit;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ageUnit"))), refVal_setAgeUnit );
        setAgeUnit(refVal_setAgeUnit);
    }
    return ok;
}

double AgeDTO::getValue() const
{
    return m_Value;
}

void AgeDTO::setValue(double value)
{
    m_Value = value;
    m_ValueIsSet = true;
}

bool AgeDTO::valueIsSet() const
{
    return m_ValueIsSet;
}

void AgeDTO::unsetValue()
{
    m_ValueIsSet = false;
}
std::shared_ptr<AgeUnitType> AgeDTO::getAgeUnit() const
{
    return m_AgeUnit;
}

void AgeDTO::setAgeUnit(const std::shared_ptr<AgeUnitType>& value)
{
    m_AgeUnit = value;
    m_AgeUnitIsSet = true;
}

bool AgeDTO::ageUnitIsSet() const
{
    return m_AgeUnitIsSet;
}

void AgeDTO::unsetAgeUnit()
{
    m_AgeUnitIsSet = false;
}
}
}
}
}


