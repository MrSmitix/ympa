
/*
 * SuggestedOfferMappingDTO.h
 *
 * Товар с соответствующей карточкой на Маркете.
 */

#ifndef TINY_CPP_CLIENT_SuggestedOfferMappingDTO_H_
#define TINY_CPP_CLIENT_SuggestedOfferMappingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetMappingDTO.h"
#include "SuggestedOfferDTO.h"

namespace Tiny {


/*! \brief Товар с соответствующей карточкой на Маркете.
 *
 *  \ingroup Models
 *
 */

class SuggestedOfferMappingDTO{
public:

    /*! \brief Constructor.
	 */
    SuggestedOfferMappingDTO();
    SuggestedOfferMappingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SuggestedOfferMappingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	SuggestedOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(SuggestedOfferDTO  offer);
	/*! \brief Get 
	 */
	GetMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(GetMappingDTO  mapping);


    private:
    SuggestedOfferDTO offer;
    GetMappingDTO mapping;
};
}

#endif /* TINY_CPP_CLIENT_SuggestedOfferMappingDTO_H_ */
