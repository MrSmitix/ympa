/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Данные, необходимые для генерации отчета: идентификатор магазина, период, за который нужен отчет, а также фильтры. 
/// </summary>
class  GenerateUnitedNettingReportRequest 
{
public:
    GenerateUnitedNettingReportRequest() = default;
    explicit GenerateUnitedNettingReportRequest(boost::property_tree::ptree const& pt);
    virtual ~GenerateUnitedNettingReportRequest() = default;

    GenerateUnitedNettingReportRequest(const GenerateUnitedNettingReportRequest& other) = default; // copy constructor
    GenerateUnitedNettingReportRequest(GenerateUnitedNettingReportRequest&& other) noexcept = default; // move constructor

    GenerateUnitedNettingReportRequest& operator=(const GenerateUnitedNettingReportRequest& other) = default; // copy assignment
    GenerateUnitedNettingReportRequest& operator=(GenerateUnitedNettingReportRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GenerateUnitedNettingReportRequest members

    /// <summary>
    /// Идентификатор бизнеса.
    /// </summary>
    int64_t getBusinessId() const;
    void setBusinessId(int64_t value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Начало периода, включительно. 
    /// </summary>
    std::string getDateTimeFrom() const;
    void setDateTimeFrom(std::string value);

    /// <summary>
    /// {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Конец периода, включительно. Максимальный период — 1 год. 
    /// </summary>
    std::string getDateTimeTo() const;
    void setDateTimeTo(std::string value);

    /// <summary>
    /// Начало периода, включительно.
    /// </summary>
    std::string getDateFrom() const;
    void setDateFrom(std::string value);

    /// <summary>
    /// Конец периода, включительно. Максимальный период — 1 год.
    /// </summary>
    std::string getDateTo() const;
    void setDateTo(std::string value);

    /// <summary>
    /// Номер платежного поручения.
    /// </summary>
    int64_t getBankOrderId() const;
    void setBankOrderId(int64_t value);

    /// <summary>
    /// Дата платежного поручения.
    /// </summary>
    std::string getBankOrderDateTime() const;
    void setBankOrderDateTime(std::string value);

    /// <summary>
    /// Список моделей, которые нужны в отчете. 
    /// </summary>
    std::vector<PlacementType> getPlacementPrograms() const;
    void setPlacementPrograms(std::vector<PlacementType> value);

    /// <summary>
    /// Список ИНН, которые нужны в отчете.
    /// </summary>
    std::vector<std::string> getInns() const;
    void setInns(std::vector<std::string> value);

    /// <summary>
    /// Список магазинов, которые нужны в отчете.
    /// </summary>
    std::vector<int64_t> getCampaignIds() const;
    void setCampaignIds(std::vector<int64_t> value);

protected:
    int64_t m_BusinessId = 0L;
    std::string m_DateTimeFrom = "";
    std::string m_DateTimeTo = "";
    std::string m_DateFrom = "";
    std::string m_DateTo = "";
    int64_t m_BankOrderId = 0L;
    std::string m_BankOrderDateTime = "";
    std::vector<PlacementType> m_PlacementPrograms;
    std::vector<std::string> m_Inns;
    std::vector<int64_t> m_CampaignIds;
};

std::vector<GenerateUnitedNettingReportRequest> createGenerateUnitedNettingReportRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GenerateUnitedNettingReportRequest>(const GenerateUnitedNettingReportRequest& val) {
    return val.toPropertyTree();
}

template<>
inline GenerateUnitedNettingReportRequest fromPt<GenerateUnitedNettingReportRequest>(const boost::property_tree::ptree& pt) {
    GenerateUnitedNettingReportRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GenerateUnitedNettingReportRequest_H_ */
