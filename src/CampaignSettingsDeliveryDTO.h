/*
 * CampaignSettingsDeliveryDTO.h
 *
 * Информация о доставке в своем регионе магазина.
 */

#ifndef _CampaignSettingsDeliveryDTO_H_
#define _CampaignSettingsDeliveryDTO_H_


#include <string>
#include "CampaignSettingsScheduleDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о доставке в своем регионе магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsDeliveryDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignSettingsDeliveryDTO();
	CampaignSettingsDeliveryDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignSettingsDeliveryDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignSettingsScheduleDTO getSchedule();

	/*! \brief Set 
	 */
	void setSchedule(CampaignSettingsScheduleDTO  schedule);

private:
	CampaignSettingsScheduleDTO schedule;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignSettingsDeliveryDTO_H_ */
