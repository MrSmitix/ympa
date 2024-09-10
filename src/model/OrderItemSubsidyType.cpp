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



#include "ympa_cpp_restsdk_client/model/OrderItemSubsidyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrderItemSubsidyType::eOrderItemSubsidyType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("YANDEX_CASHBACK")))
        return OrderItemSubsidyType::eOrderItemSubsidyType::OrderItemSubsidyType_YANDEX_CASHBACK;
    if (val == utility::conversions::to_string_t(U("SUBSIDY")))
        return OrderItemSubsidyType::eOrderItemSubsidyType::OrderItemSubsidyType_SUBSIDY;
    return {};
}

EnumUnderlyingType fromEnum(OrderItemSubsidyType::eOrderItemSubsidyType e)
{
    switch (e)
    {
    case OrderItemSubsidyType::eOrderItemSubsidyType::OrderItemSubsidyType_YANDEX_CASHBACK:
        return U("YANDEX_CASHBACK");
    case OrderItemSubsidyType::eOrderItemSubsidyType::OrderItemSubsidyType_SUBSIDY:
        return U("SUBSIDY");
    default:
        break;
    }
    return {};
}
}

OrderItemSubsidyType::OrderItemSubsidyType()
{
}

OrderItemSubsidyType::~OrderItemSubsidyType()
{
}

void OrderItemSubsidyType::validate()
{
    // TODO: implement validation
}

web::json::value OrderItemSubsidyType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrderItemSubsidyType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrderItemSubsidyType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrderItemSubsidyType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrderItemSubsidyType::eOrderItemSubsidyType OrderItemSubsidyType::getValue() const
{
   return m_value;
}

void OrderItemSubsidyType::setValue(OrderItemSubsidyType::eOrderItemSubsidyType const value)
{
   m_value = value;
}


}
}
}
}


