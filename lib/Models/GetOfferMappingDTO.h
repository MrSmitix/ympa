
/*
 * GetOfferMappingDTO.h
 *
 * Информация о товаре.
 */

#ifndef TINY_CPP_CLIENT_GetOfferMappingDTO_H_
#define TINY_CPP_CLIENT_GetOfferMappingDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetMappingDTO.h"
#include "GetOfferDTO.h"

namespace Tiny {


/*! \brief Информация о товаре.
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingDTO{
public:

    /*! \brief Constructor.
	 */
    GetOfferMappingDTO();
    GetOfferMappingDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferMappingDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	GetOfferDTO getOffer();

	/*! \brief Set 
	 */
	void setOffer(GetOfferDTO  offer);
	/*! \brief Get 
	 */
	GetMappingDTO getMapping();

	/*! \brief Set 
	 */
	void setMapping(GetMappingDTO  mapping);


    private:
    GetOfferDTO offer;
    GetMappingDTO mapping;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferMappingDTO_H_ */
