/*
 * GetBidsInfoRequest.h
 *
 * description.
 */

#ifndef _GetBidsInfoRequest_H_
#define _GetBidsInfoRequest_H_


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

class GetBidsInfoRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetBidsInfoRequest();
	GetBidsInfoRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetBidsInfoRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
	 */
	std::list<std::string> getSkus();

	/*! \brief Set Список товаров, для которых нужно получить значения ставок.  Если список не задан, постранично возвращаются все товары со ставками.  Если список задан, результаты возвращаются одной страницей, а параметры `page_token` и `limit` игнорируются. 
	 */
	void setSkus(std::list <std::string> skus);

private:
	std::list <std::string>skus;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetBidsInfoRequest_H_ */
