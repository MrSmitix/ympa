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
 * FeedPublicationPriceAndStockUpdateDTO.h
 *
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
 */

#ifndef FeedPublicationPriceAndStockUpdateDTO_H_
#define FeedPublicationPriceAndStockUpdateDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре &#x60;full&#x60;. Выводится, если параметр &#x60;publication status&#x3D;OK&#x60;. 
/// </summary>
class  FeedPublicationPriceAndStockUpdateDTO 
{
public:
    FeedPublicationPriceAndStockUpdateDTO() = default;
    explicit FeedPublicationPriceAndStockUpdateDTO(boost::property_tree::ptree const& pt);
    virtual ~FeedPublicationPriceAndStockUpdateDTO() = default;

    FeedPublicationPriceAndStockUpdateDTO(const FeedPublicationPriceAndStockUpdateDTO& other) = default; // copy constructor
    FeedPublicationPriceAndStockUpdateDTO(FeedPublicationPriceAndStockUpdateDTO&& other) noexcept = default; // move constructor

    FeedPublicationPriceAndStockUpdateDTO& operator=(const FeedPublicationPriceAndStockUpdateDTO& other) = default; // copy assignment
    FeedPublicationPriceAndStockUpdateDTO& operator=(FeedPublicationPriceAndStockUpdateDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// FeedPublicationPriceAndStockUpdateDTO members

    /// <summary>
    /// Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
    /// </summary>
    std::string getFileTime() const;
    void setFileTime(std::string value);

    /// <summary>
    /// Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
    /// </summary>
    std::string getPublishedTime() const;
    void setPublishedTime(std::string value);

protected:
    std::string m_FileTime = "";
    std::string m_PublishedTime = "";
};

std::vector<FeedPublicationPriceAndStockUpdateDTO> createFeedPublicationPriceAndStockUpdateDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<FeedPublicationPriceAndStockUpdateDTO>(const FeedPublicationPriceAndStockUpdateDTO& val) {
    return val.toPropertyTree();
}

template<>
inline FeedPublicationPriceAndStockUpdateDTO fromPt<FeedPublicationPriceAndStockUpdateDTO>(const boost::property_tree::ptree& pt) {
    FeedPublicationPriceAndStockUpdateDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* FeedPublicationPriceAndStockUpdateDTO_H_ */
