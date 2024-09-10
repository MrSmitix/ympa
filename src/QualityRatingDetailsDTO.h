/*
 * QualityRatingDetailsDTO.h
 *
 * Информация о заказах, которые повлияли на индекс качества.
 */

#ifndef _QualityRatingDetailsDTO_H_
#define _QualityRatingDetailsDTO_H_


#include <string>
#include "QualityRatingAffectedOrderDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о заказах, которые повлияли на индекс качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingDetailsDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityRatingDetailsDTO();
	QualityRatingDetailsDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityRatingDetailsDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Список заказов, которые повлияли на индекс качества.
	 */
	std::list<QualityRatingAffectedOrderDTO> getAffectedOrders();

	/*! \brief Set Список заказов, которые повлияли на индекс качества.
	 */
	void setAffectedOrders(std::list <QualityRatingAffectedOrderDTO> affectedOrders);

private:
	std::list <QualityRatingAffectedOrderDTO>affectedOrders;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityRatingDetailsDTO_H_ */
