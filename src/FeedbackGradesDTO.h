/*
 * FeedbackGradesDTO.h
 *
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */

#ifndef _FeedbackGradesDTO_H_
#define _FeedbackGradesDTO_H_


#include <string>
#include "FeedbackFactorDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 *
 *  \ingroup Models
 *
 */

class FeedbackGradesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	FeedbackGradesDTO();
	FeedbackGradesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FeedbackGradesDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
	 */
	long long getAverage();

	/*! \brief Set Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
	 */
	void setAverage(long long  average);
	/*! \brief Get Количество пользователей, считающих отзыв полезным.
	 */
	long long getAgreeCount();

	/*! \brief Set Количество пользователей, считающих отзыв полезным.
	 */
	void setAgreeCount(long long  agreeCount);
	/*! \brief Get Количество пользователей, считающих отзыв бесполезным.
	 */
	long long getRejectCount();

	/*! \brief Set Количество пользователей, считающих отзыв бесполезным.
	 */
	void setRejectCount(long long  rejectCount);
	/*! \brief Get Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
	 */
	std::list<FeedbackFactorDTO> getFactors();

	/*! \brief Set Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
	 */
	void setFactors(std::list <FeedbackFactorDTO> factors);

private:
	long long average;
	long long agreeCount;
	long long rejectCount;
	std::list <FeedbackFactorDTO>factors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FeedbackGradesDTO_H_ */
