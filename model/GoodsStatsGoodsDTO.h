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
 * GoodsStatsGoodsDTO.h
 *
 * Информация о товаре.
 */

#ifndef GoodsStatsGoodsDTO_H_
#define GoodsStatsGoodsDTO_H_



#include "TariffDTO.h"
#include "GoodsStatsWeightDimensionsDTO.h"
#include <string>
#include "GoodsStatsWarehouseDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Информация о товаре.
/// </summary>
class  GoodsStatsGoodsDTO 
{
public:
    GoodsStatsGoodsDTO() = default;
    explicit GoodsStatsGoodsDTO(boost::property_tree::ptree const& pt);
    virtual ~GoodsStatsGoodsDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GoodsStatsGoodsDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getShopSku() const;
    void setShopSku(std::string value);

    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    void setMarketSku(int64_t value);

    /// <summary>
    /// Название товара.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
    /// </summary>
    double getPrice() const;
    void setPrice(double value);

    /// <summary>
    /// Идентификатор категории товара на Маркете.
    /// </summary>
    int64_t getCategoryId() const;
    void setCategoryId(int64_t value);

    /// <summary>
    /// Название категории товара на Маркете.
    /// </summary>
    std::string getCategoryName() const;
    void setCategoryName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<GoodsStatsWeightDimensionsDTO> getWeightDimensions() const;
    void setWeightDimensions(std::shared_ptr<GoodsStatsWeightDimensionsDTO> value);

    /// <summary>
    /// Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
    /// </summary>
    std::vector<std::shared_ptr<GoodsStatsWarehouseDTO>> getWarehouses() const;
    void setWarehouses(std::vector<std::shared_ptr<GoodsStatsWarehouseDTO>> value);

    /// <summary>
    /// Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
    /// </summary>
    std::vector<std::shared_ptr<TariffDTO>> getTariffs() const;
    void setTariffs(std::vector<std::shared_ptr<TariffDTO>> value);

    /// <summary>
    /// Ссылки (URL) изображений товара в хорошем качестве.
    /// </summary>
    std::vector<std::string> getPictures() const;
    void setPictures(std::vector<std::string> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_ShopSku = "";
    int64_t m_MarketSku = 0L;
    std::string m_Name = "";
    double m_Price = 0.0;
    int64_t m_CategoryId = 0L;
    std::string m_CategoryName = "";
    std::shared_ptr<GoodsStatsWeightDimensionsDTO> m_WeightDimensions;
    std::vector<std::shared_ptr<GoodsStatsWarehouseDTO>> m_Warehouses;
    std::vector<std::shared_ptr<TariffDTO>> m_Tariffs;
    std::vector<std::string> m_Pictures;
};

std::vector<GoodsStatsGoodsDTO> createGoodsStatsGoodsDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GoodsStatsGoodsDTO_H_ */
