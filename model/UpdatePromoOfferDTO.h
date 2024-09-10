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
 * UpdatePromoOfferDTO.h
 *
 * Описание товаров, которые участвуют в акции.
 */

#ifndef UpdatePromoOfferDTO_H_
#define UpdatePromoOfferDTO_H_



#include "UpdatePromoOfferParamsDTO.h"
#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Описание товаров, которые участвуют в акции.
/// </summary>
class  UpdatePromoOfferDTO 
{
public:
    UpdatePromoOfferDTO() = default;
    explicit UpdatePromoOfferDTO(boost::property_tree::ptree const& pt);
    virtual ~UpdatePromoOfferDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// UpdatePromoOfferDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getOfferId() const;
    void setOfferId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<UpdatePromoOfferParamsDTO> getParams() const;
    void setParams(std::shared_ptr<UpdatePromoOfferParamsDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_OfferId = "";
    std::shared_ptr<UpdatePromoOfferParamsDTO> m_Params;
};

std::vector<UpdatePromoOfferDTO> createUpdatePromoOfferDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* UpdatePromoOfferDTO_H_ */
