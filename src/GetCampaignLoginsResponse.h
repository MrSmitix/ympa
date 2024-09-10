/*
 * GetCampaignLoginsResponse.h
 *
 * Ответ на запрос списка логинов, связанных с магазином.
 */

#ifndef _GetCampaignLoginsResponse_H_
#define _GetCampaignLoginsResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ответ на запрос списка логинов, связанных с магазином.
 *
 *  \ingroup Models
 *
 */

class GetCampaignLoginsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	GetCampaignLoginsResponse();
	GetCampaignLoginsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetCampaignLoginsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список логинов.
	 */
	std::list<std::string> getLogins();

	/*! \brief Set Список логинов.
	 */
	void setLogins(std::list <std::string> logins);

private:
	std::list <std::string>logins;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetCampaignLoginsResponse_H_ */
