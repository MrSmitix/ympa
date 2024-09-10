
/*
 * CampaignSettingsLocalRegionDTO.h
 *
 * Информация о своем регионе магазина.
 */

#ifndef TINY_CPP_CLIENT_CampaignSettingsLocalRegionDTO_H_
#define TINY_CPP_CLIENT_CampaignSettingsLocalRegionDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignSettingsDeliveryDTO.h"
#include "CampaignSettingsScheduleSourceType.h"
#include "RegionType.h"

namespace Tiny {


/*! \brief Информация о своем регионе магазина.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsLocalRegionDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignSettingsLocalRegionDTO();
    CampaignSettingsLocalRegionDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignSettingsLocalRegionDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор региона.
	 */
	long getId();

	/*! \brief Set Идентификатор региона.
	 */
	void setId(long  id);
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
    long id{};
    std::string name{};
    RegionType type;
    CampaignSettingsScheduleSourceType deliveryOptionsSource;
    CampaignSettingsDeliveryDTO delivery;
};
}

#endif /* TINY_CPP_CLIENT_CampaignSettingsLocalRegionDTO_H_ */
