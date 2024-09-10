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
 * GetCategoriesMaxSaleQuantumRequest.h
 *
 * Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
 */

#ifndef GetCategoriesMaxSaleQuantumRequest_H_
#define GetCategoriesMaxSaleQuantumRequest_H_



#include <set>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Список категорий, для которых нужно вернуть лимит на установку кванта и минимального количества товаров. 
/// </summary>
class  GetCategoriesMaxSaleQuantumRequest 
{
public:
    GetCategoriesMaxSaleQuantumRequest() = default;
    explicit GetCategoriesMaxSaleQuantumRequest(boost::property_tree::ptree const& pt);
    virtual ~GetCategoriesMaxSaleQuantumRequest() = default;

    GetCategoriesMaxSaleQuantumRequest(const GetCategoriesMaxSaleQuantumRequest& other) = default; // copy constructor
    GetCategoriesMaxSaleQuantumRequest(GetCategoriesMaxSaleQuantumRequest&& other) noexcept = default; // move constructor

    GetCategoriesMaxSaleQuantumRequest& operator=(const GetCategoriesMaxSaleQuantumRequest& other) = default; // copy assignment
    GetCategoriesMaxSaleQuantumRequest& operator=(GetCategoriesMaxSaleQuantumRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetCategoriesMaxSaleQuantumRequest members

    /// <summary>
    /// Идентификаторы листовых категории на Маркете — тех, у которых нет дочерних категорий.
    /// </summary>
    std::set<int64_t> getMarketCategoryIds() const;
    void setMarketCategoryIds(std::set<int64_t> value);

protected:
    std::set<int64_t> m_MarketCategoryIds;
};

std::vector<GetCategoriesMaxSaleQuantumRequest> createGetCategoriesMaxSaleQuantumRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetCategoriesMaxSaleQuantumRequest>(const GetCategoriesMaxSaleQuantumRequest& val) {
    return val.toPropertyTree();
}

template<>
inline GetCategoriesMaxSaleQuantumRequest fromPt<GetCategoriesMaxSaleQuantumRequest>(const boost::property_tree::ptree& pt) {
    GetCategoriesMaxSaleQuantumRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetCategoriesMaxSaleQuantumRequest_H_ */
