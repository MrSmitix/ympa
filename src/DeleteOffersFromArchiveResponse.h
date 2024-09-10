/*
 * DeleteOffersFromArchiveResponse.h
 *
 * Результат разархивации товаров.
 */

#ifndef _DeleteOffersFromArchiveResponse_H_
#define _DeleteOffersFromArchiveResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "DeleteOffersFromArchiveDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат разархивации товаров.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersFromArchiveResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteOffersFromArchiveResponse();
	DeleteOffersFromArchiveResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteOffersFromArchiveResponse();

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
	DeleteOffersFromArchiveDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeleteOffersFromArchiveDTO  result);

private:
	ApiResponseStatusType status;
	DeleteOffersFromArchiveDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteOffersFromArchiveResponse_H_ */
