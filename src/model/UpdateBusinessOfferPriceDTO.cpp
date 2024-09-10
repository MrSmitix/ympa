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



#include "ympa_cpp_restsdk_client/model/UpdateBusinessOfferPriceDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



UpdateBusinessOfferPriceDTO::UpdateBusinessOfferPriceDTO()
{
    m_OfferId = utility::conversions::to_string_t("");
    m_OfferIdIsSet = false;
    m_PriceIsSet = false;
}

UpdateBusinessOfferPriceDTO::~UpdateBusinessOfferPriceDTO()
{
}

void UpdateBusinessOfferPriceDTO::validate()
{
    // TODO: implement validation
}

web::json::value UpdateBusinessOfferPriceDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_OfferIdIsSet)
    {
        val[utility::conversions::to_string_t(U("offerId"))] = ModelBase::toJson(m_OfferId);
    }
    if(m_PriceIsSet)
    {
        val[utility::conversions::to_string_t(U("price"))] = ModelBase::toJson(m_Price);
    }

    return val;
}

bool UpdateBusinessOfferPriceDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("offerId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("offerId")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setOfferId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setOfferId);
            setOfferId(refVal_setOfferId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("price"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("price")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<UpdatePriceWithDiscountDTO> refVal_setPrice;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPrice);
            setPrice(refVal_setPrice);
        }
    }
    return ok;
}

void UpdateBusinessOfferPriceDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_OfferIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("offerId")), m_OfferId));
    }
    if(m_PriceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("price")), m_Price));
    }
}

bool UpdateBusinessOfferPriceDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("offerId"))))
    {
        utility::string_t refVal_setOfferId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("offerId"))), refVal_setOfferId );
        setOfferId(refVal_setOfferId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("price"))))
    {
        std::shared_ptr<UpdatePriceWithDiscountDTO> refVal_setPrice;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("price"))), refVal_setPrice );
        setPrice(refVal_setPrice);
    }
    return ok;
}

utility::string_t UpdateBusinessOfferPriceDTO::getOfferId() const
{
    return m_OfferId;
}

void UpdateBusinessOfferPriceDTO::setOfferId(const utility::string_t& value)
{
    m_OfferId = value;
    m_OfferIdIsSet = true;
}

bool UpdateBusinessOfferPriceDTO::offerIdIsSet() const
{
    return m_OfferIdIsSet;
}

void UpdateBusinessOfferPriceDTO::unsetOfferId()
{
    m_OfferIdIsSet = false;
}
std::shared_ptr<UpdatePriceWithDiscountDTO> UpdateBusinessOfferPriceDTO::getPrice() const
{
    return m_Price;
}

void UpdateBusinessOfferPriceDTO::setPrice(const std::shared_ptr<UpdatePriceWithDiscountDTO>& value)
{
    m_Price = value;
    m_PriceIsSet = true;
}

bool UpdateBusinessOfferPriceDTO::priceIsSet() const
{
    return m_PriceIsSet;
}

void UpdateBusinessOfferPriceDTO::unsetPrice()
{
    m_PriceIsSet = false;
}
}
}
}
}


