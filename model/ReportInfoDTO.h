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
 * ReportInfoDTO.h
 *
 * Статус генерации и ссылка на готовый отчет.
 */

#ifndef ReportInfoDTO_H_
#define ReportInfoDTO_H_



#include <string>
#include "ReportStatusType.h"
#include "ReportSubStatusType.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Статус генерации и ссылка на готовый отчет.
/// </summary>
class  ReportInfoDTO 
{
public:
    ReportInfoDTO() = default;
    explicit ReportInfoDTO(boost::property_tree::ptree const& pt);
    virtual ~ReportInfoDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// ReportInfoDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ReportStatusType> getStatus() const;
    void setStatus(std::shared_ptr<ReportStatusType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ReportSubStatusType> getSubStatus() const;
    void setSubStatus(std::shared_ptr<ReportSubStatusType> value);

    /// <summary>
    /// Дата и время запроса на генерацию.
    /// </summary>
    std::string getGenerationRequestedAt() const;
    void setGenerationRequestedAt(std::string value);

    /// <summary>
    /// Дата и время завершения генерации.
    /// </summary>
    std::string getGenerationFinishedAt() const;
    void setGenerationFinishedAt(std::string value);

    /// <summary>
    /// Ссылка на готовый отчет.
    /// </summary>
    std::string getFile() const;
    void setFile(std::string value);

    /// <summary>
    /// Ожидаемая продолжительность генерации в миллисекундах.
    /// </summary>
    int64_t getEstimatedGenerationTime() const;
    void setEstimatedGenerationTime(int64_t value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<ReportStatusType> m_Status = std::make_shared<ReportStatusType>();
    std::shared_ptr<ReportSubStatusType> m_SubStatus = std::make_shared<ReportSubStatusType>();
    std::string m_GenerationRequestedAt = "";
    std::string m_GenerationFinishedAt = "";
    std::string m_file = "";
    int64_t m_EstimatedGenerationTime = 0L;
};

std::vector<ReportInfoDTO> createReportInfoDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* ReportInfoDTO_H_ */
