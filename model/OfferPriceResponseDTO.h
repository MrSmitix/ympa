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
#include "helpers.h"

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

    OfferPriceResponseDTO(const OfferPriceResponseDTO& other) = default; // copy constructor
    OfferPriceResponseDTO(OfferPriceResponseDTO&& other) noexcept = default; // move constructor

    OfferPriceResponseDTO& operator=(const OfferPriceResponseDTO& other) = default; // copy assignment
    OfferPriceResponseDTO& operator=(OfferPriceResponseDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
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
    PriceDTO getPrice() const;
    void setPrice(PriceDTO value);

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
    std::string m_Id = "";
    PriceDTO m_Price;
    int64_t m_MarketSku = 0L;
    std::string m_UpdatedAt = "";
};

std::vector<OfferPriceResponseDTO> createOfferPriceResponseDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OfferPriceResponseDTO>(const OfferPriceResponseDTO& val) {
    return val.toPropertyTree();
}

template<>
inline OfferPriceResponseDTO fromPt<OfferPriceResponseDTO>(const boost::property_tree::ptree& pt) {
    OfferPriceResponseDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OfferPriceResponseDTO_H_ */
