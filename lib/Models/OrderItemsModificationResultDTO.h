
/*
 * OrderItemsModificationResultDTO.h
 *
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
 */

#ifndef TINY_CPP_CLIENT_OrderItemsModificationResultDTO_H_
#define TINY_CPP_CLIENT_OrderItemsModificationResultDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BriefOrderItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 *
 *  \ingroup Models
 *
 */

class OrderItemsModificationResultDTO{
public:

    /*! \brief Constructor.
	 */
    OrderItemsModificationResultDTO();
    OrderItemsModificationResultDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderItemsModificationResultDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список позиций в заказе, подлежащих маркировке.
	 */
	std::list<BriefOrderItemDTO> getItems();

	/*! \brief Set Список позиций в заказе, подлежащих маркировке.
	 */
	void setItems(std::list <BriefOrderItemDTO> items);


    private:
    std::list<BriefOrderItemDTO> items;
};
}

#endif /* TINY_CPP_CLIENT_OrderItemsModificationResultDTO_H_ */
