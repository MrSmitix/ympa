
/*
 * DeleteOffersFromArchiveRequest.h
 *
 * Товары, которые нужно восстановить из архива. 
 */

#ifndef TINY_CPP_CLIENT_DeleteOffersFromArchiveRequest_H_
#define TINY_CPP_CLIENT_DeleteOffersFromArchiveRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Товары, которые нужно восстановить из архива. 
 *
 *  \ingroup Models
 *
 */

class DeleteOffersFromArchiveRequest{
public:

    /*! \brief Constructor.
	 */
    DeleteOffersFromArchiveRequest();
    DeleteOffersFromArchiveRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteOffersFromArchiveRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров, которые нужно восстановить из архива.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список товаров, которые нужно восстановить из архива.
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_DeleteOffersFromArchiveRequest_H_ */
