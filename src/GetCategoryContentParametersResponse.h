/*
 * GetCategoryContentParametersResponse.h
 *
 * Ответ со списком характеристик для категории и их допустимыми значениями.
 */

#ifndef _GetCategoryContentParametersResponse_H_
#define _GetCategoryContentParametersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "CategoryContentParametersDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ со списком характеристик для категории и их допустимыми значениями.
 *
 *  \ingroup Models
 *
 */

class GetCategoryContentParametersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCategoryContentParametersResponse();
	GetCategoryContentParametersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCategoryContentParametersResponse();

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
	CategoryContentParametersDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CategoryContentParametersDTO  result);

private:
	ApiResponseStatusType status;
	CategoryContentParametersDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCategoryContentParametersResponse_H_ */
