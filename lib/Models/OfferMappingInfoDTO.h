
/*
 * OfferMappingInfoDTO.h
 *
 * Информация о карточке товара.
 */

#ifndef TINY_CPP_CLIENT_OfferMappingInfoDTO_H_
#define TINY_CPP_CLIENT_OfferMappingInfoDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferMappingDTO.h"

namespace Tiny {


/*! \brief Информация о карточке товара.
 *
 *  \ingroup Models
 *
 */

class OfferMappingInfoDTO{
public:

    /*! \brief Constructor.
	 */
    OfferMappingInfoDTO();
    OfferMappingInfoDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingInfoDTO();


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


    private:
    OfferMappingDTO mapping;
    OfferMappingDTO awaitingModerationMapping;
    OfferMappingDTO rejectedMapping;
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingInfoDTO_H_ */
