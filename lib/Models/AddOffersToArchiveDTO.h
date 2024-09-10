
/*
 * AddOffersToArchiveDTO.h
 *
 * Товары, которые не удалось поместить в архив.
 */

#ifndef TINY_CPP_CLIENT_AddOffersToArchiveDTO_H_
#define TINY_CPP_CLIENT_AddOffersToArchiveDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AddOffersToArchiveErrorDTO.h"
#include <list>

namespace Tiny {


/*! \brief Товары, которые не удалось поместить в архив.
 *
 *  \ingroup Models
 *
 */

class AddOffersToArchiveDTO{
public:

    /*! \brief Constructor.
	 */
    AddOffersToArchiveDTO();
    AddOffersToArchiveDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AddOffersToArchiveDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров, которые не удалось поместить в архив.
	 */
	std::list<AddOffersToArchiveErrorDTO> getNotArchivedOffers();

	/*! \brief Set Список товаров, которые не удалось поместить в архив.
	 */
	void setNotArchivedOffers(std::list <AddOffersToArchiveErrorDTO> notArchivedOffers);


    private:
    std::list<AddOffersToArchiveErrorDTO> notArchivedOffers;
};
}

#endif /* TINY_CPP_CLIENT_AddOffersToArchiveDTO_H_ */
