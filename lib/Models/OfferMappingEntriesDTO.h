
/*
 * OfferMappingEntriesDTO.h
 *
 * Информация о товарах в каталоге.
 */

#ifndef TINY_CPP_CLIENT_OfferMappingEntriesDTO_H_
#define TINY_CPP_CLIENT_OfferMappingEntriesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferMappingEntryDTO.h"
#include "ScrollingPagerDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о товарах в каталоге.
 *
 *  \ingroup Models
 *
 */

class OfferMappingEntriesDTO{
public:

    /*! \brief Constructor.
	 */
    OfferMappingEntriesDTO();
    OfferMappingEntriesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferMappingEntriesDTO();


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
	/*! \brief Get Информация о товарах в каталоге.
	 */
	std::list<OfferMappingEntryDTO> getOfferMappingEntries();

	/*! \brief Set Информация о товарах в каталоге.
	 */
	void setOfferMappingEntries(std::list <OfferMappingEntryDTO> offerMappingEntries);


    private:
    ScrollingPagerDTO paging;
    std::list<OfferMappingEntryDTO> offerMappingEntries;
};
}

#endif /* TINY_CPP_CLIENT_OfferMappingEntriesDTO_H_ */
