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
 * UpdateBusinessPricesRequest.h
 *
 * Запрос на установку базовых цен на товары.
 */

#ifndef UpdateBusinessPricesRequest_H_
#define UpdateBusinessPricesRequest_H_



#include "UpdateBusinessOfferPriceDTO.h"
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
/// Запрос на установку базовых цен на товары.
/// </summary>
class  UpdateBusinessPricesRequest 
{
public:
    UpdateBusinessPricesRequest() = default;
    explicit UpdateBusinessPricesRequest(boost::property_tree::ptree const& pt);
    virtual ~UpdateBusinessPricesRequest() = default;

    UpdateBusinessPricesRequest(const UpdateBusinessPricesRequest& other) = default; // copy constructor
    UpdateBusinessPricesRequest(UpdateBusinessPricesRequest&& other) noexcept = default; // move constructor

    UpdateBusinessPricesRequest& operator=(const UpdateBusinessPricesRequest& other) = default; // copy assignment
    UpdateBusinessPricesRequest& operator=(UpdateBusinessPricesRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdateBusinessPricesRequest members

    /// <summary>
    /// Список товаров с ценами.
    /// </summary>
    std::vector<UpdateBusinessOfferPriceDTO> getOffers() const;
    void setOffers(std::vector<UpdateBusinessOfferPriceDTO> value);

protected:
    std::vector<UpdateBusinessOfferPriceDTO> m_Offers;
};

std::vector<UpdateBusinessPricesRequest> createUpdateBusinessPricesRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdateBusinessPricesRequest>(const UpdateBusinessPricesRequest& val) {
    return val.toPropertyTree();
}

template<>
inline UpdateBusinessPricesRequest fromPt<UpdateBusinessPricesRequest>(const boost::property_tree::ptree& pt) {
    UpdateBusinessPricesRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdateBusinessPricesRequest_H_ */
