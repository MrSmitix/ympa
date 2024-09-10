
/*
 * GetChatHistoryResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetChatHistoryResponse_H_
#define TINY_CPP_CLIENT_GetChatHistoryResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "ChatMessagesResultDTO.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetChatHistoryResponse{
public:

    /*! \brief Constructor.
	 */
    GetChatHistoryResponse();
    GetChatHistoryResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetChatHistoryResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
};
}

#endif /* TINY_CPP_CLIENT_GetChatHistoryResponse_H_ */
