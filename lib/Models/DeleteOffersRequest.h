
/*
 * DeleteOffersRequest.h
 *
 * Фильтрации удаляемых товаров по offerIds. 
 */

#ifndef TINY_CPP_CLIENT_DeleteOffersRequest_H_
#define TINY_CPP_CLIENT_DeleteOffersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Фильтрации удаляемых товаров по offerIds. 
 *
 *  \ingroup Models
 *
 */

class DeleteOffersRequest{
public:

    /*! \brief Constructor.
	 */
    DeleteOffersRequest();
    DeleteOffersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteOffersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список SKU товаров, которые нужно удалить.
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список SKU товаров, которые нужно удалить.
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_DeleteOffersRequest_H_ */
