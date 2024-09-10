
/*
 * UpdateOfferMappingEntryDTO.h
 *
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferMappingEntryDTO_H_
#define TINY_CPP_CLIENT_UpdateOfferMappingEntryDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferMappingDTO.h"
#include "UpdateMappingsOfferDTO.h"

namespace Tiny {


/*! \brief Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingEntryDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferMappingEntryDTO();
    UpdateOfferMappingEntryDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferMappingEntryDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	OfferMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(OfferMappingDTO  mapping);
	/*! \brief Get 
	 */
	OfferMappingDTO getAwaitingModerationMapping();

	/*! \brief Set 
	 */
	void setAwaitingModerationMapping(OfferMappingDTO  awaitingModerationMapping);
	/*! \brief Get 
	 */
	OfferMappingDTO getRejectedMapping();

	/*! \brief Set 
	 */
	void setRejectedMapping(OfferMappingDTO  rejectedMapping);
	/*! \brief Get 
	 */
	UpdateMappingsOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(UpdateMappingsOfferDTO  offer);


    private:
    OfferMappingDTO mapping;
    OfferMappingDTO awaitingModerationMapping;
    OfferMappingDTO rejectedMapping;
    UpdateMappingsOfferDTO offer;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferMappingEntryDTO_H_ */
