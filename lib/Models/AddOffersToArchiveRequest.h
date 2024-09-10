
/*
 * AddOffersToArchiveRequest.h
 *
 * Товары, которые нужно поместить в архив. 
 */

#ifndef TINY_CPP_CLIENT_AddOffersToArchiveRequest_H_
#define TINY_CPP_CLIENT_AddOffersToArchiveRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Товары, которые нужно поместить в архив. 
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveRequest{
public:

    /*! \brief Constructor.
	 */
    AddOffersToArchiveRequest();
    AddOffersToArchiveRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AddOffersToArchiveRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров, которые нужно поместить в архив.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список товаров, которые нужно поместить в архив.
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_AddOffersToArchiveRequest_H_ */
