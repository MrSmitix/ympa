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



#include "ympa_cpp_restsdk_client/model/OrderPaymentMethodType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

OrderPaymentMethodType::eOrderPaymentMethodType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("CASH_ON_DELIVERY")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_CASH_ON_DELIVERY;
    if (val == utility::conversions::to_string_t(U("CARD_ON_DELIVERY")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_CARD_ON_DELIVERY;
    if (val == utility::conversions::to_string_t(U("BOUND_CARD_ON_DELIVERY")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_BOUND_CARD_ON_DELIVERY;
    if (val == utility::conversions::to_string_t(U("YANDEX")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_YANDEX;
    if (val == utility::conversions::to_string_t(U("APPLE_PAY")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_APPLE_PAY;
    if (val == utility::conversions::to_string_t(U("EXTERNAL_CERTIFICATE")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_EXTERNAL_CERTIFICATE;
    if (val == utility::conversions::to_string_t(U("CREDIT")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_CREDIT;
    if (val == utility::conversions::to_string_t(U("GOOGLE_PAY")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_GOOGLE_PAY;
    if (val == utility::conversions::to_string_t(U("TINKOFF_CREDIT")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_TINKOFF_CREDIT;
    if (val == utility::conversions::to_string_t(U("SBP")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_SBP;
    if (val == utility::conversions::to_string_t(U("TINKOFF_INSTALLMENTS")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_TINKOFF_INSTALLMENTS;
    if (val == utility::conversions::to_string_t(U("B2B_ACCOUNT_PREPAYMENT")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_B2B_ACCOUNT_PREPAYMENT;
    if (val == utility::conversions::to_string_t(U("B2B_ACCOUNT_POSTPAYMENT")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_B2B_ACCOUNT_POSTPAYMENT;
    if (val == utility::conversions::to_string_t(U("UNKNOWN")))
        return OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_UNKNOWN;
    return {};
}

EnumUnderlyingType fromEnum(OrderPaymentMethodType::eOrderPaymentMethodType e)
{
    switch (e)
    {
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_CASH_ON_DELIVERY:
        return U("CASH_ON_DELIVERY");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_CARD_ON_DELIVERY:
        return U("CARD_ON_DELIVERY");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_BOUND_CARD_ON_DELIVERY:
        return U("BOUND_CARD_ON_DELIVERY");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_YANDEX:
        return U("YANDEX");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_APPLE_PAY:
        return U("APPLE_PAY");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_EXTERNAL_CERTIFICATE:
        return U("EXTERNAL_CERTIFICATE");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_CREDIT:
        return U("CREDIT");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_GOOGLE_PAY:
        return U("GOOGLE_PAY");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_TINKOFF_CREDIT:
        return U("TINKOFF_CREDIT");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_SBP:
        return U("SBP");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_TINKOFF_INSTALLMENTS:
        return U("TINKOFF_INSTALLMENTS");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_B2B_ACCOUNT_PREPAYMENT:
        return U("B2B_ACCOUNT_PREPAYMENT");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_B2B_ACCOUNT_POSTPAYMENT:
        return U("B2B_ACCOUNT_POSTPAYMENT");
    case OrderPaymentMethodType::eOrderPaymentMethodType::OrderPaymentMethodType_UNKNOWN:
        return U("UNKNOWN");
    default:
        break;
    }
    return {};
}
}

OrderPaymentMethodType::OrderPaymentMethodType()
{
}

OrderPaymentMethodType::~OrderPaymentMethodType()
{
}

void OrderPaymentMethodType::validate()
{
    // TODO: implement validation
}

web::json::value OrderPaymentMethodType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool OrderPaymentMethodType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void OrderPaymentMethodType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool OrderPaymentMethodType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

OrderPaymentMethodType::eOrderPaymentMethodType OrderPaymentMethodType::getValue() const
{
   return m_value;
}

void OrderPaymentMethodType::setValue(OrderPaymentMethodType::eOrderPaymentMethodType const value)
{
   m_value = value;
}


}
}
}
}


