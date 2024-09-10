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



#include "ympa_cpp_restsdk_client/model/OrdersStatsStockType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrdersStatsStockType::eOrdersStatsStockType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("FIT")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_FIT;
    if (val == utility::conversions::to_string_t(U("FREEZE")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_FREEZE;
    if (val == utility::conversions::to_string_t(U("AVAILABLE")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_AVAILABLE;
    if (val == utility::conversions::to_string_t(U("QUARANTINE")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_QUARANTINE;
    if (val == utility::conversions::to_string_t(U("UTILIZATION")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_UTILIZATION;
    if (val == utility::conversions::to_string_t(U("DEFECT")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_DEFECT;
    if (val == utility::conversions::to_string_t(U("EXPIRED")))
        return OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_EXPIRED;
    return {};
}

EnumUnderlyingType fromEnum(OrdersStatsStockType::eOrdersStatsStockType e)
{
    switch (e)
    {
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_FIT:
        return U("FIT");
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_FREEZE:
        return U("FREEZE");
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_AVAILABLE:
        return U("AVAILABLE");
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_QUARANTINE:
        return U("QUARANTINE");
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_UTILIZATION:
        return U("UTILIZATION");
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_DEFECT:
        return U("DEFECT");
    case OrdersStatsStockType::eOrdersStatsStockType::OrdersStatsStockType_EXPIRED:
        return U("EXPIRED");
    default:
        break;
    }
    return {};
}
}

OrdersStatsStockType::OrdersStatsStockType()
{
}

OrdersStatsStockType::~OrdersStatsStockType()
{
}

void OrdersStatsStockType::validate()
{
    // TODO: implement validation
}

web::json::value OrdersStatsStockType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrdersStatsStockType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrdersStatsStockType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrdersStatsStockType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrdersStatsStockType::eOrdersStatsStockType OrdersStatsStockType::getValue() const
{
   return m_value;
}

void OrdersStatsStockType::setValue(OrdersStatsStockType::eOrdersStatsStockType const value)
{
   m_value = value;
}


}
}
}
}


