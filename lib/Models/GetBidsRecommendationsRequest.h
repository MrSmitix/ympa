
/*
 * GetBidsRecommendationsRequest.h
 *
 * description.
 */

#ifndef TINY_CPP_CLIENT_GetBidsRecommendationsRequest_H_
#define TINY_CPP_CLIENT_GetBidsRecommendationsRequest_H_


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

class GetBidsRecommendationsRequest{
public:

    /*! \brief Constructor.
	 */
    GetBidsRecommendationsRequest();
    GetBidsRecommendationsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetBidsRecommendationsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Список товаров, для которых нужно получить рекомендации по ставкам. 
	 */
	std::list<std::string> getSkus();

	/*! \brief Set Список товаров, для которых нужно получить рекомендации по ставкам. 
	 */
	void setSkus(std::list <std::string> skus);


    private:
    std::list<std::string> skus;
};
}

#endif /* TINY_CPP_CLIENT_GetBidsRecommendationsRequest_H_ */
