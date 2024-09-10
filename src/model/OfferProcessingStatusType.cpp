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



#include "ympa_cpp_restsdk_client/model/OfferProcessingStatusType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OfferProcessingStatusType::eOfferProcessingStatusType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("UNKNOWN")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_UNKNOWN;
    if (val == utility::conversions::to_string_t(U("READY")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_READY;
    if (val == utility::conversions::to_string_t(U("IN_WORK")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_IN_WORK;
    if (val == utility::conversions::to_string_t(U("NEED_INFO")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_NEED_INFO;
    if (val == utility::conversions::to_string_t(U("NEED_MAPPING")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_NEED_MAPPING;
    if (val == utility::conversions::to_string_t(U("NEED_CONTENT")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_NEED_CONTENT;
    if (val == utility::conversions::to_string_t(U("CONTENT_PROCESSING")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_CONTENT_PROCESSING;
    if (val == utility::conversions::to_string_t(U("SUSPENDED")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_SUSPENDED;
    if (val == utility::conversions::to_string_t(U("REJECTED")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_REJECTED;
    if (val == utility::conversions::to_string_t(U("REVIEW")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_REVIEW;
    if (val == utility::conversions::to_string_t(U("CREATE_ERROR")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_CREATE_ERROR;
    if (val == utility::conversions::to_string_t(U("UPDATE_ERROR")))
        return OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_UPDATE_ERROR;
    return {};
}

EnumUnderlyingType fromEnum(OfferProcessingStatusType::eOfferProcessingStatusType e)
{
    switch (e)
    {
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_UNKNOWN:
        return U("UNKNOWN");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_READY:
        return U("READY");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_IN_WORK:
        return U("IN_WORK");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_NEED_INFO:
        return U("NEED_INFO");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_NEED_MAPPING:
        return U("NEED_MAPPING");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_NEED_CONTENT:
        return U("NEED_CONTENT");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_CONTENT_PROCESSING:
        return U("CONTENT_PROCESSING");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_SUSPENDED:
        return U("SUSPENDED");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_REJECTED:
        return U("REJECTED");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_REVIEW:
        return U("REVIEW");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_CREATE_ERROR:
        return U("CREATE_ERROR");
    case OfferProcessingStatusType::eOfferProcessingStatusType::OfferProcessingStatusType_UPDATE_ERROR:
        return U("UPDATE_ERROR");
    default:
        break;
    }
    return {};
}
}

OfferProcessingStatusType::OfferProcessingStatusType()
{
}

OfferProcessingStatusType::~OfferProcessingStatusType()
{
}

void OfferProcessingStatusType::validate()
{
    // TODO: implement validation
}

web::json::value OfferProcessingStatusType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OfferProcessingStatusType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OfferProcessingStatusType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OfferProcessingStatusType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OfferProcessingStatusType::eOfferProcessingStatusType OfferProcessingStatusType::getValue() const
{
   return m_value;
}

void OfferProcessingStatusType::setValue(OfferProcessingStatusType::eOfferProcessingStatusType const value)
{
   m_value = value;
}


}
}
}
}


