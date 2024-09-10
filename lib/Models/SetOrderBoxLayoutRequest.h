
/*
 * SetOrderBoxLayoutRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_SetOrderBoxLayoutRequest_H_
#define TINY_CPP_CLIENT_SetOrderBoxLayoutRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderBoxLayoutDTO.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class SetOrderBoxLayoutRequest{
public:

    /*! \brief Constructor.
	 */
    SetOrderBoxLayoutRequest();
    SetOrderBoxLayoutRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetOrderBoxLayoutRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список коробок.
	 */
	std::list<OrderBoxLayoutDTO> getBoxes();

	/*! \brief Set Список коробок.
	 */
	void setBoxes(std::list <OrderBoxLayoutDTO> boxes);
	/*! \brief Get Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
	 */
	bool isAllowRemove();

	/*! \brief Set Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
	 */
	void setAllowRemove(bool  allowRemove);


    private:
    std::list<OrderBoxLayoutDTO> boxes;
    bool allowRemove{};
};
}

#endif /* TINY_CPP_CLIENT_SetOrderBoxLayoutRequest_H_ */
