/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
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
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация о товаре.
/// </summary>
class  GoodsStatsGoodsDTO
{
public:
    GoodsStatsGoodsDTO();
    virtual ~GoodsStatsGoodsDTO() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const GoodsStatsGoodsDTO& rhs) const;
    bool operator!=(const GoodsStatsGoodsDTO& rhs) const;

    /////////////////////////////////////////////
    /// GoodsStatsGoodsDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getShopSku() const;
    void setShopSku(std::string const& value);
    bool shopSkuIsSet() const;
    void unsetShopSku();
    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    void setMarketSku(int64_t const value);
    bool marketSkuIsSet() const;
    void unsetMarketSku();
    /// <summary>
    /// Название товара.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
    /// </summary>
    double getPrice() const;
    void setPrice(double const value);
    bool priceIsSet() const;
    void unsetPrice();
    /// <summary>
    /// Идентификатор категории товара на Маркете.
    /// </summary>
    int64_t getCategoryId() const;
    void setCategoryId(int64_t const value);
    bool categoryIdIsSet() const;
    void unsetCategoryId();
    /// <summary>
    /// Название категории товара на Маркете.
    /// </summary>
    std::string getCategoryName() const;
    void setCategoryName(std::string const& value);
    bool categoryNameIsSet() const;
    void unsetCategoryName();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::GoodsStatsWeightDimensionsDTO getWeightDimensions() const;
    void setWeightDimensions(org::openapitools::server::model::GoodsStatsWeightDimensionsDTO const& value);
    bool weightDimensionsIsSet() const;
    void unsetWeightDimensions();
    /// <summary>
    /// Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
    /// </summary>
    std::vector<org::openapitools::server::model::GoodsStatsWarehouseDTO> getWarehouses() const;
    void setWarehouses(std::vector<org::openapitools::server::model::GoodsStatsWarehouseDTO> const& value);
    bool warehousesIsSet() const;
    void unsetWarehouses();
    /// <summary>
    /// Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги &#x60;SORTING&#x60; (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
    /// </summary>
    std::vector<org::openapitools::server::model::TariffDTO> getTariffs() const;
    void setTariffs(std::vector<org::openapitools::server::model::TariffDTO> const& value);
    bool tariffsIsSet() const;
    void unsetTariffs();
    /// <summary>
    /// Ссылки (URL) изображений товара в хорошем качестве.
    /// </summary>
    std::vector<std::string> getPictures() const;
    void setPictures(std::vector<std::string> const& value);
    bool picturesIsSet() const;
    void unsetPictures();

    friend  void to_json(nlohmann::json& j, const GoodsStatsGoodsDTO& o);
    friend  void from_json(const nlohmann::json& j, GoodsStatsGoodsDTO& o);
protected:
    std::string m_ShopSku;
    bool m_ShopSkuIsSet;
    int64_t m_MarketSku;
    bool m_MarketSkuIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    double m_Price;
    bool m_PriceIsSet;
    int64_t m_CategoryId;
    bool m_CategoryIdIsSet;
    std::string m_CategoryName;
    bool m_CategoryNameIsSet;
    org::openapitools::server::model::GoodsStatsWeightDimensionsDTO m_WeightDimensions;
    bool m_WeightDimensionsIsSet;
    std::vector<org::openapitools::server::model::GoodsStatsWarehouseDTO> m_Warehouses;
    bool m_WarehousesIsSet;
    std::vector<org::openapitools::server::model::TariffDTO> m_Tariffs;
    bool m_TariffsIsSet;
    std::vector<std::string> m_Pictures;
    bool m_PicturesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* GoodsStatsGoodsDTO_H_ */
