/*
 * GetCampaignSettingsResponse.h
 *
 * Ответ на запрос настроек магазина.
 */

#ifndef _GetCampaignSettingsResponse_H_
#define _GetCampaignSettingsResponse_H_


#include <string>
#include "CampaignSettingsDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос настроек магазина.
 *
 *  \ingroup Models
 *
 */

class GetCampaignSettingsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignSettingsResponse();
	GetCampaignSettingsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignSettingsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignSettingsDTO getSettings();

	/*! \brief Set 
	 */
	void setSettings(CampaignSettingsDTO  settings);

private:
	CampaignSettingsDTO settings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignSettingsResponse_H_ */
