/*
 * QualityRatingDTO.h
 *
 * Информация об индексе качества.
 */

#ifndef _QualityRatingDTO_H_
#define _QualityRatingDTO_H_


#include <string>
#include "Date.h"
#include "QualityRatingComponentDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об индексе качества.
 *
 *  \ingroup Models
 *
 */

class QualityRatingDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	QualityRatingDTO();
	QualityRatingDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~QualityRatingDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Значение индекса качества.
	 */
	long long getRating();

	/*! \brief Set Значение индекса качества.
	 */
	void setRating(long long  rating);
	/*! \brief Get Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	 */
	Date getCalculationDate();

	/*! \brief Set Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	 */
	void setCalculationDate(Date  calculationDate);
	/*! \brief Get Составляющие индекса качества.
	 */
	std::list<QualityRatingComponentDTO> getComponents();

	/*! \brief Set Составляющие индекса качества.
	 */
	void setComponents(std::list <QualityRatingComponentDTO> components);

private:
	long long rating;
	Date calculationDate;
	std::list <QualityRatingComponentDTO>components;
	void __init();
	void __cleanup();

};
}
}

#endif /* _QualityRatingDTO_H_ */
