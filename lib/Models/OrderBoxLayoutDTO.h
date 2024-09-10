
/*
 * OrderBoxLayoutDTO.h
 *
 * Информация о коробке.
 */

#ifndef TINY_CPP_CLIENT_OrderBoxLayoutDTO_H_
#define TINY_CPP_CLIENT_OrderBoxLayoutDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OrderBoxLayoutItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Информация о коробке.
 *
 *  \ingroup Models
 *
 */

class OrderBoxLayoutDTO{
public:

    /*! \brief Constructor.
	 */
    OrderBoxLayoutDTO();
    OrderBoxLayoutDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderBoxLayoutDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
	 */
	std::list<OrderBoxLayoutItemDTO> getItems();

	/*! \brief Set Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
	 */
	void setItems(std::list <OrderBoxLayoutItemDTO> items);


    private:
    std::list<OrderBoxLayoutItemDTO> items;
};
}

#endif /* TINY_CPP_CLIENT_OrderBoxLayoutDTO_H_ */
