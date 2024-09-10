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



#include "ympa_cpp_restsdk_client/model/OrderUpdateStatusType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrderUpdateStatusType::eOrderUpdateStatusType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("OK")))
        return OrderUpdateStatusType::eOrderUpdateStatusType::OrderUpdateStatusType_OK;
    if (val == utility::conversions::to_string_t(U("ERROR")))
        return OrderUpdateStatusType::eOrderUpdateStatusType::OrderUpdateStatusType_ERROR;
    return {};
}

EnumUnderlyingType fromEnum(OrderUpdateStatusType::eOrderUpdateStatusType e)
{
    switch (e)
    {
    case OrderUpdateStatusType::eOrderUpdateStatusType::OrderUpdateStatusType_OK:
        return U("OK");
    case OrderUpdateStatusType::eOrderUpdateStatusType::OrderUpdateStatusType_ERROR:
        return U("ERROR");
    default:
        break;
    }
    return {};
}
}

OrderUpdateStatusType::OrderUpdateStatusType()
{
}

OrderUpdateStatusType::~OrderUpdateStatusType()
{
}

void OrderUpdateStatusType::validate()
{
    // TODO: implement validation
}

web::json::value OrderUpdateStatusType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrderUpdateStatusType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrderUpdateStatusType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrderUpdateStatusType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrderUpdateStatusType::eOrderUpdateStatusType OrderUpdateStatusType::getValue() const
{
   return m_value;
}

void OrderUpdateStatusType::setValue(OrderUpdateStatusType::eOrderUpdateStatusType const value)
{
   m_value = value;
}


}
}
}
}


