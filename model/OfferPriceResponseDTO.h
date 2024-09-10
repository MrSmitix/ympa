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
 * OfferPriceResponseDTO.h
 *
 * Информация об установленной цене на товар.
 */

#ifndef OfferPriceResponseDTO_H_
#define OfferPriceResponseDTO_H_



#include <string>
#include "PriceDTO.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация об установленной цене на товар.
/// </summary>
class  OfferPriceResponseDTO 
{
public:
    OfferPriceResponseDTO() = default;
    explicit OfferPriceResponseDTO(boost::property_tree::ptree const& pt);
    virtual ~OfferPriceResponseDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// OfferPriceResponseDTO members

    /// <summary>
    /// Идентификатор предложения из прайс-листа.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PriceDTO> getPrice() const;
    void setPrice(std::shared_ptr<PriceDTO> value);

    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    void setMarketSku(int64_t value);

    /// <summary>
    /// Дата и время последнего обновления цены на товар.
    /// </summary>
    std::string getUpdatedAt() const;
    void setUpdatedAt(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Id = "";
    std::shared_ptr<PriceDTO> m_Price;
    int64_t m_MarketSku = 0L;
    std::string m_UpdatedAt = "";
};

std::vector<OfferPriceResponseDTO> createOfferPriceResponseDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* OfferPriceResponseDTO_H_ */
