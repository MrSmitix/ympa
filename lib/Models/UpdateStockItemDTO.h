
/*
 * UpdateStockItemDTO.h
 *
 * Информация об остатках товара. 
 */

#ifndef TINY_CPP_CLIENT_UpdateStockItemDTO_H_
#define TINY_CPP_CLIENT_UpdateStockItemDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Информация об остатках товара. 
 *
 *  \ingroup Models
 *
 */

class UpdateStockItemDTO{
public:

    /*! \brief Constructor.
	 */
    UpdateStockItemDTO();
    UpdateStockItemDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateStockItemDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Количество доступного товара. 
	 */
	long getCount();

	/*! \brief Set Количество доступного товара. 
	 */
	void setCount(long  count);
	/*! \brief Get Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	std::string getUpdatedAt();

	/*! \brief Set Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
	 */
	void setUpdatedAt(std::string  updatedAt);


    private:
    long count{};
    std::string updatedAt{};
};
}

#endif /* TINY_CPP_CLIENT_UpdateStockItemDTO_H_ */
