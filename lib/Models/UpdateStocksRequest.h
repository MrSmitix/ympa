
/*
 * UpdateStocksRequest.h
 *
 * Запрос на изменение информации по остаткам товаров.
 */

#ifndef TINY_CPP_CLIENT_UpdateStocksRequest_H_
#define TINY_CPP_CLIENT_UpdateStocksRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"
#include "UpdateStockDTO.h"

namespace Tiny {


/*! \brief Запрос на изменение информации по остаткам товаров.
 *
 *  \ingroup Models
 *
 */

class UpdateStocksRequest{
public:

    /*! \brief Constructor.
	 */
    UpdateStocksRequest();
    UpdateStocksRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateStocksRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Данные об остатках товаров. 
	 */
	Set<UpdateStockDTO> getSkus();

	/*! \brief Set Данные об остатках товаров. 
	 */
	void setSkus(Set <UpdateStockDTO> skus);


    private:
    Set<UpdateStockDTO> skus;
};
}

#endif /* TINY_CPP_CLIENT_UpdateStocksRequest_H_ */
