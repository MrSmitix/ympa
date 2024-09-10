/*
 * CreateOutletResponse.h
 *
 * Ответ на запрос о создании точки продаж.
 */

#ifndef _CreateOutletResponse_H_
#define _CreateOutletResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "OutletResponseDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос о создании точки продаж.
 *
 *  \ingroup Models
 *
 */

class CreateOutletResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateOutletResponse();
	CreateOutletResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateOutletResponse();

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
	OutletResponseDTO getResult();

	/*! \brief Set 
	 */
	void setResult(OutletResponseDTO  result);

private:
	ApiResponseStatusType status;
	OutletResponseDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateOutletResponse_H_ */
