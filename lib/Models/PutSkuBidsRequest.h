
/*
 * PutSkuBidsRequest.h
 *
 * description.
 */

#ifndef TINY_CPP_CLIENT_PutSkuBidsRequest_H_
#define TINY_CPP_CLIENT_PutSkuBidsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "SkuBidItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class PutSkuBidsRequest{
public:

    /*! \brief Constructor.
	 */
    PutSkuBidsRequest();
    PutSkuBidsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PutSkuBidsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров и ставки для продвижения, которые на них нужно установить.
	 */
	std::list<SkuBidItemDTO> getBids();

	/*! \brief Set Список товаров и ставки для продвижения, которые на них нужно установить.
	 */
	void setBids(std::list <SkuBidItemDTO> bids);


    private:
    std::list<SkuBidItemDTO> bids;
};
}

#endif /* TINY_CPP_CLIENT_PutSkuBidsRequest_H_ */
