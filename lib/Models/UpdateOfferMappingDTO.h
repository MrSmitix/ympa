
/*
 * UpdateOfferMappingDTO.h
 *
 * Информация о товаре.
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferMappingDTO_H_
#define TINY_CPP_CLIENT_UpdateOfferMappingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateMappingDTO.h"
#include "UpdateOfferDTO.h"

namespace Tiny {


/*! \brief Информация о товаре.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferMappingDTO();
    UpdateOfferMappingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferMappingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	UpdateOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(UpdateOfferDTO  offer);
	/*! \brief Get 
	 */
	UpdateMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(UpdateMappingDTO  mapping);


    private:
    UpdateOfferDTO offer;
    UpdateMappingDTO mapping;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferMappingDTO_H_ */
