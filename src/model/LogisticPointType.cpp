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



#include "ympa_cpp_restsdk_client/model/LogisticPointType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

LogisticPointType::eLogisticPointType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("WAREHOUSE")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_WAREHOUSE;
    if (val == utility::conversions::to_string_t(U("PICKUP_POINT")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_POINT;
    if (val == utility::conversions::to_string_t(U("PICKUP_TERMINAL")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_TERMINAL;
    if (val == utility::conversions::to_string_t(U("PICKUP_POST_OFFICE")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_POST_OFFICE;
    if (val == utility::conversions::to_string_t(U("PICKUP_MIXED")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_MIXED;
    if (val == utility::conversions::to_string_t(U("PICKUP_RETAIL")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_RETAIL;
    if (val == utility::conversions::to_string_t(U("UNKNOWN")))
        return LogisticPointType::eLogisticPointType::LogisticPointType_UNKNOWN;
    return {};
}

EnumUnderlyingType fromEnum(LogisticPointType::eLogisticPointType e)
{
    switch (e)
    {
    case LogisticPointType::eLogisticPointType::LogisticPointType_WAREHOUSE:
        return U("WAREHOUSE");
    case LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_POINT:
        return U("PICKUP_POINT");
    case LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_TERMINAL:
        return U("PICKUP_TERMINAL");
    case LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_POST_OFFICE:
        return U("PICKUP_POST_OFFICE");
    case LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_MIXED:
        return U("PICKUP_MIXED");
    case LogisticPointType::eLogisticPointType::LogisticPointType_PICKUP_RETAIL:
        return U("PICKUP_RETAIL");
    case LogisticPointType::eLogisticPointType::LogisticPointType_UNKNOWN:
        return U("UNKNOWN");
    default:
        break;
    }
    return {};
}
}

LogisticPointType::LogisticPointType()
{
}

LogisticPointType::~LogisticPointType()
{
}

void LogisticPointType::validate()
{
    // TODO: implement validation
}

web::json::value LogisticPointType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool LogisticPointType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void LogisticPointType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool LogisticPointType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

LogisticPointType::eLogisticPointType LogisticPointType::getValue() const
{
   return m_value;
}

void LogisticPointType::setValue(LogisticPointType::eLogisticPointType const value)
{
   m_value = value;
}


}
}
}
}


