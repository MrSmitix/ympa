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



#include "ympa_cpp_restsdk_client/model/LicenseCheckStatusType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

LicenseCheckStatusType::eLicenseCheckStatusType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("NEW")))
        return LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_NEW;
    if (val == utility::conversions::to_string_t(U("SUCCESS")))
        return LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_SUCCESS;
    if (val == utility::conversions::to_string_t(U("FAIL")))
        return LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_FAIL;
    if (val == utility::conversions::to_string_t(U("REVOKE")))
        return LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_REVOKE;
    if (val == utility::conversions::to_string_t(U("DONT_WANT")))
        return LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_DONT_WANT;
    if (val == utility::conversions::to_string_t(U("FAIL_MANUAL")))
        return LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_FAIL_MANUAL;
    return {};
}

EnumUnderlyingType fromEnum(LicenseCheckStatusType::eLicenseCheckStatusType e)
{
    switch (e)
    {
    case LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_NEW:
        return U("NEW");
    case LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_SUCCESS:
        return U("SUCCESS");
    case LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_FAIL:
        return U("FAIL");
    case LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_REVOKE:
        return U("REVOKE");
    case LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_DONT_WANT:
        return U("DONT_WANT");
    case LicenseCheckStatusType::eLicenseCheckStatusType::LicenseCheckStatusType_FAIL_MANUAL:
        return U("FAIL_MANUAL");
    default:
        break;
    }
    return {};
}
}

LicenseCheckStatusType::LicenseCheckStatusType()
{
}

LicenseCheckStatusType::~LicenseCheckStatusType()
{
}

void LicenseCheckStatusType::validate()
{
    // TODO: implement validation
}

web::json::value LicenseCheckStatusType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool LicenseCheckStatusType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void LicenseCheckStatusType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool LicenseCheckStatusType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

LicenseCheckStatusType::eLicenseCheckStatusType LicenseCheckStatusType::getValue() const
{
   return m_value;
}

void LicenseCheckStatusType::setValue(LicenseCheckStatusType::eLicenseCheckStatusType const value)
{
   m_value = value;
}


}
}
}
}


