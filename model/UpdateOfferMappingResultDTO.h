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
 * UpdateOfferMappingResultDTO.h
 *
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */

#ifndef UpdateOfferMappingResultDTO_H_
#define UpdateOfferMappingResultDTO_H_



#include "OfferMappingErrorDTO.h"
#include <string>
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
/// Ошибки и предупреждения, которые появились из-за переданных характеристик.
/// </summary>
class  UpdateOfferMappingResultDTO 
{
public:
    UpdateOfferMappingResultDTO() = default;
    explicit UpdateOfferMappingResultDTO(boost::property_tree::ptree const& pt);
    virtual ~UpdateOfferMappingResultDTO() = default;

    UpdateOfferMappingResultDTO(const UpdateOfferMappingResultDTO& other) = default; // copy constructor
    UpdateOfferMappingResultDTO(UpdateOfferMappingResultDTO&& other) noexcept = default; // move constructor

    UpdateOfferMappingResultDTO& operator=(const UpdateOfferMappingResultDTO& other) = default; // copy assignment
    UpdateOfferMappingResultDTO& operator=(UpdateOfferMappingResultDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// UpdateOfferMappingResultDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string value);

    /// <summary>
    /// Ошибки — информация в каталоге не обновится.
    /// </summary>
    std::vector<OfferMappingErrorDTO> getErrors() const;
    void setErrors(std::vector<OfferMappingErrorDTO> value);

    /// <summary>
    /// Предупреждения — информация в каталоге обновится.
    /// </summary>
    std::vector<OfferMappingErrorDTO> getWarnings() const;
    void setWarnings(std::vector<OfferMappingErrorDTO> value);

protected:
    std::string m_OfferId = "";
    std::vector<OfferMappingErrorDTO> m_Errors;
    std::vector<OfferMappingErrorDTO> m_Warnings;
};

std::vector<UpdateOfferMappingResultDTO> createUpdateOfferMappingResultDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<UpdateOfferMappingResultDTO>(const UpdateOfferMappingResultDTO& val) {
    return val.toPropertyTree();
}

template<>
inline UpdateOfferMappingResultDTO fromPt<UpdateOfferMappingResultDTO>(const boost::property_tree::ptree& pt) {
    UpdateOfferMappingResultDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* UpdateOfferMappingResultDTO_H_ */
