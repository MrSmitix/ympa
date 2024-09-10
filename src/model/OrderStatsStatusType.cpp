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



#include "ympa_cpp_restsdk_client/model/OrderStatsStatusType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrderStatsStatusType::eOrderStatsStatusType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("CANCELLED_BEFORE_PROCESSING")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_CANCELLED_BEFORE_PROCESSING;
    if (val == utility::conversions::to_string_t(U("CANCELLED_IN_DELIVERY")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_CANCELLED_IN_DELIVERY;
    if (val == utility::conversions::to_string_t(U("CANCELLED_IN_PROCESSING")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_CANCELLED_IN_PROCESSING;
    if (val == utility::conversions::to_string_t(U("DELIVERY")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_DELIVERY;
    if (val == utility::conversions::to_string_t(U("DELIVERED")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_DELIVERED;
    if (val == utility::conversions::to_string_t(U("PARTIALLY_DELIVERED")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PARTIALLY_DELIVERED;
    if (val == utility::conversions::to_string_t(U("PARTIALLY_RETURNED")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PARTIALLY_RETURNED;
    if (val == utility::conversions::to_string_t(U("PENDING")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PENDING;
    if (val == utility::conversions::to_string_t(U("PICKUP")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PICKUP;
    if (val == utility::conversions::to_string_t(U("PROCESSING")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PROCESSING;
    if (val == utility::conversions::to_string_t(U("RESERVED")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_RESERVED;
    if (val == utility::conversions::to_string_t(U("RETURNED")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_RETURNED;
    if (val == utility::conversions::to_string_t(U("UNKNOWN")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_UNKNOWN;
    if (val == utility::conversions::to_string_t(U("UNPAID")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_UNPAID;
    if (val == utility::conversions::to_string_t(U("LOST")))
        return OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_LOST;
    return {};
}

EnumUnderlyingType fromEnum(OrderStatsStatusType::eOrderStatsStatusType e)
{
    switch (e)
    {
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_CANCELLED_BEFORE_PROCESSING:
        return U("CANCELLED_BEFORE_PROCESSING");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_CANCELLED_IN_DELIVERY:
        return U("CANCELLED_IN_DELIVERY");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_CANCELLED_IN_PROCESSING:
        return U("CANCELLED_IN_PROCESSING");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_DELIVERY:
        return U("DELIVERY");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_DELIVERED:
        return U("DELIVERED");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PARTIALLY_DELIVERED:
        return U("PARTIALLY_DELIVERED");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PARTIALLY_RETURNED:
        return U("PARTIALLY_RETURNED");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PENDING:
        return U("PENDING");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PICKUP:
        return U("PICKUP");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_PROCESSING:
        return U("PROCESSING");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_RESERVED:
        return U("RESERVED");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_RETURNED:
        return U("RETURNED");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_UNKNOWN:
        return U("UNKNOWN");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_UNPAID:
        return U("UNPAID");
    case OrderStatsStatusType::eOrderStatsStatusType::OrderStatsStatusType_LOST:
        return U("LOST");
    default:
        break;
    }
    return {};
}
}

OrderStatsStatusType::OrderStatsStatusType()
{
}

OrderStatsStatusType::~OrderStatsStatusType()
{
}

void OrderStatsStatusType::validate()
{
    // TODO: implement validation
}

web::json::value OrderStatsStatusType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrderStatsStatusType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrderStatsStatusType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrderStatsStatusType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrderStatsStatusType::eOrderStatsStatusType OrderStatsStatusType::getValue() const
{
   return m_value;
}

void OrderStatsStatusType::setValue(OrderStatsStatusType::eOrderStatsStatusType const value)
{
   m_value = value;
}


}
}
}
}


