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



#include "ympa_cpp_restsdk_client/model/OfferConditionQualityType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OfferConditionQualityType::eOfferConditionQualityType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("PERFECT")))
        return OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_PERFECT;
    if (val == utility::conversions::to_string_t(U("EXCELLENT")))
        return OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_EXCELLENT;
    if (val == utility::conversions::to_string_t(U("GOOD")))
        return OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_GOOD;
    if (val == utility::conversions::to_string_t(U("NOT_SPECIFIED")))
        return OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_NOT_SPECIFIED;
    return {};
}

EnumUnderlyingType fromEnum(OfferConditionQualityType::eOfferConditionQualityType e)
{
    switch (e)
    {
    case OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_PERFECT:
        return U("PERFECT");
    case OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_EXCELLENT:
        return U("EXCELLENT");
    case OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_GOOD:
        return U("GOOD");
    case OfferConditionQualityType::eOfferConditionQualityType::OfferConditionQualityType_NOT_SPECIFIED:
        return U("NOT_SPECIFIED");
    default:
        break;
    }
    return {};
}
}

OfferConditionQualityType::OfferConditionQualityType()
{
}

OfferConditionQualityType::~OfferConditionQualityType()
{
}

void OfferConditionQualityType::validate()
{
    // TODO: implement validation
}

web::json::value OfferConditionQualityType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OfferConditionQualityType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OfferConditionQualityType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OfferConditionQualityType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }
    {
        EnumUnderlyingType e;
        ok = ModelBase::fromHttpContent(multipart->getContent(namePrefix), e);
        if (ok)
        {
            auto v = toEnum(e);
            setValue(v);
        }
    }
    return ok;
}

OfferConditionQualityType::eOfferConditionQualityType OfferConditionQualityType::getValue() const
{
   return m_value;
}

void OfferConditionQualityType::setValue(OfferConditionQualityType::eOfferConditionQualityType const value)
{
   m_value = value;
}


}
}
}
}


