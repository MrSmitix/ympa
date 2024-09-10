
/*
 * GetBidsInfoRequest.h
 *
 * description.
 */

#ifndef TINY_CPP_CLIENT_GetBidsInfoRequest_H_
#define TINY_CPP_CLIENT_GetBidsInfoRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class GetBidsInfoRequest{
public:

    /*! \brief Constructor.
	 */
    GetBidsInfoRequest();
    GetBidsInfoRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBidsInfoRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
	 */
	std::list<std::string> getSkus();

	/*! \brief Set Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
	 */
	void setSkus(std::list <std::string> skus);


    private:
    std::list<std::string> skus;
};
}

#endif /* TINY_CPP_CLIENT_GetBidsInfoRequest_H_ */
