
/*
 * GetCampaignLoginsResponse.h
 *
 * Ответ на запрос списка логинов, связанных с магазином.
 */

#ifndef TINY_CPP_CLIENT_GetCampaignLoginsResponse_H_
#define TINY_CPP_CLIENT_GetCampaignLoginsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Ответ на запрос списка логинов, связанных с магазином.
 *
 *  \ingroup Models
 *
 */

class GetCampaignLoginsResponse{
public:

    /*! \brief Constructor.
	 */
    GetCampaignLoginsResponse();
    GetCampaignLoginsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetCampaignLoginsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список логинов.
	 */
	std::list<std::string> getLogins();

	/*! \brief Set Список логинов.
	 */
	void setLogins(std::list <std::string> logins);


    private:
    std::list<std::string> logins;
};
}

#endif /* TINY_CPP_CLIENT_GetCampaignLoginsResponse_H_ */
