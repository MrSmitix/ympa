
/*
 * CampaignSettingsDeliveryDTO.h
 *
 * Информация о доставке в своем регионе магазина.
 */

#ifndef TINY_CPP_CLIENT_CampaignSettingsDeliveryDTO_H_
#define TINY_CPP_CLIENT_CampaignSettingsDeliveryDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignSettingsScheduleDTO.h"

namespace Tiny {


/*! \brief Информация о доставке в своем регионе магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsDeliveryDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignSettingsDeliveryDTO();
    CampaignSettingsDeliveryDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignSettingsDeliveryDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignSettingsScheduleDTO getSchedule();

	/*! \brief Set 
	 */
	void setSchedule(CampaignSettingsScheduleDTO  schedule);


    private:
    CampaignSettingsScheduleDTO schedule;
};
}

#endif /* TINY_CPP_CLIENT_CampaignSettingsDeliveryDTO_H_ */
