/*
 * GetCampaignResponse.h
 *
 * Информация о магазине к данным идентификатора кампании.
 */

#ifndef _GetCampaignResponse_H_
#define _GetCampaignResponse_H_


#include <string>
#include "CampaignDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о магазине к данным идентификатора кампании.
 *
 *  \ingroup Models
 *
 */

class GetCampaignResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignResponse();
	GetCampaignResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignDTO getCampaign();

	/*! \brief Set 
	 */
	void setCampaign(CampaignDTO  campaign);

private:
	CampaignDTO campaign;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignResponse_H_ */
