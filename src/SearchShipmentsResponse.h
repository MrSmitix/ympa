/*
 * SearchShipmentsResponse.h
 *
 * Ответ на запрос информации об отгрузках.
 */

#ifndef _SearchShipmentsResponse_H_
#define _SearchShipmentsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "SearchShipmentsResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос информации об отгрузках.
 *
 *  \ingroup Models
 *
 */

class SearchShipmentsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	SearchShipmentsResponse();
	SearchShipmentsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SearchShipmentsResponse();

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
	SearchShipmentsResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(SearchShipmentsResponseDTO  result);

private:
	ApiResponseStatusType status;
	SearchShipmentsResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SearchShipmentsResponse_H_ */
