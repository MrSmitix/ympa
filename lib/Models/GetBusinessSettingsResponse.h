
/*
 * GetBusinessSettingsResponse.h
 *
 * Ответ на запрос настроек кабинета.
 */

#ifndef TINY_CPP_CLIENT_GetBusinessSettingsResponse_H_
#define TINY_CPP_CLIENT_GetBusinessSettingsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "GetBusinessSettingsInfoDTO.h"

namespace Tiny {


/*! \brief Ответ на запрос настроек кабинета.
 *
 *  \ingroup Models
 *
 */

class GetBusinessSettingsResponse{
public:

    /*! \brief Constructor.
	 */
    GetBusinessSettingsResponse();
    GetBusinessSettingsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBusinessSettingsResponse();


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
	GetBusinessSettingsInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetBusinessSettingsInfoDTO  result);


    private:
    ApiResponseStatusType status;
    GetBusinessSettingsInfoDTO result;
};
}

#endif /* TINY_CPP_CLIENT_GetBusinessSettingsResponse_H_ */
