/*
 * GetHiddenOffersResponse.h
 *
 * Ответ на запрос списка скрытий.
 */

#ifndef _GetHiddenOffersResponse_H_
#define _GetHiddenOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetHiddenOffersResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка скрытий.
 *
 *  \ingroup Models
 *
 */

class GetHiddenOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetHiddenOffersResponse();
	GetHiddenOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetHiddenOffersResponse();

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
	GetHiddenOffersResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetHiddenOffersResultDTO  result);

private:
	ApiResponseStatusType status;
	GetHiddenOffersResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetHiddenOffersResponse_H_ */
