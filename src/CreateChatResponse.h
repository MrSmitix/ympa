/*
 * CreateChatResponse.h
 *
 * Результат создания чата.
 */

#ifndef _CreateChatResponse_H_
#define _CreateChatResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "CreateChatResultDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Результат создания чата.
 *
 *  \ingroup Models
 *
 */

class CreateChatResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatResponse();
	CreateChatResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatResponse();

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
	CreateChatResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CreateChatResultDTO  result);

private:
	ApiResponseStatusType status;
	CreateChatResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatResponse_H_ */
