
/*
 * CampaignSettingsDTO.h
 *
 * Настройки магазина.
 */

#ifndef TINY_CPP_CLIENT_CampaignSettingsDTO_H_
#define TINY_CPP_CLIENT_CampaignSettingsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignSettingsLocalRegionDTO.h"

namespace Tiny {


/*! \brief Настройки магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignSettingsDTO();
    CampaignSettingsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignSettingsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор региона, в котором находится магазин.
	 */
	long getCountryRegion();

	/*! \brief Set Идентификатор региона, в котором находится магазин.
	 */
	void setCountryRegion(long  countryRegion);
	/*! \brief Get Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
	 */
	std::string getShopName();

	/*! \brief Set Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
	 */
	void setShopName(std::string  shopName);
	/*! \brief Get Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
	 */
	bool isShowInContext();

	/*! \brief Set Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
	 */
	void setShowInContext(bool  showInContext);
	/*! \brief Get Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
	 */
	bool isShowInPremium();

	/*! \brief Set Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
	 */
	void setShowInPremium(bool  showInPremium);
	/*! \brief Get Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
	 */
	bool isUseOpenStat();

	/*! \brief Set Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
	 */
	void setUseOpenStat(bool  useOpenStat);
	/*! \brief Get 
	 */
	CampaignSettingsLocalRegionDTO getLocalRegion();

	/*! \brief Set 
	 */
	void setLocalRegion(CampaignSettingsLocalRegionDTO  localRegion);


    private:
    long countryRegion{};
    std::string shopName{};
    bool showInContext{};
    bool showInPremium{};
    bool useOpenStat{};
    CampaignSettingsLocalRegionDTO localRegion;
};
}

#endif /* TINY_CPP_CLIENT_CampaignSettingsDTO_H_ */
