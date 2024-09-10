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
 * GenerateStocksOnWarehousesReportRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef GenerateStocksOnWarehousesReportRequest_H_
#define GenerateStocksOnWarehousesReportRequest_H_



#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Данные, необходимые для генерации отчета. 
/// </summary>
class  GenerateStocksOnWarehousesReportRequest 
{
public:
    GenerateStocksOnWarehousesReportRequest() = default;
    explicit GenerateStocksOnWarehousesReportRequest(boost::property_tree::ptree const& pt);
    virtual ~GenerateStocksOnWarehousesReportRequest() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GenerateStocksOnWarehousesReportRequest members

    /// <summary>
    /// Идентификатор магазина.
    /// </summary>
    int64_t getCampaignId() const;
    void setCampaignId(int64_t value);

    /// <summary>
    /// Фильтр по идентификаторам складов (только модель FBY). Чтобы узнать идентификатор, воспользуйтесь запросом [GET warehouses](../../reference/warehouses/getFulfillmentWarehouses.md).
    /// </summary>
    std::vector<int64_t> getWarehouseIds() const;
    void setWarehouseIds(std::vector<int64_t> value);

    /// <summary>
    /// Фильтр по дате (для модели FBY). В отчет попадут данные за **предшествующий** дате день.
    /// </summary>
    std::string getReportDate() const;
    void setReportDate(std::string value);

    /// <summary>
    /// Фильтр по категориям на Маркете (кроме модели FBY).
    /// </summary>
    std::vector<int64_t> getCategoryIds() const;
    void setCategoryIds(std::vector<int64_t> value);

    /// <summary>
    /// Фильтр по наличию остатков (кроме модели FBY).
    /// </summary>
    bool isHasStocks() const;
    void setHasStocks(bool value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    int64_t m_CampaignId = 0L;
    std::vector<int64_t> m_WarehouseIds;
    std::string m_ReportDate = "";
    std::vector<int64_t> m_CategoryIds;
    bool m_HasStocks = false;
};

std::vector<GenerateStocksOnWarehousesReportRequest> createGenerateStocksOnWarehousesReportRequestVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GenerateStocksOnWarehousesReportRequest_H_ */
