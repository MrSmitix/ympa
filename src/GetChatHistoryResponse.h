/*
 * GetChatHistoryResponse.h
 *
 * 
 */

#ifndef _GetChatHistoryResponse_H_
#define _GetChatHistoryResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "ChatMessagesResultDTO.h"
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

class GetChatHistoryResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetChatHistoryResponse();
	GetChatHistoryResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetChatHistoryResponse();

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
	ChatMessagesResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(ChatMessagesResultDTO  result);

private:
	ApiResponseStatusType status;
	ChatMessagesResultDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetChatHistoryResponse_H_ */
