/*
 * GetCampaignsResponse.h
 *
 * Результаты поиска магазинов.
 */

#ifndef _GetCampaignsResponse_H_
#define _GetCampaignsResponse_H_


#include <string>
#include "CampaignDTO.h"
#include "FlippingPagerDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результаты поиска магазинов.
 *
 *  \ingroup Models
 *
 */

class GetCampaignsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignsResponse();
	GetCampaignsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список с информацией по каждому магазину.
	 */
	std::list<CampaignDTO> getCampaigns();

	/*! \brief Set Список с информацией по каждому магазину.
	 */
	void setCampaigns(std::list <CampaignDTO> campaigns);
	/*! \brief Get 
	 */
	FlippingPagerDTO getPager();

	/*! \brief Set 
	 */
	void setPager(FlippingPagerDTO  pager);

private:
	std::list <CampaignDTO>campaigns;
	FlippingPagerDTO pager;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignsResponse_H_ */
