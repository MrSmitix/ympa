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



#include "ympa_cpp_restsdk_client/model/OfferCardRecommendationDTO.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



OfferCardRecommendationDTO::OfferCardRecommendationDTO()
{
    m_TypeIsSet = false;
    m_Percent = 0;
    m_PercentIsSet = false;
}

OfferCardRecommendationDTO::~OfferCardRecommendationDTO()
{
}

void OfferCardRecommendationDTO::validate()
{
    // TODO: implement validation
}

web::json::value OfferCardRecommendationDTO::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_PercentIsSet)
    {
        val[utility::conversions::to_string_t(U("percent"))] = ModelBase::toJson(m_Percent);
    }

    return val;
}

bool OfferCardRecommendationDTO::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<OfferCardRecommendationType> refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("percent"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("percent")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setPercent;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPercent);
            setPercent(refVal_setPercent);
        }
    }
    return ok;
}

void OfferCardRecommendationDTO::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_PercentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("percent")), m_Percent));
    }
}

bool OfferCardRecommendationDTO::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        std::shared_ptr<OfferCardRecommendationType> refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("percent"))))
    {
        int32_t refVal_setPercent;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("percent"))), refVal_setPercent );
        setPercent(refVal_setPercent);
    }
    return ok;
}

std::shared_ptr<OfferCardRecommendationType> OfferCardRecommendationDTO::getType() const
{
    return m_Type;
}

void OfferCardRecommendationDTO::setType(const std::shared_ptr<OfferCardRecommendationType>& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool OfferCardRecommendationDTO::typeIsSet() const
{
    return m_TypeIsSet;
}

void OfferCardRecommendationDTO::unsetType()
{
    m_TypeIsSet = false;
}
int32_t OfferCardRecommendationDTO::getPercent() const
{
    return m_Percent;
}

void OfferCardRecommendationDTO::setPercent(int32_t value)
{
    m_Percent = value;
    m_PercentIsSet = true;
}

bool OfferCardRecommendationDTO::percentIsSet() const
{
    return m_PercentIsSet;
}

void OfferCardRecommendationDTO::unsetPercent()
{
    m_PercentIsSet = false;
}
}
}
}
}


