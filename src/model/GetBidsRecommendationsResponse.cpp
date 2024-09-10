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



#include "ympa_cpp_restsdk_client/model/GetBidsRecommendationsResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



GetBidsRecommendationsResponse::GetBidsRecommendationsResponse()
{
    m_StatusIsSet = false;
    m_ResultIsSet = false;
}

GetBidsRecommendationsResponse::~GetBidsRecommendationsResponse()
{
}

void GetBidsRecommendationsResponse::validate()
{
    // TODO: implement validation
}

web::json::value GetBidsRecommendationsResponse::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_ResultIsSet)
    {
        val[utility::conversions::to_string_t(U("result"))] = ModelBase::toJson(m_Result);
    }

    return val;
}

bool GetBidsRecommendationsResponse::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<ApiResponseStatusType> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("result"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("result")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<GetBidsRecommendationsResponseDTO> refVal_setResult;
            ok &= ModelBase::fromJson(fieldValue, refVal_setResult);
            setResult(refVal_setResult);
        }
    }
    return ok;
}

void GetBidsRecommendationsResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_ResultIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("result")), m_Result));
    }
}

bool GetBidsRecommendationsResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<ApiResponseStatusType> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("result"))))
    {
        std::shared_ptr<GetBidsRecommendationsResponseDTO> refVal_setResult;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("result"))), refVal_setResult );
        setResult(refVal_setResult);
    }
    return ok;
}

std::shared_ptr<ApiResponseStatusType> GetBidsRecommendationsResponse::getStatus() const
{
    return m_Status;
}

void GetBidsRecommendationsResponse::setStatus(const std::shared_ptr<ApiResponseStatusType>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool GetBidsRecommendationsResponse::statusIsSet() const
{
    return m_StatusIsSet;
}

void GetBidsRecommendationsResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
std::shared_ptr<GetBidsRecommendationsResponseDTO> GetBidsRecommendationsResponse::getResult() const
{
    return m_Result;
}

void GetBidsRecommendationsResponse::setResult(const std::shared_ptr<GetBidsRecommendationsResponseDTO>& value)
{
    m_Result = value;
    m_ResultIsSet = true;
}

bool GetBidsRecommendationsResponse::resultIsSet() const
{
    return m_ResultIsSet;
}

void GetBidsRecommendationsResponse::unsetResult()
{
    m_ResultIsSet = false;
}
}
}
}
}


