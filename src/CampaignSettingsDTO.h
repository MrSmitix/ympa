/*
 * CampaignSettingsDTO.h
 *
 * Настройки магазина.
 */

#ifndef _CampaignSettingsDTO_H_
#define _CampaignSettingsDTO_H_


#include <string>
#include "CampaignSettingsLocalRegionDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Настройки магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignSettingsDTO();
	CampaignSettingsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignSettingsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор региона, в котором находится магазин.
	 */
	long long getCountryRegion();

	/*! \brief Set Идентификатор региона, в котором находится магазин.
	 */
	void setCountryRegion(long long  countryRegion);
	/*! \brief Get Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
	 */
	std::string getShopName();

	/*! \brief Set Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
	 */
	void setShopName(std::string  shopName);
	/*! \brief Get Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
	 */
	bool getShowInContext();

	/*! \brief Set Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
	 */
	void setShowInContext(bool  showInContext);
	/*! \brief Get Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
	 */
	bool getShowInPremium();

	/*! \brief Set Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
	 */
	void setShowInPremium(bool  showInPremium);
	/*! \brief Get Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
	 */
	bool getUseOpenStat();

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
	long long countryRegion;
	std::string shopName;
	bool showInContext;
	bool showInPremium;
	bool useOpenStat;
	CampaignSettingsLocalRegionDTO localRegion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignSettingsDTO_H_ */
