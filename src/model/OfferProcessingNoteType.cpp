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



#include "ympa_cpp_restsdk_client/model/OfferProcessingNoteType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OfferProcessingNoteType::eOfferProcessingNoteType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("ASSORTMENT")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_ASSORTMENT;
    if (val == utility::conversions::to_string_t(U("CANCELLED")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_CANCELLED;
    if (val == utility::conversions::to_string_t(U("CONFLICTING_INFORMATION")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_CONFLICTING_INFORMATION;
    if (val == utility::conversions::to_string_t(U("OTHER")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_OTHER;
    if (val == utility::conversions::to_string_t(U("DEPARTMENT_FROZEN")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_DEPARTMENT_FROZEN;
    if (val == utility::conversions::to_string_t(U("INCORRECT_INFORMATION")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_INCORRECT_INFORMATION;
    if (val == utility::conversions::to_string_t(U("LEGAL_CONFLICT")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_LEGAL_CONFLICT;
    if (val == utility::conversions::to_string_t(U("NEED_CLASSIFICATION_INFORMATION")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_CLASSIFICATION_INFORMATION;
    if (val == utility::conversions::to_string_t(U("NEED_INFORMATION")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_INFORMATION;
    if (val == utility::conversions::to_string_t(U("NEED_PICTURES")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_PICTURES;
    if (val == utility::conversions::to_string_t(U("NEED_VENDOR")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_VENDOR;
    if (val == utility::conversions::to_string_t(U("NO_CATEGORY")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_CATEGORY;
    if (val == utility::conversions::to_string_t(U("NO_KNOWLEDGE")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_KNOWLEDGE;
    if (val == utility::conversions::to_string_t(U("NO_PARAMETERS_IN_SHOP_TITLE")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_PARAMETERS_IN_SHOP_TITLE;
    if (val == utility::conversions::to_string_t(U("NO_SIZE_MEASURE")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_SIZE_MEASURE;
    if (val == utility::conversions::to_string_t(U("SAMPLE_LINE")))
        return OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_SAMPLE_LINE;
    return {};
}

EnumUnderlyingType fromEnum(OfferProcessingNoteType::eOfferProcessingNoteType e)
{
    switch (e)
    {
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_ASSORTMENT:
        return U("ASSORTMENT");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_CANCELLED:
        return U("CANCELLED");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_CONFLICTING_INFORMATION:
        return U("CONFLICTING_INFORMATION");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_OTHER:
        return U("OTHER");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_DEPARTMENT_FROZEN:
        return U("DEPARTMENT_FROZEN");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_INCORRECT_INFORMATION:
        return U("INCORRECT_INFORMATION");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_LEGAL_CONFLICT:
        return U("LEGAL_CONFLICT");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_CLASSIFICATION_INFORMATION:
        return U("NEED_CLASSIFICATION_INFORMATION");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_INFORMATION:
        return U("NEED_INFORMATION");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_PICTURES:
        return U("NEED_PICTURES");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NEED_VENDOR:
        return U("NEED_VENDOR");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_CATEGORY:
        return U("NO_CATEGORY");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_KNOWLEDGE:
        return U("NO_KNOWLEDGE");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_PARAMETERS_IN_SHOP_TITLE:
        return U("NO_PARAMETERS_IN_SHOP_TITLE");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_NO_SIZE_MEASURE:
        return U("NO_SIZE_MEASURE");
    case OfferProcessingNoteType::eOfferProcessingNoteType::OfferProcessingNoteType_SAMPLE_LINE:
        return U("SAMPLE_LINE");
    default:
        break;
    }
    return {};
}
}

OfferProcessingNoteType::OfferProcessingNoteType()
{
}

OfferProcessingNoteType::~OfferProcessingNoteType()
{
}

void OfferProcessingNoteType::validate()
{
    // TODO: implement validation
}

web::json::value OfferProcessingNoteType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OfferProcessingNoteType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OfferProcessingNoteType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OfferProcessingNoteType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OfferProcessingNoteType::eOfferProcessingNoteType OfferProcessingNoteType::getValue() const
{
   return m_value;
}

void OfferProcessingNoteType::setValue(OfferProcessingNoteType::eOfferProcessingNoteType const value)
{
   m_value = value;
}


}
}
}
}


