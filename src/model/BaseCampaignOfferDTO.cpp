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



#include "ympa_cpp_restsdk_client/model/BaseCampaignOfferDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



BaseCampaignOfferDTO::BaseCampaignOfferDTO()
{
    m_OfferId = utility::conversions::to_string_t("");
    m_OfferIdIsSet = false;
    m_QuantumIsSet = false;
    m_Available = false;
    m_AvailableIsSet = false;
}

BaseCampaignOfferDTO::~BaseCampaignOfferDTO()
{
}

void BaseCampaignOfferDTO::validate()
{
    // TODO: implement validation
}

web::json::value BaseCampaignOfferDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_OfferIdIsSet)
    {
        val[utility::conversions::to_string_t(U("offerId"))] = ModelBase::toJson(m_OfferId);
    }
    if(m_QuantumIsSet)
    {
        val[utility::conversions::to_string_t(U("quantum"))] = ModelBase::toJson(m_Quantum);
    }
    if(m_AvailableIsSet)
    {
        val[utility::conversions::to_string_t(U("available"))] = ModelBase::toJson(m_Available);
    }

    return val;
}

bool BaseCampaignOfferDTO::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("quantum"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("quantum")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<QuantumDTO> refVal_setQuantum;
            ok &= ModelBase::fromJson(fieldValue, refVal_setQuantum);
            setQuantum(refVal_setQuantum);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("available"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("available")));
        if(!fieldValue.is_null())
        {
            bool refVal_setAvailable;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAvailable);
            setAvailable(refVal_setAvailable);
        }
    }
    return ok;
}

void BaseCampaignOfferDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_QuantumIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("quantum")), m_Quantum));
    }
    if(m_AvailableIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("available")), m_Available));
    }
}

bool BaseCampaignOfferDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("quantum"))))
    {
        std::shared_ptr<QuantumDTO> refVal_setQuantum;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("quantum"))), refVal_setQuantum );
        setQuantum(refVal_setQuantum);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("available"))))
    {
        bool refVal_setAvailable;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("available"))), refVal_setAvailable );
        setAvailable(refVal_setAvailable);
    }
    return ok;
}

utility::string_t BaseCampaignOfferDTO::getOfferId() const
{
    return m_OfferId;
}

void BaseCampaignOfferDTO::setOfferId(const utility::string_t& value)
{
    m_OfferId = value;
    m_OfferIdIsSet = true;
}

bool BaseCampaignOfferDTO::offerIdIsSet() const
{
    return m_OfferIdIsSet;
}

void BaseCampaignOfferDTO::unsetOfferId()
{
    m_OfferIdIsSet = false;
}
std::shared_ptr<QuantumDTO> BaseCampaignOfferDTO::getQuantum() const
{
    return m_Quantum;
}

void BaseCampaignOfferDTO::setQuantum(const std::shared_ptr<QuantumDTO>& value)
{
    m_Quantum = value;
    m_QuantumIsSet = true;
}

bool BaseCampaignOfferDTO::quantumIsSet() const
{
    return m_QuantumIsSet;
}

void BaseCampaignOfferDTO::unsetQuantum()
{
    m_QuantumIsSet = false;
}
bool BaseCampaignOfferDTO::isAvailable() const
{
    return m_Available;
}

void BaseCampaignOfferDTO::setAvailable(bool value)
{
    m_Available = value;
    m_AvailableIsSet = true;
}

bool BaseCampaignOfferDTO::availableIsSet() const
{
    return m_AvailableIsSet;
}

void BaseCampaignOfferDTO::unsetAvailable()
{
    m_AvailableIsSet = false;
}
}
}
}
}


