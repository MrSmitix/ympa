/*
 * GetPricesByOfferIdsResponse.h
 *
 * Ответ на запрос списка цен.
 */

#ifndef _GetPricesByOfferIdsResponse_H_
#define _GetPricesByOfferIdsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OfferPriceByOfferIdsListResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка цен.
 *
 *  \ingroup Models
 *
 */

class GetPricesByOfferIdsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetPricesByOfferIdsResponse();
	GetPricesByOfferIdsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetPricesByOfferIdsResponse();

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
	OfferPriceByOfferIdsListResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferPriceByOfferIdsListResponseDTO  result);

private:
	ApiResponseStatusType status;
	OfferPriceByOfferIdsListResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetPricesByOfferIdsResponse_H_ */
