/*
 * DeleteOffersResponse.h
 *
 * Результат удаления товаров.
 */

#ifndef _DeleteOffersResponse_H_
#define _DeleteOffersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "DeleteOffersDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат удаления товаров.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteOffersResponse();
	DeleteOffersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteOffersResponse();

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
	DeleteOffersDTO getResult();

	/*! \brief Set 
	 */
	void setResult(DeleteOffersDTO  result);

private:
	ApiResponseStatusType status;
	DeleteOffersDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteOffersResponse_H_ */
