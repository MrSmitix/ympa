/*
 * OfferCampaignStatusDTO.h
 *
 * Статус товара в магазине.
 */

#ifndef _OfferCampaignStatusDTO_H_
#define _OfferCampaignStatusDTO_H_


#include <string>
#include "OfferCampaignStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Статус товара в магазине.
 *
 *  \ingroup Models
 *
 */

class OfferCampaignStatusDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferCampaignStatusDTO();
	OfferCampaignStatusDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferCampaignStatusDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кампании. 
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании. 
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get 
	 */
	OfferCampaignStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OfferCampaignStatusType  status);

private:
	long long campaignId;
	OfferCampaignStatusType status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferCampaignStatusDTO_H_ */
