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



#include "ympa_cpp_restsdk_client/model/TimeUnitType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

TimeUnitType::eTimeUnitType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("HOUR")))
        return TimeUnitType::eTimeUnitType::TimeUnitType_HOUR;
    if (val == utility::conversions::to_string_t(U("DAY")))
        return TimeUnitType::eTimeUnitType::TimeUnitType_DAY;
    if (val == utility::conversions::to_string_t(U("WEEK")))
        return TimeUnitType::eTimeUnitType::TimeUnitType_WEEK;
    if (val == utility::conversions::to_string_t(U("MONTH")))
        return TimeUnitType::eTimeUnitType::TimeUnitType_MONTH;
    if (val == utility::conversions::to_string_t(U("YEAR")))
        return TimeUnitType::eTimeUnitType::TimeUnitType_YEAR;
    return {};
}

EnumUnderlyingType fromEnum(TimeUnitType::eTimeUnitType e)
{
    switch (e)
    {
    case TimeUnitType::eTimeUnitType::TimeUnitType_HOUR:
        return U("HOUR");
    case TimeUnitType::eTimeUnitType::TimeUnitType_DAY:
        return U("DAY");
    case TimeUnitType::eTimeUnitType::TimeUnitType_WEEK:
        return U("WEEK");
    case TimeUnitType::eTimeUnitType::TimeUnitType_MONTH:
        return U("MONTH");
    case TimeUnitType::eTimeUnitType::TimeUnitType_YEAR:
        return U("YEAR");
    default:
        break;
    }
    return {};
}
}

TimeUnitType::TimeUnitType()
{
}

TimeUnitType::~TimeUnitType()
{
}

void TimeUnitType::validate()
{
    // TODO: implement validation
}

web::json::value TimeUnitType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool TimeUnitType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void TimeUnitType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool TimeUnitType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

TimeUnitType::eTimeUnitType TimeUnitType::getValue() const
{
   return m_value;
}

void TimeUnitType::setValue(TimeUnitType::eTimeUnitType const value)
{
   m_value = value;
}


}
}
}
}


