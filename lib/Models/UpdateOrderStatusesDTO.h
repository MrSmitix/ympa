
/*
 * UpdateOrderStatusesDTO.h
 *
 * Список заказов, статус которых обновился.
 */

#ifndef TINY_CPP_CLIENT_UpdateOrderStatusesDTO_H_
#define TINY_CPP_CLIENT_UpdateOrderStatusesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UpdateOrderStatusDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список заказов, статус которых обновился.
 *
 *  \ingroup Models
 *
 */

class UpdateOrderStatusesDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateOrderStatusesDTO();
    UpdateOrderStatusesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOrderStatusesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список с обновленными заказами.
	 */
	std::list<UpdateOrderStatusDTO> getOrders();

	/*! \brief Set Список с обновленными заказами.
	 */
	void setOrders(std::list <UpdateOrderStatusDTO> orders);


    private:
    std::list<UpdateOrderStatusDTO> orders;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOrderStatusesDTO_H_ */
