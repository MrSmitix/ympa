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


#include "GenerateGoodsRealizationReportRequest.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

GenerateGoodsRealizationReportRequest::GenerateGoodsRealizationReportRequest()
{
    m_CampaignId = 0L;
    m_Year = 0;
    m_Month = 0;
    
}

void GenerateGoodsRealizationReportRequest::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool GenerateGoodsRealizationReportRequest::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool GenerateGoodsRealizationReportRequest::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "GenerateGoodsRealizationReportRequest" : pathPrefix;

                 
    
    /* Month */ {
        const int32_t& value = m_Month;
        const std::string currentValuePath = _pathPrefix + ".month";
                
        
        if (value < 1)
        {
            success = false;
            msg << currentValuePath << ": must be greater than or equal to 1;";
        }
        if (value > 12)
        {
            success = false;
            msg << currentValuePath << ": must be less than or equal to 12;";
        }

    }
    
    return success;
}

bool GenerateGoodsRealizationReportRequest::operator==(const GenerateGoodsRealizationReportRequest& rhs) const
{
    return
    
    
    (getCampaignId() == rhs.getCampaignId())
     &&
    
    (getYear() == rhs.getYear())
     &&
    
    (getMonth() == rhs.getMonth())
    
    
    ;
}

bool GenerateGoodsRealizationReportRequest::operator!=(const GenerateGoodsRealizationReportRequest& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const GenerateGoodsRealizationReportRequest& o)
{
    j = nlohmann::json::object();
    j["campaignId"] = o.m_CampaignId;
    j["year"] = o.m_Year;
    j["month"] = o.m_Month;
    
}

void from_json(const nlohmann::json& j, GenerateGoodsRealizationReportRequest& o)
{
    j.at("campaignId").get_to(o.m_CampaignId);
    j.at("year").get_to(o.m_Year);
    j.at("month").get_to(o.m_Month);
    
}

int64_t GenerateGoodsRealizationReportRequest::getCampaignId() const
{
    return m_CampaignId;
}
void GenerateGoodsRealizationReportRequest::setCampaignId(int64_t const value)
{
    m_CampaignId = value;
}
int32_t GenerateGoodsRealizationReportRequest::getYear() const
{
    return m_Year;
}
void GenerateGoodsRealizationReportRequest::setYear(int32_t const value)
{
    m_Year = value;
}
int32_t GenerateGoodsRealizationReportRequest::getMonth() const
{
    return m_Month;
}
void GenerateGoodsRealizationReportRequest::setMonth(int32_t const value)
{
    m_Month = value;
}


} // namespace org::openapitools::server::model

