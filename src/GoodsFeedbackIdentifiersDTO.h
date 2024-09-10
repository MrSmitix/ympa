/*
 * GoodsFeedbackIdentifiersDTO.h
 *
 * Идентификаторы, которые связаны с отзывом.
 */

#ifndef _GoodsFeedbackIdentifiersDTO_H_
#define _GoodsFeedbackIdentifiersDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Идентификаторы, которые связаны с отзывом.
 *
 *  \ingroup Models
 *
 */

class GoodsFeedbackIdentifiersDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	GoodsFeedbackIdentifiersDTO();
	GoodsFeedbackIdentifiersDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GoodsFeedbackIdentifiersDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа на Маркете.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа на Маркете.
	 */
	void setOrderId(long long  orderId);
	/*! \brief Get Идентификатор модели товара.
	 */
	long long getModelId();

	/*! \brief Set Идентификатор модели товара.
	 */
	void setModelId(long long  modelId);

private:
	long long orderId;
	long long modelId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GoodsFeedbackIdentifiersDTO_H_ */
