
/*
 * GetOfferMappingsResultDTO.h
 *
 * Информация о товарах.
 */

#ifndef TINY_CPP_CLIENT_GetOfferMappingsResultDTO_H_
#define TINY_CPP_CLIENT_GetOfferMappingsResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetOfferMappingDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о товарах.
 *
 *  \ingroup Models
 *
 */

class GetOfferMappingsResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetOfferMappingsResultDTO();
    GetOfferMappingsResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetOfferMappingsResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ScrollingPagerDTO getPaging();

	/*! \brief Set 
	 */
	void setPaging(ScrollingPagerDTO  paging);
	/*! \brief Get Информация о товарах.
	 */
	std::list<GetOfferMappingDTO> getOfferMappings();

	/*! \brief Set Информация о товарах.
	 */
	void setOfferMappings(std::list <GetOfferMappingDTO> offerMappings);


    private:
    ScrollingPagerDTO paging;
    std::list<GetOfferMappingDTO> offerMappings;
};
}

#endif /* TINY_CPP_CLIENT_GetOfferMappingsResultDTO_H_ */
