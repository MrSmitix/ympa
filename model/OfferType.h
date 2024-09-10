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
 * OfferType.h
 *
 * Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
 */

#ifndef OfferType_H_
#define OfferType_H_



#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Особый тип товара:  * &#x60;MEDICINE&#x60; — лекарства. * &#x60;BOOK&#x60; — бумажные и электронные книги. * &#x60;AUDIOBOOK&#x60; — аудиокниги. * &#x60;ARTIST_TITLE&#x60; — музыкальная и видеопродукция. * &#x60;ON_DEMAND&#x60; — товары на заказ.  {% note info \&quot;Если ваш товар — книга\&quot; %}  Укажите год издания в характеристиках товара. [Подробнее о параметре](../../reference/business-assortment/updateOfferMappings.md#offerparamdto)  {% endnote %} 
/// </summary>
class  OfferType 
{
public:
    OfferType() = default;
    explicit OfferType(boost::property_tree::ptree const& pt);
    virtual ~OfferType() = default;

    OfferType(const OfferType& other) = default; // copy constructor
    OfferType(OfferType&& other) noexcept = default; // move constructor

    OfferType& operator=(const OfferType& other) = default; // copy assignment
    OfferType& operator=(OfferType&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    std::string toString() const;
    void fromString(const std::string& str);

    /////////////////////////////////////////////
    /// OfferType members
    std::string getEnumValue() const;
    void setEnumValue(const std::string& val);

protected:
    std::string m_OfferTypeEnumValue;
};

std::vector<OfferType> createOfferTypeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<OfferType>(const OfferType& val) {
    return val.toPropertyTree();
}

template<>
inline OfferType fromPt<OfferType>(const boost::property_tree::ptree& pt) {
    OfferType ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* OfferType_H_ */
