/*
 * AddOffersToArchiveResponse.h
 *
 * Результат архивации товаров.
 */

#ifndef _AddOffersToArchiveResponse_H_
#define _AddOffersToArchiveResponse_H_


#include <string>
#include "AddOffersToArchiveDTO.h"
#include "ApiResponseStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат архивации товаров.
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AddOffersToArchiveResponse();
	AddOffersToArchiveResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AddOffersToArchiveResponse();

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
	AddOffersToArchiveDTO getResult();

	/*! \brief Set 
	 */
	void setResult(AddOffersToArchiveDTO  result);

private:
	ApiResponseStatusType status;
	AddOffersToArchiveDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AddOffersToArchiveResponse_H_ */
