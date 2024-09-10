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



#include "ympa_cpp_restsdk_client/model/OrderItemInstanceType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrderItemInstanceType::eOrderItemInstanceType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("CIS")))
        return OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_CIS;
    if (val == utility::conversions::to_string_t(U("UIN")))
        return OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_UIN;
    if (val == utility::conversions::to_string_t(U("RNPT")))
        return OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_RNPT;
    if (val == utility::conversions::to_string_t(U("GTD")))
        return OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_GTD;
    return {};
}

EnumUnderlyingType fromEnum(OrderItemInstanceType::eOrderItemInstanceType e)
{
    switch (e)
    {
    case OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_CIS:
        return U("CIS");
    case OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_UIN:
        return U("UIN");
    case OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_RNPT:
        return U("RNPT");
    case OrderItemInstanceType::eOrderItemInstanceType::OrderItemInstanceType_GTD:
        return U("GTD");
    default:
        break;
    }
    return {};
}
}

OrderItemInstanceType::OrderItemInstanceType()
{
}

OrderItemInstanceType::~OrderItemInstanceType()
{
}

void OrderItemInstanceType::validate()
{
    // TODO: implement validation
}

web::json::value OrderItemInstanceType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrderItemInstanceType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrderItemInstanceType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrderItemInstanceType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrderItemInstanceType::eOrderItemInstanceType OrderItemInstanceType::getValue() const
{
   return m_value;
}

void OrderItemInstanceType::setValue(OrderItemInstanceType::eOrderItemInstanceType const value)
{
   m_value = value;
}


}
}
}
}


