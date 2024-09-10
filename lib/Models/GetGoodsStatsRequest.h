
/*
 * GetGoodsStatsRequest.h
 *
 * Запрос отчета по товарам.
 */

#ifndef TINY_CPP_CLIENT_GetGoodsStatsRequest_H_
#define TINY_CPP_CLIENT_GetGoodsStatsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Set.h"

namespace Tiny {


/*! \brief Запрос отчета по товарам.
 *
 *  \ingroup Models
 *
 */

class GetGoodsStatsRequest{
public:

    /*! \brief Constructor.
	 */
    GetGoodsStatsRequest();
    GetGoodsStatsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetGoodsStatsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список ваших идентификаторов SKU. 
	 */
	Set<std::string> getShopSkus();

	/*! \brief Set Список ваших идентификаторов SKU. 
	 */
	void setShopSkus(Set <std::string> shopSkus);


    private:
    Set<std::string> shopSkus;
};
}

#endif /* TINY_CPP_CLIENT_GetGoodsStatsRequest_H_ */
