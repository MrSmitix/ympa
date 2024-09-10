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



#include "ympa_cpp_restsdk_client/model/OrderDocumentStatusType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrderDocumentStatusType::eOrderDocumentStatusType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("READY")))
        return OrderDocumentStatusType::eOrderDocumentStatusType::OrderDocumentStatusType_READY;
    if (val == utility::conversions::to_string_t(U("NOT_READY")))
        return OrderDocumentStatusType::eOrderDocumentStatusType::OrderDocumentStatusType_NOT_READY;
    return {};
}

EnumUnderlyingType fromEnum(OrderDocumentStatusType::eOrderDocumentStatusType e)
{
    switch (e)
    {
    case OrderDocumentStatusType::eOrderDocumentStatusType::OrderDocumentStatusType_READY:
        return U("READY");
    case OrderDocumentStatusType::eOrderDocumentStatusType::OrderDocumentStatusType_NOT_READY:
        return U("NOT_READY");
    default:
        break;
    }
    return {};
}
}

OrderDocumentStatusType::OrderDocumentStatusType()
{
}

OrderDocumentStatusType::~OrderDocumentStatusType()
{
}

void OrderDocumentStatusType::validate()
{
    // TODO: implement validation
}

web::json::value OrderDocumentStatusType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrderDocumentStatusType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrderDocumentStatusType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrderDocumentStatusType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrderDocumentStatusType::eOrderDocumentStatusType OrderDocumentStatusType::getValue() const
{
   return m_value;
}

void OrderDocumentStatusType::setValue(OrderDocumentStatusType::eOrderDocumentStatusType const value)
{
   m_value = value;
}


}
}
}
}


