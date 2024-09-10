
/*
 * UpdateOfferContentRequest.h
 *
 * Запрос на установку новых значений для параметров.
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferContentRequest_H_
#define TINY_CPP_CLIENT_UpdateOfferContentRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferContentDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на установку новых значений для параметров.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferContentRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferContentRequest();
    UpdateOfferContentRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferContentRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров с указанными характеристиками.
	 */
	std::list<OfferContentDTO> getOffersContent();

	/*! \brief Set Список товаров с указанными характеристиками.
	 */
	void setOffersContent(std::list <OfferContentDTO> offersContent);


    private:
    std::list<OfferContentDTO> offersContent;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferContentRequest_H_ */
