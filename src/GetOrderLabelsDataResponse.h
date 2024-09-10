/*
 * GetOrderLabelsDataResponse.h
 *
 * Ответ с информацией для печати ярлыков.
 */

#ifndef _GetOrderLabelsDataResponse_H_
#define _GetOrderLabelsDataResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrderLabelDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ с информацией для печати ярлыков.
 *
 *  \ingroup Models
 *
 */

class GetOrderLabelsDataResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetOrderLabelsDataResponse();
	GetOrderLabelsDataResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetOrderLabelsDataResponse();

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
	OrderLabelDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderLabelDTO  result);

private:
	ApiResponseStatusType status;
	OrderLabelDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetOrderLabelsDataResponse_H_ */
