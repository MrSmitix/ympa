
/*
 * ParcelDTO.h
 *
 * Информация о грузовых местах в заказе.
 */

#ifndef TINY_CPP_CLIENT_ParcelDTO_H_
#define TINY_CPP_CLIENT_ParcelDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ParcelBoxDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о грузовых местах в заказе.
 *
 *  \ingroup Models
 *
 */

class ParcelDTO{
public:

    /*! \brief Constructor.
	 */
    ParcelDTO();
    ParcelDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ParcelDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список грузовых мест. Маркет определяет количество мест по длине этого списка.
	 */
	std::list<ParcelBoxDTO> getBoxes();

	/*! \brief Set Список грузовых мест. Маркет определяет количество мест по длине этого списка.
	 */
	void setBoxes(std::list <ParcelBoxDTO> boxes);


    private:
    std::list<ParcelBoxDTO> boxes;
};
}

#endif /* TINY_CPP_CLIENT_ParcelDTO_H_ */
