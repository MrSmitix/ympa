
/*
 * DeleteHiddenOffersRequest.h
 *
 * Запрос на возобновление показа оферов.
 */

#ifndef TINY_CPP_CLIENT_DeleteHiddenOffersRequest_H_
#define TINY_CPP_CLIENT_DeleteHiddenOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "HiddenOfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на возобновление показа оферов.
 *
 *  \ingroup Models
 *
 */

class DeleteHiddenOffersRequest{
public:

    /*! \brief Constructor.
	 */
    DeleteHiddenOffersRequest();
    DeleteHiddenOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteHiddenOffersRequest();


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

#endif /* TINY_CPP_CLIENT_DeleteHiddenOffersRequest_H_ */
