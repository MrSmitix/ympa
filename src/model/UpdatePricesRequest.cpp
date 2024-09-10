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



#include "ympa_cpp_restsdk_client/model/UpdatePricesRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UpdatePricesRequest::UpdatePricesRequest()
{
    m_OffersIsSet = false;
}

UpdatePricesRequest::~UpdatePricesRequest()
{
}

void UpdatePricesRequest::validate()
{
    // TODO: implement validation
}

web::json::value UpdatePricesRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_OffersIsSet)
    {
        val[utility::conversions::to_string_t(U("offers"))] = ModelBase::toJson(m_Offers);
    }

    return val;
}

bool UpdatePricesRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("offers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("offers")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<OfferPriceDTO>> refVal_setOffers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOffers);
            setOffers(refVal_setOffers);
        }
    }
    return ok;
}

void UpdatePricesRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_OffersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("offers")), m_Offers));
    }
}

bool UpdatePricesRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("offers"))))
    {
        std::vector<std::shared_ptr<OfferPriceDTO>> refVal_setOffers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("offers"))), refVal_setOffers );
        setOffers(refVal_setOffers);
    }
    return ok;
}

std::vector<std::shared_ptr<OfferPriceDTO>>& UpdatePricesRequest::getOffers()
{
    return m_Offers;
}

void UpdatePricesRequest::setOffers(const std::vector<std::shared_ptr<OfferPriceDTO>>& value)
{
    m_Offers = value;
    m_OffersIsSet = true;
}

bool UpdatePricesRequest::offersIsSet() const
{
    return m_OffersIsSet;
}

void UpdatePricesRequest::unsetOffers()
{
    m_OffersIsSet = false;
}
}
}
}
}


