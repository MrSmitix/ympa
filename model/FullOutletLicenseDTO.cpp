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


#include "FullOutletLicenseDTO.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

FullOutletLicenseDTO::FullOutletLicenseDTO()
{
    m_Id = 0L;
    m_IdIsSet = false;
    m_OutletId = 0L;
    m_OutletIdIsSet = false;
    m_LicenseTypeIsSet = false;
    m_number = "";
    m_numberIsSet = false;
    m_DateOfIssue = "";
    m_DateOfIssueIsSet = false;
    m_DateOfExpiry = "";
    m_DateOfExpiryIsSet = false;
    m_CheckStatusIsSet = false;
    m_CheckComment = "";
    m_CheckCommentIsSet = false;
    
}

void FullOutletLicenseDTO::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool FullOutletLicenseDTO::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool FullOutletLicenseDTO::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "FullOutletLicenseDTO" : pathPrefix;

                                    
    return success;
}

bool FullOutletLicenseDTO::operator==(const FullOutletLicenseDTO& rhs) const
{
    return
    
    
    
    ((!idIsSet() && !rhs.idIsSet()) || (idIsSet() && rhs.idIsSet() && getId() == rhs.getId())) &&
    
    
    ((!outletIdIsSet() && !rhs.outletIdIsSet()) || (outletIdIsSet() && rhs.outletIdIsSet() && getOutletId() == rhs.getOutletId())) &&
    
    
    ((!licenseTypeIsSet() && !rhs.licenseTypeIsSet()) || (licenseTypeIsSet() && rhs.licenseTypeIsSet() && getLicenseType() == rhs.getLicenseType())) &&
    
    
    ((!numberIsSet() && !rhs.numberIsSet()) || (numberIsSet() && rhs.numberIsSet() && getNumber() == rhs.getNumber())) &&
    
    
    ((!dateOfIssueIsSet() && !rhs.dateOfIssueIsSet()) || (dateOfIssueIsSet() && rhs.dateOfIssueIsSet() && getDateOfIssue() == rhs.getDateOfIssue())) &&
    
    
    ((!dateOfExpiryIsSet() && !rhs.dateOfExpiryIsSet()) || (dateOfExpiryIsSet() && rhs.dateOfExpiryIsSet() && getDateOfExpiry() == rhs.getDateOfExpiry())) &&
    
    
    ((!checkStatusIsSet() && !rhs.checkStatusIsSet()) || (checkStatusIsSet() && rhs.checkStatusIsSet() && getCheckStatus() == rhs.getCheckStatus())) &&
    
    
    ((!checkCommentIsSet() && !rhs.checkCommentIsSet()) || (checkCommentIsSet() && rhs.checkCommentIsSet() && getCheckComment() == rhs.getCheckComment()))
    
    ;
}

bool FullOutletLicenseDTO::operator!=(const FullOutletLicenseDTO& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const FullOutletLicenseDTO& o)
{
    j = nlohmann::json::object();
    if(o.idIsSet())
        j["id"] = o.m_Id;
    if(o.outletIdIsSet())
        j["outletId"] = o.m_OutletId;
    if(o.licenseTypeIsSet())
        j["licenseType"] = o.m_LicenseType;
    if(o.numberIsSet())
        j["number"] = o.m_number;
    if(o.dateOfIssueIsSet())
        j["dateOfIssue"] = o.m_DateOfIssue;
    if(o.dateOfExpiryIsSet())
        j["dateOfExpiry"] = o.m_DateOfExpiry;
    if(o.checkStatusIsSet())
        j["checkStatus"] = o.m_CheckStatus;
    if(o.checkCommentIsSet())
        j["checkComment"] = o.m_CheckComment;
    
}

void from_json(const nlohmann::json& j, FullOutletLicenseDTO& o)
{
    if(j.find("id") != j.end())
    {
        j.at("id").get_to(o.m_Id);
        o.m_IdIsSet = true;
    } 
    if(j.find("outletId") != j.end())
    {
        j.at("outletId").get_to(o.m_OutletId);
        o.m_OutletIdIsSet = true;
    } 
    if(j.find("licenseType") != j.end())
    {
        j.at("licenseType").get_to(o.m_LicenseType);
        o.m_LicenseTypeIsSet = true;
    } 
    if(j.find("number") != j.end())
    {
        j.at("number").get_to(o.m_number);
        o.m_numberIsSet = true;
    } 
    if(j.find("dateOfIssue") != j.end())
    {
        j.at("dateOfIssue").get_to(o.m_DateOfIssue);
        o.m_DateOfIssueIsSet = true;
    } 
    if(j.find("dateOfExpiry") != j.end())
    {
        j.at("dateOfExpiry").get_to(o.m_DateOfExpiry);
        o.m_DateOfExpiryIsSet = true;
    } 
    if(j.find("checkStatus") != j.end())
    {
        j.at("checkStatus").get_to(o.m_CheckStatus);
        o.m_CheckStatusIsSet = true;
    } 
    if(j.find("checkComment") != j.end())
    {
        j.at("checkComment").get_to(o.m_CheckComment);
        o.m_CheckCommentIsSet = true;
    } 
    
}

int64_t FullOutletLicenseDTO::getId() const
{
    return m_Id;
}
void FullOutletLicenseDTO::setId(int64_t const value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool FullOutletLicenseDTO::idIsSet() const
{
    return m_IdIsSet;
}
void FullOutletLicenseDTO::unsetId()
{
    m_IdIsSet = false;
}
int64_t FullOutletLicenseDTO::getOutletId() const
{
    return m_OutletId;
}
void FullOutletLicenseDTO::setOutletId(int64_t const value)
{
    m_OutletId = value;
    m_OutletIdIsSet = true;
}
bool FullOutletLicenseDTO::outletIdIsSet() const
{
    return m_OutletIdIsSet;
}
void FullOutletLicenseDTO::unsetOutletId()
{
    m_OutletIdIsSet = false;
}
org::openapitools::server::model::LicenseType FullOutletLicenseDTO::getLicenseType() const
{
    return m_LicenseType;
}
void FullOutletLicenseDTO::setLicenseType(org::openapitools::server::model::LicenseType const& value)
{
    m_LicenseType = value;
    m_LicenseTypeIsSet = true;
}
bool FullOutletLicenseDTO::licenseTypeIsSet() const
{
    return m_LicenseTypeIsSet;
}
void FullOutletLicenseDTO::unsetLicenseType()
{
    m_LicenseTypeIsSet = false;
}
std::string FullOutletLicenseDTO::getNumber() const
{
    return m_number;
}
void FullOutletLicenseDTO::setNumber(std::string const& value)
{
    m_number = value;
    m_numberIsSet = true;
}
bool FullOutletLicenseDTO::numberIsSet() const
{
    return m_numberIsSet;
}
void FullOutletLicenseDTO::unsetnumber()
{
    m_numberIsSet = false;
}
std::string FullOutletLicenseDTO::getDateOfIssue() const
{
    return m_DateOfIssue;
}
void FullOutletLicenseDTO::setDateOfIssue(std::string const& value)
{
    m_DateOfIssue = value;
    m_DateOfIssueIsSet = true;
}
bool FullOutletLicenseDTO::dateOfIssueIsSet() const
{
    return m_DateOfIssueIsSet;
}
void FullOutletLicenseDTO::unsetDateOfIssue()
{
    m_DateOfIssueIsSet = false;
}
std::string FullOutletLicenseDTO::getDateOfExpiry() const
{
    return m_DateOfExpiry;
}
void FullOutletLicenseDTO::setDateOfExpiry(std::string const& value)
{
    m_DateOfExpiry = value;
    m_DateOfExpiryIsSet = true;
}
bool FullOutletLicenseDTO::dateOfExpiryIsSet() const
{
    return m_DateOfExpiryIsSet;
}
void FullOutletLicenseDTO::unsetDateOfExpiry()
{
    m_DateOfExpiryIsSet = false;
}
org::openapitools::server::model::LicenseCheckStatusType FullOutletLicenseDTO::getCheckStatus() const
{
    return m_CheckStatus;
}
void FullOutletLicenseDTO::setCheckStatus(org::openapitools::server::model::LicenseCheckStatusType const& value)
{
    m_CheckStatus = value;
    m_CheckStatusIsSet = true;
}
bool FullOutletLicenseDTO::checkStatusIsSet() const
{
    return m_CheckStatusIsSet;
}
void FullOutletLicenseDTO::unsetCheckStatus()
{
    m_CheckStatusIsSet = false;
}
std::string FullOutletLicenseDTO::getCheckComment() const
{
    return m_CheckComment;
}
void FullOutletLicenseDTO::setCheckComment(std::string const& value)
{
    m_CheckComment = value;
    m_CheckCommentIsSet = true;
}
bool FullOutletLicenseDTO::checkCommentIsSet() const
{
    return m_CheckCommentIsSet;
}
void FullOutletLicenseDTO::unsetCheckComment()
{
    m_CheckCommentIsSet = false;
}


} // namespace org::openapitools::server::model

