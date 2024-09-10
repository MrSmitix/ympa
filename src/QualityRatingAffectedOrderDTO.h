/*
 * QualityRatingAffectedOrderDTO.h
 *
 * Информация о заказе, который повлиял на индекс качества.
 */

#ifndef _QualityRatingAffectedOrderDTO_H_
#define _QualityRatingAffectedOrderDTO_H_


#include <string>
#include "AffectedOrderQualityRatingComponentType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о заказе, который повлиял на индекс качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingAffectedOrderDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityRatingAffectedOrderDTO();
	QualityRatingAffectedOrderDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityRatingAffectedOrderDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор заказа.
	 */
	long long getOrderId();

	/*! \brief Set Идентификатор заказа.
	 */
	void setOrderId(long long  orderId);
	/*! \brief Get Описание проблемы.
	 */
	std::string getDescription();

	/*! \brief Set Описание проблемы.
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	AffectedOrderQualityRatingComponentType getComponentType();

	/*! \brief Set 
	 */
	void setComponentType(AffectedOrderQualityRatingComponentType  componentType);

private:
	long long orderId;
	std::string description;
	AffectedOrderQualityRatingComponentType componentType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityRatingAffectedOrderDTO_H_ */
