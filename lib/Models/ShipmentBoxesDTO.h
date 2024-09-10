
/*
 * ShipmentBoxesDTO.h
 *
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */

#ifndef TINY_CPP_CLIENT_ShipmentBoxesDTO_H_
#define TINY_CPP_CLIENT_ShipmentBoxesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ParcelBoxDTO.h"
#include <list>

namespace Tiny {


/*! \brief В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 *
 *  \ingroup Models
 *
 */

class ShipmentBoxesDTO{
public:

    /*! \brief Constructor.
	 */
    ShipmentBoxesDTO();
    ShipmentBoxesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ShipmentBoxesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список грузовых мест. Маркет определил количество мест по длине этого списка. 
	 */
	std::list<ParcelBoxDTO> getBoxes();

	/*! \brief Set Список грузовых мест. Маркет определил количество мест по длине этого списка. 
	 */
	void setBoxes(std::list <ParcelBoxDTO> boxes);


    private:
    std::list<ParcelBoxDTO> boxes;
};
}

#endif /* TINY_CPP_CLIENT_ShipmentBoxesDTO_H_ */
