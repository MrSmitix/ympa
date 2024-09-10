/*
 * ProvideOrderItemIdentifiersResponse.h
 *
 * 
 */

#ifndef _ProvideOrderItemIdentifiersResponse_H_
#define _ProvideOrderItemIdentifiersResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OrderItemsModificationResultDTO.h"
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

class ProvideOrderItemIdentifiersResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ProvideOrderItemIdentifiersResponse();
	ProvideOrderItemIdentifiersResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProvideOrderItemIdentifiersResponse();

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
	OrderItemsModificationResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OrderItemsModificationResultDTO  result);

private:
	ApiResponseStatusType status;
	OrderItemsModificationResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProvideOrderItemIdentifiersResponse_H_ */
