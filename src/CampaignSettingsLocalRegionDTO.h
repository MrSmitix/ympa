/*
 * CampaignSettingsLocalRegionDTO.h
 *
 * Информация о своем регионе магазина.
 */

#ifndef _CampaignSettingsLocalRegionDTO_H_
#define _CampaignSettingsLocalRegionDTO_H_


#include <string>
#include "CampaignSettingsDeliveryDTO.h"
#include "CampaignSettingsScheduleSourceType.h"
#include "RegionType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о своем регионе магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsLocalRegionDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignSettingsLocalRegionDTO();
	CampaignSettingsLocalRegionDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignSettingsLocalRegionDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор региона.
	 */
	long long getId();

	/*! \brief Set Идентификатор региона.
	 */
	void setId(long long  id);
	/*! \brief Get Название региона.
	 */
	std::string getName();

	/*! \brief Set Название региона.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	RegionType getType();

	/*! \brief Set 
	 */
	void setType(RegionType  type);
	/*! \brief Get 
	 */
	CampaignSettingsScheduleSourceType getDeliveryOptionsSource();

	/*! \brief Set 
	 */
	void setDeliveryOptionsSource(CampaignSettingsScheduleSourceType  deliveryOptionsSource);
	/*! \brief Get 
	 */
	CampaignSettingsDeliveryDTO getDelivery();

	/*! \brief Set 
	 */
	void setDelivery(CampaignSettingsDeliveryDTO  delivery);

private:
	long long id;
	std::string name;
	RegionType type;
	CampaignSettingsScheduleSourceType deliveryOptionsSource;
	CampaignSettingsDeliveryDTO delivery;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignSettingsLocalRegionDTO_H_ */
