/*
 * GetBusinessSettingsResponse.h
 *
 * Ответ на запрос настроек кабинета.
 */

#ifndef _GetBusinessSettingsResponse_H_
#define _GetBusinessSettingsResponse_H_


#include <string>
#include "ApiResponseStatusType.h"
#include "GetBusinessSettingsInfoDTO.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос настроек кабинета.
 *
 *  \ingroup Models
 *
 */

class GetBusinessSettingsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBusinessSettingsResponse();
	GetBusinessSettingsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBusinessSettingsResponse();

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
	GetBusinessSettingsInfoDTO getResult();

	/*! \brief Set 
	 */
	void setResult(GetBusinessSettingsInfoDTO  result);

private:
	ApiResponseStatusType status;
	GetBusinessSettingsInfoDTO result;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBusinessSettingsResponse_H_ */
