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



#include "ympa_cpp_restsdk_client/model/GetPromoAssortmentInfoDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetPromoAssortmentInfoDTO::GetPromoAssortmentInfoDTO()
{
    m_ActiveOffers = 0;
    m_ActiveOffersIsSet = false;
    m_PotentialOffers = 0;
    m_PotentialOffersIsSet = false;
    m_Processing = false;
    m_ProcessingIsSet = false;
}

GetPromoAssortmentInfoDTO::~GetPromoAssortmentInfoDTO()
{
}

void GetPromoAssortmentInfoDTO::validate()
{
    // TODO: implement validation
}

web::json::value GetPromoAssortmentInfoDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ActiveOffersIsSet)
    {
        val[utility::conversions::to_string_t(U("activeOffers"))] = ModelBase::toJson(m_ActiveOffers);
    }
    if(m_PotentialOffersIsSet)
    {
        val[utility::conversions::to_string_t(U("potentialOffers"))] = ModelBase::toJson(m_PotentialOffers);
    }
    if(m_ProcessingIsSet)
    {
        val[utility::conversions::to_string_t(U("processing"))] = ModelBase::toJson(m_Processing);
    }

    return val;
}

bool GetPromoAssortmentInfoDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("activeOffers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("activeOffers")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setActiveOffers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setActiveOffers);
            setActiveOffers(refVal_setActiveOffers);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("potentialOffers"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("potentialOffers")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPotentialOffers;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPotentialOffers);
            setPotentialOffers(refVal_setPotentialOffers);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("processing"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("processing")));
        if(!fieldValue.is_null())
        {
            bool refVal_setProcessing;
            ok &= ModelBase::fromJson(fieldValue, refVal_setProcessing);
            setProcessing(refVal_setProcessing);
        }
    }
    return ok;
}

void GetPromoAssortmentInfoDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ActiveOffersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("activeOffers")), m_ActiveOffers));
    }
    if(m_PotentialOffersIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("potentialOffers")), m_PotentialOffers));
    }
    if(m_ProcessingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("processing")), m_Processing));
    }
}

bool GetPromoAssortmentInfoDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("activeOffers"))))
    {
        int32_t refVal_setActiveOffers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("activeOffers"))), refVal_setActiveOffers );
        setActiveOffers(refVal_setActiveOffers);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("potentialOffers"))))
    {
        int32_t refVal_setPotentialOffers;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("potentialOffers"))), refVal_setPotentialOffers );
        setPotentialOffers(refVal_setPotentialOffers);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("processing"))))
    {
        bool refVal_setProcessing;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("processing"))), refVal_setProcessing );
        setProcessing(refVal_setProcessing);
    }
    return ok;
}

int32_t GetPromoAssortmentInfoDTO::getActiveOffers() const
{
    return m_ActiveOffers;
}

void GetPromoAssortmentInfoDTO::setActiveOffers(int32_t value)
{
    m_ActiveOffers = value;
    m_ActiveOffersIsSet = true;
}

bool GetPromoAssortmentInfoDTO::activeOffersIsSet() const
{
    return m_ActiveOffersIsSet;
}

void GetPromoAssortmentInfoDTO::unsetActiveOffers()
{
    m_ActiveOffersIsSet = false;
}
int32_t GetPromoAssortmentInfoDTO::getPotentialOffers() const
{
    return m_PotentialOffers;
}

void GetPromoAssortmentInfoDTO::setPotentialOffers(int32_t value)
{
    m_PotentialOffers = value;
    m_PotentialOffersIsSet = true;
}

bool GetPromoAssortmentInfoDTO::potentialOffersIsSet() const
{
    return m_PotentialOffersIsSet;
}

void GetPromoAssortmentInfoDTO::unsetPotentialOffers()
{
    m_PotentialOffersIsSet = false;
}
bool GetPromoAssortmentInfoDTO::isProcessing() const
{
    return m_Processing;
}

void GetPromoAssortmentInfoDTO::setProcessing(bool value)
{
    m_Processing = value;
    m_ProcessingIsSet = true;
}

bool GetPromoAssortmentInfoDTO::processingIsSet() const
{
    return m_ProcessingIsSet;
}

void GetPromoAssortmentInfoDTO::unsetProcessing()
{
    m_ProcessingIsSet = false;
}
}
}
}
}


