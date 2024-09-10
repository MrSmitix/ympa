/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "RejectedPromoOfferUpdateReasonType.h"
#include "Helpers.h"
#include <stdexcept>
#include <sstream>

namespace org::openapitools::server::model
{

RejectedPromoOfferUpdateReasonType::RejectedPromoOfferUpdateReasonType()
{
    
}

void RejectedPromoOfferUpdateReasonType::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool RejectedPromoOfferUpdateReasonType::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool RejectedPromoOfferUpdateReasonType::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "RejectedPromoOfferUpdateReasonType" : pathPrefix;

    
    if (m_value == RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::INVALID_VALUE_OPENAPI_GENERATED)
    {
        success = false;
        msg << _pathPrefix << ": has no value;";
    }

    return success;
}

bool RejectedPromoOfferUpdateReasonType::operator==(const RejectedPromoOfferUpdateReasonType& rhs) const
{
    return
    getValue() == rhs.getValue()
    
    ;
}

bool RejectedPromoOfferUpdateReasonType::operator!=(const RejectedPromoOfferUpdateReasonType& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const RejectedPromoOfferUpdateReasonType& o)
{
    j = nlohmann::json::object();
    
    switch (o.getValue())
    {
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::INVALID_VALUE_OPENAPI_GENERATED:
            j = "INVALID_VALUE_OPENAPI_GENERATED";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_DOES_NOT_EXIST:
            j = "OFFER_DOES_NOT_EXIST";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_DUPLICATION:
            j = "OFFER_DUPLICATION";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_NOT_ELIGIBLE_FOR_PROMO:
            j = "OFFER_NOT_ELIGIBLE_FOR_PROMO";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED:
            j = "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED:
            j = "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::EMPTY_OLD_PRICE:
            j = "EMPTY_OLD_PRICE";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::EMPTY_PROMO_PRICE:
            j = "EMPTY_PROMO_PRICE";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::MAX_PROMO_PRICE_EXCEEDED:
            j = "MAX_PROMO_PRICE_EXCEEDED";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::PROMO_PRICE_BIGGER_THAN_MAX:
            j = "PROMO_PRICE_BIGGER_THAN_MAX";
            break;
        case RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::PROMO_PRICE_SMALLER_THAN_MIN:
            j = "PROMO_PRICE_SMALLER_THAN_MIN";
            break;
    }
}

void from_json(const nlohmann::json& j, RejectedPromoOfferUpdateReasonType& o)
{
    
    auto s = j.get<std::string>();
    if (s == "OFFER_DOES_NOT_EXIST") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_DOES_NOT_EXIST);
    } 
    else if (s == "OFFER_DUPLICATION") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_DUPLICATION);
    } 
    else if (s == "OFFER_NOT_ELIGIBLE_FOR_PROMO") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_NOT_ELIGIBLE_FOR_PROMO);
    } 
    else if (s == "OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED);
    } 
    else if (s == "DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED);
    } 
    else if (s == "EMPTY_OLD_PRICE") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::EMPTY_OLD_PRICE);
    } 
    else if (s == "EMPTY_PROMO_PRICE") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::EMPTY_PROMO_PRICE);
    } 
    else if (s == "MAX_PROMO_PRICE_EXCEEDED") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::MAX_PROMO_PRICE_EXCEEDED);
    } 
    else if (s == "PROMO_PRICE_BIGGER_THAN_MAX") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::PROMO_PRICE_BIGGER_THAN_MAX);
    } 
    else if (s == "PROMO_PRICE_SMALLER_THAN_MIN") {
     o.setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType::PROMO_PRICE_SMALLER_THAN_MIN);
    }  else {
     std::stringstream ss;
     ss << "Unexpected value " << s << " in json"
        << " cannot be converted to enum of type"
        << " RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType";
     throw std::invalid_argument(ss.str());
    } 

}

RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType RejectedPromoOfferUpdateReasonType::getValue() const
{
    return m_value;
}
void RejectedPromoOfferUpdateReasonType::setValue(RejectedPromoOfferUpdateReasonType::eRejectedPromoOfferUpdateReasonType value)
{
    m_value = value;
}

} // namespace org::openapitools::server::model

