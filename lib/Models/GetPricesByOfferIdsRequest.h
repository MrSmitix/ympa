
/*
 * GetPricesByOfferIdsRequest.h
 *
 * Запрос списка цен.
 */

#ifndef TINY_CPP_CLIENT_GetPricesByOfferIdsRequest_H_
#define TINY_CPP_CLIENT_GetPricesByOfferIdsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Запрос списка цен.
 *
 *  \ingroup Models
 *
 */

class GetPricesByOfferIdsRequest{
public:

    /*! \brief Constructor.
	 */
    GetPricesByOfferIdsRequest();
    GetPricesByOfferIdsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetPricesByOfferIdsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	 */
	std::list<std::string> getOfferIds();

	/*! \brief Set Список SKU.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
	 */
	void setOfferIds(std::list <std::string> offerIds);


    private:
    std::list<std::string> offerIds;
};
}

#endif /* TINY_CPP_CLIENT_GetPricesByOfferIdsRequest_H_ */
