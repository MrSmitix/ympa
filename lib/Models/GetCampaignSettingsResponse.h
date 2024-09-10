
/*
 * GetCampaignSettingsResponse.h
 *
 * Ответ на запрос настроек магазина.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignSettingsResponse_H_
#define TINY_CPP_CLIENT_GetCampaignSettingsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignSettingsDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос настроек магазина.
 *
 *  \ingroup Models
 *
 */

class GetCampaignSettingsResponse{
public:

    /*! \brief Constructor.
	 */
    GetCampaignSettingsResponse();
    GetCampaignSettingsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignSettingsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignSettingsDTO getSettings();

	/*! \brief Set 
	 */
	void setSettings(CampaignSettingsDTO  settings);


    private:
    CampaignSettingsDTO settings;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignSettingsResponse_H_ */
