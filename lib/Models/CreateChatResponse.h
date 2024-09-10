
/*
 * CreateChatResponse.h
 *
 * Результат создания чата.
 */

#ifndef TINY_CPP_CLIENT_CreateChatResponse_H_
#define TINY_CPP_CLIENT_CreateChatResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "CreateChatResultDTO.h"

namespace Tiny {


/*! \brief Результат создания чата.
 *
 *  \ingroup Models
 *
 */

class CreateChatResponse{
public:

    /*! \brief Constructor.
	 */
    CreateChatResponse();
    CreateChatResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateChatResponse();


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
	CreateChatResultDTO getResult();

	/*! \brief Set 
	 */
	void setResult(CreateChatResultDTO  result);


    private:
    ApiResponseStatusType status;
    CreateChatResultDTO result;
};
}

#endif /* TINY_CPP_CLIENT_CreateChatResponse_H_ */
