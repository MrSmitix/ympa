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
/*
 * GenerateUnitedNettingReportRequest.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
 */

#ifndef GenerateUnitedNettingReportRequest_H_
#define GenerateUnitedNettingReportRequest_H_


#include <string>
#include "PlacementType.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
/// </summary>
class  GenerateUnitedNettingReportRequest
{
public:
    GenerateUnitedNettingReportRequest();
    virtual ~GenerateUnitedNettingReportRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const GenerateUnitedNettingReportRequest& rhs) const;
    bool operator!=(const GenerateUnitedNettingReportRequest& rhs) const;

    /////////////////////////////////////////////
    /// GenerateUnitedNettingReportRequest members

    /// <summary>
    /// Идентификатор бизнеса.
    /// </summary>
    int64_t getBusinessId() const;
    void setBusinessId(int64_t const value);
    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
    /// </summary>
    std::string getDateTimeFrom() const;
    void setDateTimeFrom(std::string const& value);
    bool dateTimeFromIsSet() const;
    void unsetDateTimeFrom();
    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
    /// </summary>
    std::string getDateTimeTo() const;
    void setDateTimeTo(std::string const& value);
    bool dateTimeToIsSet() const;
    void unsetDateTimeTo();
    /// <summary>
    /// Начало периода, включительно.
    /// </summary>
    std::string getDateFrom() const;
    void setDateFrom(std::string const& value);
    bool dateFromIsSet() const;
    void unsetDateFrom();
    /// <summary>
    /// Конец периода, включительно. Максимальный период — 1 год.
    /// </summary>
    std::string getDateTo() const;
    void setDateTo(std::string const& value);
    bool dateToIsSet() const;
    void unsetDateTo();
    /// <summary>
    /// Номер платежного поручения.
    /// </summary>
    int64_t getBankOrderId() const;
    void setBankOrderId(int64_t const value);
    bool bankOrderIdIsSet() const;
    void unsetBankOrderId();
    /// <summary>
    /// Дата платежного поручения.
    /// </summary>
    std::string getBankOrderDateTime() const;
    void setBankOrderDateTime(std::string const& value);
    bool bankOrderDateTimeIsSet() const;
    void unsetBankOrderDateTime();
    /// <summary>
    /// Список моделей, которые нужны в отчете. 
    /// </summary>
    std::vector<org::openapitools::server::model::PlacementType> getPlacementPrograms() const;
    void setPlacementPrograms(std::vector<org::openapitools::server::model::PlacementType> const& value);
    bool placementProgramsIsSet() const;
    void unsetPlacementPrograms();
    /// <summary>
    /// Список ИНН, которые нужны в отчете.
    /// </summary>
    std::vector<std::string> getInns() const;
    void setInns(std::vector<std::string> const& value);
    bool innsIsSet() const;
    void unsetInns();
    /// <summary>
    /// Список магазинов, которые нужны в отчете.
    /// </summary>
    std::vector<int64_t> getCampaignIds() const;
    void setCampaignIds(std::vector<int64_t> const value);
    bool campaignIdsIsSet() const;
    void unsetCampaignIds();

    friend  void to_json(nlohmann::json& j, const GenerateUnitedNettingReportRequest& o);
    friend  void from_json(const nlohmann::json& j, GenerateUnitedNettingReportRequest& o);
protected:
    int64_t m_BusinessId;

    std::string m_DateTimeFrom;
    bool m_DateTimeFromIsSet;
    std::string m_DateTimeTo;
    bool m_DateTimeToIsSet;
    std::string m_DateFrom;
    bool m_DateFromIsSet;
    std::string m_DateTo;
    bool m_DateToIsSet;
    int64_t m_BankOrderId;
    bool m_BankOrderIdIsSet;
    std::string m_BankOrderDateTime;
    bool m_BankOrderDateTimeIsSet;
    std::vector<org::openapitools::server::model::PlacementType> m_PlacementPrograms;
    bool m_PlacementProgramsIsSet;
    std::vector<std::string> m_Inns;
    bool m_InnsIsSet;
    std::vector<int64_t> m_CampaignIds;
    bool m_CampaignIdsIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* GenerateUnitedNettingReportRequest_H_ */
