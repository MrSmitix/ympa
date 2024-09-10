
/*
 * GetPromosResultDTO.h
 *
 * Информация об акциях Маркета.
 */

#ifndef TINY_CPP_CLIENT_GetPromosResultDTO_H_
#define TINY_CPP_CLIENT_GetPromosResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GetPromoDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация об акциях Маркета.
 *
 *  \ingroup Models
 *
 */

class GetPromosResultDTO{
public:

    /*! \brief Constructor.
	 */
    GetPromosResultDTO();
    GetPromosResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPromosResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Акции Маркета.
	 */
	std::list<GetPromoDTO> getPromos();

	/*! \brief Set Акции Маркета.
	 */
	void setPromos(std::list <GetPromoDTO> promos);


    private:
    std::list<GetPromoDTO> promos;
};
}

#endif /* TINY_CPP_CLIENT_GetPromosResultDTO_H_ */
