
/*
 * UpdateOfferMappingEntryRequest.h
 *
 * Запрос на обновление товаров.
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferMappingEntryRequest_H_
#define TINY_CPP_CLIENT_UpdateOfferMappingEntryRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateOfferMappingEntryDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на обновление товаров.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingEntryRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferMappingEntryRequest();
    UpdateOfferMappingEntryRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferMappingEntryRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Информация о товарах в каталоге.
	 */
	std::list<UpdateOfferMappingEntryDTO> getOfferMappingEntries();

	/*! \brief Set Информация о товарах в каталоге.
	 */
	void setOfferMappingEntries(std::list <UpdateOfferMappingEntryDTO> offerMappingEntries);


    private:
    std::list<UpdateOfferMappingEntryDTO> offerMappingEntries;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferMappingEntryRequest_H_ */
