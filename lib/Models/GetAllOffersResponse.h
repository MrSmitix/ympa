
/*
 * GetAllOffersResponse.h
 *
 * Список предложений.
 */

#ifndef TINY_CPP_CLIENT_GetAllOffersResponse_H_
#define TINY_CPP_CLIENT_GetAllOffersResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список предложений.
 *
 *  \ingroup Models
 *
 */

class GetAllOffersResponse{
public:

    /*! \brief Constructor.
	 */
    GetAllOffersResponse();
    GetAllOffersResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetAllOffersResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список предложений магазина.
	 */
	std::list<OfferDTO> getOffers();

	/*! \brief Set Список предложений магазина.
	 */
	void setOffers(std::list <OfferDTO> offers);


    private:
    std::list<OfferDTO> offers;
};
}

#endif /* TINY_CPP_CLIENT_GetAllOffersResponse_H_ */
