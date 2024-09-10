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
 * CampaignSettingsDTO.h
 *
 * Настройки магазина.
 */

#ifndef CampaignSettingsDTO_H_
#define CampaignSettingsDTO_H_


#include <string>
#include "CampaignSettingsLocalRegionDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Настройки магазина.
/// </summary>
class  CampaignSettingsDTO
{
public:
    CampaignSettingsDTO();
    virtual ~CampaignSettingsDTO() = default;


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

    bool operator==(const CampaignSettingsDTO& rhs) const;
    bool operator!=(const CampaignSettingsDTO& rhs) const;

    /////////////////////////////////////////////
    /// CampaignSettingsDTO members

    /// <summary>
    /// Идентификатор региона, в котором находится магазин.
    /// </summary>
    int64_t getCountryRegion() const;
    void setCountryRegion(int64_t const value);
    bool countryRegionIsSet() const;
    void unsetCountryRegion();
    /// <summary>
    /// Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — &#x60;null&#x60;. 
    /// </summary>
    std::string getShopName() const;
    void setShopName(std::string const& value);
    bool shopNameIsSet() const;
    void unsetShopName();
    /// <summary>
    /// Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * &#x60;false&#x60; — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * &#x60;true&#x60; — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
    /// </summary>
    bool isShowInContext() const;
    void setShowInContext(bool const value);
    bool showInContextIsSet() const;
    void unsetShowInContext();
    /// <summary>
    /// Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * &#x60;false&#x60; — предложения не показываются в блоке cпецразмещения. * &#x60;true&#x60; — предложения показываются в блоке cпецразмещения. 
    /// </summary>
    bool isShowInPremium() const;
    void setShowInPremium(bool const value);
    bool showInPremiumIsSet() const;
    void unsetShowInPremium();
    /// <summary>
    /// Признак использования внешней интернет-статистики. Возможные значения: * &#x60;false&#x60; — внешняя интернет-статистика не используется. * &#x60;true&#x60; — внешняя интернет-статистика используется. 
    /// </summary>
    bool isUseOpenStat() const;
    void setUseOpenStat(bool const value);
    bool useOpenStatIsSet() const;
    void unsetUseOpenStat();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CampaignSettingsLocalRegionDTO getLocalRegion() const;
    void setLocalRegion(org::openapitools::server::model::CampaignSettingsLocalRegionDTO const& value);
    bool localRegionIsSet() const;
    void unsetLocalRegion();

    friend  void to_json(nlohmann::json& j, const CampaignSettingsDTO& o);
    friend  void from_json(const nlohmann::json& j, CampaignSettingsDTO& o);
protected:
    int64_t m_CountryRegion;
    bool m_CountryRegionIsSet;
    std::string m_ShopName;
    bool m_ShopNameIsSet;
    bool m_ShowInContext;
    bool m_ShowInContextIsSet;
    bool m_ShowInPremium;
    bool m_ShowInPremiumIsSet;
    bool m_UseOpenStat;
    bool m_UseOpenStatIsSet;
    org::openapitools::server::model::CampaignSettingsLocalRegionDTO m_LocalRegion;
    bool m_LocalRegionIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CampaignSettingsDTO_H_ */
