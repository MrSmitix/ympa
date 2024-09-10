/*
 * SetOrderBoxLayoutResponse.h
 *
 * 
 */

#ifndef _SetOrderBoxLayoutResponse_H_
#define _SetOrderBoxLayoutResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrderBoxesLayoutDTO.h"
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

class SetOrderBoxLayoutResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SetOrderBoxLayoutResponse();
	SetOrderBoxLayoutResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SetOrderBoxLayoutResponse();

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
	OrderBoxesLayoutDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderBoxesLayoutDTO  result);

private:
	ApiResponseStatusType status;
	OrderBoxesLayoutDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SetOrderBoxLayoutResponse_H_ */
