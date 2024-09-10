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
 * FeedIndexLogsResultDTO.h
 *
 * Результат выполнения запроса отчета по индексации прайс-листа.
 */

#ifndef FeedIndexLogsResultDTO_H_
#define FeedIndexLogsResultDTO_H_



#include "FeedIndexLogsRecordDTO.h"
#include "FeedIndexLogsFeedDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Результат выполнения запроса отчета по индексации прайс-листа.
/// </summary>
class  FeedIndexLogsResultDTO 
{
public:
    FeedIndexLogsResultDTO() = default;
    explicit FeedIndexLogsResultDTO(boost::property_tree::ptree const& pt);
    virtual ~FeedIndexLogsResultDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// FeedIndexLogsResultDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedIndexLogsFeedDTO> getFeed() const;
    void setFeed(std::shared_ptr<FeedIndexLogsFeedDTO> value);

    /// <summary>
    /// Список отчетов по индексации прайс-листа.
    /// </summary>
    std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>> getIndexLogRecords() const;
    void setIndexLogRecords(std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>> value);

    /// <summary>
    /// Количество отчетов на всех страницах выходных данных.
    /// </summary>
    int64_t getTotal() const;
    void setTotal(int64_t value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<FeedIndexLogsFeedDTO> m_Feed;
    std::vector<std::shared_ptr<FeedIndexLogsRecordDTO>> m_IndexLogRecords;
    int64_t m_Total = 0L;
};

std::vector<FeedIndexLogsResultDTO> createFeedIndexLogsResultDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* FeedIndexLogsResultDTO_H_ */
