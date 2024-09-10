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



#include "ympa_cpp_restsdk_client/model/CampaignDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



CampaignDTO::CampaignDTO()
{
    m_Domain = utility::conversions::to_string_t("");
    m_DomainIsSet = false;
    m_Id = 0L;
    m_IdIsSet = false;
    m_ClientId = 0L;
    m_ClientIdIsSet = false;
    m_BusinessIsSet = false;
    m_PlacementTypeIsSet = false;
}

CampaignDTO::~CampaignDTO()
{
}

void CampaignDTO::validate()
{
    // TODO: implement validation
}

web::json::value CampaignDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_DomainIsSet)
    {
        val[utility::conversions::to_string_t(U("domain"))] = ModelBase::toJson(m_Domain);
    }
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_ClientIdIsSet)
    {
        val[utility::conversions::to_string_t(U("clientId"))] = ModelBase::toJson(m_ClientId);
    }
    if(m_BusinessIsSet)
    {
        val[utility::conversions::to_string_t(U("business"))] = ModelBase::toJson(m_Business);
    }
    if(m_PlacementTypeIsSet)
    {
        val[utility::conversions::to_string_t(U("placementType"))] = ModelBase::toJson(m_PlacementType);
    }

    return val;
}

bool CampaignDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("domain"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("domain")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDomain;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDomain);
            setDomain(refVal_setDomain);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("clientId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("clientId")));
        if(!fieldValue.is_null())
        {
            int64_t refVal_setClientId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setClientId);
            setClientId(refVal_setClientId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("business"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("business")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<BusinessDTO> refVal_setBusiness;
            ok &= ModelBase::fromJson(fieldValue, refVal_setBusiness);
            setBusiness(refVal_setBusiness);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("placementType"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("placementType")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<PlacementType> refVal_setPlacementType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPlacementType);
            setPlacementType(refVal_setPlacementType);
        }
    }
    return ok;
}

void CampaignDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_DomainIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("domain")), m_Domain));
    }
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_ClientIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("clientId")), m_ClientId));
    }
    if(m_BusinessIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("business")), m_Business));
    }
    if(m_PlacementTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("placementType")), m_PlacementType));
    }
}

bool CampaignDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("domain"))))
    {
        utility::string_t refVal_setDomain;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("domain"))), refVal_setDomain );
        setDomain(refVal_setDomain);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        int64_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("clientId"))))
    {
        int64_t refVal_setClientId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("clientId"))), refVal_setClientId );
        setClientId(refVal_setClientId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("business"))))
    {
        std::shared_ptr<BusinessDTO> refVal_setBusiness;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("business"))), refVal_setBusiness );
        setBusiness(refVal_setBusiness);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("placementType"))))
    {
        std::shared_ptr<PlacementType> refVal_setPlacementType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("placementType"))), refVal_setPlacementType );
        setPlacementType(refVal_setPlacementType);
    }
    return ok;
}

utility::string_t CampaignDTO::getDomain() const
{
    return m_Domain;
}

void CampaignDTO::setDomain(const utility::string_t& value)
{
    m_Domain = value;
    m_DomainIsSet = true;
}

bool CampaignDTO::domainIsSet() const
{
    return m_DomainIsSet;
}

void CampaignDTO::unsetDomain()
{
    m_DomainIsSet = false;
}
int64_t CampaignDTO::getId() const
{
    return m_Id;
}

void CampaignDTO::setId(int64_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool CampaignDTO::idIsSet() const
{
    return m_IdIsSet;
}

void CampaignDTO::unsetId()
{
    m_IdIsSet = false;
}
int64_t CampaignDTO::getClientId() const
{
    return m_ClientId;
}

void CampaignDTO::setClientId(int64_t value)
{
    m_ClientId = value;
    m_ClientIdIsSet = true;
}

bool CampaignDTO::clientIdIsSet() const
{
    return m_ClientIdIsSet;
}

void CampaignDTO::unsetClientId()
{
    m_ClientIdIsSet = false;
}
std::shared_ptr<BusinessDTO> CampaignDTO::getBusiness() const
{
    return m_Business;
}

void CampaignDTO::setBusiness(const std::shared_ptr<BusinessDTO>& value)
{
    m_Business = value;
    m_BusinessIsSet = true;
}

bool CampaignDTO::businessIsSet() const
{
    return m_BusinessIsSet;
}

void CampaignDTO::unsetBusiness()
{
    m_BusinessIsSet = false;
}
std::shared_ptr<PlacementType> CampaignDTO::getPlacementType() const
{
    return m_PlacementType;
}

void CampaignDTO::setPlacementType(const std::shared_ptr<PlacementType>& value)
{
    m_PlacementType = value;
    m_PlacementTypeIsSet = true;
}

bool CampaignDTO::placementTypeIsSet() const
{
    return m_PlacementTypeIsSet;
}

void CampaignDTO::unsetPlacementType()
{
    m_PlacementTypeIsSet = false;
}
}
}
}
}


