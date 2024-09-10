/*
 * GetCampaignOffersResponse.h
 *
 * Ответ на запрос списка товаров в магазине.
 */

#ifndef _GetCampaignOffersResponse_H_
#define _GetCampaignOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetCampaignOffersResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка товаров в магазине.
 *
 *  \ingroup Models
 *
 */

class GetCampaignOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignOffersResponse();
	GetCampaignOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignOffersResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get 
	 */
	GetCampaignOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetCampaignOffersResultDTO  result);

private:
	ApiResponseStatusType status;
	GetCampaignOffersResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignOffersResponse_H_ */
