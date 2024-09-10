/*
 * GetGoodsFeedbackResponse.h
 *
 * 
 */

#ifndef _GetGoodsFeedbackResponse_H_
#define _GetGoodsFeedbackResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GoodsFeedbackListDTO.h"
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

class GetGoodsFeedbackResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetGoodsFeedbackResponse();
	GetGoodsFeedbackResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetGoodsFeedbackResponse();

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
	GoodsFeedbackListDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GoodsFeedbackListDTO  result);

private:
	ApiResponseStatusType status;
	GoodsFeedbackListDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetGoodsFeedbackResponse_H_ */
