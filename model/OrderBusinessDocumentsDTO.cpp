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


#include "OrderBusinessDocumentsDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

OrderBusinessDocumentsDTO::OrderBusinessDocumentsDTO()
{
    m_UpdIsSet = false;
    m_UkdIsSet = false;
    m_TorgTwelveIsSet = false;
    m_SfIsSet = false;
    m_KsfIsSet = false;
    
}

void OrderBusinessDocumentsDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool OrderBusinessDocumentsDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool OrderBusinessDocumentsDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "OrderBusinessDocumentsDTO" : pathPrefix;

                        
    return success;
}

bool OrderBusinessDocumentsDTO::operator==(const OrderBusinessDocumentsDTO& rhs) const
{
    return
    
    
    
    ((!updIsSet() && !rhs.updIsSet()) || (updIsSet() && rhs.updIsSet() && getUpd() == rhs.getUpd())) &&
    
    
    ((!ukdIsSet() && !rhs.ukdIsSet()) || (ukdIsSet() && rhs.ukdIsSet() && getUkd() == rhs.getUkd())) &&
    
    
    ((!torgTwelveIsSet() && !rhs.torgTwelveIsSet()) || (torgTwelveIsSet() && rhs.torgTwelveIsSet() && getTorgTwelve() == rhs.getTorgTwelve())) &&
    
    
    ((!sfIsSet() && !rhs.sfIsSet()) || (sfIsSet() && rhs.sfIsSet() && getSf() == rhs.getSf())) &&
    
    
    ((!ksfIsSet() && !rhs.ksfIsSet()) || (ksfIsSet() && rhs.ksfIsSet() && getKsf() == rhs.getKsf()))
    
    ;
}

bool OrderBusinessDocumentsDTO::operator!=(const OrderBusinessDocumentsDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const OrderBusinessDocumentsDTO& o)
{
    j = nlohmann::json::object();
    if(o.updIsSet())
        j["upd"] = o.m_Upd;
    if(o.ukdIsSet())
        j["ukd"] = o.m_Ukd;
    if(o.torgTwelveIsSet())
        j["torgTwelve"] = o.m_TorgTwelve;
    if(o.sfIsSet())
        j["sf"] = o.m_Sf;
    if(o.ksfIsSet())
        j["ksf"] = o.m_Ksf;
    
}

void from_json(const nlohmann::json& j, OrderBusinessDocumentsDTO& o)
{
    if(j.find("upd") != j.end())
    {
        j.at("upd").get_to(o.m_Upd);
        o.m_UpdIsSet = true;
    } 
    if(j.find("ukd") != j.end())
    {
        j.at("ukd").get_to(o.m_Ukd);
        o.m_UkdIsSet = true;
    } 
    if(j.find("torgTwelve") != j.end())
    {
        j.at("torgTwelve").get_to(o.m_TorgTwelve);
        o.m_TorgTwelveIsSet = true;
    } 
    if(j.find("sf") != j.end())
    {
        j.at("sf").get_to(o.m_Sf);
        o.m_SfIsSet = true;
    } 
    if(j.find("ksf") != j.end())
    {
        j.at("ksf").get_to(o.m_Ksf);
        o.m_KsfIsSet = true;
    } 
    
}

org::openapitools::server::model::DocumentDTO OrderBusinessDocumentsDTO::getUpd() const
{
    return m_Upd;
}
void OrderBusinessDocumentsDTO::setUpd(org::openapitools::server::model::DocumentDTO const& value)
{
    m_Upd = value;
    m_UpdIsSet = true;
}
bool OrderBusinessDocumentsDTO::updIsSet() const
{
    return m_UpdIsSet;
}
void OrderBusinessDocumentsDTO::unsetUpd()
{
    m_UpdIsSet = false;
}
org::openapitools::server::model::DocumentDTO OrderBusinessDocumentsDTO::getUkd() const
{
    return m_Ukd;
}
void OrderBusinessDocumentsDTO::setUkd(org::openapitools::server::model::DocumentDTO const& value)
{
    m_Ukd = value;
    m_UkdIsSet = true;
}
bool OrderBusinessDocumentsDTO::ukdIsSet() const
{
    return m_UkdIsSet;
}
void OrderBusinessDocumentsDTO::unsetUkd()
{
    m_UkdIsSet = false;
}
org::openapitools::server::model::DocumentDTO OrderBusinessDocumentsDTO::getTorgTwelve() const
{
    return m_TorgTwelve;
}
void OrderBusinessDocumentsDTO::setTorgTwelve(org::openapitools::server::model::DocumentDTO const& value)
{
    m_TorgTwelve = value;
    m_TorgTwelveIsSet = true;
}
bool OrderBusinessDocumentsDTO::torgTwelveIsSet() const
{
    return m_TorgTwelveIsSet;
}
void OrderBusinessDocumentsDTO::unsetTorgTwelve()
{
    m_TorgTwelveIsSet = false;
}
org::openapitools::server::model::DocumentDTO OrderBusinessDocumentsDTO::getSf() const
{
    return m_Sf;
}
void OrderBusinessDocumentsDTO::setSf(org::openapitools::server::model::DocumentDTO const& value)
{
    m_Sf = value;
    m_SfIsSet = true;
}
bool OrderBusinessDocumentsDTO::sfIsSet() const
{
    return m_SfIsSet;
}
void OrderBusinessDocumentsDTO::unsetSf()
{
    m_SfIsSet = false;
}
org::openapitools::server::model::DocumentDTO OrderBusinessDocumentsDTO::getKsf() const
{
    return m_Ksf;
}
void OrderBusinessDocumentsDTO::setKsf(org::openapitools::server::model::DocumentDTO const& value)
{
    m_Ksf = value;
    m_KsfIsSet = true;
}
bool OrderBusinessDocumentsDTO::ksfIsSet() const
{
    return m_KsfIsSet;
}
void OrderBusinessDocumentsDTO::unsetKsf()
{
    m_KsfIsSet = false;
}


} // namespace org::openapitools::server::model

