/*
 * GetOfferMappingEntriesResponse.h
 *
 * Ответ на запрос списка товаров в каталоге.
 */

#ifndef _GetOfferMappingEntriesResponse_H_
#define _GetOfferMappingEntriesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OfferMappingEntriesDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка товаров в каталоге.
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingEntriesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOfferMappingEntriesResponse();
	GetOfferMappingEntriesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOfferMappingEntriesResponse();

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
	OfferMappingEntriesDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OfferMappingEntriesDTO  result);

private:
	ApiResponseStatusType status;
	OfferMappingEntriesDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOfferMappingEntriesResponse_H_ */
