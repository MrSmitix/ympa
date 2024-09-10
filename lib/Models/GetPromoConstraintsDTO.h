
/*
 * GetPromoConstraintsDTO.h
 *
 * Ограничения в акции.
 */

#ifndef TINY_CPP_CLIENT_GetPromoConstraintsDTO_H_
#define TINY_CPP_CLIENT_GetPromoConstraintsDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Ограничения в акции.
 *
 *  \ingroup Models
 *
 */

class GetPromoConstraintsDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromoConstraintsDTO();
    GetPromoConstraintsDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromoConstraintsDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
	 */
	std::list<long> getWarehouseIds();

	/*! \brief Set Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
	 */
	void setWarehouseIds(std::list <long> warehouseIds);


    private:
    std::list<long> warehouseIds;
};
}

#endif /* TINY_CPP_CLIENT_GetPromoConstraintsDTO_H_ */
