/*
 * GetCampaignRegionResponse.h
 *
 * Ответ на запрос региона магазина.
 */

#ifndef _GetCampaignRegionResponse_H_
#define _GetCampaignRegionResponse_H_


#include <string>
#include "RegionDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос региона магазина.
 *
 *  \ingroup Models
 *
 */

class GetCampaignRegionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignRegionResponse();
	GetCampaignRegionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignRegionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	RegionDTO getRegion();

	/*! \brief Set 
	 */
	void setRegion(RegionDTO  region);

private:
	RegionDTO region;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignRegionResponse_H_ */
