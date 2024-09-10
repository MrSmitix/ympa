
/*
 * DeleteOffersFromArchiveDTO.h
 *
 * Товары, которые не удалось восстановить из архива.
 */

#ifndef TINY_CPP_CLIENT_DeleteOffersFromArchiveDTO_H_
#define TINY_CPP_CLIENT_DeleteOffersFromArchiveDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Товары, которые не удалось восстановить из архива.
 *
 *  \ingroup Models
 *
 */

class DeleteOffersFromArchiveDTO{
public:

    /*! \brief Constructor.
	 */
    DeleteOffersFromArchiveDTO();
    DeleteOffersFromArchiveDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DeleteOffersFromArchiveDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров, которые не удалось восстановить из архива.
	 */
	std::list<std::string> getNotUnarchivedOfferIds();

	/*! \brief Set Список товаров, которые не удалось восстановить из архива.
	 */
	void setNotUnarchivedOfferIds(std::list <std::string> notUnarchivedOfferIds);


    private:
    std::list<std::string> notUnarchivedOfferIds;
};
}

#endif /* TINY_CPP_CLIENT_DeleteOffersFromArchiveDTO_H_ */
