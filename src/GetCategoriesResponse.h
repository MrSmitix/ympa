/*
 * GetCategoriesResponse.h
 *
 * 
 */

#ifndef _GetCategoriesResponse_H_
#define _GetCategoriesResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "CategoryDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetCategoriesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCategoriesResponse();
	GetCategoriesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCategoriesResponse();

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
	CategoryDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CategoryDTO  result);

private:
	ApiResponseStatusType status;
	CategoryDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCategoriesResponse_H_ */
