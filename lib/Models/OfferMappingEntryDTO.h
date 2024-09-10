
/*
 * OfferMappingEntryDTO.h
 *
 * Список товаров. 
 */

#ifndef TINY_CPP_CLIENT_OfferMappingEntryDTO_H_
#define TINY_CPP_CLIENT_OfferMappingEntryDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MappingsOfferDTO.h"
#include "OfferMappingDTO.h"

namespace Tiny {


/*! \brief Список товаров. 
 *
 *  \ingroup Models
 *
 */

class OfferMappingEntryDTO{
public:

    /*! \brief Constructor.
	 */
    OfferMappingEntryDTO();
    OfferMappingEntryDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingEntryDTO();


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
	MappingsOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(MappingsOfferDTO  offer);


    private:
    OfferMappingDTO mapping;
    OfferMappingDTO awaitingModerationMapping;
    OfferMappingDTO rejectedMapping;
    MappingsOfferDTO offer;
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingEntryDTO_H_ */
