
/*
 * AddHiddenOffersRequest.h
 *
 * Запрос на скрытие оферов.
 */

#ifndef TINY_CPP_CLIENT_AddHiddenOffersRequest_H_
#define TINY_CPP_CLIENT_AddHiddenOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "HiddenOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на скрытие оферов.
 *
 *  \ingroup Models
 *
 */

class AddHiddenOffersRequest{
public:

    /*! \brief Constructor.
	 */
    AddHiddenOffersRequest();
    AddHiddenOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AddHiddenOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список скрытых товаров. 
	 */
	std::list<HiddenOfferDTO> getHiddenOffers();

	/*! \brief Set Список скрытых товаров. 
	 */
	void setHiddenOffers(std::list <HiddenOfferDTO> hiddenOffers);


    private:
    std::list<HiddenOfferDTO> hiddenOffers;
};
}

#endif /* TINY_CPP_CLIENT_AddHiddenOffersRequest_H_ */
