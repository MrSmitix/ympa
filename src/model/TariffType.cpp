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



#include "ympa_cpp_restsdk_client/model/TariffType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {


namespace
{
using EnumUnderlyingType = utility::string_t;

TariffType::eTariffType toEnum(const EnumUnderlyingType& val)
{
    if (val == utility::conversions::to_string_t(U("AGENCY_COMMISSION")))
        return TariffType::eTariffType::TariffType_AGENCY_COMMISSION;
    if (val == utility::conversions::to_string_t(U("PAYMENT_TRANSFER")))
        return TariffType::eTariffType::TariffType_PAYMENT_TRANSFER;
    if (val == utility::conversions::to_string_t(U("STORAGE")))
        return TariffType::eTariffType::TariffType_STORAGE;
    if (val == utility::conversions::to_string_t(U("WITHDRAW")))
        return TariffType::eTariffType::TariffType_WITHDRAW;
    if (val == utility::conversions::to_string_t(U("SURPLUS")))
        return TariffType::eTariffType::TariffType_SURPLUS;
    if (val == utility::conversions::to_string_t(U("FEE")))
        return TariffType::eTariffType::TariffType_FEE;
    if (val == utility::conversions::to_string_t(U("DELIVERY_TO_CUSTOMER")))
        return TariffType::eTariffType::TariffType_DELIVERY_TO_CUSTOMER;
    if (val == utility::conversions::to_string_t(U("CROSSREGIONAL_DELIVERY")))
        return TariffType::eTariffType::TariffType_CROSSREGIONAL_DELIVERY;
    if (val == utility::conversions::to_string_t(U("CROSSREGIONAL_DELIVERY_RETURN")))
        return TariffType::eTariffType::TariffType_CROSSREGIONAL_DELIVERY_RETURN;
    if (val == utility::conversions::to_string_t(U("DISPOSAL")))
        return TariffType::eTariffType::TariffType_DISPOSAL;
    if (val == utility::conversions::to_string_t(U("SORTING_CENTER_STORAGE")))
        return TariffType::eTariffType::TariffType_SORTING_CENTER_STORAGE;
    if (val == utility::conversions::to_string_t(U("EXPRESS_DELIVERY")))
        return TariffType::eTariffType::TariffType_EXPRESS_DELIVERY;
    if (val == utility::conversions::to_string_t(U("FF_XDOC_SUPPLY_BOX")))
        return TariffType::eTariffType::TariffType_FF_XDOC_SUPPLY_BOX;
    if (val == utility::conversions::to_string_t(U("FF_XDOC_SUPPLY_PALLET")))
        return TariffType::eTariffType::TariffType_FF_XDOC_SUPPLY_PALLET;
    if (val == utility::conversions::to_string_t(U("SORTING")))
        return TariffType::eTariffType::TariffType_SORTING;
    if (val == utility::conversions::to_string_t(U("MIDDLE_MILE")))
        return TariffType::eTariffType::TariffType_MIDDLE_MILE;
    if (val == utility::conversions::to_string_t(U("RETURN_PROCESSING")))
        return TariffType::eTariffType::TariffType_RETURN_PROCESSING;
    if (val == utility::conversions::to_string_t(U("EXPRESS_CANCELLED_BY_PARTNER")))
        return TariffType::eTariffType::TariffType_EXPRESS_CANCELLED_BY_PARTNER;
    if (val == utility::conversions::to_string_t(U("DELIVERY_TO_CUSTOMER_RETURN")))
        return TariffType::eTariffType::TariffType_DELIVERY_TO_CUSTOMER_RETURN;
    if (val == utility::conversions::to_string_t(U("CROSSBORDER_DELIVERY")))
        return TariffType::eTariffType::TariffType_CROSSBORDER_DELIVERY;
    if (val == utility::conversions::to_string_t(U("INTAKE_SORTING_BULKY_CARGO")))
        return TariffType::eTariffType::TariffType_INTAKE_SORTING_BULKY_CARGO;
    if (val == utility::conversions::to_string_t(U("INTAKE_SORTING_SMALL_GOODS")))
        return TariffType::eTariffType::TariffType_INTAKE_SORTING_SMALL_GOODS;
    if (val == utility::conversions::to_string_t(U("INTAKE_SORTING_DAILY")))
        return TariffType::eTariffType::TariffType_INTAKE_SORTING_DAILY;
    if (val == utility::conversions::to_string_t(U("FF_STORAGE_BILLING")))
        return TariffType::eTariffType::TariffType_FF_STORAGE_BILLING;
    if (val == utility::conversions::to_string_t(U("CANCELLED_ORDER_FEE_QI")))
        return TariffType::eTariffType::TariffType_CANCELLED_ORDER_FEE_QI;
    if (val == utility::conversions::to_string_t(U("LATE_ORDER_EXECUTION_FEE_QI")))
        return TariffType::eTariffType::TariffType_LATE_ORDER_EXECUTION_FEE_QI;
    return {};
}

EnumUnderlyingType fromEnum(TariffType::eTariffType e)
{
    switch (e)
    {
    case TariffType::eTariffType::TariffType_AGENCY_COMMISSION:
        return U("AGENCY_COMMISSION");
    case TariffType::eTariffType::TariffType_PAYMENT_TRANSFER:
        return U("PAYMENT_TRANSFER");
    case TariffType::eTariffType::TariffType_STORAGE:
        return U("STORAGE");
    case TariffType::eTariffType::TariffType_WITHDRAW:
        return U("WITHDRAW");
    case TariffType::eTariffType::TariffType_SURPLUS:
        return U("SURPLUS");
    case TariffType::eTariffType::TariffType_FEE:
        return U("FEE");
    case TariffType::eTariffType::TariffType_DELIVERY_TO_CUSTOMER:
        return U("DELIVERY_TO_CUSTOMER");
    case TariffType::eTariffType::TariffType_CROSSREGIONAL_DELIVERY:
        return U("CROSSREGIONAL_DELIVERY");
    case TariffType::eTariffType::TariffType_CROSSREGIONAL_DELIVERY_RETURN:
        return U("CROSSREGIONAL_DELIVERY_RETURN");
    case TariffType::eTariffType::TariffType_DISPOSAL:
        return U("DISPOSAL");
    case TariffType::eTariffType::TariffType_SORTING_CENTER_STORAGE:
        return U("SORTING_CENTER_STORAGE");
    case TariffType::eTariffType::TariffType_EXPRESS_DELIVERY:
        return U("EXPRESS_DELIVERY");
    case TariffType::eTariffType::TariffType_FF_XDOC_SUPPLY_BOX:
        return U("FF_XDOC_SUPPLY_BOX");
    case TariffType::eTariffType::TariffType_FF_XDOC_SUPPLY_PALLET:
        return U("FF_XDOC_SUPPLY_PALLET");
    case TariffType::eTariffType::TariffType_SORTING:
        return U("SORTING");
    case TariffType::eTariffType::TariffType_MIDDLE_MILE:
        return U("MIDDLE_MILE");
    case TariffType::eTariffType::TariffType_RETURN_PROCESSING:
        return U("RETURN_PROCESSING");
    case TariffType::eTariffType::TariffType_EXPRESS_CANCELLED_BY_PARTNER:
        return U("EXPRESS_CANCELLED_BY_PARTNER");
    case TariffType::eTariffType::TariffType_DELIVERY_TO_CUSTOMER_RETURN:
        return U("DELIVERY_TO_CUSTOMER_RETURN");
    case TariffType::eTariffType::TariffType_CROSSBORDER_DELIVERY:
        return U("CROSSBORDER_DELIVERY");
    case TariffType::eTariffType::TariffType_INTAKE_SORTING_BULKY_CARGO:
        return U("INTAKE_SORTING_BULKY_CARGO");
    case TariffType::eTariffType::TariffType_INTAKE_SORTING_SMALL_GOODS:
        return U("INTAKE_SORTING_SMALL_GOODS");
    case TariffType::eTariffType::TariffType_INTAKE_SORTING_DAILY:
        return U("INTAKE_SORTING_DAILY");
    case TariffType::eTariffType::TariffType_FF_STORAGE_BILLING:
        return U("FF_STORAGE_BILLING");
    case TariffType::eTariffType::TariffType_CANCELLED_ORDER_FEE_QI:
        return U("CANCELLED_ORDER_FEE_QI");
    case TariffType::eTariffType::TariffType_LATE_ORDER_EXECUTION_FEE_QI:
        return U("LATE_ORDER_EXECUTION_FEE_QI");
    default:
        break;
    }
    return {};
}
}

TariffType::TariffType()
{
}

TariffType::~TariffType()
{
}

void TariffType::validate()
{
    // TODO: implement validation
}

web::json::value TariffType::toJson() const
{
    auto val = fromEnum(m_value);
    return web::json::value(val);
}

bool TariffType::fromJson(const web::json::value& val)
{
    m_value = toEnum(val.as_string());
    return true;
}

void TariffType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if (!namePrefix.empty() && namePrefix.back() != U('.'))
    {
        namePrefix.push_back(U('.'));
    }

    auto e = fromEnum(m_value);
    multipart->add(ModelBase::toHttpContent(namePrefix, e));
}

bool TariffType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

TariffType::eTariffType TariffType::getValue() const
{
   return m_value;
}

void TariffType::setValue(TariffType::eTariffType const value)
{
   m_value = value;
}


}
}
}
}


