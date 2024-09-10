/*
 * GetBidsRecommendationsRequest.h
 *
 * description.
 */

#ifndef _GetBidsRecommendationsRequest_H_
#define _GetBidsRecommendationsRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief description.
 *
 *  \ingroup Models
 *
 */

class GetBidsRecommendationsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBidsRecommendationsRequest();
	GetBidsRecommendationsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBidsRecommendationsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров, для которых нужно получить рекомендации по ставкам. 
	 */
	std::list<std::string> getSkus();

	/*! \brief Set Список товаров, для которых нужно получить рекомендации по ставкам. 
	 */
	void setSkus(std::list <std::string> skus);

private:
	std::list <std::string>skus;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBidsRecommendationsRequest_H_ */
